package com.allen.first.semaphore.i_tryacquire.test.run;


import com.allen.first.semaphore.i_tryacquire.extthread.ThreadA;
import com.allen.first.semaphore.i_tryacquire.extthread.ThreadB;
import com.allen.first.semaphore.i_tryacquire.service.Service;

public class Run {

	public static void main(String[] args) {
		Service service = new Service();
		ThreadA a = new ThreadA(service);
		a.setName("A");
		a.start();
		ThreadB b = new ThreadB(service);
		b.setName("B");
		b.start();
	}

}
