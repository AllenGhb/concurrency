package com.allen.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
/**
 * 基于JDK的动态代理
 * 基于JDK的动态代理就需要知道两个类：1.InvocationHandler（接口）、2.Proxy（类）
 * 还要知道JDK是基于接口的动态代理
 *
 * 1. java.lang.reflect.Proxy：这是 Java 动态代理机制的主类，它提供了一组静态方法来为一组接口动态地生成代理类及其对象
 * 2. java.lang.reflect.InvocationHandler：这是调用处理器接口，它自定义了一个invoke方法，
 * 用于几种处理在动态代理类对象上的方法调用。通常在该方法中实现对委托类的代理访问。
 * 3. java.lang.ClassLoader：Proxy 静态方法生成动态代理类同样需要通过类装载器来进行装载才能使用，
 * 它与普通类的唯一区别就是其字节码是由 JVM 在运行时动态生成的而非预存在于任何一个.class 文件中。
 *
 * @author 周何圳 2020年06月16日 新建
 */
public class SubjectProxy implements InvocationHandler {

    private Subject subject;

    public SubjectProxy(Subject subject) {
        this.subject = subject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("--------------begin-------------");
        Object invoke = method.invoke(subject, args);
        System.out.println("--------------end-------------");
        return invoke;
    }

    public static void main(String[] args) {
        Subject subject = new SubjectImpl();
        InvocationHandler subjectProxy = new SubjectProxy(subject);
        /*
         * subjectProxy.getClass().getClassLoader() 代理类的类加载器
         * subject.getClass().getInterfaces() 被代理类的接口,如果有多个就是数组形式传入
         * subjectProxy 代理类实体
         */
        Subject proxyInstance = (Subject) Proxy.newProxyInstance(subjectProxy.getClass().getClassLoader(), subject.getClass().getInterfaces(), subjectProxy);
        proxyInstance.hello("world");
    }

}
