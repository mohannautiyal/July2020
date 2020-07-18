package com.home.sync;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumSyncronization {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		  
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.makemytrip.com/flights/");
		 
		 driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 
		 //implicit wait is applied globally for all the web elements for which driver is interacting
		// it is dynamic wait
		 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.findElement(By.xpath("//div[@data-cy='outsideModal']")).click();
		 Thread.sleep(5000);
		 driver.quit();
	}

}
