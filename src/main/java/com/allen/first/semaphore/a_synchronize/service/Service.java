package com.allen.first.semaphore.a_synchronize.service;

import java.util.concurrent.Semaphore;

public class Service {

	/**
	 * permits是许可的意思，代表同一时间内，最多允许多少个线程同时执行acquire()到release()之间的代码
	 *
	 * permits值如果大于1时，Semaphore类并不能保证线程安全性，因为还有可能出现线程共同访问实例变量，导致
	 * 出现脏数据情况
	*/
	private Semaphore semaphore = new Semaphore(2);

	public void testMethod() {
		try {
			/*
			 * acquire()无参方法是使用permits个许可
			 */
			semaphore.acquire(2);
			System.out.println(Thread.currentThread().getName()
					+ " begin timer=" + System.currentTimeMillis());
			int i = 0;
			Thread.sleep(5000);
			System.out.println(Thread.currentThread().getName()
					+ "   end timer=" + System.currentTimeMillis());
			semaphore.release(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
