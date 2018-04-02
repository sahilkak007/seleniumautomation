package ExcelPrograms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExcelReadTC {

	public  static  XSSFWorkbook  wb;
	public  static XSSFSheet    sh;
	public   static  XSSFRow    row; 
	public  static  XSSFCell cell;
		@Test
	public  void read() throws IOException
	{		System.setProperty
			   ("webdriver.chrome.driver", 
					   "C:\\chromedriver.exe");
		     WebDriver  driver=new ChromeDriver();

		    
		FileInputStream  fis=new FileInputStream("C:\\data\\data.xlsx");
		
		wb=new XSSFWorkbook(fis);
				
	int rows=sh.getPhysicalNumberOfRows();
		cell=wb.getSheetAt(0).getRow(0).getCell(0);
		System.out.println(cell.getStringCellValue());
		String url=cell.getStringCellValue();
		
		//driver.get(url);
		
		
	}
}
