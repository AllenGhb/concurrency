package com.allen.first.semaphore.b_permits.run;

import com.allen.first.semaphore.b_permits.extthread.ThreadA;
import com.allen.first.semaphore.b_permits.service.Service;

public class Run {

	public static void main(String[] args) {
		Service service = new Service();
		ThreadA[] a = new ThreadA[10];
		for (int i = 0; i < 10; i++) {
			a[i] = new ThreadA(service);
			a[i].start();
		}
	}

}
