package com.allen.first.semaphore.h_fair.myservice;

import java.util.concurrent.Semaphore;

public class MyService {

	private Semaphore semaphore = new Semaphore(1, true);

	public void testMethod() {
		try {
			semaphore.acquire();
			System.out
					.println("ThreadName=" + Thread.currentThread().getName());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			semaphore.release();
		}
	}

}
