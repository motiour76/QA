package com.asurion.model;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.asurion.controller.FraudCheckAPI_Controller;

public class FraudCheckAPI_Model {
	
	FraudCheckAPI_Controller controller = new FraudCheckAPI_Controller();
	
	
	public String incidentID = controller.getRandomValue();
	public String incidentNumber = controller.getRandomValue();
	public int geoID = controller.getIntRandomValue();
	
    public String assignee = controller.getRadomID();
	public String customerID = controller.getStringRandomValue();
	//public String serviceRequestStartDate = controller.getCurrentDateTime(); 
	public String serviceRequestStartDate = controller.getPreviousDate(-30); 

	public String failureDate = controller.getCurrentDateTime();
	public String contractCreateDt = controller.getCurrentDateTime();
	public String productPurchaseDt = controller.getCurrentDateTime();
	public String labelDate = controller.getCurrentDateTime();
	public String scanDate = controller.getCurrentDateTime();
	public long contractNumber = controller.getRandomPhoneNumber();;
	public String clientTransactionNumber = controller.getStringRandomValue();
	public double warranty_price_high = controller.warranty_price_high();
	public double warranty_price_low = controller.warranty_price_low();
	public double purchasePrice = controller.purchase_price();
	public String fulfillmentTransactionId =controller.getStringRandomValue();

	public double totalAuthAmount = controller.purchase_price();
	public double pEBOOriginalPrice = controller.purchase_price();
	public double pEBOOfferedPrice = controller.purchase_price();
	public long ctiPhoneNumber = controller.getIntRandomValue();
	public long inboundPhoneNumber = controller.getIntRandomValue();
	public long primaryPhoneNumber = controller.getIntRandomValue();

	
//============================Data Read from Excel File=========================
	
	public String program_Type_rule1() throws Exception {
		 File src=new File("C:\\Users\\MOTIOUR.RAHMAN\\Desktop\\ASURION\\Asurion.FRM.QA\\TestData.xlsx");
		 FileInputStream fis=new FileInputStream(src);
	     XSSFWorkbook wb=new XSSFWorkbook(fis);
	     XSSFSheet sh1= wb.getSheetAt(0);
		 String program_Type_rule1=   sh1.getRow(62).getCell(1).getStringCellValue();
		 wb.close();
		 return program_Type_rule1;
	}

	
	public String program_Type_rule2() throws Exception {
		 File src=new File("C:\\Users\\MOTIOUR.RAHMAN\\Desktop\\ASURION\\Asurion.FRM.QA\\TestData.xlsx");
		 FileInputStream fis=new FileInputStream(src);
	     XSSFWorkbook wb=new XSSFWorkbook(fis);
	     XSSFSheet sh1= wb.getSheetAt(0);
		 String program_Type_rule1=   sh1.getRow(63).getCell(1).getStringCellValue();
		 wb.close();
		 return program_Type_rule1;
	}

	public String program_Type_rule3() throws Exception {
		 File src=new File("C:\\Users\\MOTIOUR.RAHMAN\\Desktop\\ASURION\\Asurion.FRM.QA\\TestData.xlsx");
		 FileInputStream fis=new FileInputStream(src);
	     XSSFWorkbook wb=new XSSFWorkbook(fis);
	     XSSFSheet sh1= wb.getSheetAt(0);
		 String program_Type_rule1=   sh1.getRow(64).getCell(1).getStringCellValue();
		 wb.close();
		 return program_Type_rule1;
	}

	public String program_Type_rule4() throws Exception {
		 File src=new File("C:\\Users\\MOTIOUR.RAHMAN\\Desktop\\ASURION\\Asurion.FRM.QA\\TestData.xlsx");
		 FileInputStream fis=new FileInputStream(src);
	     XSSFWorkbook wb=new XSSFWorkbook(fis);
	     XSSFSheet sh1= wb.getSheetAt(0);
		 String program_Type_rule1=   sh1.getRow(65).getCell(1).getStringCellValue();
		 wb.close();
		 return program_Type_rule1;
	}

	public String program_Type_rule5() throws Exception {
		 File src=new File("C:\\Users\\MOTIOUR.RAHMAN\\Desktop\\ASURION\\Asurion.FRM.QA\\TestData.xlsx");
		 FileInputStream fis=new FileInputStream(src);
	     XSSFWorkbook wb=new XSSFWorkbook(fis);
	     XSSFSheet sh1= wb.getSheetAt(0);
		 String program_Type_rule5=   sh1.getRow(66).getCell(1).getStringCellValue();
		 wb.close();
		 return program_Type_rule5;
	}

	
	public String program_Type_rule6() throws Exception {
		 File src=new File("C:\\Users\\MOTIOUR.RAHMAN\\Desktop\\ASURION\\Asurion.FRM.QA\\TestData.xlsx");
		 FileInputStream fis=new FileInputStream(src);
	     XSSFWorkbook wb=new XSSFWorkbook(fis);
	     XSSFSheet sh1= wb.getSheetAt(0);
		 String program_Type_rule6=   sh1.getRow(67).getCell(1).getStringCellValue();
		 wb.close();
		 return program_Type_rule6;
	}
	
	
	public String program_Type_rule7() throws Exception {
		 File src=new File("C:\\Users\\MOTIOUR.RAHMAN\\Desktop\\ASURION\\Asurion.FRM.QA\\TestData.xlsx");
		 FileInputStream fis=new FileInputStream(src);
	     XSSFWorkbook wb=new XSSFWorkbook(fis);
	     XSSFSheet sh1= wb.getSheetAt(0);
		 String program_Type_rule7=   sh1.getRow(68).getCell(1).getStringCellValue();
		 wb.close();
		 return program_Type_rule7;
	}
	
	
	public String program_Type_rule8() throws Exception {
		 File src=new File("C:\\Users\\MOTIOUR.RAHMAN\\Desktop\\ASURION\\Asurion.FRM.QA\\TestData.xlsx");
		 FileInputStream fis=new FileInputStream(src);
	     XSSFWorkbook wb=new XSSFWorkbook(fis);
	     XSSFSheet sh1= wb.getSheetAt(0);
		 String program_Type_rule=   sh1.getRow(69).getCell(1).getStringCellValue();
		 wb.close();
		 return program_Type_rule;
	}
	
	public String program_Type_rule9() throws Exception {
		 File src=new File("C:\\Users\\MOTIOUR.RAHMAN\\Desktop\\ASURION\\Asurion.FRM.QA\\TestData.xlsx");
		 FileInputStream fis=new FileInputStream(src);
	     XSSFWorkbook wb=new XSSFWorkbook(fis);
	     XSSFSheet sh1= wb.getSheetAt(0);
		 String program_Type_rule=   sh1.getRow(70).getCell(1).getStringCellValue();
		 wb.close();
		 return program_Type_rule;
	}
	
	public String program_Type_rule10() throws Exception {
		 File src=new File("C:\\Users\\MOTIOUR.RAHMAN\\Desktop\\ASURION\\Asurion.FRM.QA\\TestData.xlsx");
		 FileInputStream fis=new FileInputStream(src);
	     XSSFWorkbook wb=new XSSFWorkbook(fis);
	     XSSFSheet sh1= wb.getSheetAt(0);
		 String program_Type_rule=   sh1.getRow(71).getCell(1).getStringCellValue();
		 wb.close();
		 return program_Type_rule;
	}
	
