package com.asurion.model;

import com.asurion.controller.FRM_Rules_Controller;

public class FRM_Rules_Model {
	

	
FRM_Rules_Controller controller = new FRM_Rules_Controller();
	
	
	public String sRId =   			     			controller.getRadomID();//.getStringRandomValue()+"123456789012L";                        
	public long sRnum =   		         			controller.getIntRandomValue(); 
	public int assignee =    		    			controller.getIntRandomValue();  
	public long contactNum = 	         			controller.getRandomPhoneNumber();   
	public long clientTranscNum =        			controller.getIntRandomValue(); 
	public String browser_Finger_Print = 			controller.getStringRandomValue(); 
	public long automatic_Nbr_Id =       			controller.getIntRandomValue();
	public long dialed_Phone_Nbr =       			controller.getRandomPhoneNumber(); 
	public long primary_Phone_Nbr =      			controller.getRandomPhoneNumber();  
	public String contract_Browser_Finger_Print =   controller.getStringRandomValue(); 
	public String product_Id =           			controller.getStringRandomValue(); 
	public String fulfillment_Transaction_Id = 		controller.getStringRandomValue();
	public String serial =               			controller.getStringRandomValue(); 
	public String customer_Id =          			controller.getStringRandomValue(); 
	public double warranty_price_low =   			controller.warranty_price_low();
	public double warranty_price_high =  			controller.warranty_price_high();
	public double purchase_price =       			controller.purchase_price();
	public String startDate = 						controller.getCurrentDateTime();// "2017-07-20T12:20:18.804-04:00"; 
	public String failureDate = 					controller.getUpdatedDate(10);//"2017-07-20T12:20:18.804-04:00";
	public String contract_Create_Dt = 				controller.getCurrentDateTime(); //"2017-07-20T12:20:18.804-04:00";
	public String product_Purchase_Dt = 			controller.getCurrentDateTime();//"2017-07-20T12:20:18.804-04:00";
	public String created_Date = 					controller.getCurrentDateTime();//"2017-07-20T12:20:18.804-04:00";


	//====================================================

	public String reqTypeCode = "REPLREQ";  //ok
	public String reqStatusCode = "WORKING"; //ok
    public String failure_Code = "ADH"; //ok
	public String eTypeCode = "Claim"; //ok
	public String source = "CareCentral"; //ok
	public String channelName = "Agent";//ok
	public String agentName = "Doe, Jane"; //ok
	public String province = "VA"; //ok
	public String resCode = "DIAG"; //ok
	public String warrantySKU = "WMT TV REPL 24M $100-300 P"; //ok
	public String contract_Create_Channel = "CARECENTRAL";//ok
	public String contract_Created_By = "Doe, Jane";//ok
	
	
	//======================Program_Type==============================
	
	public String program_Type_rule1 = "FEE PLAN";         //Data need to change from Excel // ok
	public String program_Type_rule2 = "POSTPAID SERVICE"; //Data need to change from Excel
	public String program_Type_rule3 = "SERVICE";          //Data need to change from Excel
	public String program_Type_rule4 = "BUY BACK";         //Data need to change from Excel
	public String program_Type_rule5 = "SERVICE";          //Data need to change from Excel
	public String program_Type_rule6 = "";                 //Data need to change from Excel
	public String program_Type_rule7 = "";                 //Data need to change from Excel
	public String program_Type_rule8 = "";                 //Data need to change from Excel
	public String program_Type_rule9 = "";                 //Data need to change from Excel
	public String receipt_Status_Code = "N"; //ok
	
	//=======================Client_Id=============================
	
	public int client_Id_rule1 = 6018553;                  //Data need to change from Excel //ok
	public int client_Id_rule2 = 73986370;                 //Data need to change from Excel
	public int client_Id_rule3 = 186523556;                //Data need to change from Excel
	public int client_Id_rule4 = 0;                        //Data need to change from Excel
	public int client_Id_rule5 = 0;                        //Data need to change from Excel
	public int client_Id_rule6 = 125444713;                //Data need to change from Excel
	public int client_Id_rule7 = 167094897;                //Data need to change from Excel
	public int client_Id_rule8 = 0;                        //Data need to change from Excel
	public int client_Id_rule9 = 0;                        //Data need to change from Excel
	
	
	//=======================is_Bulky=============================

	public String is_Bulky = "Y";          					//Data need to change from Excel //ok
	public String is_Bulky_rule8 = "N";   					//Data need to change from Excel

	
	
	//====================================================

	
	public String client_Name = "WAL-WHL-SL-VA"; //ok
	public String product_Name = "TV"; //OK
	public String product_Name_Incident = "LOST"; //OK
	public String product_Brand = "LG";  // OK
	public String product_Category = "TV";  //OK
	public String product_Class = "Device";  //OK
	public String product_Industry = "CONSUMER ELECTRONICS"; //OK
	public String model = "MS2287"; //OK
	public String product_Description = "LG 8500 Smart LED TV"; //OK
	public String customer_First_Name = "JOHN"; //OK
	public String customer_Last_Name = "DOE"; //OK
	public String auth_Type = "AUTH 1"; //OK
	public String auth_Status = "1st Authorization";  //OK
    public String address_Type_Code = "CUST"; //OK
	public double cust_Store_Dist = 56.0d;//ok
	public String is_FL = "N"; //ok
	
	public double total_Auth_Amount = 456.9d;//ok
	
	
	public boolean PEBO_Override_Flag = true;
	public boolean valid_Id_Ind = true;
	public boolean address_Override_Flag = true;
	public boolean service_Flag = true;

	

}
