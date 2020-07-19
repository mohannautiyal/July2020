package com.home.Selenium.identifiers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumIdentifiers {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.makemytrip.com/flights/");
		 
		 driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 
		 //implicit wait is applied globally for all the web elements for which driver is interacting
		// it is dynamic wait
		 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		// driver.findElement(By.xpath("//span[@class='rightArrow pushRight']")).click();
		 
		 WebElement element = driver.findElement(By.cssSelector(".rightArrow.pushRight"));
		 System.out.println(element.getAttribute("Class"));
		 element.click();
         Thread.sleep(5000);
		 driver.quit();
		 
	//	 driver.findElement(By.className(className))
	//	 driver.findElement(By.cssSelector(selector))
	//	 driver.findElement(By.id(id))
	//	 driver.findElement(By.linkText(linkText))
	//	 driver.findElement(By.name(name))
	//   driver.findElement(By.partialLinkText(linkText))	
	//	 driver.findElement(By.tagName(name))
	//	 driver.findElement(By.xpath(xpathExpression))
		
   
		
		
	}

}