	public String program_Type_rule11() throws Exception {
		 File src=new File("C:\\Users\\MOTIOUR.RAHMAN\\Desktop\\ASURION\\Asurion.FRM.QA\\TestData.xlsx");
		 FileInputStream fis=new FileInputStream(src);
	     XSSFWorkbook wb=new XSSFWorkbook(fis);
	     XSSFSheet sh1= wb.getSheetAt(0);
		 String program_Type_rule=   sh1.getRow(72).getCell(1).getStringCellValue();
		 wb.close();
		 return program_Type_rule;
	}
	
	public String program_Type_rule12() throws Exception {
		 File src=new File("C:\\Users\\MOTIOUR.RAHMAN\\Desktop\\ASURION\\Asurion.FRM.QA\\TestData.xlsx");
		 FileInputStream fis=new FileInputStream(src);
	     XSSFWorkbook wb=new XSSFWorkbook(fis);
	     XSSFSheet sh1= wb.getSheetAt(0);
		 String program_Type_rule=   sh1.getRow(73).getCell(1).getStringCellValue();
		 wb.close();
		 return program_Type_rule;
	}
	
	public String program_Type_rule13() throws Exception {
		 File src=new File("C:\\Users\\MOTIOUR.RAHMAN\\Desktop\\ASURION\\Asurion.FRM.QA\\TestData.xlsx");
		 FileInputStream fis=new FileInputStream(src);
	     XSSFWorkbook wb=new XSSFWorkbook(fis);
	     XSSFSheet sh1= wb.getSheetAt(0);
		 String program_Type_rule=   sh1.getRow(74).getCell(1).getStringCellValue();
		 wb.close();
		 return program_Type_rule;
	}
	
	public String program_Type_rule14() throws Exception {
		 File src=new File("C:\\Users\\MOTIOUR.RAHMAN\\Desktop\\ASURION\\Asurion.FRM.QA\\TestData.xlsx");
		 FileInputStream fis=new FileInputStream(src);
	     XSSFWorkbook wb=new XSSFWorkbook(fis);
	     XSSFSheet sh1= wb.getSheetAt(0);
		 String program_Type_rule=   sh1.getRow(75).getCell(1).getStringCellValue();
		 wb.close();
		 return program_Type_rule;
	}
	
	public String program_Type_rule15() throws Exception {
		 File src=new File("C:\\Users\\MOTIOUR.RAHMAN\\Desktop\\ASURION\\Asurion.FRM.QA\\TestData.xlsx");
		 FileInputStream fis=new FileInputStream(src);
	     XSSFWorkbook wb=new XSSFWorkbook(fis);
	     XSSFSheet sh1= wb.getSheetAt(0);
		 String program_Type_rule=   sh1.getRow(76).getCell(1).getStringCellValue();
		 wb.close();
		 return program_Type_rule;
	}
	
	public String program_Type_rule16() throws Exception {
		 File src=new File("C:\\Users\\MOTIOUR.RAHMAN\\Desktop\\ASURION\\Asurion.FRM.QA\\TestData.xlsx");
		 FileInputStream fis=new FileInputStream(src);
	     XSSFWorkbook wb=new XSSFWorkbook(fis);
	     XSSFSheet sh1= wb.getSheetAt(0);
		 String program_Type_rule=   sh1.getRow(77).getCell(1).getStringCellValue();
		 wb.close();
		 return program_Type_rule;
	}
	
	public String program_Type_rule17() throws Exception {
		 File src=new File("C:\\Users\\MOTIOUR.RAHMAN\\Desktop\\ASURION\\Asurion.FRM.QA\\TestData.xlsx");
		 FileInputStream fis=new FileInputStream(src);
	     XSSFWorkbook wb=new XSSFWorkbook(fis);
	     XSSFSheet sh1= wb.getSheetAt(0);
		 String program_Type_rule=   sh1.getRow(78).getCell(1).getStringCellValue();
		 wb.close();
		 return program_Type_rule;
	}
	
	public String program_Type_rule18() throws Exception {
		 File src=new File("C:\\Users\\MOTIOUR.RAHMAN\\Desktop\\ASURION\\Asurion.FRM.QA\\TestData.xlsx");
		 FileInputStream fis=new FileInputStream(src);
	     XSSFWorkbook wb=new XSSFWorkbook(fis);
	     XSSFSheet sh1= wb.getSheetAt(0);
		 String program_Type_rule=   sh1.getRow(79).getCell(1).getStringCellValue();
		 wb.close();
		 return program_Type_rule;
	}
	
	
	
	public String program_Type_Blank() throws Exception {
		 File src=new File("C:\\Users\\MOTIOUR.RAHMAN\\Desktop\\ASURION\\Asurion.FRM.QA\\TestData.xlsx");
		 FileInputStream fis=new FileInputStream(src);
	     XSSFWorkbook wb=new XSSFWorkbook(fis);
	     XSSFSheet sh1= wb.getSheetAt(0);
		 String program_Type_rule5=   sh1.getRow(80).getCell(1).getStringCellValue();
		 wb.close();
		 return program_Type_rule5;
	}
	
	
	
	public String program_Type_FEE_PLAN() throws Exception {
		 File src=new File("C:\\Users\\MOTIOUR.RAHMAN\\Desktop\\ASURION\\Asurion.FRM.QA\\TestData.xlsx");
		 FileInputStream fis=new FileInputStream(src);
	     XSSFWorkbook wb=new XSSFWorkbook(fis);
	     XSSFSheet sh1= wb.getSheetAt(0);
		 String program_Type_rule1=   sh1.getRow(113).getCell(1).getStringCellValue();
		 wb.close();
		 return program_Type_rule1;
	}
	
	public String program_Type_SERVICE() throws Exception {
		 File src=new File("C:\\Users\\MOTIOUR.RAHMAN\\Desktop\\ASURION\\Asurion.FRM.QA\\TestData.xlsx");
		 FileInputStream fis=new FileInputStream(src);
	     XSSFWorkbook wb=new XSSFWorkbook(fis);
	     XSSFSheet sh1= wb.getSheetAt(0);
		 String program_Type_rule1=   sh1.getRow(114).getCell(1).getStringCellValue();
		 wb.close();
		 return program_Type_rule1;
	}
	
	public String program_Type_POST_PAID_SERVICE() throws Exception {
		 File src=new File("C:\\Users\\MOTIOUR.RAHMAN\\Desktop\\ASURION\\Asurion.FRM.QA\\TestData.xlsx");
		 FileInputStream fis=new FileInputStream(src);
	     XSSFWorkbook wb=new XSSFWorkbook(fis);
	     XSSFSheet sh1= wb.getSheetAt(0);
		 String program_Type_rule1=   sh1.getRow(115).getCell(1).getStringCellValue();
		 wb.close();
		 return program_Type_rule1;
	}
	
	public String program_Type_BUY_BACK() throws Exception {
		 File src=new File("C:\\Users\\MOTIOUR.RAHMAN\\Desktop\\ASURION\\Asurion.FRM.QA\\TestData.xlsx");
		 FileInputStream fis=new FileInputStream(src);
	     XSSFWorkbook wb=new XSSFWorkbook(fis);
	     XSSFSheet sh1= wb.getSheetAt(0);
		 String program_Type_rule1=   sh1.getRow(116).getCell(1).getStringCellValue();
		 wb.close();
		 return program_Type_rule1;
	}
	
