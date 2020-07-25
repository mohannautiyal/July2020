package com.home;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class TestNGBasics3 {

	
	
	@Test(priority=1)
	public void Login() {
		
		System.out.println("Logging into Application");
		assertTrue(false);
	}
	
	
	//@Test(priority=2)
	@Test(priority=2,dependsOnMethods="Login")

	public void CheckHomePage() {
		System.out.println("Verifying Home Page");
	}
}
