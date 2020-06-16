package com.allen.first.semaphore.g_queue.extthread;


import com.allen.first.semaphore.g_queue.myservice.MyService;

public class MyThread extends Thread {

	private MyService myService;

	public MyThread(MyService myService) {
		super();
		this.myService = myService;
	}

	@Override
	public void run() {
		myService.testMethod();
	}

}
