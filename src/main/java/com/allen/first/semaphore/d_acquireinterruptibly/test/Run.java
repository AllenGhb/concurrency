package com.allen.first.semaphore.d_acquireinterruptibly.test;


import com.allen.first.semaphore.d_acquireinterruptibly.extthread.ThreadA;
import com.allen.first.semaphore.d_acquireinterruptibly.extthread.ThreadB;
import com.allen.first.semaphore.d_acquireinterruptibly.service.Service;

public class Run {

	public static void main(String[] args) throws InterruptedException {
		Service service = new Service();
		ThreadA a = new ThreadA(service);
		a.setName("A");
		a.start();

		ThreadB b = new ThreadB(service);
		b.setName("B");
		b.start();


		b.interrupt();
		System.out.println("main中断了a");
	}

}
