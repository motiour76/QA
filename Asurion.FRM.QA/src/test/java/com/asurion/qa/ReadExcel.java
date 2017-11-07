package com.asurion.qa;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) {

		
		
		 try {
			 
			  // Specify the file path which you want to create or write
			 
			 // File src=new File("C:\\ExcelData\\TestData.xlsx");
		      File src = new File("C:\\Users\\MOTIOUR.RAHMAN\\Desktop\\ASURION\\Asurion.FRM.QA\\TestData.xlsx");

			  // Load the file
			 
			  FileInputStream fis=new FileInputStream(src);
			 
			   // load the workbook
			 
			   XSSFWorkbook wb=new XSSFWorkbook(fis);
			 
			  // get the sheet which you want to modify or create
			 
			   XSSFSheet sh1= wb.getSheetAt(0);
			 
			 // getRow specify which row we want to read and getCell which column
			 
			 System.out.println(sh1.getRow(104).getCell(105).getStringCellValue());
			 
				 
			 
			  } catch (Exception e) {
			 
			   System.out.println(e.getMessage());
			 
			  }

	}

}
