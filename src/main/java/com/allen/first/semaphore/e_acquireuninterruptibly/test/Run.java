package com.allen.first.semaphore.e_acquireuninterruptibly.test;


import com.allen.first.semaphore.e_acquireuninterruptibly.extthread.ThreadA;
import com.allen.first.semaphore.e_acquireuninterruptibly.extthread.ThreadB;
import com.allen.first.semaphore.e_acquireuninterruptibly.service.Service;

public class Run {

	public static void main(String[] args)  {
		Service service = new Service();
		ThreadA a = new ThreadA(service);
		a.setName("A");
		a.start();

		ThreadB b = new ThreadB(service);
		b.setName("B");
		b.start();


		Thread.currentThread().interrupt();
		System.out.println("main中断了a");
	}

}
