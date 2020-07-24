package SeleniumRevision;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		 
		 driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		 
		driver.findElement(By.cssSelector("input[type='file']")).sendKeys("E:\\July2020\\seleniumGRID\\GRIDNotes");
		Thread.sleep(4000);
		
		driver.quit();
		
	}

}
