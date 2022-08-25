package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton1 {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver ();
    driver.get("http://training.qaonlinetraining.com/testPage.php");
	
	
	
	WebElement radioButtonFemale = driver.findElement(By.xpath("/html/body/form/input[4]"));
	WebElement radioButtonMale = driver.findElement(By.xpath("/html/body/form/input[5]"));
	WebElement radioButtonOther = driver.findElement(By.xpath("/html/body/form/input[5]"));
	WebElement radioButtonSubmit = driver.findElement(By.xpath("/html/body/form/input[11]"));
	
	
	radioButtonFemale.click();
	radioButtonMale.click();
	radioButtonOther.click();
	radioButtonSubmit.click();
	
    Thread.sleep(4000);
    
    driver.close();
	
	
	
	
	
	
	
	
	
	
	}
}
