package ExcelPrograms;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class excelwrite 
{
	
	

	public  static  XSSFWorkbook  wb;
	public  static XSSFSheet    sh;
	public   static  XSSFRow    row; 
	public  static  XSSFCell cell;
	
	@Test
	public   void  writedata() throws IOException
	{
		
		FileInputStream  fis=new FileInputStream("C:\\data\\data.xlsx");
		
		wb=new XSSFWorkbook(fis);
		sh=wb.getSheet("credentials");
		
		//setcelldata-until  unless  we have existing row or cell
		
		XSSFRow  r1=sh.getRow(0);   //accesing the  header  row  here
		
		
	XSSFCell   r1c3=r1.createCell(2);  //create  a  cell
	
	r1c3.setCellValue("Status");
	
	XSSFRow   r2=sh.getRow(1);
	
	
	//r2.getCell(2).setCellValue("Passed");
	XSSFCell  r2c3=r2.createCell(2);
	//r2c3.setCellValue("Passed");
	
	r2c3.setCellValue("Failed");
		
		FileOutputStream  fout=new FileOutputStream("C:\\data\\data.xlsx");
		
		wb.write(fout);
		fout.close();
	}

}
