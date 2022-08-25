package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://training.qaonlinetraining.com/testPage.php");
		
		Select countrySelect = new Select(driver.findElement(By.name("country")));
	 countrySelect.selectByVisibleText("USA");
	
	
	 
		driver.findElement(By.name("submit")).click();
		  System.out.println("Form Fill-up Succesfull");
		 
		driver.close();
	}

}
