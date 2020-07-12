package com.home.pages;

import org.openqa.selenium.By;

import com.home.grid.baseClass;

public class GooglePage extends baseClass {
	
	public void SearchGoogle() {
		driver.findElement(By.name("q")).sendKeys("MultiThreading");
		driver.findElement(By.name("q")).submit();
		driver.findElements(By.xpath("//h3")).stream().filter(elem->(elem.getText().length()>0)).forEach(x -> System.out.println(x.getText()));
	}

	
	public void teardown() {
		driver.quit();
	}
	
	
	
}
