package SeleniumPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class links_ex {

	@Test
	public  void linkTC()
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver   driver=new ChromeDriver();
			
	  driver.get("https://www.ebay.in/");
	  
	   List<WebElement>   nolinks=driver.findElements(By.tagName("a"));
	   
	   System.out.println(nolinks.size());
	   
	   
	   for(WebElement  obj: nolinks)
	   {
		   
		   System.out.println(obj.getText());
	   }
	   
		
	}
	
}
