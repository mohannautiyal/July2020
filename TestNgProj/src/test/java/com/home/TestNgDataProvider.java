package com.home;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.home.dataProviders.testData;

public class TestNgDataProvider {

	@DataProvider
	public Object[][] getData() {

		Object[][] data = new Object[2][2];
		data[0][0] = "Madan";
		data[0][1] = "Test123";

		data[1][0] = "Raj";
		data[1][1] = "453";

		return data;

	}
	
	
	@Test(dataProvider="getData")
	public void TestRunWithData(String param1,String Param2) {
		
		System.out.println("Running for "+param1 +" and "+ Param2);
		
	}

	

	@Test(dataProviderClass=testData.class ,dataProvider="getData001")
	public void TestRunWithDataFromDiffClass(String param1,String Param2) {
		
		System.out.println("Running for "+param1 +" and "+ Param2);
		
	}
}
