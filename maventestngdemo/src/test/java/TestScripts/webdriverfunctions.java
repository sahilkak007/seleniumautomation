package TestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class webdriverfunctions {

	@Test
	public  void login()
	{
		//invoking  chrome   browser
		
	System.setProperty("webdriver.chrome.driver", 
				"C:\\chromedriver.exe");
    WebDriver  driver=new ChromeDriver();
	//	System.setProperty("webdriver.gecko.driver", "C:\\driver\\"
			//	+ "geckodriver.exe");
		//WebDriver  driver=new FirefoxDriver();
		 
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");	 
    
    
		
		 System.out.println(driver.getTitle());
		 System.out.println(driver.getCurrentUrl());
		 System.out.println(driver.getPageSource());
		 
		 
	}
				 
		 
		 
		 
	}

