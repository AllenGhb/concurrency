package com.allen.first.semaphore.a_synchronize.run;

import com.allen.first.semaphore.a_synchronize.extthread.ThreadA;
import com.allen.first.semaphore.a_synchronize.extthread.ThreadB;
import com.allen.first.semaphore.a_synchronize.extthread.ThreadC;
import com.allen.first.semaphore.a_synchronize.service.Service;

public class Run {

	public static void main(String[] args) {
		Service service = new Service();
		ThreadA a = new ThreadA(service);
		a.setName("A");
		ThreadB b = new ThreadB(service);
		b.setName("B");
		ThreadC c = new ThreadC(service);
		c.setName("C");
		a.start();
		b.start();
		c.start();
	}

}
