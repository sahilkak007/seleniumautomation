package SeleniumPrograms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class webdriver_demo 
{
	
	//1st step
	Properties  prop=new Properties();
	@Test
	public  void   login() throws IOException
	{
		//Locate the property file
		FileInputStream fis=new FileInputStream("C:\\JavaExample\\Online_batch\\data.property");
		
				prop.load(fis);
				
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver   driver=new ChromeDriver();
			
	  driver.get(prop.getProperty("url"));
	
	
	  System.out.println(driver.getTitle());
	  System.out.println(driver.getCurrentUrl());
	
	  
	  driver.findElement(By.cssSelector("#login1")).sendKeys(prop.getProperty("user"));
	
	  driver.findElement(By.xpath("//*[@id='password']")).sendKeys(prop.getProperty("pass"));

	  
	}
	

	
	
	
}
