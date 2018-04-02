package SeleniumPrograms;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class alert_ex {

	
	@Test
	public  void  alertTC() throws InterruptedException
	{
		
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver   driver=new ChromeDriver();
				
	  driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	  driver.findElement(By.name("proceed")).click();
	  
	  Alert al=driver.switchTo().alert();
	  
	  System.out.println(al.getText());
	  
	  Thread.sleep(3000);
	 // al.accept();
	  al.dismiss();
	  
	  
	  
	  
		
	}
}
