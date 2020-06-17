package com.allen.second.cyclicbarrier.c_awaitafterreset;

import java.util.concurrent.CyclicBarrier;


public class Test {

	public static void main(String[] args) throws InterruptedException {
		// parties 的值可以重置归0
		CyclicBarrier cbRef = new CyclicBarrier(3,() -> System.out.println("筹齐3个了"));

		ThreadA threadA1 = new ThreadA(cbRef);
		threadA1.start();
		Thread.sleep(5000);
		System.out.println(cbRef.getNumberWaiting());

		ThreadA threadA2 = new ThreadA(cbRef);
		threadA2.start();
		Thread.sleep(5000);
		System.out.println(cbRef.getNumberWaiting());

		ThreadA threadA3 = new ThreadA(cbRef);
		threadA3.start();
		Thread.sleep(5000);
		System.out.println(cbRef.getNumberWaiting());

		ThreadA threadA4 = new ThreadA(cbRef);
		threadA4.start();
		Thread.sleep(5000);
		System.out.println(cbRef.getNumberWaiting());

	}
}
