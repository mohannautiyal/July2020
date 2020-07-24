package SeleniumRevision;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		 
		 driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		 
	     driver.findElement(By.cssSelector(".signinbtn")).click();
	     Thread.sleep(3000);

	     Alert popup = driver.switchTo().alert();
	    String alertText =  popup.getText();
	    System.out.println("Alert Text is "+alertText);
	    
	    popup.accept();
	     
	     Thread.sleep(2000);
	     
	     driver.quit();
	
	}

}
