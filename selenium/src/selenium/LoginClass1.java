package selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginClass1 {

	public static void main(String[] args) {
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
	driver = new ChromeDriver ();
	
		driver.get("https://admin-demo.nopcommerce.com/login");
		
		WebElement email = driver.findElement(By.id("email"));
		
       email.clear();
       WebElement password = driver.findElement(By.id("password"));
       password.clear();
      
       email.sendKeys("admin@yourstore.com");
       password.sendKeys("admin");
       
	 WebElement button1 = driver.findElement(By.className("button1"));
	 button1.submit();
	 driver.close();
	 
	}
	

}
 