package com.allen.second.cyclicbarrier.e_run2.test;

import com.allen.second.cyclicbarrier.e_run2.extthread.MyThread;
import com.allen.second.cyclicbarrier.e_run2.service.MyService;

import java.util.concurrent.CyclicBarrier;


public class Run {

	public static void main(String[] args) {
		int parties = 4;
		CyclicBarrier cbRef = new CyclicBarrier(parties, new Runnable() {
			public void run() {
				System.out.println("都到了！");
			}
		});

		MyService myService = new MyService(cbRef);

		MyThread[] threadArray = new MyThread[5];
		for (int i = 0; i < threadArray.length; i++) {
			threadArray[i] = new MyThread(myService);
			threadArray[i].start();
		}

	}
}