	public String program_Type_WHOLE_WHOME() throws Exception {
		 File src=new File("C:\\Users\\MOTIOUR.RAHMAN\\Desktop\\ASURION\\Asurion.FRM.QA\\TestData.xlsx");
		 FileInputStream fis=new FileInputStream(src);
	     XSSFWorkbook wb=new XSSFWorkbook(fis);
	     XSSFSheet sh1= wb.getSheetAt(0);
		 String program_Type_rule1=   sh1.getRow(117).getCell(1).getStringCellValue();
		 wb.close();
		 return program_Type_rule1;
	}

	public int clientID1() throws Exception {
		File src = new File("C:\\Users\\MOTIOUR.RAHMAN\\Desktop\\ASURION\\Asurion.FRM.QA\\TestData.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh1 = wb.getSheetAt(0);
		@SuppressWarnings("deprecation")
		int clientID1 = (int) sh1.getRow(81).getCell(1).getNumericCellValue();
		wb.close();
		return clientID1;		 
		 
	}
	
	public int clientID2() throws Exception {
		File src = new File("C:\\Users\\MOTIOUR.RAHMAN\\Desktop\\ASURION\\Asurion.FRM.QA\\TestData.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh1 = wb.getSheetAt(0);
		@SuppressWarnings("deprecation")
		int clientID2 = (int) sh1.getRow(82).getCell(1).getNumericCellValue();
		wb.close();
		return clientID2;		 
		 
	}
	
	
	public int clientID3() throws Exception {
		File src = new File("C:\\Users\\MOTIOUR.RAHMAN\\Desktop\\ASURION\\Asurion.FRM.QA\\TestData.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh1 = wb.getSheetAt(0);
		@SuppressWarnings("deprecation")
		int clientID3 = (int) sh1.getRow(83).getCell(1).getNumericCellValue();
		wb.close();
		return clientID3;		 
		 
	}
	
	public int clientID4() throws Exception {
		File src = new File("C:\\Users\\MOTIOUR.RAHMAN\\Desktop\\ASURION\\Asurion.FRM.QA\\TestData.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh1 = wb.getSheetAt(0);
		@SuppressWarnings("deprecation")
		int clientID4 = (int) sh1.getRow(84).getCell(1).getNumericCellValue();
		wb.close();
		return clientID4;		 
		 
	}
	
	public int clientID5() throws Exception {
		File src = new File("C:\\Users\\MOTIOUR.RAHMAN\\Desktop\\ASURION\\Asurion.FRM.QA\\TestData.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh1 = wb.getSheetAt(0);
		@SuppressWarnings("deprecation")
		int clientID5 = (int) sh1.getRow(85).getCell(1).getNumericCellValue();
		wb.close();
		return clientID5;		 
		 
	}
	
	public int clientID6() throws Exception {
		File src = new File("C:\\Users\\MOTIOUR.RAHMAN\\Desktop\\ASURION\\Asurion.FRM.QA\\TestData.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh1 = wb.getSheetAt(0);
		@SuppressWarnings("deprecation")
		int clientID6 = (int) sh1.getRow(86).getCell(1).getNumericCellValue();
		wb.close();
		return clientID6;		 
		 
	}
	
	public int clientID7() throws Exception {
		File src = new File("C:\\Users\\MOTIOUR.RAHMAN\\Desktop\\ASURION\\Asurion.FRM.QA\\TestData.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh1 = wb.getSheetAt(0);
		@SuppressWarnings("deprecation")
		int clientID7 = (int) sh1.getRow(87).getCell(1).getNumericCellValue();
		wb.close();
		return clientID7;		 
		 
	}
	
	public int clientID8() throws Exception {
		File src = new File("C:\\Users\\MOTIOUR.RAHMAN\\Desktop\\ASURION\\Asurion.FRM.QA\\TestData.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh1 = wb.getSheetAt(0);
		@SuppressWarnings("deprecation")
		int clientID8 = (int) sh1.getRow(88).getCell(1).getNumericCellValue();
		wb.close();
		return clientID8;		 
		 
	}

	public int clientID9() throws Exception {
		File src = new File("C:\\Users\\MOTIOUR.RAHMAN\\Desktop\\ASURION\\Asurion.FRM.QA\\TestData.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh1 = wb.getSheetAt(0);
		@SuppressWarnings("deprecation")
		int clientID9 = (int) sh1.getRow(89).getCell(1).getNumericCellValue();
		wb.close();
		return clientID9;		 
		 
	}
	
	public int clientID10() throws Exception {
		File src = new File("C:\\Users\\MOTIOUR.RAHMAN\\Desktop\\ASURION\\Asurion.FRM.QA\\TestData.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh1 = wb.getSheetAt(0);
		@SuppressWarnings("deprecation")
		int clientID10 = (int) sh1.getRow(90).getCell(1).getNumericCellValue();
		wb.close();
		return clientID10;		 
		 
	}
	
	public int clientID11() throws Exception {
		File src = new File("C:\\Users\\MOTIOUR.RAHMAN\\Desktop\\ASURION\\Asurion.FRM.QA\\TestData.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh1 = wb.getSheetAt(0);
		@SuppressWarnings("deprecation")
		int clientID11 = (int) sh1.getRow(91).getCell(1).getNumericCellValue();
		wb.close();
		return clientID11;		 
		 
	}
	
	
	public int clientID12() throws Exception {
		File src = new File("C:\\Users\\MOTIOUR.RAHMAN\\Desktop\\ASURION\\Asurion.FRM.QA\\TestData.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh1 = wb.getSheetAt(0);
		@SuppressWarnings("deprecation")
		int clientID12 = (int) sh1.getRow(92).getCell(1).getNumericCellValue();
		wb.close();
		return clientID12;		 
		 
	}
	
	public int clientID13() throws Exception {
		File src = new File("C:\\Users\\MOTIOUR.RAHMAN\\Desktop\\ASURION\\Asurion.FRM.QA\\TestData.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh1 = wb.getSheetAt(0);
		@SuppressWarnings("deprecation")
		int clientID13 = (int) sh1.getRow(93).getCell(1).getNumericCellValue();
		wb.close();
		return clientID13;		 
		 
	}
	
	public int clientID14() throws Exception {
		File src = new File("C:\\Users\\MOTIOUR.RAHMAN\\Desktop\\ASURION\\Asurion.FRM.QA\\TestData.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh1 = wb.getSheetAt(0);
		@SuppressWarnings("deprecation")
		int clientID14 = (int) sh1.getRow(94).getCell(1).getNumericCellValue();
		wb.close();
		return clientID14;		 
		 
	}
	
	public int clientID15() throws Exception {
		File src = new File("C:\\Users\\MOTIOUR.RAHMAN\\Desktop\\ASURION\\Asurion.FRM.QA\\TestData.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh1 = wb.getSheetAt(0);
		@SuppressWarnings("deprecation")
		int clientID15 = (int) sh1.getRow(95).getCell(1).getNumericCellValue();
		wb.close();
		return clientID15;		 
		 
	}
	
	public int clientID16() throws Exception {
		File src = new File("C:\\Users\\MOTIOUR.RAHMAN\\Desktop\\ASURION\\Asurion.FRM.QA\\TestData.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh1 = wb.getSheetAt(0);
		@SuppressWarnings("deprecation")
		int clientID16 = (int) sh1.getRow(96).getCell(1).getNumericCellValue();
		wb.close();
		return clientID16;		 
		 
	}
	
	
	public int clientID17() throws Exception {
		File src = new File("C:\\Users\\MOTIOUR.RAHMAN\\Desktop\\ASURION\\Asurion.FRM.QA\\TestData.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh1 = wb.getSheetAt(0);
		@SuppressWarnings("deprecation")
		int clientID17 = (int) sh1.getRow(97).getCell(1).getNumericCellValue();
		wb.close();
		return clientID17;		 
		 
	}
	
	
	public int clientID18() throws Exception {
		File src = new File("C:\\Users\\MOTIOUR.RAHMAN\\Desktop\\ASURION\\Asurion.FRM.QA\\TestData.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh1 = wb.getSheetAt(0);
		@SuppressWarnings("deprecation")
		int clientID18 = (int) sh1.getRow(98).getCell(1).getNumericCellValue();
		wb.close();
		return clientID18;		 
		 
	}
	
	
	public int clientID_Blank() throws Exception {
		File src = new File("C:\\Users\\MOTIOUR.RAHMAN\\Desktop\\ASURION\\Asurion.FRM.QA\\TestData.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh1 = wb.getSheetAt(0);
		@SuppressWarnings("deprecation")
		int clientID1 = (int) sh1.getRow(98).getCell(1).getNumericCellValue();
		wb.close();
		return clientID1;		 
		 
	}
	
	public int clientID_AddresCount() throws Exception {
		File src = new File("C:\\Users\\MOTIOUR.RAHMAN\\Desktop\\ASURION\\Asurion.FRM.QA\\TestData.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh1 = wb.getSheetAt(0);
		@SuppressWarnings("deprecation")
		int clientID6 = (int) sh1.getRow(107).getCell(1).getNumericCellValue();
		wb.close();
		return clientID6;		 
		 
	}
	
	public int clientID_AddresCount1() throws Exception {
		File src = new File("C:\\Users\\MOTIOUR.RAHMAN\\Desktop\\ASURION\\Asurion.FRM.QA\\TestData.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh1 = wb.getSheetAt(0);
		@SuppressWarnings("deprecation")
		int clientID6 = (int) sh1.getRow(108).getCell(1).getNumericCellValue();
		wb.close();
		return clientID6;		 
		 
	}
	
	public int clientID_141043767() throws Exception {
		File src = new File("C:\\Users\\MOTIOUR.RAHMAN\\Desktop\\ASURION\\Asurion.FRM.QA\\TestData.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh1 = wb.getSheetAt(0);
		@SuppressWarnings("deprecation")
		int clientID1 = (int) sh1.getRow(109).getCell(1).getNumericCellValue();
		wb.close();
		return clientID1;		 
		 
	}
	
	public int clientID_125444713() throws Exception {
		File src = new File("C:\\Users\\MOTIOUR.RAHMAN\\Desktop\\ASURION\\Asurion.FRM.QA\\TestData.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh1 = wb.getSheetAt(0);
		@SuppressWarnings("deprecation")
		int clientID1 = (int) sh1.getRow(109).getCell(1).getNumericCellValue();
		wb.close();
		return clientID1;		 
		 
	}
	
	
	
	public String requestingChannel() throws Exception {
		 File src=new File("C:\\Users\\MOTIOUR.RAHMAN\\Desktop\\ASURION\\Asurion.FRM.QA\\TestData.xlsx");
		 FileInputStream fis=new FileInputStream(src);
	     XSSFWorkbook wb=new XSSFWorkbook(fis);
	     XSSFSheet sh1= wb.getSheetAt(0);
		 String requestingChannel=   sh1.getRow(1).getCell(1).getStringCellValue();
		 wb.close();
		 return requestingChannel;
	}
	
	
	
	
	public String serviceRequestType() throws Exception {
		 File src=new File("C:\\Users\\MOTIOUR.RAHMAN\\Desktop\\ASURION\\Asurion.FRM.QA\\TestData.xlsx");
	     	FileInputStream fis=new FileInputStream(src);
	     XSSFWorkbook wb=new XSSFWorkbook(fis);
	     XSSFSheet sh1= wb.getSheetAt(0);
		 String serviceRequestType=   sh1.getRow(2).getCell(1).getStringCellValue();
		 wb.close();
		 return serviceRequestType;
	}
	
	
	public String serviceRequestStatus() throws Exception {
		 File src=new File("C:\\Users\\MOTIOUR.RAHMAN\\Desktop\\ASURION\\Asurion.FRM.QA\\TestData.xlsx");

		FileInputStream fis=new FileInputStream(src);
	     XSSFWorkbook wb=new XSSFWorkbook(fis);
	     XSSFSheet sh1= wb.getSheetAt(0);
		 String serviceRequestStatus=   sh1.getRow(3).getCell(1).getStringCellValue();
		 wb.close();
		 return serviceRequestStatus;
	}
	
	
	public String serviceFlag() throws Exception {
		 File src=new File("C:\\Users\\MOTIOUR.RAHMAN\\Desktop\\ASURION\\Asurion.FRM.QA\\TestData.xlsx");

		FileInputStream fis=new FileInputStream(src);
	     XSSFWorkbook wb=new XSSFWorkbook(fis);
	     XSSFSheet sh1= wb.getSheetAt(0);
		 String serviceFlag=   sh1.getRow(4).getCell(1).getStringCellValue();
		 wb.close();
		 return serviceFlag;
	}
	
	
	public String failureCode() throws Exception {
		 File src=new File("C:\\Users\\MOTIOUR.RAHMAN\\Desktop\\ASURION\\Asurion.FRM.QA\\TestData.xlsx");

		FileInputStream fis=new FileInputStream(src);
	     XSSFWorkbook wb=new XSSFWorkbook(fis);
	     XSSFSheet sh1= wb.getSheetAt(0);
		 String failureCode=   sh1.getRow(5).getCell(1).getStringCellValue();
		 wb.close();
		 return failureCode;
	}
	
	public String entitlementType() throws Exception {
		 File src=new File("C:\\Users\\MOTIOUR.RAHMAN\\Desktop\\ASURION\\Asurion.FRM.QA\\TestData.xlsx");
	     FileInputStream fis=new FileInputStream(src);
	     XSSFWorkbook wb=new XSSFWorkbook(fis);
	     XSSFSheet sh1= wb.getSheetAt(0);
		 String entitlementType=   sh1.getRow(6).getCell(1).getStringCellValue();
		 wb.close();
		 return entitlementType;
	}
	
	public String claimSource() throws Exception {
		 File src=new File("C:\\Users\\MOTIOUR.RAHMAN\\Desktop\\ASURION\\Asurion.FRM.QA\\TestData.xlsx");
	     FileInputStream fis=new FileInputStream(src);
	     XSSFWorkbook wb=new XSSFWorkbook(fis);
	     XSSFSheet sh1= wb.getSheetAt(0);
		 String claimSource=   sh1.getRow(7).getCell(1).getStringCellValue();
		 wb.close();
		 return claimSource;
	}
	
	public String ccrName() throws Exception {
		 File src=new File("C:\\Users\\MOTIOUR.RAHMAN\\Desktop\\ASURION\\Asurion.FRM.QA\\TestData.xlsx");
	     FileInputStream fis=new FileInputStream(src);
	     XSSFWorkbook wb=new XSSFWorkbook(fis);
	     XSSFSheet sh1= wb.getSheetAt(0);
		 String ccrName=   sh1.getRow(9).getCell(1).getStringCellValue();
		 wb.close();
		 return ccrName;
	}
	
	public String resolutionCode() throws Exception {
		 File src=new File("C:\\Users\\MOTIOUR.RAHMAN\\Desktop\\ASURION\\Asurion.FRM.QA\\TestData.xlsx");
	     FileInputStream fis=new FileInputStream(src);
	     XSSFWorkbook wb=new XSSFWorkbook(fis);
	     XSSFSheet sh1= wb.getSheetAt(0);
		 String resolutionCode=   sh1.getRow(11).getCell(1).getStringCellValue();
		 wb.close();
		 return resolutionCode;
	}
	
	
	public String clientName() throws Exception {
		 File src=new File("C:\\Users\\MOTIOUR.RAHMAN\\Desktop\\ASURION\\Asurion.FRM.QA\\TestData.xlsx");
	     FileInputStream fis=new FileInputStream(src);
	     XSSFWorkbook wb=new XSSFWorkbook(fis);
	     XSSFSheet sh1= wb.getSheetAt(0);
		 String clientName=   sh1.getRow(18).getCell(1).getStringCellValue();
		 wb.close();
		 return clientName;
	}
	public String personFirstName() throws Exception {
		 File src=new File("C:\\Users\\MOTIOUR.RAHMAN\\Desktop\\ASURION\\Asurion.FRM.QA\\TestData.xlsx");
	     FileInputStream fis=new FileInputStream(src);
	     XSSFWorkbook wb=new XSSFWorkbook(fis);
	     XSSFSheet sh1= wb.getSheetAt(0);
		 String personFirstName=   sh1.getRow(27).getCell(1).getStringCellValue();
		 wb.close();
		 return personFirstName;
	}
	
	public String personLastName() throws Exception {
		 File src=new File("C:\\Users\\MOTIOUR.RAHMAN\\Desktop\\ASURION\\Asurion.FRM.QA\\TestData.xlsx");
	     FileInputStream fis=new FileInputStream(src);
	     XSSFWorkbook wb=new XSSFWorkbook(fis);
	     XSSFSheet sh1= wb.getSheetAt(0);
		 String personLastName=   sh1.getRow(28).getCell(1).getStringCellValue();
		 wb.close();
		 return personLastName;
	}
	
	public String validId() throws Exception {
		 File src=new File("C:\\Users\\MOTIOUR.RAHMAN\\Desktop\\ASURION\\Asurion.FRM.QA\\TestData.xlsx");
	     FileInputStream fis=new FileInputStream(src);
	     XSSFWorkbook wb=new XSSFWorkbook(fis);
	     XSSFSheet sh1= wb.getSheetAt(0);
		 String validId=   sh1.getRow(35).getCell(1).getStringCellValue();
		 wb.close();
		 return validId;
	}
	
	public String warrantySku() throws Exception {
		 File src=new File("C:\\Users\\MOTIOUR.RAHMAN\\Desktop\\ASURION\\Asurion.FRM.QA\\TestData.xlsx");
	     FileInputStream fis=new FileInputStream(src);
	     XSSFWorkbook wb=new XSSFWorkbook(fis);
	     XSSFSheet sh1= wb.getSheetAt(0);
		 String warrantySku=   sh1.getRow(12).getCell(1).getStringCellValue();
		 wb.close();
		 return warrantySku;
	}
	
	public String contractCreateChannel() throws Exception {
		 File src=new File("C:\\Users\\MOTIOUR.RAHMAN\\Desktop\\ASURION\\Asurion.FRM.QA\\TestData.xlsx");
	     FileInputStream fis=new FileInputStream(src);
	     XSSFWorkbook wb=new XSSFWorkbook(fis);
	     XSSFSheet sh1= wb.getSheetAt(0);
		 String contractCreateChannel=   sh1.getRow(13).getCell(1).getStringCellValue();
		 wb.close();
		 return contractCreateChannel;
	}
	
	
	public String contractCreatedBy() throws Exception {
		 File src=new File("C:\\Users\\MOTIOUR.RAHMAN\\Desktop\\ASURION\\Asurion.FRM.QA\\TestData.xlsx");
	     FileInputStream fis=new FileInputStream(src);
	     XSSFWorkbook wb=new XSSFWorkbook(fis);
	     XSSFSheet sh1= wb.getSheetAt(0);
		 String contractCreatedBy=   sh1.getRow(14).getCell(1).getStringCellValue();
		 wb.close();
		 return contractCreatedBy;
	}
	
	public String contractBrowserFingerPrint() throws Exception {
		 File src=new File("C:\\Users\\MOTIOUR.RAHMAN\\Desktop\\ASURION\\Asurion.FRM.QA\\TestData.xlsx");
	     FileInputStream fis=new FileInputStream(src);
	     XSSFWorkbook wb=new XSSFWorkbook(fis);
	     XSSFSheet sh1= wb.getSheetAt(0);
		 String contractBrowserFingerPrint=   sh1.getRow(36).getCell(1).getStringCellValue();
		 wb.close();
		 return contractBrowserFingerPrint;
	}
	
	public String receiptFlag() throws Exception {
		 File src=new File("C:\\Users\\MOTIOUR.RAHMAN\\Desktop\\ASURION\\Asurion.FRM.QA\\TestData.xlsx");
	     FileInputStream fis=new FileInputStream(src);
	     XSSFWorkbook wb=new XSSFWorkbook(fis);
	     XSSFSheet sh1= wb.getSheetAt(0);
		 String receiptFlag=   sh1.getRow(37).getCell(1).getStringCellValue();
		 wb.close();
		 return receiptFlag;
	}
	
	public String instanceID() throws Exception {
		 File src=new File("C:\\Users\\MOTIOUR.RAHMAN\\Desktop\\ASURION\\Asurion.FRM.QA\\TestData.xlsx");
	     FileInputStream fis=new FileInputStream(src);
	     XSSFWorkbook wb=new XSSFWorkbook(fis);
	     XSSFSheet sh1= wb.getSheetAt(0);
		 String instanceID=   sh1.getRow(38).getCell(1).getStringCellValue();
		 wb.close();
		 return instanceID;
	}
	
	public String bulkyFlag() throws Exception {
		 File src=new File("C:\\Users\\MOTIOUR.RAHMAN\\Desktop\\ASURION\\Asurion.FRM.QA\\TestData.xlsx");
	     FileInputStream fis=new FileInputStream(src);
	     XSSFWorkbook wb=new XSSFWorkbook(fis);
	     XSSFSheet sh1= wb.getSheetAt(0);
		 String bulkyFlag=   sh1.getRow(17).getCell(1).getStringCellValue();
		 wb.close();
		 return bulkyFlag;
	}
	
	
	public String bulkyFlagYES() throws Exception {
		 File src=new File("C:\\Users\\MOTIOUR.RAHMAN\\Desktop\\ASURION\\Asurion.FRM.QA\\TestData.xlsx");
	     FileInputStream fis=new FileInputStream(src);
	     XSSFWorkbook wb=new XSSFWorkbook(fis);
	     XSSFSheet sh1= wb.getSheetAt(0);
		 String bulkyFlag=   sh1.getRow(99).getCell(1).getStringCellValue();
		 wb.close();
		 return bulkyFlag;
	}
	public String bulkyFlagNO() throws Exception {
		 File src=new File("C:\\Users\\MOTIOUR.RAHMAN\\Desktop\\ASURION\\Asurion.FRM.QA\\TestData.xlsx");
	     FileInputStream fis=new FileInputStream(src);
	     XSSFWorkbook wb=new XSSFWorkbook(fis);
	     XSSFSheet sh1= wb.getSheetAt(0);
		 String bulkyFlag=   sh1.getRow(100).getCell(1).getStringCellValue();
		 wb.close();
		 return bulkyFlag;
	}
	

	
	public String product() throws Exception {
		 File src=new File("C:\\Users\\MOTIOUR.RAHMAN\\Desktop\\ASURION\\Asurion.FRM.QA\\TestData.xlsx");
	     FileInputStream fis=new FileInputStream(src);
	     XSSFWorkbook wb=new XSSFWorkbook(fis);
	     XSSFSheet sh1= wb.getSheetAt(0);
		 String product=   sh1.getRow(19).getCell(1).getStringCellValue();
		 wb.close();
		 return product;
	}
	
	public String make() throws Exception {
		 File src=new File("C:\\Users\\MOTIOUR.RAHMAN\\Desktop\\ASURION\\Asurion.FRM.QA\\TestData.xlsx");
	     FileInputStream fis=new FileInputStream(src);
	     XSSFWorkbook wb=new XSSFWorkbook(fis);
	     XSSFSheet sh1= wb.getSheetAt(0);
		 String make=   sh1.getRow(21).getCell(1).getStringCellValue();
		 wb.close();
		 return make;
	}
	
	public String category() throws Exception {
		 File src=new File("C:\\Users\\MOTIOUR.RAHMAN\\Desktop\\ASURION\\Asurion.FRM.QA\\TestData.xlsx");
	     FileInputStream fis=new FileInputStream(src);
	     XSSFWorkbook wb=new XSSFWorkbook(fis);
	     XSSFSheet sh1= wb.getSheetAt(0);
		 String category=   sh1.getRow(22).getCell(1).getStringCellValue();
		 wb.close();
		 return category;
	}
	
	public String type() throws Exception {
		 File src=new File("C:\\Users\\MOTIOUR.RAHMAN\\Desktop\\ASURION\\Asurion.FRM.QA\\TestData.xlsx");
	     FileInputStream fis=new FileInputStream(src);
	     XSSFWorkbook wb=new XSSFWorkbook(fis);
	     XSSFSheet sh1= wb.getSheetAt(0);
		 String type=   sh1.getRow(23).getCell(1).getStringCellValue();
		 wb.close();
		 return type;
	}
	
	public String model() throws Exception {
		 File src=new File("C:\\Users\\MOTIOUR.RAHMAN\\Desktop\\ASURION\\Asurion.FRM.QA\\TestData.xlsx");
	     FileInputStream fis=new FileInputStream(src);
	     XSSFWorkbook wb=new XSSFWorkbook(fis);
	     XSSFSheet sh1= wb.getSheetAt(0);
		 String model=   sh1.getRow(25).getCell(1).getStringCellValue();
		 wb.close();
		 return model;
	}
	
	public String serial() throws Exception {
		 File src=new File("C:\\Users\\MOTIOUR.RAHMAN\\Desktop\\ASURION\\Asurion.FRM.QA\\TestData.xlsx");
	     FileInputStream fis=new FileInputStream(src);
	     XSSFWorkbook wb=new XSSFWorkbook(fis);
	     XSSFSheet sh1= wb.getSheetAt(0);
		 String serial=   sh1.getRow(24).getCell(1).getStringCellValue();
		 wb.close();
		 return serial;
	}
	
	public String productDescription() throws Exception {
		 File src=new File("C:\\Users\\MOTIOUR.RAHMAN\\Desktop\\ASURION\\Asurion.FRM.QA\\TestData.xlsx");
	     FileInputStream fis=new FileInputStream(src);
	     XSSFWorkbook wb=new XSSFWorkbook(fis);
	     XSSFSheet sh1= wb.getSheetAt(0);
		 String productDescription=   sh1.getRow(26).getCell(1).getStringCellValue();
		 wb.close();
		 return productDescription;
	}
	public String authType() throws Exception {
		 File src=new File("C:\\Users\\MOTIOUR.RAHMAN\\Desktop\\ASURION\\Asurion.FRM.QA\\TestData.xlsx");
	     FileInputStream fis=new FileInputStream(src);
	     XSSFWorkbook wb=new XSSFWorkbook(fis);
	     XSSFSheet sh1= wb.getSheetAt(0);
		 String authType=   sh1.getRow(29).getCell(1).getStringCellValue();
		 wb.close();
		 return authType;
	}
	public String authStatus() throws Exception {
		 File src=new File("C:\\Users\\MOTIOUR.RAHMAN\\Desktop\\ASURION\\Asurion.FRM.QA\\TestData.xlsx");
	     FileInputStream fis=new FileInputStream(src);
	     XSSFWorkbook wb=new XSSFWorkbook(fis);
	     XSSFSheet sh1= wb.getSheetAt(0);
		 String authStatus=   sh1.getRow(29).getCell(1).getStringCellValue();
		 wb.close();
		 return authStatus;
	}
	
	public String pEBOOverrideFlag() throws Exception {
		 File src=new File("C:\\Users\\MOTIOUR.RAHMAN\\Desktop\\ASURION\\Asurion.FRM.QA\\TestData.xlsx");
	     FileInputStream fis=new FileInputStream(src);
	     XSSFWorkbook wb=new XSSFWorkbook(fis);
	     XSSFSheet sh1= wb.getSheetAt(0);
		 String pEBOOverrideFlag=   sh1.getRow(39).getCell(1).getStringCellValue();
		 wb.close();
		 return pEBOOverrideFlag;
	}
	
	public double geoID() throws Exception {
		 File src=new File("C:\\Users\\MOTIOUR.RAHMAN\\Desktop\\ASURION\\Asurion.FRM.QA\\TestData.xlsx");
	     FileInputStream fis=new FileInputStream(src);
	     XSSFWorkbook wb=new XSSFWorkbook(fis);
	     XSSFSheet sh1= wb.getSheetAt(0);
		 @SuppressWarnings("deprecation")
		double geoID=   sh1.getRow(40).getCell(1).getCellType();
		 wb.close();
		 return geoID;
	}
	
	public double addressId() throws Exception {
		 File src=new File("C:\\Users\\MOTIOUR.RAHMAN\\Desktop\\ASURION\\Asurion.FRM.QA\\TestData.xlsx");
	 FileInputStream fis=new FileInputStream(src);
	     XSSFWorkbook wb=new XSSFWorkbook(fis);
	     XSSFSheet sh1= wb.getSheetAt(0);
		 @SuppressWarnings("deprecation")
		double addressId=   sh1.getRow(41).getCell(1).getCellType();
		 wb.close();
		 return addressId;
		 
		 
	}
	

public String address1() throws Exception {
		 File src=new File("C:\\Users\\MOTIOUR.RAHMAN\\Desktop\\ASURION\\Asurion.FRM.QA\\TestData.xlsx");
	     FileInputStream fis=new FileInputStream(src);
	     XSSFWorkbook wb=new XSSFWorkbook(fis);
	     XSSFSheet sh1= wb.getSheetAt(0);
		 String address1=   sh1.getRow(42).getCell(1).getStringCellValue();
		 wb.close();
		 return address1;
	}
	
	
	
	public String address2() throws Exception {
		 File src=new File("C:\\Users\\MOTIOUR.RAHMAN\\Desktop\\ASURION\\Asurion.FRM.QA\\TestData.xlsx");
	     FileInputStream fis=new FileInputStream(src);
	     XSSFWorkbook wb=new XSSFWorkbook(fis);
	     XSSFSheet sh1= wb.getSheetAt(0);
		 String address2=   sh1.getRow(43).getCell(1).getStringCellValue();
		 wb.close();
		 return address2;
	}
	
	public String address3() throws Exception {
		 File src=new File("C:\\Users\\MOTIOUR.RAHMAN\\Desktop\\ASURION\\Asurion.FRM.QA\\TestData.xlsx");
	     FileInputStream fis=new FileInputStream(src);
	     XSSFWorkbook wb=new XSSFWorkbook(fis);
	     XSSFSheet sh1= wb.getSheetAt(0);
		 String address3=   sh1.getRow(44).getCell(1).getStringCellValue();
		 wb.close();
		 return address3;
	}
	
	public String address4() throws Exception {
		 File src=new File("C:\\Users\\MOTIOUR.RAHMAN\\Desktop\\ASURION\\Asurion.FRM.QA\\TestData.xlsx");
	     FileInputStream fis=new FileInputStream(src);
	     XSSFWorkbook wb=new XSSFWorkbook(fis);
	     XSSFSheet sh1= wb.getSheetAt(0);
		 String address4=   sh1.getRow(45).getCell(1).getStringCellValue();
		 wb.close();
		 return address4;
	}
	
	public String city() throws Exception {
		 File src=new File("C:\\Users\\MOTIOUR.RAHMAN\\Desktop\\ASURION\\Asurion.FRM.QA\\TestData.xlsx");
	     FileInputStream fis=new FileInputStream(src);
	     XSSFWorkbook wb=new XSSFWorkbook(fis);
	     XSSFSheet sh1= wb.getSheetAt(0);
		 String city=   sh1.getRow(46).getCell(1).getStringCellValue();
		 wb.close();
		 return city;
	}
	
	
	public String province() throws Exception {
		 File src=new File("C:\\Users\\MOTIOUR.RAHMAN\\Desktop\\ASURION\\Asurion.FRM.QA\\TestData.xlsx");
	     FileInputStream fis=new FileInputStream(src);
	     XSSFWorkbook wb=new XSSFWorkbook(fis);
	     XSSFSheet sh1= wb.getSheetAt(0);
		 String province=   sh1.getRow(47).getCell(1).getStringCellValue();
		 wb.close();
		 return province;
	}
	
	public String state() throws Exception {
		 File src=new File("C:\\Users\\MOTIOUR.RAHMAN\\Desktop\\ASURION\\Asurion.FRM.QA\\TestData.xlsx");
	     FileInputStream fis=new FileInputStream(src);
	     XSSFWorkbook wb=new XSSFWorkbook(fis);
	     XSSFSheet sh1= wb.getSheetAt(0);
		 String state=   sh1.getRow(47).getCell(1).getStringCellValue();
		 wb.close();
		 return state;
	}

	
	
	
	public double postalCode() throws Exception {
		File src = new File("C:\\Users\\MOTIOUR.RAHMAN\\Desktop\\ASURION\\Asurion.FRM.QA\\TestData.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh1 = wb.getSheetAt(0);
		@SuppressWarnings("deprecation")
		double postalCode = sh1.getRow(48).getCell(1).getCellType();
		wb.close();
		return postalCode;		 
		 
	}

	
	public String country() throws Exception {
		 File src=new File("C:\\Users\\MOTIOUR.RAHMAN\\Desktop\\ASURION\\Asurion.FRM.QA\\TestData.xlsx");
	     FileInputStream fis=new FileInputStream(src);
	     XSSFWorkbook wb=new XSSFWorkbook(fis);
	     XSSFSheet sh1= wb.getSheetAt(0);
		 String country=   sh1.getRow(49).getCell(1).getStringCellValue();
		 wb.close();
		 return country;
	}
	
	
	public double latitude() throws Exception {
		File src = new File("C:\\Users\\MOTIOUR.RAHMAN\\Desktop\\ASURION\\Asurion.FRM.QA\\TestData.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh1 = wb.getSheetAt(0);
		@SuppressWarnings("deprecation")
		double latitude = sh1.getRow(58).getCell(1).getCellType();
		wb.close();
		return latitude;		 
		 
	}

	
	public double longitude() throws Exception {
		File src = new File("C:\\Users\\MOTIOUR.RAHMAN\\Desktop\\ASURION\\Asurion.FRM.QA\\TestData.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh1 = wb.getSheetAt(0);
		@SuppressWarnings("deprecation")
		double longitude = sh1.getRow(59).getCell(1).getCellType();
		wb.close();
		return longitude;		 
		 
	}


	public String addressOverrideFlag() throws Exception {
		 File src=new File("C:\\Users\\MOTIOUR.RAHMAN\\Desktop\\ASURION\\Asurion.FRM.QA\\TestData.xlsx");
	     FileInputStream fis=new FileInputStream(src);
	     XSSFWorkbook wb=new XSSFWorkbook(fis);
	     XSSFSheet sh1= wb.getSheetAt(0);
		 String addressOverrideFlag=   sh1.getRow(50).getCell(1).getStringCellValue();
		 wb.close();
		 return addressOverrideFlag;
	}
	
	
	public String labelType() throws Exception {
		 File src=new File("C:\\Users\\MOTIOUR.RAHMAN\\Desktop\\ASURION\\Asurion.FRM.QA\\TestData.xlsx");
	     FileInputStream fis=new FileInputStream(src);
	     XSSFWorkbook wb=new XSSFWorkbook(fis);
	     XSSFSheet sh1= wb.getSheetAt(0);
		 String labelType=   sh1.getRow(51).getCell(1).getStringCellValue();
		 wb.close();
		 return labelType;
	}
	
	
	
	
	public String trackingNumber() throws Exception {
		 File src=new File("C:\\Users\\MOTIOUR.RAHMAN\\Desktop\\ASURION\\Asurion.FRM.QA\\TestData.xlsx");
	     FileInputStream fis=new FileInputStream(src);
	     XSSFWorkbook wb=new XSSFWorkbook(fis);
	     XSSFSheet sh1= wb.getSheetAt(0);
		 String trackingNumber=   sh1.getRow(52).getCell(1).getStringCellValue();
		 wb.close();
		 return trackingNumber;
	}
	
	

	
	public String scanStatus() throws Exception {
	 File src=new File("C:\\Users\\MOTIOUR.RAHMAN\\Desktop\\ASURION\\Asurion.FRM.QA\\TestData.xlsx");
     FileInputStream fis=new FileInputStream(src);
     XSSFWorkbook wb=new XSSFWorkbook(fis);
     XSSFSheet sh1= wb.getSheetAt(0);
	 String scanStatus=   sh1.getRow(53).getCell(1).getStringCellValue();
	 wb.close();
	 return scanStatus;
}

public String webID() throws Exception {
	 File src=new File("C:\\Users\\MOTIOUR.RAHMAN\\Desktop\\ASURION\\Asurion.FRM.QA\\TestData.xlsx");
     FileInputStream fis=new FileInputStream(src);
     XSSFWorkbook wb=new XSSFWorkbook(fis);
     XSSFSheet sh1= wb.getSheetAt(0);
	 String webID=   sh1.getRow(54).getCell(1).getStringCellValue();
	 wb.close();
	 return webID;
}

public String iPAddress() throws Exception {
	 File src=new File("C:\\Users\\MOTIOUR.RAHMAN\\Desktop\\ASURION\\Asurion.FRM.QA\\TestData.xlsx");
     FileInputStream fis=new FileInputStream(src);
     XSSFWorkbook wb=new XSSFWorkbook(fis);
     XSSFSheet sh1= wb.getSheetAt(0);
	 String iPAddress=   sh1.getRow(55).getCell(1).getStringCellValue();
	 wb.close();
	 return iPAddress;
}
public String webSessionId() throws Exception {
	 File src=new File("C:\\Users\\MOTIOUR.RAHMAN\\Desktop\\ASURION\\Asurion.FRM.QA\\TestData.xlsx");
     FileInputStream fis=new FileInputStream(src);
     XSSFWorkbook wb=new XSSFWorkbook(fis);
     XSSFSheet sh1= wb.getSheetAt(0);
	 String webSessionId=   sh1.getRow(56).getCell(1).getStringCellValue();
	 wb.close();
	 return webSessionId;
}

public String emailAddress() throws Exception {
	 File src=new File("C:\\Users\\MOTIOUR.RAHMAN\\Desktop\\ASURION\\Asurion.FRM.QA\\TestData.xlsx");
     FileInputStream fis=new FileInputStream(src);
     XSSFWorkbook wb=new XSSFWorkbook(fis);
     XSSFSheet sh1= wb.getSheetAt(0);
	 String emailAddress=   sh1.getRow(57).getCell(1).getStringCellValue();
	 wb.close();
	 return emailAddress;
}

public String Is_Bulky_Yes() throws Exception {
	 File src=new File("C:\\Users\\MOTIOUR.RAHMAN\\Desktop\\ASURION\\Asurion.FRM.QA\\TestData.xlsx");
    FileInputStream fis=new FileInputStream(src);
    XSSFWorkbook wb=new XSSFWorkbook(fis);
    XSSFSheet sh1= wb.getSheetAt(0);
	 String Is_Bulky=   sh1.getRow(99).getCell(1).getStringCellValue();
	 wb.close();
	 return Is_Bulky;
}
	
	
public String Is_Bulky_NO() throws Exception {
	 File src=new File("C:\\Users\\MOTIOUR.RAHMAN\\Desktop\\ASURION\\Asurion.FRM.QA\\TestData.xlsx");
   FileInputStream fis=new FileInputStream(src);
   XSSFWorkbook wb=new XSSFWorkbook(fis);
   XSSFSheet sh1= wb.getSheetAt(0);
	 String Is_Bulky=   sh1.getRow(100).getCell(1).getStringCellValue();
	 wb.close();
	 return Is_Bulky;
}
	

public String Is_FL_Yes() throws Exception {
	 File src=new File("C:\\Users\\MOTIOUR.RAHMAN\\Desktop\\ASURION\\Asurion.FRM.QA\\TestData.xlsx");
   FileInputStream fis=new FileInputStream(src);
   XSSFWorkbook wb=new XSSFWorkbook(fis);
   XSSFSheet sh1= wb.getSheetAt(0);
	 String Is_Bulky=   sh1.getRow(101).getCell(1).getStringCellValue();
	 wb.close();
	 return Is_Bulky;
}
	


public String Is_FL_NO() throws Exception {
	 File src=new File("C:\\Users\\MOTIOUR.RAHMAN\\Desktop\\ASURION\\Asurion.FRM.QA\\TestData.xlsx");
   FileInputStream fis=new FileInputStream(src);
   XSSFWorkbook wb=new XSSFWorkbook(fis);
   XSSFSheet sh1= wb.getSheetAt(0);
	 String Is_Bulky=   sh1.getRow(102).getCell(1).getStringCellValue();
	 wb.close();
	 return Is_Bulky;
}
	


public int incidentID() throws Exception {
	File src = new File("C:\\Users\\MOTIOUR.RAHMAN\\Desktop\\ASURION\\Asurion.FRM.QA\\TestData.xlsx");
	FileInputStream fis = new FileInputStream(src);
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	XSSFSheet sh1 = wb.getSheetAt(0);
	@SuppressWarnings("deprecation")
	int clientID1 = (int) sh1.getRow(104).getCell(1).getNumericCellValue();
	wb.close();
	return clientID1;		 
	 
}
	


public int incidentNumber() throws Exception {
	File src = new File("C:\\Users\\MOTIOUR.RAHMAN\\Desktop\\ASURION\\Asurion.FRM.QA\\TestData.xlsx");
	FileInputStream fis = new FileInputStream(src);
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	XSSFSheet sh1 = wb.getSheetAt(0);
	@SuppressWarnings("deprecation")
	int clientID1 = (int) sh1.getRow(105).getCell(1).getNumericCellValue();
	wb.close();
	return clientID1;		 
	 
}


















//======================Program_Type==============================

	

//++++++++++++++++++++++++++++++++++++++
//public String program_Type_rule1 = "FEE PLAN";   //Data need to change from Excel //ok

//public String program_Type_rule2 = "SERVICE";   //Data need to change from Excel //ok


//=======================Client_Id=============================

//public long clientID1 = 6018553;   //Data need to change from Excel //ok
//public long clientID2 = 73986370;   //Data need to change from Excel //ok
//public long clientID3 = 237836367;


	
	

	
	
	
	

	//==============================================
		//public String labelType = "PRINT";
	//public String trackingNumber = "123456789012";
	//public String scanStatus = "ABJ";

	///public String webID = "ABJ";
//	public String iPAddress = "12.12.12.15";
	//public String webSessionId = "12312ASDLAKSDJ12112123LKJ1SF";
	//public String emailAddress = "de1o@testing.com";
	//public String city = "2P";
/*		
public String province = "PULASKI";
		public String state = "VA";
		public String postalCode = "11435";
		public String country = "US";
		public long latitude = 12l;
		public long longitude = 32l;
		public String addressOverrideFlag = "Y";

	public long addressId = 13332l;
	public String address1 = "988 MEMORIAL DR APT 28";
	public String address2 = "Midland pkway";
	public String address3 = "1G";
	public String address4 = "2P";


*/
	//public String bulkyFlag = "Y";
	//public String product = "LG 8500 Smart LED TV";
	//public String make = "LG Electronics";
	//public String category = "LED TV";
	//public String type = "VIDEO CONSUMER ELECTRONIC";

	//public String entitlementType = "CLAIM";
	//public String claimSource = "CareCentral";
	//public String ccrName = "Doe, Jane";
	//public String resolutionCode = "DIAG";
	//public String clientName = "WAL-WHL-SL-VA";
	//public String personFirstName = "Doe";
	//public String personLastName = "Doe";
	//public String validId = "Y";
		//public String warrantySku = "WMT TV REPL 24M $100-300 P";
		//public String contractCreateChannel = "CARECENTRAL"; 
		//public String contractCreatedBy = "DOE JOHNS"; 
		//public String contractBrowserFingerPrint = "12312ASDLAKSDJ1213LKJSF";
		//public String receiptFlag = "N";
		//public String instanceID = "12312ASDLAKSDJ1213LKJSF";
	//public String model = "MS2287";
	//public String serial = "LXPLY020449480E";
	//public String productDescription = "LG 8500 Smart LED TV";
	//public String authType = "auth 1";
	//public String authStatus = "1st Authorization";
	//public String pEBOOverrideFlag = "Y";
	//public long geoID = 121212l;


	
	//public String requestingChannel = "PEGA";
		//public String serviceRequestType = "REPLREQ";
		//public String serviceRequestStatus = "WORKING";
		//public String serviceFlag = "Y";
		//public String failureCode = "ADH";
		

	
	
	//=======================is_Bulky=============================

	


}
