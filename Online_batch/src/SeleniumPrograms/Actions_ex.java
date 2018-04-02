package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Actions_ex {

	
	@Test
	public  void action_ex() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver   driver=new ChromeDriver();
			
	  driver.get("https://www.amazon.in/");
	  
	  Thread.sleep(4000);
	  WebElement  e1=driver.findElement(By.id("nav-link-yourAccount"));
	  
	  
		
	  Actions  a1=new Actions(driver);
		
	  a1.moveToElement(e1).perform();
		
		//driver.findElement(By.partialLinkText("Orders")).click();
		
	  driver.findElement(By.linkText("Your Wish List")).click();
		driver.navigate().back();
		Thread.sleep(3000);
		
	a1.contextClick().perform();
		
	  
	}
}
