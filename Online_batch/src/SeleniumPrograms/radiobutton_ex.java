package SeleniumPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class radiobutton_ex {

	@Test
	public  void  radiotest()
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver   driver=new ChromeDriver();
			
	  driver.get("http://toolsqa.com/automation-practice-form/");
	  
	  JavascriptExecutor   js=(JavascriptExecutor)(driver);
	  
	  
	  js.executeScript("window.scrollBy(0,500)");
	List<WebElement> noradio=	driver.findElements(By.xpath("//*[@type='radio']"));
		
		System.out.println(noradio.size());
		
		for(WebElement  obj:noradio)
		{
			if(obj.getAttribute("value").equalsIgnoreCase("Female"))
			{
			  System.out.println(obj.getAttribute("value"));
			  System.out.println(obj.getAttribute("checked"));
			  
			  if (obj.getAttribute("checked")==null)
			  {
			    obj.click();
			  }
		}
		
		
		
	}
	
}
}