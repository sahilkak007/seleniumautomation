package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testngannotaion {
  WebDriver   driver;
	@Test(priority=0)
  public void openbrowser()
  {
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
	  driver=new ChromeDriver();
	  //System.out.println("browser is  opened");	  
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
  }
  
  @Test(priority=25)
  public  void  blogin()
  {
	  
	  driver.findElement(By.cssSelector("#login1")).sendKeys("user@redffmail.com");
		 // driver.findElement(By.xpath("//*[@id='login1']")).sendKeys("user@rediffmail.com");
		  
		  driver.findElement(By.xpath("//*[@id='password']")).sendKeys("pass223");
	//  System.out.println("login is  successful");
	  
  }
  
  @Test(priority=45)
  public  void  clogout()
  {
	  
	   driver.close();
	  
  }
}
