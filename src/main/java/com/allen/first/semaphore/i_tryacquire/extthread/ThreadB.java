package com.allen.first.semaphore.i_tryacquire.extthread;


import com.allen.first.semaphore.i_tryacquire.service.Service;

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
