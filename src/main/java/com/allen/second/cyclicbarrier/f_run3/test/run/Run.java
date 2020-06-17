package com.allen.second.cyclicbarrier.f_run3.test.run;


import com.allen.second.cyclicbarrier.f_run3.extthread.MyThreadA;
import com.allen.second.cyclicbarrier.f_run3.extthread.MyThreadB;
import com.allen.second.cyclicbarrier.f_run3.service.MyService;

public class Run {

	public static void main(String[] args) throws InterruptedException {
		MyService service = new MyService();
		MyThreadA a = new MyThreadA(service);
		a.start();
		MyThreadB b = new MyThreadB(service);
		b.start();
	}

}
