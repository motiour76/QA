package com.asurion.model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Random;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FRM_Rules_Model1 {
	
	
	public static String excelReader() throws Exception {
		
		  File src=new File("C:\\ExcelData\\TestData.xlsx");
			 
		  // Load the file
		 
		  FileInputStream fis=new FileInputStream(src);
		 
		   // load the workbook
		 
		   XSSFWorkbook wb=new XSSFWorkbook(fis);
		 
		  // get the sheet which you want to modify or create
		 
		   XSSFSheet sh1= wb.getSheetAt(0);
		   
		 String rep=   sh1.getRow(0).getCell(0).getStringCellValue();

		
		wb.close();
		return rep;
		
	}

	
	public String requestingChannel() throws Exception {
		
		 File src=new File("C:\\ExcelData\\TestData.xlsx");
		 FileInputStream fis=new FileInputStream(src);
	     XSSFWorkbook wb=new XSSFWorkbook(fis);
	     XSSFSheet sh1= wb.getSheetAt(0);
		 String requestingChannel=   sh1.getRow(1).getCell(0).getStringCellValue();
		 wb.close();
		 return requestingChannel;
	}
	
	public String getStringReqTypeCode() throws Exception {
		
		 File src=new File("C:\\ExcelData\\TestData.xlsx");
		 FileInputStream fis=new FileInputStream(src);
	     XSSFWorkbook wb=new XSSFWorkbook(fis);
	     XSSFSheet sh1= wb.getSheetAt(0);
		 String getStringReqTypeCode=   sh1.getRow(2).getCell(1).getStringCellValue();
		 wb.close();
		 return getStringReqTypeCode;
	}
	
	public String getStringReqStatusCode() throws Exception {
		
		 File src=new File("C:\\ExcelData\\TestData.xlsx");
		 FileInputStream fis=new FileInputStream(src);
	     XSSFWorkbook wb=new XSSFWorkbook(fis);
	     XSSFSheet sh1= wb.getSheetAt(0);
		 String rep=   sh1.getRow(1).getCell(1).getStringCellValue();
		 wb.close();
		 return rep;
	}
	
	public String getStringFailureCode() throws Exception {
		
		 File src=new File("C:\\ExcelData\\TestData.xlsx");
		 FileInputStream fis=new FileInputStream(src);
	     XSSFWorkbook wb=new XSSFWorkbook(fis);
	     XSSFSheet sh1= wb.getSheetAt(0);
		 String rep=   sh1.getRow(2).getCell(1).getStringCellValue();
		 wb.close();
		 return rep;
	}
	
	public String getStringETypeCode() throws Exception {
		
		 File src=new File("C:\\ExcelData\\TestData.xlsx");
		 FileInputStream fis=new FileInputStream(src);
	     XSSFWorkbook wb=new XSSFWorkbook(fis);
	     XSSFSheet sh1= wb.getSheetAt(0);
		 String rep=   sh1.getRow(3).getCell(1).getStringCellValue();
		 wb.close();
		 return rep;
	}
	
	public String getStringSource() throws Exception {
		
		 File src=new File("C:\\ExcelData\\TestData.xlsx");
		 FileInputStream fis=new FileInputStream(src);
	     XSSFWorkbook wb=new XSSFWorkbook(fis);
	     XSSFSheet sh1= wb.getSheetAt(0);
		 String rep=   sh1.getRow(4).getCell(1).getStringCellValue();
		 wb.close();
		 return rep;
	}
	
	
	public String getStringChanelName() throws Exception {
		
		 File src=new File("C:\\ExcelData\\TestData.xlsx");
		 FileInputStream fis=new FileInputStream(src);
	     XSSFWorkbook wb=new XSSFWorkbook(fis);
	     XSSFSheet sh1= wb.getSheetAt(0);
		 String rep=   sh1.getRow(5).getCell(1).getStringCellValue();
		 wb.close();
		 return rep;
	}
	
	
	public String getStringAgentName() throws Exception {
		
		 File src=new File("C:\\ExcelData\\TestData.xlsx");
		 FileInputStream fis=new FileInputStream(src);
	     XSSFWorkbook wb=new XSSFWorkbook(fis);
	     XSSFSheet sh1= wb.getSheetAt(0);
		 String rep=   sh1.getRow(6).getCell(1).getStringCellValue();
		 wb.close();
		 return rep;
	}
	
	public String getProvince() throws Exception {
		
		 File src=new File("C:\\ExcelData\\TestData.xlsx");
		 FileInputStream fis=new FileInputStream(src);
	     XSSFWorkbook wb=new XSSFWorkbook(fis);
	     XSSFSheet sh1= wb.getSheetAt(0);
		 String rep=   sh1.getRow(7).getCell(1).getStringCellValue();
		 wb.close();
		 return rep;
	}
	
	public String getResCode() throws Exception {
		
		 File src=new File("C:\\ExcelData\\TestData.xlsx");
		 FileInputStream fis=new FileInputStream(src);
	     XSSFWorkbook wb=new XSSFWorkbook(fis);
	     XSSFSheet sh1= wb.getSheetAt(0);
		 String rep=   sh1.getRow(8).getCell(1).getStringCellValue();
		 wb.close();
		 return rep;
	}
	
	
	public String getwarrantySKU() throws Exception {
		
		 File src=new File("C:\\ExcelData\\TestData.xlsx");
		 FileInputStream fis=new FileInputStream(src);
	     XSSFWorkbook wb=new XSSFWorkbook(fis);
	     XSSFSheet sh1= wb.getSheetAt(0);
		 String rep=   sh1.getRow(9).getCell(1).getStringCellValue();
		 wb.close();
		 return rep;
	}
	
	public String getContract_Create_Channel() throws Exception {
		
		 File src=new File("C:\\ExcelData\\TestData.xlsx");
		 FileInputStream fis=new FileInputStream(src);
	     XSSFWorkbook wb=new XSSFWorkbook(fis);
	     XSSFSheet sh1= wb.getSheetAt(0);
		 String rep=   sh1.getRow(10).getCell(1).getStringCellValue();
		 wb.close();
		 return rep;
	}
	
	public String getcontract_Created_By() throws Exception {
		
		 File src=new File("C:\\ExcelData\\TestData.xlsx");
		 FileInputStream fis=new FileInputStream(src);
	     XSSFWorkbook wb=new XSSFWorkbook(fis);
	     XSSFSheet sh1= wb.getSheetAt(0);
		 String rep=   sh1.getRow(11).getCell(1).getStringCellValue();
		 wb.close();
		 return rep;
	}
	
	
	public String receipt_Status_Code() throws Exception {
		
		 File src=new File("C:\\ExcelData\\TestData.xlsx");
		 FileInputStream fis=new FileInputStream(src);
	     XSSFWorkbook wb=new XSSFWorkbook(fis);
	     XSSFSheet sh1= wb.getSheetAt(0);
		 String rep=   sh1.getRow(12).getCell(1).getStringCellValue();
		 wb.close();
		 return rep;
	}
	
	
	
	public String clientID() throws Exception {
		
		 File src=new File("C:\\ExcelData\\TestData.xlsx");
		 FileInputStream fis=new FileInputStream(src);
	     XSSFWorkbook wb=new XSSFWorkbook(fis);
	     XSSFSheet sh1= wb.getSheetAt(0);
		 String clientID=   sh1.getRow(13).getCell(1).getRawValue();
		 wb.close();
		 return clientID;
	}
	
	
	
	public String isBulky() throws Exception {
		
		 File src=new File("C:\\ExcelData\\TestData.xlsx");
		 FileInputStream fis=new FileInputStream(src);
	     XSSFWorkbook wb=new XSSFWorkbook(fis);
	     XSSFSheet sh1= wb.getSheetAt(0);
		 String isBulky=   sh1.getRow(14).getCell(1).getRawValue();
		 wb.close();
		 return isBulky;
	}
	
	
	public String client_Name() throws Exception {
		
		 File src=new File("C:\\ExcelData\\TestData.xlsx");
		 FileInputStream fis=new FileInputStream(src);
	     XSSFWorkbook wb=new XSSFWorkbook(fis);
	     XSSFSheet sh1= wb.getSheetAt(0);
		 String client_Name=   sh1.getRow(15).getCell(1).getRawValue();
		 wb.close();
		 return client_Name;
	}
	
	public String product_Name() throws Exception {
		
		 File src=new File("C:\\ExcelData\\TestData.xlsx");
		 FileInputStream fis=new FileInputStream(src);
	     XSSFWorkbook wb=new XSSFWorkbook(fis);
	     XSSFSheet sh1= wb.getSheetAt(0);
		 String product_Name=   sh1.getRow(16).getCell(1).getRawValue();
		 wb.close();
		 return product_Name;
	}
	
	public String product_Name_Incident() throws Exception {
		
		 File src=new File("C:\\ExcelData\\TestData.xlsx");
		 FileInputStream fis=new FileInputStream(src);
	     XSSFWorkbook wb=new XSSFWorkbook(fis);
	     XSSFSheet sh1= wb.getSheetAt(0);
		 String product_Name_Incident=   sh1.getRow(17).getCell(1).getRawValue();
		 wb.close();
		 return product_Name_Incident;
	}
	
	
	public String product_Brand() throws Exception {
		
		 File src=new File("C:\\ExcelData\\TestData.xlsx");
		 FileInputStream fis=new FileInputStream(src);
	     XSSFWorkbook wb=new XSSFWorkbook(fis);
	     XSSFSheet sh1= wb.getSheetAt(0);
		 String product_Brand=   sh1.getRow(18).getCell(1).getRawValue();
		 wb.close();
		 return product_Brand;
	}
	
	
	public String product_Category() throws Exception {
		
		 File src=new File("C:\\ExcelData\\TestData.xlsx");
		 FileInputStream fis=new FileInputStream(src);
	     XSSFWorkbook wb=new XSSFWorkbook(fis);
	     XSSFSheet sh1= wb.getSheetAt(0);
		 String product_Category=   sh1.getRow(19).getCell(1).getRawValue();
		 wb.close();
		 return product_Category;
	}
	
	public String product_Class() throws Exception {
		
		 File src=new File("C:\\ExcelData\\TestData.xlsx");
		 FileInputStream fis=new FileInputStream(src);
	     XSSFWorkbook wb=new XSSFWorkbook(fis);
	     XSSFSheet sh1= wb.getSheetAt(0);
		 String product_Class=   sh1.getRow(20).getCell(1).getRawValue();
		 wb.close();
		 return product_Class;
	}
	
	
	public String product_Industry() throws Exception {
		
		 File src=new File("C:\\ExcelData\\TestData.xlsx");
		 FileInputStream fis=new FileInputStream(src);
	     XSSFWorkbook wb=new XSSFWorkbook(fis);
	     XSSFSheet sh1= wb.getSheetAt(0);
		 String product_Industry=   sh1.getRow(21).getCell(1).getRawValue();
		 wb.close();
		 return product_Industry;
	}
	
	public String model() throws Exception {
		
		 File src=new File("C:\\ExcelData\\TestData.xlsx");
		 FileInputStream fis=new FileInputStream(src);
	     XSSFWorkbook wb=new XSSFWorkbook(fis);
	     XSSFSheet sh1= wb.getSheetAt(0);
		 String model=   sh1.getRow(22).getCell(1).getRawValue();
		 wb.close();
		 return model;
	}
	
	
	public String product_Description() throws Exception {
		
		 File src=new File("C:\\ExcelData\\TestData.xlsx");
		 FileInputStream fis=new FileInputStream(src);
	     XSSFWorkbook wb=new XSSFWorkbook(fis);
	     XSSFSheet sh1= wb.getSheetAt(0);
		 String product_Description=   sh1.getRow(23).getCell(1).getRawValue();
		 wb.close();
		 return product_Description;
	}
	
	public String customer_First_Name() throws Exception {
		
		 File src=new File("C:\\ExcelData\\TestData.xlsx");
		 FileInputStream fis=new FileInputStream(src);
	     XSSFWorkbook wb=new XSSFWorkbook(fis);
	     XSSFSheet sh1= wb.getSheetAt(0);
		 String customer_First_Name=   sh1.getRow(24).getCell(1).getRawValue();
		 wb.close();
		 return customer_First_Name;
	}
	
	
	public String customer_Last_Name() throws Exception {
		
		 File src=new File("C:\\ExcelData\\TestData.xlsx");
		 FileInputStream fis=new FileInputStream(src);
	     XSSFWorkbook wb=new XSSFWorkbook(fis);
	     XSSFSheet sh1= wb.getSheetAt(0);
		 String customer_Last_Name=   sh1.getRow(25).getCell(1).getRawValue();
		 wb.close();
		 return customer_Last_Name;
	}
	
	
	public String auth_Type() throws Exception {
		
		 File src=new File("C:\\ExcelData\\TestData.xlsx");
		 FileInputStream fis=new FileInputStream(src);
	     XSSFWorkbook wb=new XSSFWorkbook(fis);
	     XSSFSheet sh1= wb.getSheetAt(0);
		 String auth_Type=   sh1.getRow(26).getCell(1).getRawValue();
		 wb.close();
		 return auth_Type;
	}
	
	
	public String auth_Status() throws Exception {
		
		 File src=new File("C:\\ExcelData\\TestData.xlsx");
		 FileInputStream fis=new FileInputStream(src);
	     XSSFWorkbook wb=new XSSFWorkbook(fis);
	     XSSFSheet sh1= wb.getSheetAt(0);
		 String auth_Status=   sh1.getRow(27).getCell(1).getRawValue();
		 wb.close();
		 return auth_Status;
	}
	
	
	public String address_Type_Code() throws Exception {
		
		 File src=new File("C:\\ExcelData\\TestData.xlsx");
		 FileInputStream fis=new FileInputStream(src);
	     XSSFWorkbook wb=new XSSFWorkbook(fis);
	     XSSFSheet sh1= wb.getSheetAt(0);
		 String address_Type_Code=   sh1.getRow(28).getCell(1).getRawValue();
		 wb.close();
		 return address_Type_Code;
	}
	
	
	
	public String is_FL() throws Exception {
		
		 File src=new File("C:\\ExcelData\\TestData.xlsx");
		 FileInputStream fis=new FileInputStream(src);
	     XSSFWorkbook wb=new XSSFWorkbook(fis);
	     XSSFSheet sh1= wb.getSheetAt(0);
		 String is_FL=   sh1.getRow(29).getCell(1).getRawValue();
		 wb.close();
		 return is_FL;
	}
	
	
	
	public double cust_Store_Dist() throws Exception {
		
		 File src=new File("C:\\ExcelData\\TestData.xlsx");
		 FileInputStream fis=new FileInputStream(src);
	     XSSFWorkbook wb=new XSSFWorkbook(fis);
	     XSSFSheet sh1= wb.getSheetAt(0);
		 @SuppressWarnings("deprecation")
		double cust_Store_Dist=   sh1.getRow(30).getCell(1).getCellType();
		 wb.close();
		 return cust_Store_Dist;
	}
	
	
	public double total_Auth_Amount() throws Exception {
		
		 File src=new File("C:\\ExcelData\\TestData.xlsx");
		 FileInputStream fis=new FileInputStream(src);
	     XSSFWorkbook wb=new XSSFWorkbook(fis);
	     XSSFSheet sh1= wb.getSheetAt(0);
		 @SuppressWarnings("deprecation")
		double cust_Store_Dist=   sh1.getRow(31).getCell(1).getCellType();
		 wb.close();
		 return cust_Store_Dist;
	}
	
	
	
	
	
	public String program_Type_rule1() throws Exception {
		
		 File src=new File("C:\\ExcelData\\TestData.xlsx");
		 FileInputStream fis=new FileInputStream(src);
	     XSSFWorkbook wb=new XSSFWorkbook(fis);
	     XSSFSheet sh1= wb.getSheetAt(0);
		 String rep=   sh1.getRow(38).getCell(1).getStringCellValue();
		 wb.close();
		 return rep;
	}
	
	
	
	


}
