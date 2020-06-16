package com.allen.first.countdownlatch.a_countdownlatch.test.run;


import com.allen.first.countdownlatch.a_countdownlatch.extthread.MyThread;
import com.allen.first.countdownlatch.a_countdownlatch.service.MyService;

public class Run {
	public static void main(String[] args) throws InterruptedException {
		MyService service = new MyService();
		MyThread t = new MyThread(service);
		t.start();
		Thread.sleep(5000);
		service.downMethod();
	}
}
