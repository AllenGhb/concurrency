package com.allen.first.semaphore.a_synchronize.extthread;


import com.allen.first.semaphore.a_synchronize.service.Service;

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
