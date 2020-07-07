package com.home.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class actions {
	
	public WebDriver driver;
	
	public void launchapplication() {
		System.out.println(" LAUNCHING APPLICATION......");
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("http://tutorialsninja.com/demo/");

	}
	
   public void getTitle() {
		
	System.out.println(driver.getTitle()); 
		

	}
	  

}
