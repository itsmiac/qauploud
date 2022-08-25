package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName1 {

	public static void main(String[] args) {
		 WebDriver browserObject;
		 System.getProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
	     
		   browserObject = new ChromeDriver();
		 browserObject.get("https://www.itlearn360.com/");
	
int count=0;
List <WebElement> allLinks = browserObject.findElements(By.tagName("a"));

for (WebElement links : allLinks ) {
	
 System.out.println(links.getAttribute("href "));
 
count ++;
}
System.out.println("total number of links present: "+count);
browserObject.close();


	}
	}

