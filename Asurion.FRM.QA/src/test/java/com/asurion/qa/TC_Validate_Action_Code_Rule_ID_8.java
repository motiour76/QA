package com.asurion.qa;

import static com.jayway.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.ValidatableResponse;

public class TC_Validate_Action_Code_Rule_ID_8 {
	
	String sRId= "12312ASDLAKSDJ1213LKJSF";
	long sRnum = 123456789012L;
	String startDate = "2017-07-20T12:20:18.804-04:00";
	String reqTypeCode = "REPLREQ";
	String reqStatusCode = "WORKING";
	boolean service_Flag = true;
	String failure_Code = "ADH";
	String failureDate = "2017-07-20T12:20:18.804-04:00";
	String eTypeCode = "Claim";
	String source = "CareCentral";
	String channelName = "Agent";
	String agentName = "Doe, Jane";
	String province = "VA";
	String resCode = "DIAG";
	int assignee = 112951;
	long contactNum = 123456789012L;
	long clientTranscNum = 123456789012L;
	String warrantySKU = "WMT TV REPL 24M $100-300 P";
	double warranty_price_low = 4.8;
	double warranty_price_high = 667.8;
	double purchase_price = 688.9;
	String contract_Create_Dt = "2017-07-20T12:20:18.804-04:00";
	String contract_Create_Channel = "CARECENTRAL";
	String contract_Created_By = "Doe, Jane";
	String contract_Browser_Finger_Print = "12312ASDLAKSDJ1213LKJSF";
	String program_Type = "";
	String receipt_Status_Code = "N";
	int client_Id = 0; 
	String client_Name = "WAL-WHL-SL-VA";
	double cust_Store_Dist = 56.0d; 
	String  product_Id = "12312ASDLAKSDJ1213LKJSF";
	String is_Bulky = "N";
	String product_Name = "TV";
	String product_Name_Incident = "LOST";
	String product_Brand = "LG";
	String product_Category = "TV";
	String product_Class = "Device";
	String product_Industry = "CONSUMER ELECTRONICS";
	String product_Purchase_Dt = " 2017-07-20T12:20:18.804-04:00";
	String model = "MS2287";
	String serial = "LXPLY020449480E";
	String product_Description = "LG 8500 Smart LED TV";
	String customer_Id = "12312ASDLAKSDJ1213LKJSF";
	String customer_First_Name = "JOHN";
	String customer_Last_Name = "DOE";
	boolean valid_Id_Ind = true;
	String fulfillment_Transaction_Id = "12312ASDLAKSDJ1213LKJSF";
	String auth_Type = "AUTH 1";
	String auth_Status = "1st Authorization";
	double total_Auth_Amount = 456.9d;
	boolean PEBO_Override_Flag = true;
	String created_Date = "2017-07-20T12:20:18.804-04:00";
	String browser_Finger_Print = "12312ASDLAKSDJ1213LKJSF";
	long automatic_Nbr_Id = 123456789012L;
	long dialed_Phone_Nbr = 123456789012L;
	long primary_Phone_Nbr = 123456789012L;
	String address_Type_Code = "CUST";
	boolean address_Override_Flag = true;
	String is_FL = "N";
	
	
	@Test
	public void ASURION_RuleID_8_Paramater() {
		
			        ValidatableResponse response = given()
			        		.contentType(ContentType.JSON)
			        		.body("{\"FRMCheck\":{\"ClaimDetailsAction\":{"
									+ "\"Service_Request_Id\":\"" + sRId +"\" ,"
									+"\"Service_Request_Nbr\":\"" + sRnum +"\" ,"   
									+ "\"Svc_Req_Start_Date\":\"" + startDate +"\","
									+ "\"Svc_Req_Type_Code\":\"" + reqTypeCode + "\","
									+ "\"Svc_Req_Status_Code\":\"" + reqStatusCode + "\","
									+ "\"Service_Flag\":"+ service_Flag+","
									+ "\"Failure_Code\":\""+ failure_Code +"\","
									+ "\"Failure_Date\":\"" + failureDate + "\","
									+ "\"Entitlement_Type_Code\":\""+ eTypeCode + "\","
									+ "\"Source\":\"" + source + "\","
									+ "\"Channel_Name\":\"" + channelName +"\","
									+ "\"Agent_Name\":\"" + agentName + "\","
									+ "\"Claim_State_Province\":\""+ province +"\","
									+ "\"Resolution_Code\":\""+ resCode +"\","
									+ "\"Assignee\":\""+ assignee+"\","
									+ "\"Contract_Nbr\":\"" + contactNum +"\","
									+ "\"Client_Transaction_Nbr\":\"" + clientTranscNum + "\","
									+ "\"Warranty_SKU\":\""+ warrantySKU +"\","
									+ "\"Warranty_Price_Low\": " + warranty_price_low +","
									+ "\"Warranty_Price_High\": " + warranty_price_high +","
									+ "\"Purchase_Price\": "+ purchase_price +","
									+ "\"Contract_Create_Dt\":\""+ contract_Create_Dt+"\","
									+ "\"Contract_Create_Channel\":\"" + contract_Create_Channel +"\","
									+ "\"Contract_Created_By\":\""+ contract_Created_By +"\","
									+ "\"Contract_Browser_Finger_Print\":\""+ contract_Browser_Finger_Print+"\","
									+ "\"Program_Type\":\""+ program_Type+"\","
									+ "\"Receipt_Status_Code\":\""+ receipt_Status_Code +"\","
									+ "\"Client_Id\":\"" + client_Id+ "\","
									+ "\"Client_Name\":\""+ client_Name +"\","
									+ "\"Cust_Store_Dist\": "+ cust_Store_Dist+","
									+ "\"Product_Id\":\"" + product_Id+"\","
									+ "\"Is_Bulky\":\""+ is_Bulky+"\","
									+ "\"Product_Name\":\""+ product_Name +"\","
									+ "\"Product_Name_Incident\":\""+ product_Name_Incident+"\","
									+ "\"Product_Brand\":\""+ product_Brand+"\","
									+ "\"Product_Category\":\""+ product_Category+"\","
									+ "\"Product_Class\":\""+ product_Class+"\","
									+ "\"Product_Industry\":\""+ product_Industry +"\","
									+ "\"Product_Purchase_Dt\":\""+ product_Purchase_Dt+"\","
									+ "\"Model\":\""+ model+"\","
									+ "\"Serial\":\""+ serial +"\","
									+ "\"Product_Description\":\""+ product_Description +"\","
									+ "\"Customer_Id\":\""+ customer_Id +"\","
									+ "\"Customer_First_Name\":\""+ customer_First_Name+"\","
									+ "\"Customer_Last_Name\":\""+ customer_Last_Name +"\","
									+ "\"Valid_Id_Ind\":" + valid_Id_Ind+","
									+ "\"Fulfillment_Transaction_Id\":\""+ fulfillment_Transaction_Id +"\","
									+ "\"Auth_Type\":\""+ auth_Type +"\","
									+ "\"Auth_Status\":\""+ auth_Status+"\","
									+ "\"Total_Auth_Amount\":\""+  total_Auth_Amount +"\","
									+ "\"PEBO_Override_Flag\":"+ PEBO_Override_Flag+","
									+ "\"Created_Date\":\""+created_Date +"\","
									+ "\"Browser_Finger_Print\":\""+browser_Finger_Print +"\","
									+ "\"Automatic_Nbr_Id\":\""+ automatic_Nbr_Id +"\","
									+ "\"Dialed_Phone_Nbr\":\""+ dialed_Phone_Nbr+"\","
									+ "\"Primary_Phone_Nbr\":\""+ primary_Phone_Nbr+"\","
									+ "\"Address_Type_Code\":\""+ address_Type_Code+"\","
									+ "\"Address_Override_Flag\":"+ address_Override_Flag+","
									+ "\"Is_FL\":\""+ is_FL +"\"},"
									+ "\"ScanDetailsAction\":{},\"CountsComputations\":[],"
									+ "\"RefereceComputations\":[]}}")	
					.when()
					.post("http://SYNLPTPF01D6F:8990/Channels/HTTPChannel/FRMCheckDest")
					.then()
		      		.log()
	        		.body()
	 				.statusCode(200)
					.contentType(ContentType.JSON);
		            String rule_Id = response.extract().path("FRMCheckResp.RiskOutputs[0].ActionCode");
				    Assert.assertEquals(rule_Id, "NO E-LABEL");
		

		}

}
