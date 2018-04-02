package SeleniumPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class frames_ex {

	
	@Test
	public  void frames()
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
		     
		      options.addArguments("start-maximized");

		   WebDriver   driver = new ChromeDriver(options);
			
		  driver.get("https://netbanking.hdfcbank.com/netbanking/");
		  
		//  driver.findElement(By.className("input_password")).sendKeys("1234");
		List<WebElement>  noframes=driver.findElements(By.tagName("frame"));
		
		System.out.println(noframes.size());
		//swithcing via  index
	//driver.switchTo().frame(0);
		
	//	driver.findElement(By.className("input_password")).sendKeys("1234");
		
		
		//2nd  way is   switching  using name
		//driver.switchTo().frame("login_page");
	//	driver.findElement(By.className("input_password")).sendKeys("12345");
		
		
		//3rd  way  using webelement
		
		WebElement   frame1=driver.findElement(By.name("login_page"));
		
		driver.switchTo().frame(frame1);
		//driver.findElement(By.className("input_password")).sendKeys("1234678");
		
		
		driver.findElement(By.cssSelector(".input_password")).sendKeys("1234");
		driver.switchTo().defaultContent();
		
		
	driver.switchTo().frame(1);
	
		
	driver.findElement(By.partialLinkText("Privacy")).click();	
		
		
		
	}
	
}
