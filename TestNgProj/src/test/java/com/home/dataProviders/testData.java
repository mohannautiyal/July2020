package com.home.dataProviders;

import org.testng.annotations.DataProvider;

public class testData {

	
	
	@DataProvider
	public static Object[][] getData001(){
		
		Object[][] data = new Object[2][2];
		data[0][0] = "nautiyalm";
		data[0][1] = "Test123";

		data[1][0] = "nRajesh";
		data[1][1] = "453";

		return data;
		
	}
}
