package com.allen.second.cyclicbarrier.d_run1.extthread;


import com.allen.second.cyclicbarrier.d_run1.service.MyService;

public class ThreadA extends Thread {

	private MyService service;

	public ThreadA(MyService service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.beginRun();
	}

}
