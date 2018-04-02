package SeleniumPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class webtables_Ex {

@Test
public  void  webtables()
{
	
	ChromeOptions options = new ChromeOptions();

    options.addArguments("-incognito");

    options.addArguments("--disable-popup-blocking");

    options.addArguments("start-maximized");
    System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
  WebDriver  driver = new ChromeDriver(options);
	  driver.get("http://toolsqa.com/automation-practice-table/");
	  
	  //locate the  webtable
	  
	  WebElement  table=driver.findElement(By.className("tsc_table_s13"));
	  
	List<WebElement>  norows=table.findElements(By.tagName("tr"));
	  
	System.out.println(norows.size());
	int i=0;  
	for(WebElement  obj:norows)
	{
		List<WebElement> nocols=obj.findElements(By.tagName("td"));
		
		System.out.println("No of  cols in  each "+i+"th row is"+nocols.size());
		
		for(WebElement  obj2:nocols)
		{
			 if(obj2.getText().equalsIgnoreCase("Mecca"))
			 {
				 System.out.println(obj2.getText());
				 
			 }
			
			//System.out.println(obj2.getText());
		}
		//System.out.println(obj.getText());
		i++;
	}
	
	//  for(WebElement  obj: )
	  
			  
	
}

}
