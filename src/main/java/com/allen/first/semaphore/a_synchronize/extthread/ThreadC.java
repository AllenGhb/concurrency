package com.allen.first.semaphore.a_synchronize.extthread;

import com.allen.first.semaphore.a_synchronize.service.Service;

public class ThreadC extends Thread {

	private Service service;

	public ThreadC(Service service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.testMethod();
	}

}
