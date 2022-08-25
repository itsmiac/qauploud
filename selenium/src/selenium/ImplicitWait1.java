package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
 WebDriver driver = new ChromeDriver ();
 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
 String eTitle = "google";
 driver.get("https://www.google.com/");
 driver.manage().window().maximize();
 String eTitle1 = driver.getTitle();
 if (eTitle.equals(eTitle1));
 {
	 System.out.println("test passed");
	 
 }
  driver.close();
	}

}
