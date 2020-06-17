package com.allen.second.cyclicbarrier.a_wait;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
/**
 * CyclicBarrier 多个线程之间相互等待，任何一个线程完成之前，所有线程都必须等待
 * CountDownLatch 一个线程或多个线程，等待另一个线程或多个线程完成某个事情之后才能继续执行
 *
 * @author 周何圳 2020年06月17日 新建
 */
public class MyThread extends Thread {

    private CyclicBarrier cbRef;

    public MyThread(CyclicBarrier cbRef) {
        super();
        this.cbRef = cbRef;
    }

    @Override
    public void run() {
        try {
            Thread.sleep((int) (Math.random() * 1000));
            System.out.println(Thread.currentThread().getName() + " 到了! "
                    + System.currentTimeMillis());
            cbRef.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}