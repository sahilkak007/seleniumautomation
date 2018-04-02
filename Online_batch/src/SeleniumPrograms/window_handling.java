package SeleniumPrograms;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class window_handling {

	
	@Test
	public  void  windowhandling_ex() throws InterruptedException
	
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
	//	WebDriver   driver=new ChromeDriver();
			
		ChromeOptions options = new ChromeOptions();

	      options.addArguments("-incognito");

	  //    options.addArguments("--disable-popup-blocking");

	      options.addArguments("start-maximized");

	   WebDriver   driver = new ChromeDriver(options);
		
	  driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	  
	  System.out.println("Title of  page before  clickig  link");
	  System.out.println(driver.getTitle());
		
	  Thread.sleep(3000);
		driver.findElement(By.linkText("Disclaimer")).click();
		
		System.out.println("Title of  page after clickig  link");
		  System.out.println(driver.getTitle());
		
		  
		  Set<String>   wids=  driver.getWindowHandles();
		  
		  Iterator<String>  itr =wids.iterator();
		  
		  String  parent=itr.next();
		  String  child=itr.next();
		  
		  
		  driver.switchTo().window(child);
		  
		  System.out.println("Title of  page after switching to  child");
		  System.out.println(driver.getTitle());
		
				  
		driver.switchTo().window(parent);		  
				  
		 System.out.println("Title of  page after switching back  to  parent");
		  System.out.println(driver.getTitle());
		
	}
}
