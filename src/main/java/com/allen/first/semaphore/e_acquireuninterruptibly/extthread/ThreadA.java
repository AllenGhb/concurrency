package com.allen.first.semaphore.e_acquireuninterruptibly.extthread;


import com.allen.first.semaphore.e_acquireuninterruptibly.service.Service;

public class ThreadA extends Thread {

	private Service service;

	public ThreadA(Service service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.testMethod();
	}

}
