package com.allen.first.semaphore.l_consumerprovide.test.run;


import com.allen.first.semaphore.l_consumerprovide.extthread.ThreadC;
import com.allen.first.semaphore.l_consumerprovide.extthread.ThreadP;
import com.allen.first.semaphore.l_consumerprovide.service.RepastService;

public class Run {

	public static void main(String[] args) throws InterruptedException {
		RepastService service = new RepastService();
		ThreadP[] arrayP = new ThreadP[60];
		ThreadC[] arrayC = new ThreadC[60];
		for (int i = 0; i < 60; i++) {
			arrayP[i] = new ThreadP(service);
			arrayC[i] = new ThreadC(service);
		}
		Thread.sleep(2000);
		for (int i = 0; i < 60; i++) {
			arrayP[i].start();
			arrayC[i].start();
		}
	}

}
