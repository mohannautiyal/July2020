package com.home;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class TestNGBasics4 {
	
	// Running same test multiple times
	@Test(invocationCount=10)
	public void TestA() {
		int a=10;
		int b =20;
				assertTrue(a+b ==30);
				System.out.println("Test has Passed ....");
	}

}
