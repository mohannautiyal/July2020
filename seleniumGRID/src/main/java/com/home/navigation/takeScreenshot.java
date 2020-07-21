package com.home.navigation;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class takeScreenshot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		
		 driver.get("https://www.google.com/");
		 
	        TakesScreenshot scrShot =((TakesScreenshot)driver);
	        File SrcFile=    scrShot.getScreenshotAs(OutputType.FILE);
           
	        FileUtils.copyFile(SrcFile, new File("Google.png"));
          driver.quit();
	}

}
