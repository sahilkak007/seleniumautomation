package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter_ex {
  
	WebDriver   driver;
	
	@Parameters({"userid","password", "browser"})
	@Test
  public void login(String user,String pass,String browser) 
	{
		System.out.println(user);
		System.out.println(pass);
if(browser.equalsIgnoreCase("chrome"))
{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		driver=new ChromeDriver();
}
else if(browser.equalsIgnoreCase("firefox"))
{
	System.out.println("firefox  is invoked");
}
else{

	
	System.out.println("ie  is  invoked");
}

		
   	   driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
   	  driver.findElement(By.cssSelector("#login1")).sendKeys(user);
 	
 	  
 	  driver.findElement(By.xpath("//*[@id='password']")).sendKeys(pass);
 	  
  }
}
