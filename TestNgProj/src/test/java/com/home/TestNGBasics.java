package com.home;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {
	
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Running Before Suite ..");
	}
	
	
	@AfterSuite
	public void Aftersuite() {
		System.out.println("Running After Suite ...");

	}
	
	@BeforeTest
	public void BeforeTest() {
		System.out.println("Running Before Test ..");

	}
	
	@AfterTest
	public void AfterTest() {
		System.out.println("Running After Test ...");

	}
	
	
	@BeforeClass
	public void BeforeClass() {
		System.out.println("Running Before Class ..");

	}

	@AfterClass
	public void AfterClass() {
		System.out.println("Running After Class ...");

	}
	
		
	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("Running Before Method ..");

	}
	
	@AfterMethod
	public void AfterMethod() {
		System.out.println("Running After Method ..");

	}
	
	
	@Test
	public void TestNo1() {
		System.out.println("Running Test No 1 ..");

	}
	
	@Test
	public void TestNo2() {
		System.out.println("Running Test No 2 ...");

	}
}
