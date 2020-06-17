package com.allen.second.cyclicbarrier.b_partthread;

import java.util.concurrent.CyclicBarrier;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		CyclicBarrier cbRef = new CyclicBarrier(2, () -> System.out.println("全来了！"));

		for (int i = 0; i < 4; i++) {
			ThreadA threadA1 = new ThreadA(cbRef);
			threadA1.start();
			Thread.sleep(2000);
		}
	}
}

