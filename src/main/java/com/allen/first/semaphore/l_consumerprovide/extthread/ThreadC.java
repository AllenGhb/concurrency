package com.allen.first.semaphore.l_consumerprovide.extthread;


import com.allen.first.semaphore.l_consumerprovide.service.RepastService;

public class ThreadC extends Thread {

	private RepastService service;

	public ThreadC(RepastService service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.get();
	}

}
