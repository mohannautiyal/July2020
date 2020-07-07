package com.home;

import static org.testng.Assert.assertTrue;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class testNg {
	
	
	@Test(priority=1)
	public void firstTest() {
		System.out.println("Running first test");
		assertTrue(true);
		
	}
	
	@Test(priority=2,dependsOnMethods= {"firstTest"} )
	public void SecondTest(ITestContext i) {
		System.out.println("Running second test");
		i.setAttribute("TestAttribute",123);
	}
	
	
	@Test(priority=3)
	public void ThirdTest(ITestContext i) {
		System.out.println("Running third test");
		
		System.out.println(i.getAttribute("TestAttribute"));
	}

}
