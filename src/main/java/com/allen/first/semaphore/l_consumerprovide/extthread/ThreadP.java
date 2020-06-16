package com.allen.first.semaphore.l_consumerprovide.extthread;


import com.allen.first.semaphore.l_consumerprovide.service.RepastService;

public class ThreadP extends Thread {

	private RepastService service;

	public ThreadP(RepastService service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.set();
	}

}
