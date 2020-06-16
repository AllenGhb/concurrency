package com.allen.first.semaphore.h_fair.test.run;


import com.allen.first.semaphore.h_fair.extthread.MyThread;
import com.allen.first.semaphore.h_fair.myservice.MyService;

public class Run {

	public static void main(String[] args) {
		MyService service = new MyService();

		MyThread firstThread = new MyThread(service);
		firstThread.start();

		MyThread[] threadArray = new MyThread[4];
		for (int i = 0; i < 4; i++) {
			threadArray[i] = new MyThread(service);
			threadArray[i].start();
		}

	}

}
