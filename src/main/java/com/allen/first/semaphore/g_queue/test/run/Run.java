package com.allen.first.semaphore.g_queue.test.run;


import com.allen.first.semaphore.g_queue.extthread.MyThread;
import com.allen.first.semaphore.g_queue.myservice.MyService;

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
