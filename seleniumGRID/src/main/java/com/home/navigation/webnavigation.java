package com.home.navigation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webnavigation {
// Navigating forward and backward 	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		
		 driver.get("https://www.google.com/");
		 Thread.sleep(2000);
		
		 System.out.println("Navigated to " + driver.getTitle());
		 driver.navigate().to("https://www.amazon.in/");
		 Thread.sleep(2000);

		 System.out.println("Navigated to " + driver.getTitle());
		 driver.navigate().back();
		 System.out.println("Navigated to " + driver.getTitle());
		 Thread.sleep(2000);
		 driver.navigate().forward();
		 System.out.println("Navigated to " + driver.getTitle());
		 
		 driver.navigate().refresh(); // Refresh the page
		 Thread.sleep(2000);
         driver.quit();
	}

}
