package com.allen.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class HelloInterceptor implements MethodInterceptor {

    /**
     * @param o 被代理的对象实例
     * @param methodProxy 代理方法
     * @author 周何圳 2020年06月16日 新建
     */
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("begin time -----> "+ System.currentTimeMillis());
        // 调用被拦截的方法,不要使用invoke(因为invoke中调用的任何原代理类方法，均会重新代理到invoke方法中),会出现StackOverflowError的情况
        Object o1 = methodProxy.invokeSuper(o, objects);
        System.out.println("end time -----> "+ System.currentTimeMillis());
        return o1;
    }

    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(CGSubject.class);
        enhancer.setCallback(new HelloInterceptor());
        CGSubject cgsubject = (CGSubject) enhancer.create();
        System.out.println(cgsubject.getClass());
        cgsubject.sayHello();
    }
}
