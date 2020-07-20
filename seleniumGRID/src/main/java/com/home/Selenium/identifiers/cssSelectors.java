package com.home.Selenium.identifiers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelectors {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.blazemeter.com/");
		 
		 driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		//1 css with class 
		String PageHeader = driver.findElement(By.cssSelector(".home-features_title")).getText();
		 System.out.println(PageHeader);
		// css with attribute
		 driver.findElement(By.cssSelector("a[href='/case-study']")).click();
		// css with id
		String PageHeaderCustomer= driver.findElement(By.cssSelector("#case_studies_page_top_image_title")).getText();
		System.out.println(PageHeaderCustomer);
		
		//css with multiattribute
		driver.findElement(By.cssSelector("a[class='start-testing-btn'][href='https://a.blazemeter.com/app/sign-up']")).click();
		
		driver.findElement(By.cssSelector("#firstName")).sendKeys("Testing");
		driver.findElement(By.cssSelector("input[id*='last']")).sendKeys("LastName");
		
		// first of type
		driver.findElement(By.cssSelector(".rounded.form-control.bzm-input>input:first-of-type")).sendKeys("fistoftype");
		Thread.sleep(5000);;
		driver.quit();
		 
	}
	
	
	
	/*
	 * Css Selector is faster than Xpath
	 * 
	 * 1) Id->htmltag#id, #id 2) Class->htmltag.classname, .classname,
	 * cls1.cls2.cls3, html.c1.c2.c3… cn 3) Parent>childtag 4) Tag[id=’value’
	 * 
	 * Css with multiple attributes
	 * 
	 * contains
	 * input[id*='user']
	 * 
	 * startwith
	 * input[id^='u']
	 * 
	 * ending
	 * input[id$='e']
	 */


}
