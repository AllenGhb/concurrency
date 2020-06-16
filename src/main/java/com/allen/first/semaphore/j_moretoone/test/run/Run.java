package com.allen.first.semaphore.j_moretoone.test.run;


import com.allen.first.semaphore.j_moretoone.extthread.MyThread;
import com.allen.first.semaphore.j_moretoone.service.Service;

public class Run {

	public static void main(String[] args) {
		Service service = new Service();

		MyThread[] threadArray = new MyThread[12];
		for (int i = 0; i < threadArray.length; i++) {
			threadArray[i] = new MyThread(service);
			threadArray[i].start();
		}
	}

}
