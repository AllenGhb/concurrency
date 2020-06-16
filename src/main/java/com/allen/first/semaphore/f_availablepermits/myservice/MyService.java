package com.allen.first.semaphore.f_availablepermits.myservice;

import java.util.concurrent.Semaphore;

public class MyService {

	private Semaphore semaphore = new Semaphore(10);

	public void testMethod() {
		try {
			semaphore.acquire();
			/*
			 * availablePermits() 返回此Semaphore对象中当前可用的许可数
			 * drainPermits() 获取并返回立即可用的所有许可个数，并且将可用许可置0
			 */
			System.out.println(semaphore.availablePermits());
			System.out.println(semaphore.drainPermits() + " "
					+ semaphore.availablePermits());
			System.out.println(semaphore.drainPermits() + " "
					+ semaphore.availablePermits());
			System.out.println(semaphore.drainPermits() + " "
					+ semaphore.availablePermits());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			semaphore.release();
		}
	}

}
