package com.allen.second.cyclicbarrier.h_run5.extthread;

import com.allen.second.cyclicbarrier.h_run5.service.MyService;

public class MyThreadA extends Thread {

	private MyService service;

	public MyThreadA(MyService service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.testMethod();
	}

}
