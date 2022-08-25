package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver driver =new ChromeDriver ();
		
		driver.get("http://training.qaonlinetraining.com/testPage.php");
		WebElement checkboxboat = driver.findElement(By.xpath("/html/body/form/input[7]"));
		WebElement checkboxcar = driver.findElement(By.xpath("/html/body/form/input[8]"));
		WebElement checkboxbike = driver.findElement(By.xpath("/html/body/form/input[7]"));
		WebElement checkboxhourse = driver.findElement(By.xpath("/html/body/form/input[10]"));
		
		checkboxboat.click();
		checkboxcar.click();
		checkboxbike.click();
		checkboxhourse.click();
		
	Thread.sleep(6000);
	driver.close();
	
	}

}
