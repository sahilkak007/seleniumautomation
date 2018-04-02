package SeleniumPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class search_autopopulated {

	
	@Test
	public  void  search() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver   driver=new ChromeDriver();
		driver.get("http://www.rediff.com/");
		driver.findElement(By.id("srchword")).sendKeys("wallets");
		//explicit  wait or local wait
		Thread.sleep(4000);
		
		
		List<WebElement> nodrops=driver.findElements(By.xpath
				("//*[contains(@id,'suggest')]"));
		
		
		System.out.println(nodrops.size());
		
		System.out.println(nodrops.get(2));
		
		for(WebElement  obj:nodrops)
		{
			
			if(obj.getText().equalsIgnoreCase("wallets for women"))
			{
				System.out.println(obj.getText());
				obj.click();
				break;
			}
			
		}
		
		
	}
	
	
}
