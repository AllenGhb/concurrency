package com.allen.first.semaphore.h_fair.extthread;


import com.allen.first.semaphore.h_fair.myservice.MyService;

public class MyThread extends Thread {

	private MyService myService;

	public MyThread(MyService myService) {
		super();
		this.myService = myService;
	}

	@Override
	public void run() {
		System.out.println("ThreadName=" + this.getName() + "启动了！");
		myService.testMethod();
	}

}
