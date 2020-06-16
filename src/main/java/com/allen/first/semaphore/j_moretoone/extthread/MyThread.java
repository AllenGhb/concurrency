package com.allen.first.semaphore.j_moretoone.extthread;


import com.allen.first.semaphore.j_moretoone.service.Service;

public class MyThread extends Thread {

	private Service service;

	public MyThread(Service service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.sayHello();
	}

}
