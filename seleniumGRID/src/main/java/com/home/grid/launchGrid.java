package com.home.grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class launchGrid {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {

  // 1) Define desird Capablities
   DesiredCapabilities ds = new DesiredCapabilities();
   ds.setBrowserName("chrome");
   ds.setPlatform(Platform.ANY);
	
   // 2) Define chrome Options
	ChromeOptions options = new ChromeOptions();
	options.merge(ds);
	
	String huburl ="http://192.168.0.106:4444/wd/hub/";
     WebDriver driver = new RemoteWebDriver(new URL(huburl),options);
   
     driver.get("https://www.google.com/");
     System.out.println( driver.getTitle());
     Thread.sleep(5000);;
    
     driver.quit();
     
	}

}
