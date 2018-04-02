package SeleniumPrograms;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class screenshots_ex
{

	@Test
	public  void screenshot() throws IOException
	{
		
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver   driver=new ChromeDriver();
			
	  driver.get("http://toolsqa.com/automation-practice-form/");
		
		File  src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src, new File("c:\\screenshot\\screen.png"));
		System.out.println("screenshot taken");
		
		
	}
	
	
}
