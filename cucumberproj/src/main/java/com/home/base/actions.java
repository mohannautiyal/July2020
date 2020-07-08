package com.home.base;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class actions {
	
	public WebDriver driver;
	
	public boolean launchapplication() {
		System.out.println(" LAUNCHING APPLICATION......");
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("http://tutorialsninja.com/demo/");
		driver.manage().window().fullscreen();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		String str =driver.getPageSource();
	 return	str.contains("http://tutorialsninja.com/demo/");

	}
	
   public String getTitle() {
	
	String title = driver.getTitle();
	System.out.println("Title of the Page is " +title); 
	return title;	

	}
   
   public boolean verifyCategory(String categoryName) {
	  List<WebElement> category= driver.findElements(By.xpath("//a[contains(text(),'"+categoryName+"')]"));
	   if (category.size()>0) {
	  WebElement element =category.stream().filter(x -> x.getText().equals(categoryName)).findAny().orElse(null);
	  
	  if (element==null)
	   return false;
	   else
	   {
		   System.out.println("Looking for category ..." +element.getText());
		   return true;}

	   }
	   return false;
   }
	  

}
