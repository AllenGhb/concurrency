package com.allen.second.cyclicbarrier.g_run4.extthread;

import com.allen.second.cyclicbarrier.g_run4.service.MyService;

public class MyThreadB extends Thread {

	private MyService service;

	public MyThreadB(MyService service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.testMethod();
	}

}
