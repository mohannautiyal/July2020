package com.home.navigation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

// Implicit vs Explicit wait

public class explicitwait {
	 static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		  driver = new ChromeDriver();
		 driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		
		 driver.get("https://www.google.com/");
		 
		
		driver.findElement(By.cssSelector(".gLFyf.gsfi")).sendKeys("Webdriver wait");
		 clickElement(10,driver.findElement(By.cssSelector(".gNO89b")));
           Thread.sleep(5000);
		driver.quit();
		

		
	}
	
	
	public static void clickElement(int timeout,WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(element)).click();
		
	}

}
