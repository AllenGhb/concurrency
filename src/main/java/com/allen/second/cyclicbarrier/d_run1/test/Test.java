package com.allen.second.cyclicbarrier.d_run1.test;

import com.allen.second.cyclicbarrier.d_run1.extthread.ThreadA;
import com.allen.second.cyclicbarrier.d_run1.service.MyService;

import java.util.concurrent.CyclicBarrier;


public class Test {

	public static void main(String[] args) throws InterruptedException {
		CyclicBarrier cbRef = new CyclicBarrier(2,()-> System.out.println("执行到这里了"));

		MyService service = new MyService(cbRef);

		ThreadA threadA1 = new ThreadA(service);
		threadA1.setName("A");
		threadA1.start();

		ThreadA threadA2 = new ThreadA(service);
		threadA2.setName("B");
		threadA2.start();

		ThreadA threadA3 = new ThreadA(service);
		threadA3.setName("C");
		threadA3.start();

		ThreadA threadA4 = new ThreadA(service);
		threadA4.setName("D");
		threadA4.start();
	}
}
