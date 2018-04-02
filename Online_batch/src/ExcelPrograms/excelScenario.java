package ExcelPrograms;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class excelScenario {

	
	public  static  XSSFWorkbook  wb;
	public  static XSSFSheet    sh;
	public   static  XSSFRow    row; 
	public  static  XSSFCell cell;
	public  static  WebDriver driver;
	@Test
	public  void  login() throws IOException
	{
		
		System.setProperty
		   ("webdriver.chrome.driver", 
				   "C:\\chromedriver.exe");
	      

	    
	FileInputStream  fis=new FileInputStream("C:\\data\\data.xlsx");
	
	wb=new XSSFWorkbook(fis);
	sh=wb.getSheet("credentials");
	
  int rows=sh.getPhysicalNumberOfRows();
		
		for(int i=1;i<rows; i++)
		{
			driver=new ChromeDriver();
			driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
			
			String  emailid=sh.getRow(i).getCell(0).getStringCellValue();
			
			driver.findElement(By.id("login1")).sendKeys(emailid);
			
			
			String pass=sh.getRow(i).getCell(1).getStringCellValue();
			
			driver.findElement(By.id("password")).sendKeys(pass);
			
			
		}
		
		
	}
	
}
