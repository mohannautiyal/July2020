package com.home.thread;

import com.home.pages.GooglePage;

public class GoogleThread extends Thread {
	
	public String browser;
	public GooglePage googlePage;
	
	public GoogleThread(String ThreadName, String browserName) {
		
		super();
		this.browser = browserName;
		googlePage = new GooglePage();
	}

	
	public void run() {
		System.out.println("Thread "+Thread.currentThread().getName()+" started...");
		try {
			googlePage.setUp(this.browser);
			googlePage.SearchGoogle();
			Thread.sleep(1000);
			}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		finally {
			googlePage.teardown();
		}
	}
	
	
}
