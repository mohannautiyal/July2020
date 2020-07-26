package com.home;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGBasics3 {

	
	@Parameters({"param1","param2"})
	@Test(priority=1)
	public void Login(String param1,String param2) {
		
		System.out.println("Logging into Application with "+param1+" "+param2);
		assertTrue(true);
	}
	
	
	//@Test(priority=2)
	@Test(priority=2,dependsOnMethods="Login")

	public void CheckHomePage() {
		System.out.println("Verifying Home Page");
	}
}
