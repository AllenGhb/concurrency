package com.allen.first.semaphore.k_pool.test;

import com.allen.first.semaphore.k_pool.tools.ListPool;
import com.allen.first.semaphore.k_pool.extthread.MyThread;

public class Run {

	public static void main(String[] args) {

		ListPool pool = new ListPool();

		MyThread[] threadArray = new MyThread[4];
		for (int i = 0; i < threadArray.length; i++) {
			threadArray[i] = new MyThread(pool);
		}
		for (int i = 0; i < threadArray.length; i++) {
			threadArray[i].start();
		}

	}
}
