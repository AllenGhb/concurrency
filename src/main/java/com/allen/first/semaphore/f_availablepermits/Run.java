package com.allen.first.semaphore.f_availablepermits;


import com.allen.first.semaphore.f_availablepermits.myservice.MyService;

public class Run {

	public static void main(String[] args) {
		MyService service = new MyService();
		service.testMethod();

	}

}
