package com.allen.first.semaphore.i_tryacquire.service;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class Service {

	private Semaphore semaphore = new Semaphore(2);

	public void testMethod() {
		/*
		 * tryAcquire()尝试获得1个许可，如果获取不到则返回false,具有无阻塞特点，可以使线程不至于
		 * 在同步处一直持续等待的状态。
		 * tryAcquire(3, TimeUnit.SECONDS) 在指定时间内尝试获取,超时后获取不到返回false
		 */
		try {
			if (semaphore.tryAcquire(2,3, TimeUnit.SECONDS)) {
				System.out.println("ThreadName="
						+ Thread.currentThread().getName() + "首选进入！");
				for (int i = 0; i < Integer.MAX_VALUE; i++) {
					// String newString = new String();
					// Math.random();
				}
				// Thread.sleep(3000);
				semaphore.release(2);
			} else {
				System.out.println("ThreadName="
						+ Thread.currentThread().getName() + "未成功进入！");
			}
			// 方法release对应的permits值也要更改
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
