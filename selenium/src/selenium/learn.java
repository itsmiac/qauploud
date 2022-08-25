package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class learn {


	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");

		 WebDriver driver = new ChromeDriver();
		/* 
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(2, TimeUnit.MINUTES);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.get("http://www.google.com/");
		driver.get("http://training.qaonlinetraining.com/testPage.php");
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());

	*/
		 
		 
		driver.navigate().back();
		Thread.sleep(800);
		driver.navigate().forward();
		Thread.sleep(800);
		driver.navigate().refresh();
		Thread.sleep(800);
	
		driver.close();
	}
}