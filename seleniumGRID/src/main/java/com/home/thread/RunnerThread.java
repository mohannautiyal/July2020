package com.home.thread;

public class RunnerThread {

	public static void main(String[] args) {

	Thread t1=	new GoogleThread("chromeThread","chrome");
	Thread t2=	new GoogleThread("FireFoxThread","chrome");

	t1.start();
	t2.start();
		
	
		
	}

}
