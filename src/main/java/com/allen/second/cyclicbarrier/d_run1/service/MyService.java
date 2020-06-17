package com.allen.second.cyclicbarrier.d_run1.service;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class MyService {
	private CyclicBarrier cbRef;

	public MyService(CyclicBarrier cbRef) {
		super();
		this.cbRef = cbRef;
	}

	public void beginRun() {
		try {
			long sleepValue = (int) (Math.random() * 10000);
			Thread.sleep(sleepValue);
			System.out.println(Thread.currentThread().getName() + " "
					+ System.currentTimeMillis() + " begin跑第1阶段"
					+ (cbRef.getNumberWaiting() + 1));
			cbRef.await();
			System.out.println(Thread.currentThread().getName() + " "
					+ System.currentTimeMillis() + "   end跑第1阶段" + " "
					+ cbRef.getNumberWaiting());
			// ///////
			sleepValue = (int) (Math.random() * 10000);
			Thread.sleep(sleepValue);
			System.out.println(Thread.currentThread().getName() + " "
					+ System.currentTimeMillis() + " begin跑第2阶段"
					+ (cbRef.getNumberWaiting() + 1));
			cbRef.await();
			System.out.println(Thread.currentThread().getName() + " "
					+ System.currentTimeMillis() + "   end跑第2阶段" + " "
					+ cbRef.getNumberWaiting());
		} catch (InterruptedException | BrokenBarrierException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
