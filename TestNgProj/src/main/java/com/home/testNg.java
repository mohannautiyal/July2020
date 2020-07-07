package com.home;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class testNg {
	
	
	@Test(priority=1)
	public void firstTest() {
		System.out.println("Running first test");
		assertTrue(false);
		
	}
	
	@Test(priority=2,dependsOnMethods= {"firstTest"} )
	public void SecondTest() {
		System.out.println("Running second test");
		
	}
	
	
	@Test(priority=3)
	public void ThirdTest() {
		System.out.println("Running third test");
		
	}

}
