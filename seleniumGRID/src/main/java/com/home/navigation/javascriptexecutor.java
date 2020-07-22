package com.home.navigation;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptexecutor {
	
	
	/*
	 * JavaScriptExecutor is an interface that provides a mechanism to execute
	 * Javascript through selenium driver. It provides “executescript” &
	 * “executeAsyncScript” methods, to run JavaScript in the context of the
	 * currently selected frame or window.
	 */

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		
		 driver.get("https://www.google.com/");
		 
		 // Generate Alert Pop Window 
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		  js.executeScript("alert('Hello how are you');");
		  Thread.sleep(3000);
		  driver.switchTo().alert().dismiss();
		  
		  driver.findElement(By.name("q")).sendKeys("Java Script Executor");
		  // Click
		  js.executeScript("arguments[0].click();",driver.findElement(By.name("btnK")));

		  Thread.sleep(2000);
		  //Refresh browser
		  js.executeScript("history.go(0)");
		  Thread.sleep(2000);

		  //Get Title of a WebPage
		  String sTitle =  js.executeScript("return document.title;").toString();
		  
		  String sText =  js.executeScript("return document.documentElement.innerText;").toString();
		  System.out.println(sTitle);
		  
		  //Scroll Page
		  js.executeScript("window.scrollBy(0,850)");
		  Thread.sleep(2000);
		  
		  driver.quit();
	}

}
