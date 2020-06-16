package com.allen.first.countdownlatch.a_countdownlatch.extthread;


import com.allen.first.countdownlatch.a_countdownlatch.service.MyService;

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
