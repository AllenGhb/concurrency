package com.allen.second.countdownlatch.a_countdownlatch.service;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class MyService {

	private CountDownLatch down = new CountDownLatch(1);

	public void testMethod() {
		try {
			System.out.println("A");
			System.out.println(down.getCount());
			down.await(3, TimeUnit.SECONDS);
			System.out.println("B");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void downMethod() {
		System.out.println("X");
		down.countDown();
		System.out.println(down.getCount());
	}

}
