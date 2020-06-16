package com.allen.first.semaphore.d_acquireinterruptibly.extthread;


import com.allen.first.semaphore.d_acquireinterruptibly.service.Service;

public class ThreadB extends Thread {

	private Service service;

	public ThreadB(Service service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.testMethod();
	}

}
