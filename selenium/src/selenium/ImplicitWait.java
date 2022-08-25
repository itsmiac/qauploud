package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver browserObject = new ChromeDriver(); 
		browserObject.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		String eTitle = "google";
		
		browserObject.get("https://www.google.com/");
		browserObject.manage().window().maximize();
			String aTitle  = browserObject.getTitle();
		if (aTitle.equals(eTitle));
		
		System.out.println("test passed");
		browserObject.close();
		 

		
		
		
	}

}
