package SeleniumPrograms;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class gmaildropdown_ex {

	@Test
	public  void  dropdowntest() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver   driver=new ChromeDriver();
			//global  wait
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
	  driver.get("https://accounts.google.com/SignUp?hl=en");
	  
		WebElement  bday=driver.findElement(By.xpath("//*[@id='BirthMonth']/div[1]"));
		
		//advanced explicit wait
		WebDriverWait  wait=new WebDriverWait(driver, 10);
		
		wait.until(ExpectedConditions.elementToBeClickable(bday));
		bday.click();
	//local wait	
	Thread.sleep(4000);
		 List<WebElement>    nodrops= driver.findElements
				 (By.className("goog-menuitem"));
		
		 System.out.println(nodrops.size());
		 
		 for(WebElement  obj:nodrops)
		 {
			 if(obj.getText().equalsIgnoreCase("June"))
			 {
			    System.out.println(obj.getText());
			      obj.click();
			      break;
			 }
			 
			 
		 }
		 
	}
	
	
}
