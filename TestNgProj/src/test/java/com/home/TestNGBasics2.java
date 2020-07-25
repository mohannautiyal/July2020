package com.home;

import org.testng.annotations.Test;

public class TestNGBasics2 {

	
	@Test(priority=1,groups="A")
	public void TestCase1() {
		System.out.println("Executing test case no 1");
	}
	
	@Test(priority=2,groups="B")
	public void TestCase02() {
		System.out.println("Executing test case no 2");

	}
	
	@Test(priority=3,groups="A")
	public void TestCase3() {
		System.out.println("Executing test case no 3");

	}
	
	@Test(priority=4,groups="B")
	public void TestCase4() {
		System.out.println("Executing test case no 4");

	}
}
