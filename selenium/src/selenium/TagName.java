package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {

	public static void main(String[] args) {
		 WebDriver driver ;
		 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		 driver = new ChromeDriver();
		 
		 driver.get("https://www.itlearn360.com/");
		 int count=0;
		 
		 List <WebElement > alllinks= driver.findElements(By.tagName("a"));
		  for (WebElement links: alllinks ) {
			  System.out.println(links.getAttribute("href"));
			  count ++;
			  
		  }
		 System.out.println("total number od links present" +count);
		 
		 driver.close();
		 
		 
       	
        }
	}

