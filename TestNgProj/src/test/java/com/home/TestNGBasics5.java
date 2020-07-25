package com.home;

import org.testng.annotations.Test;

public class TestNGBasics5 {

	
	/*
	 * @Test(timeOut=2000) public void InfiniteLoop() { int i=1;
	 * 
	 * while(i==1) {
	 * 
	 * System.out.println("Running ..."+i); } }
	 */
	
	@Test(expectedExceptions = ArithmeticException.class)
	public void ExceptionTest() {
		System.out.println("Starting Exception");
		int i =10/0;
		System.out.println("Test Not Terminated");
	}
	
	
	
	
}
