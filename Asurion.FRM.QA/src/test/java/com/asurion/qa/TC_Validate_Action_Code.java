package com.asurion.qa;

import static com.jayway.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.ValidatableResponse;

public class TC_Validate_Action_Code {
	
	@Test
	public void validate_Action_Code_RULE_Id_1() {
                String rule_id= given().contentType(ContentType.JSON)
        		.body("{\"FRMCheck\":{\"ClaimDetailsAction\":{\"Service_Request_Id\":\"12312ASDLAKSDJ1213LKJSF\",\"Service_Request_Nbr\":\"123456789012\",\"Svc_Req_Start_Date\":\"2017-07-20T12:20:18.804-04:00\",\"Svc_Req_Type_Code\":\"REPLREQ\",\"Svc_Req_Status_Code\":\"WORKING\",\"Service_Flag\":true,\"Failure_Code\":\"ADH\",\"Failure_Date\":\"2017-07-20T12:20:18.804-04:00\",\"Entitlement_Type_Code\":\"CLAIM\",\"Source\":\"CareCentral\",\"Channel_Name\":\"Agent\",\"Agent_Name\":\"Doe, Jane\",\"Claim_State_Province\":\"VA\",\"Resolution_Code\":\"DIAG\",\"Assignee\":\"112951\",\"Contract_Nbr\":\"123456789012\",\"Client_Transaction_Nbr\":\"123456789012\",\"Warranty_SKU\":\"WMT TV REPL 24M $100-300 P\",\"Warranty_Price_Low\":4.8,\"Warranty_Price_High\":667.8,\"Purchase_Price\":688.9,\"Contract_Create_Dt\":\"2017-07-20T12:20:18.804-04:00\",\"Contract_Create_Channel\":\"CARECENTRAL\",\"Contract_Created_By\":\"Doe, Jane\",\"Contract_Browser_Finger_Print\":\"12312ASDLAKSDJ1213LKJSF\",\"Program_Type\":\"FEE PLAN\",\"Receipt_Status_Code\":\"N\",\"Client_Id\":\"6018553\",\"Client_Name\":\"WAL-WHL-SL-VA\",\"Cust_Store_Dist\":56.0,\"Product_Id\":\"12312ASDLAKSDJ1213LKJSF\",\"Is_Bulky\":\"Y\",\"Product_Name\":\"TV\",\"Product_Name_Incident\":\"LOST\",\"Product_Brand\":\"LG\",\"Product_Category\":\"TV\",\"Product_Class\":\"DEVICE\",\"Product_Industry\":\"CONSUMER ELECTRONICS\",\"Product_Purchase_Dt\":\"2017-07-20T12:20:18.804-04:00\",\"Model\":\"MS2287\",\"Serial\":\"LXPLY020449480E\",\"Product_Description\":\"LG 8500 Smart LED TV\",\"Customer_Id\":\"12312ASDLAKSDJ1213LKJSF\",\"Customer_First_Name\":\"JOHN\",\"Customer_Last_Name\":\"DOE\",\"Valid_Id_Ind\":true,\"Fulfillment_Transaction_Id\":\"12312ASDLAKSDJ1213LKJSF\",\"Auth_Type\":\"AUTH 1\",\"Auth_Status\":\"1st Authorization\",\"Total_Auth_Amount\":\"456.9\",\"PEBO_Override_Flag\":true,\"Created_Date\":\"2017-07-20T12:20:18.804-04:00\",\"Browser_Finger_Print\":\"12312ASDLAKSDJ1213LKJSF\",\"Automatic_Nbr_Id\":\"123456789012\",\"Dialed_Phone_Nbr\":\"123456789012\",\"Primary_Phone_Nbr\":\"123456789012\",\"Address_Type_Code\":\"CUST\",\"Address_Override_Flag\":true,\"Is_FL\":\"N\"},\"ScanDetailsAction\":{},\"CountsComputations\":[],\"RefereceComputations\":[]}}")
				.when()
				.post("http://SYNLPTPF01D6F:8990/Channels/HTTPChannel/FRMCheckDest")
				.then()
	      		.log()
        		.body()
 				.extract()
				.path("FRMCheckResp.RiskOutputs[0].ActionCode");
				System.out.println("Action Code for Rule no 1 is : "+rule_id);

	}
	
	@Test
	public void Assertion_Action_Code_RULE_Id_1() {
		
		        ValidatableResponse response = given().contentType(ContentType.JSON)
				.body("{\"FRMCheck\":{\"ClaimDetailsAction\":{\"Service_Request_Id\":\"12312ASDLAKSDJ1213LKJSF\",\"Service_Request_Nbr\":\"123456789012\",\"Svc_Req_Start_Date\":\"2017-07-20T12:20:18.804-04:00\",\"Svc_Req_Type_Code\":\"REPLREQ\",\"Svc_Req_Status_Code\":\"WORKING\",\"Service_Flag\":true,\"Failure_Code\":\"ADH\",\"Failure_Date\":\"2017-07-20T12:20:18.804-04:00\",\"Entitlement_Type_Code\":\"CLAIM\",\"Source\":\"CareCentral\",\"Channel_Name\":\"Agent\",\"Agent_Name\":\"Doe, Jane\",\"Claim_State_Province\":\"VA\",\"Resolution_Code\":\"DIAG\",\"Assignee\":\"112951\",\"Contract_Nbr\":\"123456789012\",\"Client_Transaction_Nbr\":\"123456789012\",\"Warranty_SKU\":\"WMT TV REPL 24M $100-300 P\",\"Warranty_Price_Low\":4.8,\"Warranty_Price_High\":667.8,\"Purchase_Price\":688.9,\"Contract_Create_Dt\":\"2017-07-20T12:20:18.804-04:00\",\"Contract_Create_Channel\":\"CARECENTRAL\",\"Contract_Created_By\":\"Doe, Jane\",\"Contract_Browser_Finger_Print\":\"12312ASDLAKSDJ1213LKJSF\",\"Program_Type\":\"FEE PLAN\",\"Receipt_Status_Code\":\"N\",\"Client_Id\":\"6018553\",\"Client_Name\":\"WAL-WHL-SL-VA\",\"Cust_Store_Dist\":56.0,\"Product_Id\":\"12312ASDLAKSDJ1213LKJSF\",\"Is_Bulky\":\"Y\",\"Product_Name\":\"TV\",\"Product_Name_Incident\":\"LOST\",\"Product_Brand\":\"LG\",\"Product_Category\":\"TV\",\"Product_Class\":\"DEVICE\",\"Product_Industry\":\"CONSUMER ELECTRONICS\",\"Product_Purchase_Dt\":\"2017-07-20T12:20:18.804-04:00\",\"Model\":\"MS2287\",\"Serial\":\"LXPLY020449480E\",\"Product_Description\":\"LG 8500 Smart LED TV\",\"Customer_Id\":\"12312ASDLAKSDJ1213LKJSF\",\"Customer_First_Name\":\"JOHN\",\"Customer_Last_Name\":\"DOE\",\"Valid_Id_Ind\":true,\"Fulfillment_Transaction_Id\":\"12312ASDLAKSDJ1213LKJSF\",\"Auth_Type\":\"AUTH 1\",\"Auth_Status\":\"1st Authorization\",\"Total_Auth_Amount\":\"456.9\",\"PEBO_Override_Flag\":true,\"Created_Date\":\"2017-07-20T12:20:18.804-04:00\",\"Browser_Finger_Print\":\"12312ASDLAKSDJ1213LKJSF\",\"Automatic_Nbr_Id\":\"123456789012\",\"Dialed_Phone_Nbr\":\"123456789012\",\"Primary_Phone_Nbr\":\"123456789012\",\"Address_Type_Code\":\"CUST\",\"Address_Override_Flag\":true,\"Is_FL\":\"N\"},\"ScanDetailsAction\":{},\"CountsComputations\":[],\"RefereceComputations\":[]}}")
				.when()
				.post("http://SYNLPTPF01D6F:8990/Channels/HTTPChannel/FRMCheckDest")
				.then()
	      		.log()
        		.body()
 				.statusCode(200)
				.contentType(ContentType.JSON);
	            String rule_Id = response.extract().path("FRMCheckResp.RiskOutputs[0].ActionCode");
			    Assert.assertEquals(rule_Id, "PM WB");
	

	}
	
	
	@Test
	public void validate_Action_Code_RULE_Id_2() {
                String rule_id= given().contentType(ContentType.JSON)
        		.body("{\"FRMCheck\":{\"ClaimDetailsAction\":{\"Service_Request_Id\":\"12312ASDLAKSDJ1213LKJSF\",\"Service_Request_Nbr\":\"123456789012\",\"Svc_Req_Start_Date\":\"2017-07-20T12:20:18.804-04:00\",\"Svc_Req_Type_Code\":\"REPLREQ\",\"Svc_Req_Status_Code\":\"WORKING\",\"Service_Flag\":true,\"Failure_Code\":\"ADH\",\"Failure_Date\":\"2017-07-20T12:20:18.804-04:00\",\"Entitlement_Type_Code\":\"CLAIM\",\"Source\":\"CareCentral\",\"Channel_Name\":\"Agent\",\"Agent_Name\":\"Doe, Jane\",\"Claim_State_Province\":\"VA\",\"Resolution_Code\":\"DIAG\",\"Assignee\":\"112951\",\"Contract_Nbr\":\"123456789012\",\"Client_Transaction_Nbr\":\"123456789012\",\"Warranty_SKU\":\"WMT TV REPL 24M $100-300 P\",\"Warranty_Price_Low\":4.8,\"Warranty_Price_High\":667.8,\"Purchase_Price\":688.9,\"Contract_Create_Dt\":\"2017-07-20T12:20:18.804-04:00\",\"Contract_Create_Channel\":\"CARECENTRAL\",\"Contract_Created_By\":\"Doe, Jane\",\"Contract_Browser_Finger_Print\":\"12312ASDLAKSDJ1213LKJSF\",\"Program_Type\":\"POSTPAID SERVICE\",\"Receipt_Status_Code\":\"N\",\"Client_Id\":\"73986370\",\"Client_Name\":\"WAL-WHL-SL-VA\",\"Cust_Store_Dist\":56.0,\"Product_Id\":\"12312ASDLAKSDJ1213LKJSF\",\"Is_Bulky\":\"Y\",\"Product_Name\":\"TV\",\"Product_Name_Incident\":\"LOST\",\"Product_Brand\":\"LG\",\"Product_Category\":\"TV\",\"Product_Class\":\"DEVICE\",\"Product_Industry\":\"CONSUMER ELECTRONICS\",\"Product_Purchase_Dt\":\"2017-07-20T12:20:18.804-04:00\",\"Model\":\"MS2287\",\"Serial\":\"LXPLY020449480E\",\"Product_Description\":\"LG 8500 Smart LED TV\",\"Customer_Id\":\"12312ASDLAKSDJ1213LKJSF\",\"Customer_First_Name\":\"JOHN\",\"Customer_Last_Name\":\"DOE\",\"Valid_Id_Ind\":true,\"Fulfillment_Transaction_Id\":\"12312ASDLAKSDJ1213LKJSF\",\"Auth_Type\":\"AUTH 1\",\"Auth_Status\":\"1st Authorization\",\"Total_Auth_Amount\":\"456.9\",\"PEBO_Override_Flag\":true,\"Created_Date\":\"2017-07-20T12:20:18.804-04:00\",\"Browser_Finger_Print\":\"12312ASDLAKSDJ1213LKJSF\",\"Automatic_Nbr_Id\":\"123456789012\",\"Dialed_Phone_Nbr\":\"123456789012\",\"Primary_Phone_Nbr\":\"123456789012\",\"Address_Type_Code\":\"CUST\",\"Address_Override_Flag\":true,\"Is_FL\":\"N\"},\"ScanDetailsAction\":{},\"CountsComputations\":[],\"RefereceComputations\":[]}}")
                .when()
				.post("http://SYNLPTPF01D6F:8990/Channels/HTTPChannel/FRMCheckDest")
				.then()
	      		.log()
        		.body()
 
				.extract()
				.path("FRMCheckResp.RiskOutputs[0].ActionCode");
				System.out.println("Action Code for Rule no 2 is :"+rule_id);

	}
	
	
	@Test
	public void Assertion_Action_Code_RULE_Id_2() {
  
		
            ValidatableResponse response = given().contentType(ContentType.JSON)
           	.body("{\"FRMCheck\":{\"ClaimDetailsAction\":{\"Service_Request_Id\":\"12312ASDLAKSDJ1213LKJSF\",\"Service_Request_Nbr\":\"123456789012\",\"Svc_Req_Start_Date\":\"2017-07-20T12:20:18.804-04:00\",\"Svc_Req_Type_Code\":\"REPLREQ\",\"Svc_Req_Status_Code\":\"WORKING\",\"Service_Flag\":true,\"Failure_Code\":\"ADH\",\"Failure_Date\":\"2017-07-20T12:20:18.804-04:00\",\"Entitlement_Type_Code\":\"CLAIM\",\"Source\":\"CareCentral\",\"Channel_Name\":\"Agent\",\"Agent_Name\":\"Doe, Jane\",\"Claim_State_Province\":\"VA\",\"Resolution_Code\":\"DIAG\",\"Assignee\":\"112951\",\"Contract_Nbr\":\"123456789012\",\"Client_Transaction_Nbr\":\"123456789012\",\"Warranty_SKU\":\"WMT TV REPL 24M $100-300 P\",\"Warranty_Price_Low\":4.8,\"Warranty_Price_High\":667.8,\"Purchase_Price\":688.9,\"Contract_Create_Dt\":\"2017-07-20T12:20:18.804-04:00\",\"Contract_Create_Channel\":\"CARECENTRAL\",\"Contract_Created_By\":\"Doe, Jane\",\"Contract_Browser_Finger_Print\":\"12312ASDLAKSDJ1213LKJSF\",\"Program_Type\":\"POSTPAID SERVICE\",\"Receipt_Status_Code\":\"N\",\"Client_Id\":\"73986370\",\"Client_Name\":\"WAL-WHL-SL-VA\",\"Cust_Store_Dist\":56.0,\"Product_Id\":\"12312ASDLAKSDJ1213LKJSF\",\"Is_Bulky\":\"Y\",\"Product_Name\":\"TV\",\"Product_Name_Incident\":\"LOST\",\"Product_Brand\":\"LG\",\"Product_Category\":\"TV\",\"Product_Class\":\"DEVICE\",\"Product_Industry\":\"CONSUMER ELECTRONICS\",\"Product_Purchase_Dt\":\"2017-07-20T12:20:18.804-04:00\",\"Model\":\"MS2287\",\"Serial\":\"LXPLY020449480E\",\"Product_Description\":\"LG 8500 Smart LED TV\",\"Customer_Id\":\"12312ASDLAKSDJ1213LKJSF\",\"Customer_First_Name\":\"JOHN\",\"Customer_Last_Name\":\"DOE\",\"Valid_Id_Ind\":true,\"Fulfillment_Transaction_Id\":\"12312ASDLAKSDJ1213LKJSF\",\"Auth_Type\":\"AUTH 1\",\"Auth_Status\":\"1st Authorization\",\"Total_Auth_Amount\":\"456.9\",\"PEBO_Override_Flag\":true,\"Created_Date\":\"2017-07-20T12:20:18.804-04:00\",\"Browser_Finger_Print\":\"12312ASDLAKSDJ1213LKJSF\",\"Automatic_Nbr_Id\":\"123456789012\",\"Dialed_Phone_Nbr\":\"123456789012\",\"Primary_Phone_Nbr\":\"123456789012\",\"Address_Type_Code\":\"CUST\",\"Address_Override_Flag\":true,\"Is_FL\":\"N\"},\"ScanDetailsAction\":{},\"CountsComputations\":[],\"RefereceComputations\":[]}}")
        	.when()
			.post("http://SYNLPTPF01D6F:8990/Channels/HTTPChannel/FRMCheckDest")
			.then()
      		.log()
    		.body()

			.statusCode(200)
			.contentType(ContentType.JSON);
            String rule_Id = response.extract().path("FRMCheckResp.RiskOutputs[0].ActionCode");
		    Assert.assertEquals(rule_Id, "RCPT REQ");

	}
	
	
	@Test
	public void validate_Action_Code_RULE_Id_3() {
                String rule_id= given().contentType(ContentType.JSON)
            	.body("{\"FRMCheck\":{\"ClaimDetailsAction\":{\"Service_Request_Id\":\"12312ASDLAKSDJ1213LKJSF\",\"Service_Request_Nbr\":\"123456789012\",\"Svc_Req_Start_Date\":\"2017-07-20T12:20:18.804-04:00\",\"Svc_Req_Type_Code\":\"REPLREQ\",\"Svc_Req_Status_Code\":\"WORKING\",\"Service_Flag\":true,\"Failure_Code\":\"ADH\",\"Failure_Date\":\"2017-07-20T12:20:18.804-04:00\",\"Entitlement_Type_Code\":\"CLAIM\",\"Source\":\"CareCentral\",\"Channel_Name\":\"Agent\",\"Agent_Name\":\"Doe, Jane\",\"Claim_State_Province\":\"VA\",\"Resolution_Code\":\"DIAG\",\"Assignee\":\"112951\",\"Contract_Nbr\":\"123456789012\",\"Client_Transaction_Nbr\":\"123456789012\",\"Warranty_SKU\":\"WMT TV REPL 24M $100-300 P\",\"Warranty_Price_Low\":4.8,\"Warranty_Price_High\":667.8,\"Purchase_Price\":688.9,\"Contract_Create_Dt\":\"2017-07-20T12:20:18.804-04:00\",\"Contract_Create_Channel\":\"CARECENTRAL\",\"Contract_Created_By\":\"Doe, Jane\",\"Contract_Browser_Finger_Print\":\"12312ASDLAKSDJ1213LKJSF\",\"Program_Type\":\"SERVICE\",\"Receipt_Status_Code\":\"N\",\"Client_Id\":\"186523556\",\"Client_Name\":\"WAL-WHL-SL-VA\",\"Cust_Store_Dist\":56.0,\"Product_Id\":\"12312ASDLAKSDJ1213LKJSF\",\"Is_Bulky\":\"Y\",\"Product_Name\":\"TV\",\"Product_Name_Incident\":\"LOST\",\"Product_Brand\":\"LG\",\"Product_Category\":\"TV\",\"Product_Class\":\"DEVICE\",\"Product_Industry\":\"CONSUMER ELECTRONICS\",\"Product_Purchase_Dt\":\"2017-07-20T12:20:18.804-04:00\",\"Model\":\"MS2287\",\"Serial\":\"LXPLY020449480E\",\"Product_Description\":\"LG 8500 Smart LED TV\",\"Customer_Id\":\"12312ASDLAKSDJ1213LKJSF\",\"Customer_First_Name\":\"JOHN\",\"Customer_Last_Name\":\"DOE\",\"Valid_Id_Ind\":true,\"Fulfillment_Transaction_Id\":\"12312ASDLAKSDJ1213LKJSF\",\"Auth_Type\":\"AUTH 1\",\"Auth_Status\":\"1st Authorization\",\"Total_Auth_Amount\":\"456.9\",\"PEBO_Override_Flag\":true,\"Created_Date\":\"2017-07-20T12:20:18.804-04:00\",\"Browser_Finger_Print\":\"12312ASDLAKSDJ1213LKJSF\",\"Automatic_Nbr_Id\":\"123456789012\",\"Dialed_Phone_Nbr\":\"123456789012\",\"Primary_Phone_Nbr\":\"123456789012\",\"Address_Type_Code\":\"CUST\",\"Address_Override_Flag\":true,\"Is_FL\":\"N\"},\"ScanDetailsAction\":{},\"CountsComputations\":[],\"RefereceComputations\":[]}}")
            	.when()
				.post("http://SYNLPTPF01D6F:8990/Channels/HTTPChannel/FRMCheckDest")
				.then()
	      		.log()
        		.body()
 
				.extract()
				.path("FRMCheckResp.RiskOutputs[0].ActionCode");
				System.out.println("Action Code for Rule no 3 is : "+rule_id);

	}
	
	
	@Test
	public void Assertion_Action_Code_RULE_Id_3() {
		
                 ValidatableResponse response = given().contentType(ContentType.JSON)
               	.body("{\"FRMCheck\":{\"ClaimDetailsAction\":{\"Service_Request_Id\":\"12312ASDLAKSDJ1213LKJSF\",\"Service_Request_Nbr\":\"123456789012\",\"Svc_Req_Start_Date\":\"2017-07-20T12:20:18.804-04:00\",\"Svc_Req_Type_Code\":\"REPLREQ\",\"Svc_Req_Status_Code\":\"WORKING\",\"Service_Flag\":true,\"Failure_Code\":\"ADH\",\"Failure_Date\":\"2017-07-20T12:20:18.804-04:00\",\"Entitlement_Type_Code\":\"CLAIM\",\"Source\":\"CareCentral\",\"Channel_Name\":\"Agent\",\"Agent_Name\":\"Doe, Jane\",\"Claim_State_Province\":\"VA\",\"Resolution_Code\":\"DIAG\",\"Assignee\":\"112951\",\"Contract_Nbr\":\"123456789012\",\"Client_Transaction_Nbr\":\"123456789012\",\"Warranty_SKU\":\"WMT TV REPL 24M $100-300 P\",\"Warranty_Price_Low\":4.8,\"Warranty_Price_High\":667.8,\"Purchase_Price\":688.9,\"Contract_Create_Dt\":\"2017-07-20T12:20:18.804-04:00\",\"Contract_Create_Channel\":\"CARECENTRAL\",\"Contract_Created_By\":\"Doe, Jane\",\"Contract_Browser_Finger_Print\":\"12312ASDLAKSDJ1213LKJSF\",\"Program_Type\":\"SERVICE\",\"Receipt_Status_Code\":\"N\",\"Client_Id\":\"186523556\",\"Client_Name\":\"WAL-WHL-SL-VA\",\"Cust_Store_Dist\":56.0,\"Product_Id\":\"12312ASDLAKSDJ1213LKJSF\",\"Is_Bulky\":\"Y\",\"Product_Name\":\"TV\",\"Product_Name_Incident\":\"LOST\",\"Product_Brand\":\"LG\",\"Product_Category\":\"TV\",\"Product_Class\":\"DEVICE\",\"Product_Industry\":\"CONSUMER ELECTRONICS\",\"Product_Purchase_Dt\":\"2017-07-20T12:20:18.804-04:00\",\"Model\":\"MS2287\",\"Serial\":\"LXPLY020449480E\",\"Product_Description\":\"LG 8500 Smart LED TV\",\"Customer_Id\":\"12312ASDLAKSDJ1213LKJSF\",\"Customer_First_Name\":\"JOHN\",\"Customer_Last_Name\":\"DOE\",\"Valid_Id_Ind\":true,\"Fulfillment_Transaction_Id\":\"12312ASDLAKSDJ1213LKJSF\",\"Auth_Type\":\"AUTH 1\",\"Auth_Status\":\"1st Authorization\",\"Total_Auth_Amount\":\"456.9\",\"PEBO_Override_Flag\":true,\"Created_Date\":\"2017-07-20T12:20:18.804-04:00\",\"Browser_Finger_Print\":\"12312ASDLAKSDJ1213LKJSF\",\"Automatic_Nbr_Id\":\"123456789012\",\"Dialed_Phone_Nbr\":\"123456789012\",\"Primary_Phone_Nbr\":\"123456789012\",\"Address_Type_Code\":\"CUST\",\"Address_Override_Flag\":true,\"Is_FL\":\"N\"},\"ScanDetailsAction\":{},\"CountsComputations\":[],\"RefereceComputations\":[]}}")
             	.when()
    			.post("http://SYNLPTPF01D6F:8990/Channels/HTTPChannel/FRMCheckDest")
    			.then()
          		.log()
        		.body()
 
    			.statusCode(200)
    			.contentType(ContentType.JSON);
                String rule_Id = response.extract().path("FRMCheckResp.RiskOutputs[0].ActionCode");
    		    Assert.assertEquals(rule_Id, "APPROVED");

 
	}
	@Test
	public void validate_Action_Code_RULE_Id_4() {
                String rule_id= given().contentType(ContentType.JSON)
            	.body("{\"FRMCheck\":{\"ClaimDetailsAction\":{\"Service_Request_Id\":\"12312ASDLAKSDJ1213LKJSF\",\"Service_Request_Nbr\":\"123456789012\",\"Svc_Req_Start_Date\":\"2017-07-20T12:20:18.804-04:00\",\"Svc_Req_Type_Code\":\"REPLREQ\",\"Svc_Req_Status_Code\":\"WORKING\",\"Service_Flag\":true,\"Failure_Code\":\"ADH\",\"Failure_Date\":\"2017-07-20T12:20:18.804-04:00\",\"Entitlement_Type_Code\":\"CLAIM\",\"Source\":\"CareCentral\",\"Channel_Name\":\"Agent\",\"Agent_Name\":\"Doe, Jane\",\"Claim_State_Province\":\"VA\",\"Resolution_Code\":\"DIAG\",\"Assignee\":\"112951\",\"Contract_Nbr\":\"123456789012\",\"Client_Transaction_Nbr\":\"123456789012\",\"Warranty_SKU\":\"WMT TV REPL 24M $100-300 P\",\"Warranty_Price_Low\":4.8,\"Warranty_Price_High\":667.8,\"Purchase_Price\":688.9,\"Contract_Create_Dt\":\"2017-07-20T12:20:18.804-04:00\",\"Contract_Create_Channel\":\"CARECENTRAL\",\"Contract_Created_By\":\"Doe, Jane\",\"Contract_Browser_Finger_Print\":\"12312ASDLAKSDJ1213LKJSF\",\"Program_Type\":\"BUY BACK\",\"Receipt_Status_Code\":\"N\",\"Client_Id\":\"\",\"Client_Name\":\"WAL-WHL-SL-VA\",\"Cust_Store_Dist\":56.0,\"Product_Id\":\"12312ASDLAKSDJ1213LKJSF\",\"Is_Bulky\":\"Y\",\"Product_Name\":\"TV\",\"Product_Name_Incident\":\"LOST\",\"Product_Brand\":\"LG\",\"Product_Category\":\"TV\",\"Product_Class\":\"DEVICE\",\"Product_Industry\":\"CONSUMER ELECTRONICS\",\"Product_Purchase_Dt\":\"2017-07-20T12:20:18.804-04:00\",\"Model\":\"MS2287\",\"Serial\":\"LXPLY020449480E\",\"Product_Description\":\"LG 8500 Smart LED TV\",\"Customer_Id\":\"12312ASDLAKSDJ1213LKJSF\",\"Customer_First_Name\":\"JOHN\",\"Customer_Last_Name\":\"DOE\",\"Valid_Id_Ind\":true,\"Fulfillment_Transaction_Id\":\"12312ASDLAKSDJ1213LKJSF\",\"Auth_Type\":\"AUTH 1\",\"Auth_Status\":\"1st Authorization\",\"Total_Auth_Amount\":\"456.9\",\"PEBO_Override_Flag\":true,\"Created_Date\":\"2017-07-20T12:20:18.804-04:00\",\"Browser_Finger_Print\":\"12312ASDLAKSDJ1213LKJSF\",\"Automatic_Nbr_Id\":\"123456789012\",\"Dialed_Phone_Nbr\":\"123456789012\",\"Primary_Phone_Nbr\":\"123456789012\",\"Address_Type_Code\":\"CUST\",\"Address_Override_Flag\":true,\"Is_FL\":\"N\"},\"ScanDetailsAction\":{},\"CountsComputations\":[],\"RefereceComputations\":[]}}")
             	.when()
				.post("http://SYNLPTPF01D6F:8990/Channels/HTTPChannel/FRMCheckDest")
				.then()
	      		.log()
        		.body()
 
				.extract()
				.path("FRMCheckResp.RiskOutputs[0].ActionCode");
				System.out.println("Action Code for Rule no 4 is : "+rule_id);

	}
	
	
	@Test
	public void Assertion_Action_Code_RULE_Id_4() {
 	            ValidatableResponse response = given().contentType(ContentType.JSON)
	          	.body("{\"FRMCheck\":{\"ClaimDetailsAction\":{\"Service_Request_Id\":\"12312ASDLAKSDJ1213LKJSF\",\"Service_Request_Nbr\":\"123456789012\",\"Svc_Req_Start_Date\":\"2017-07-20T12:20:18.804-04:00\",\"Svc_Req_Type_Code\":\"REPLREQ\",\"Svc_Req_Status_Code\":\"WORKING\",\"Service_Flag\":true,\"Failure_Code\":\"ADH\",\"Failure_Date\":\"2017-07-20T12:20:18.804-04:00\",\"Entitlement_Type_Code\":\"CLAIM\",\"Source\":\"CareCentral\",\"Channel_Name\":\"Agent\",\"Agent_Name\":\"Doe, Jane\",\"Claim_State_Province\":\"VA\",\"Resolution_Code\":\"DIAG\",\"Assignee\":\"112951\",\"Contract_Nbr\":\"123456789012\",\"Client_Transaction_Nbr\":\"123456789012\",\"Warranty_SKU\":\"WMT TV REPL 24M $100-300 P\",\"Warranty_Price_Low\":4.8,\"Warranty_Price_High\":667.8,\"Purchase_Price\":688.9,\"Contract_Create_Dt\":\"2017-07-20T12:20:18.804-04:00\",\"Contract_Create_Channel\":\"CARECENTRAL\",\"Contract_Created_By\":\"Doe, Jane\",\"Contract_Browser_Finger_Print\":\"12312ASDLAKSDJ1213LKJSF\",\"Program_Type\":\"BUY BACK\",\"Receipt_Status_Code\":\"N\",\"Client_Id\":\"\",\"Client_Name\":\"WAL-WHL-SL-VA\",\"Cust_Store_Dist\":56.0,\"Product_Id\":\"12312ASDLAKSDJ1213LKJSF\",\"Is_Bulky\":\"Y\",\"Product_Name\":\"TV\",\"Product_Name_Incident\":\"LOST\",\"Product_Brand\":\"LG\",\"Product_Category\":\"TV\",\"Product_Class\":\"DEVICE\",\"Product_Industry\":\"CONSUMER ELECTRONICS\",\"Product_Purchase_Dt\":\"2017-07-20T12:20:18.804-04:00\",\"Model\":\"MS2287\",\"Serial\":\"LXPLY020449480E\",\"Product_Description\":\"LG 8500 Smart LED TV\",\"Customer_Id\":\"12312ASDLAKSDJ1213LKJSF\",\"Customer_First_Name\":\"JOHN\",\"Customer_Last_Name\":\"DOE\",\"Valid_Id_Ind\":true,\"Fulfillment_Transaction_Id\":\"12312ASDLAKSDJ1213LKJSF\",\"Auth_Type\":\"AUTH 1\",\"Auth_Status\":\"1st Authorization\",\"Total_Auth_Amount\":\"456.9\",\"PEBO_Override_Flag\":true,\"Created_Date\":\"2017-07-20T12:20:18.804-04:00\",\"Browser_Finger_Print\":\"12312ASDLAKSDJ1213LKJSF\",\"Automatic_Nbr_Id\":\"123456789012\",\"Dialed_Phone_Nbr\":\"123456789012\",\"Primary_Phone_Nbr\":\"123456789012\",\"Address_Type_Code\":\"CUST\",\"Address_Override_Flag\":true,\"Is_FL\":\"N\"},\"ScanDetailsAction\":{},\"CountsComputations\":[],\"RefereceComputations\":[]}}")
	    		.when()
    			.post("http://SYNLPTPF01D6F:8990/Channels/HTTPChannel/FRMCheckDest")
    			.then()
          		.log()
        		.body()
 
    			.statusCode(200)
    			.contentType(ContentType.JSON);
                String rule_Id = response.extract().path("FRMCheckResp.RiskOutputs[0].ActionCode");
    		    Assert.assertEquals(rule_Id, "APPROVED");

	}
	
	
	@Test
	public void validate_Action_Code_RULE_Id_5() {
                String rule_id= given().contentType(ContentType.JSON)
            	.body("{\"FRMCheck\":{\"ClaimDetailsAction\":{\"Service_Request_Id\":\"12312ASDLAKSDJ1213LKJSF\",\"Service_Request_Nbr\":\"123456789012\",\"Svc_Req_Start_Date\":\"2017-07-20T12:20:18.804-04:00\",\"Svc_Req_Type_Code\":\"REPLREQ\",\"Svc_Req_Status_Code\":\"WORKING\",\"Service_Flag\":true,\"Failure_Code\":\"ADH\",\"Failure_Date\":\"2017-07-20T12:20:18.804-04:00\",\"Entitlement_Type_Code\":\"CLAIM\",\"Source\":\"CareCentral\",\"Channel_Name\":\"Agent\",\"Agent_Name\":\"Doe, Jane\",\"Claim_State_Province\":\"VA\",\"Resolution_Code\":\"DIAG\",\"Assignee\":\"112951\",\"Contract_Nbr\":\"123456789012\",\"Client_Transaction_Nbr\":\"123456789012\",\"Warranty_SKU\":\"WMT TV REPL 24M $100-300 P\",\"Warranty_Price_Low\":4.8,\"Warranty_Price_High\":667.8,\"Purchase_Price\":688.9,\"Contract_Create_Dt\":\"2017-07-20T12:20:18.804-04:00\",\"Contract_Create_Channel\":\"CARECENTRAL\",\"Contract_Created_By\":\"Doe, Jane\",\"Contract_Browser_Finger_Print\":\"12312ASDLAKSDJ1213LKJSF\",\"Program_Type\":\"SERVICE\",\"Receipt_Status_Code\":\"N\",\"Client_Id\":\"\",\"Client_Name\":\"WAL-WHL-SL-VA\",\"Cust_Store_Dist\":56.0,\"Product_Id\":\"12312ASDLAKSDJ1213LKJSF\",\"Is_Bulky\":\"Y\",\"Product_Name\":\"TV\",\"Product_Name_Incident\":\"LOST\",\"Product_Brand\":\"LG\",\"Product_Category\":\"TV\",\"Product_Class\":\"DEVICE\",\"Product_Industry\":\"CONSUMER ELECTRONICS\",\"Product_Purchase_Dt\":\"2017-07-20T12:20:18.804-04:00\",\"Model\":\"MS2287\",\"Serial\":\"LXPLY020449480E\",\"Product_Description\":\"LG 8500 Smart LED TV\",\"Customer_Id\":\"12312ASDLAKSDJ1213LKJSF\",\"Customer_First_Name\":\"JOHN\",\"Customer_Last_Name\":\"DOE\",\"Valid_Id_Ind\":true,\"Fulfillment_Transaction_Id\":\"12312ASDLAKSDJ1213LKJSF\",\"Auth_Type\":\"AUTH 1\",\"Auth_Status\":\"1st Authorization\",\"Total_Auth_Amount\":\"456.9\",\"PEBO_Override_Flag\":true,\"Created_Date\":\"2017-07-20T12:20:18.804-04:00\",\"Browser_Finger_Print\":\"12312ASDLAKSDJ1213LKJSF\",\"Automatic_Nbr_Id\":\"123456789012\",\"Dialed_Phone_Nbr\":\"123456789012\",\"Primary_Phone_Nbr\":\"123456789012\",\"Address_Type_Code\":\"CUST\",\"Address_Override_Flag\":true,\"Is_FL\":\"N\"},\"ScanDetailsAction\":{},\"CountsComputations\":[],\"RefereceComputations\":[]}}")
              	.when()
				.post("http://SYNLPTPF01D6F:8990/Channels/HTTPChannel/FRMCheckDest")
				.then()
	      		.log()
        		.body()
 
				.extract()
				.path("FRMCheckResp.RiskOutputs[0].ActionCode");
				System.out.println("Action Code for Rule no 5 is :"+rule_id);

	}
	
	
	@Test
	public void Assertion_Action_Code_RULE_Id_5() {
		
                ValidatableResponse response = given().contentType(ContentType.JSON)
               	.body("{\"FRMCheck\":{\"ClaimDetailsAction\":{\"Service_Request_Id\":\"12312ASDLAKSDJ1213LKJSF\",\"Service_Request_Nbr\":\"123456789012\",\"Svc_Req_Start_Date\":\"2017-07-20T12:20:18.804-04:00\",\"Svc_Req_Type_Code\":\"REPLREQ\",\"Svc_Req_Status_Code\":\"WORKING\",\"Service_Flag\":true,\"Failure_Code\":\"ADH\",\"Failure_Date\":\"2017-07-20T12:20:18.804-04:00\",\"Entitlement_Type_Code\":\"CLAIM\",\"Source\":\"CareCentral\",\"Channel_Name\":\"Agent\",\"Agent_Name\":\"Doe, Jane\",\"Claim_State_Province\":\"VA\",\"Resolution_Code\":\"DIAG\",\"Assignee\":\"112951\",\"Contract_Nbr\":\"123456789012\",\"Client_Transaction_Nbr\":\"123456789012\",\"Warranty_SKU\":\"WMT TV REPL 24M $100-300 P\",\"Warranty_Price_Low\":4.8,\"Warranty_Price_High\":667.8,\"Purchase_Price\":688.9,\"Contract_Create_Dt\":\"2017-07-20T12:20:18.804-04:00\",\"Contract_Create_Channel\":\"CARECENTRAL\",\"Contract_Created_By\":\"Doe, Jane\",\"Contract_Browser_Finger_Print\":\"12312ASDLAKSDJ1213LKJSF\",\"Program_Type\":\"SERVICE\",\"Receipt_Status_Code\":\"N\",\"Client_Id\":\"\",\"Client_Name\":\"WAL-WHL-SL-VA\",\"Cust_Store_Dist\":56.0,\"Product_Id\":\"12312ASDLAKSDJ1213LKJSF\",\"Is_Bulky\":\"Y\",\"Product_Name\":\"TV\",\"Product_Name_Incident\":\"LOST\",\"Product_Brand\":\"LG\",\"Product_Category\":\"TV\",\"Product_Class\":\"DEVICE\",\"Product_Industry\":\"CONSUMER ELECTRONICS\",\"Product_Purchase_Dt\":\"2017-07-20T12:20:18.804-04:00\",\"Model\":\"MS2287\",\"Serial\":\"LXPLY020449480E\",\"Product_Description\":\"LG 8500 Smart LED TV\",\"Customer_Id\":\"12312ASDLAKSDJ1213LKJSF\",\"Customer_First_Name\":\"JOHN\",\"Customer_Last_Name\":\"DOE\",\"Valid_Id_Ind\":true,\"Fulfillment_Transaction_Id\":\"12312ASDLAKSDJ1213LKJSF\",\"Auth_Type\":\"AUTH 1\",\"Auth_Status\":\"1st Authorization\",\"Total_Auth_Amount\":\"456.9\",\"PEBO_Override_Flag\":true,\"Created_Date\":\"2017-07-20T12:20:18.804-04:00\",\"Browser_Finger_Print\":\"12312ASDLAKSDJ1213LKJSF\",\"Automatic_Nbr_Id\":\"123456789012\",\"Dialed_Phone_Nbr\":\"123456789012\",\"Primary_Phone_Nbr\":\"123456789012\",\"Address_Type_Code\":\"CUST\",\"Address_Override_Flag\":true,\"Is_FL\":\"N\"},\"ScanDetailsAction\":{},\"CountsComputations\":[],\"RefereceComputations\":[]}}")
       		    .when()
		        .post("http://SYNLPTPF01D6F:8990/Channels/HTTPChannel/FRMCheckDest")
		        .then()
	      		.log()
        		.body()
 
		        .statusCode(200)
		        .contentType(ContentType.JSON);
                 String rule_Id = response.extract().path("FRMCheckResp.RiskOutputs[0].ActionCode");
	             Assert.assertEquals(rule_Id, "RCPT REQ");

 
	}
	
	
	@Test
	public void validate_Action_Code_RULE_Id_6() {
                String rule_id= given().contentType(ContentType.JSON)
        		.body("{\"FRMCheck\":{\"ClaimDetailsAction\":{\"Service_Request_Id\":\"12312ASDLAKSDJ1213LKJSF\",\"Service_Request_Nbr\":\"123456789012\",\"Svc_Req_Start_Date\":\"2017-07-20T12:20:18.804-04:00\",\"Svc_Req_Type_Code\":\"REPLREQ\",\"Svc_Req_Status_Code\":\"WORKING\",\"Service_Flag\":true,\"Failure_Code\":\"ADH\",\"Failure_Date\":\"2017-07-20T12:20:18.804-04:00\",\"Entitlement_Type_Code\":\"CLAIM\",\"Source\":\"CareCentral\",\"Channel_Name\":\"Agent\",\"Agent_Name\":\"Doe, Jane\",\"Claim_State_Province\":\"VA\",\"Resolution_Code\":\"DIAG\",\"Assignee\":\"112951\",\"Contract_Nbr\":\"123456789012\",\"Client_Transaction_Nbr\":\"123456789012\",\"Warranty_SKU\":\"WMT TV REPL 24M $100-300 P\",\"Warranty_Price_Low\":4.8,\"Warranty_Price_High\":667.8,\"Purchase_Price\":688.9,\"Contract_Create_Dt\":\"2017-07-20T12:20:18.804-04:00\",\"Contract_Create_Channel\":\"CARECENTRAL\",\"Contract_Created_By\":\"Doe, Jane\",\"Contract_Browser_Finger_Print\":\"12312ASDLAKSDJ1213LKJSF\",\"Program_Type\":\"\",\"Receipt_Status_Code\":\"N\",\"Client_Id\":\"125444713\",\"Client_Name\":\"WAL-WHL-SL-VA\",\"Cust_Store_Dist\":56.0,\"Product_Id\":\"12312ASDLAKSDJ1213LKJSF\",\"Is_Bulky\":\"Y\",\"Product_Name\":\"TV\",\"Product_Name_Incident\":\"LOST\",\"Product_Brand\":\"LG\",\"Product_Category\":\"TV\",\"Product_Class\":\"DEVICE\",\"Product_Industry\":\"CONSUMER ELECTRONICS\",\"Product_Purchase_Dt\":\"2017-07-20T12:20:18.804-04:00\",\"Model\":\"MS2287\",\"Serial\":\"LXPLY020449480E\",\"Product_Description\":\"LG 8500 Smart LED TV\",\"Customer_Id\":\"12312ASDLAKSDJ1213LKJSF\",\"Customer_First_Name\":\"JOHN\",\"Customer_Last_Name\":\"DOE\",\"Valid_Id_Ind\":true,\"Fulfillment_Transaction_Id\":\"12312ASDLAKSDJ1213LKJSF\",\"Auth_Type\":\"AUTH 1\",\"Auth_Status\":\"1st Authorization\",\"Total_Auth_Amount\":\"456.9\",\"PEBO_Override_Flag\":true,\"Created_Date\":\"2017-07-20T12:20:18.804-04:00\",\"Browser_Finger_Print\":\"12312ASDLAKSDJ1213LKJSF\",\"Automatic_Nbr_Id\":\"123456789012\",\"Dialed_Phone_Nbr\":\"123456789012\",\"Primary_Phone_Nbr\":\"123456789012\",\"Address_Type_Code\":\"CUST\",\"Address_Override_Flag\":true,\"Is_FL\":\"N\"},\"ScanDetailsAction\":{},\"CountsComputations\":[],\"RefereceComputations\":[]}}")
             	.when()
				.post("http://SYNLPTPF01D6F:8990/Channels/HTTPChannel/FRMCheckDest")
				.then()
	      		.log()
        		.body()
 
				.extract()
				.path("FRMCheckResp.RiskOutputs[0].ActionCode");
				System.out.println("Action Code for Rule no 6 is :"+rule_id);

	}
	
	@Test
	public void Assertion_Action_Code_RULE_Id_6() {

		
                ValidatableResponse response = given().contentType(ContentType.JSON)
           		.body("{\"FRMCheck\":{\"ClaimDetailsAction\":{\"Service_Request_Id\":\"12312ASDLAKSDJ1213LKJSF\",\"Service_Request_Nbr\":\"123456789012\",\"Svc_Req_Start_Date\":\"2017-07-20T12:20:18.804-04:00\",\"Svc_Req_Type_Code\":\"REPLREQ\",\"Svc_Req_Status_Code\":\"WORKING\",\"Service_Flag\":true,\"Failure_Code\":\"ADH\",\"Failure_Date\":\"2017-07-20T12:20:18.804-04:00\",\"Entitlement_Type_Code\":\"CLAIM\",\"Source\":\"CareCentral\",\"Channel_Name\":\"Agent\",\"Agent_Name\":\"Doe, Jane\",\"Claim_State_Province\":\"VA\",\"Resolution_Code\":\"DIAG\",\"Assignee\":\"112951\",\"Contract_Nbr\":\"123456789012\",\"Client_Transaction_Nbr\":\"123456789012\",\"Warranty_SKU\":\"WMT TV REPL 24M $100-300 P\",\"Warranty_Price_Low\":4.8,\"Warranty_Price_High\":667.8,\"Purchase_Price\":688.9,\"Contract_Create_Dt\":\"2017-07-20T12:20:18.804-04:00\",\"Contract_Create_Channel\":\"CARECENTRAL\",\"Contract_Created_By\":\"Doe, Jane\",\"Contract_Browser_Finger_Print\":\"12312ASDLAKSDJ1213LKJSF\",\"Program_Type\":\"\",\"Receipt_Status_Code\":\"N\",\"Client_Id\":\"125444713\",\"Client_Name\":\"WAL-WHL-SL-VA\",\"Cust_Store_Dist\":56.0,\"Product_Id\":\"12312ASDLAKSDJ1213LKJSF\",\"Is_Bulky\":\"Y\",\"Product_Name\":\"TV\",\"Product_Name_Incident\":\"LOST\",\"Product_Brand\":\"LG\",\"Product_Category\":\"TV\",\"Product_Class\":\"DEVICE\",\"Product_Industry\":\"CONSUMER ELECTRONICS\",\"Product_Purchase_Dt\":\"2017-07-20T12:20:18.804-04:00\",\"Model\":\"MS2287\",\"Serial\":\"LXPLY020449480E\",\"Product_Description\":\"LG 8500 Smart LED TV\",\"Customer_Id\":\"12312ASDLAKSDJ1213LKJSF\",\"Customer_First_Name\":\"JOHN\",\"Customer_Last_Name\":\"DOE\",\"Valid_Id_Ind\":true,\"Fulfillment_Transaction_Id\":\"12312ASDLAKSDJ1213LKJSF\",\"Auth_Type\":\"AUTH 1\",\"Auth_Status\":\"1st Authorization\",\"Total_Auth_Amount\":\"456.9\",\"PEBO_Override_Flag\":true,\"Created_Date\":\"2017-07-20T12:20:18.804-04:00\",\"Browser_Finger_Print\":\"12312ASDLAKSDJ1213LKJSF\",\"Automatic_Nbr_Id\":\"123456789012\",\"Dialed_Phone_Nbr\":\"123456789012\",\"Primary_Phone_Nbr\":\"123456789012\",\"Address_Type_Code\":\"CUST\",\"Address_Override_Flag\":true,\"Is_FL\":\"N\"},\"ScanDetailsAction\":{},\"CountsComputations\":[],\"RefereceComputations\":[]}}")
        		.when()
		        .post("http://SYNLPTPF01D6F:8990/Channels/HTTPChannel/FRMCheckDest")
		        .then()
	      		.log()
        		.body()
 
	        	.statusCode(200)
	       	    .contentType(ContentType.JSON);
                String rule_Id = response.extract().path("FRMCheckResp.RiskOutputs[0].ActionCode");
	            Assert.assertEquals(rule_Id, "APPROVED");

		
	}
	
	
	@Test
	public void validate_Action_Code_RULE_Id_7() {
                String rule_id= given().contentType(ContentType.JSON)
        		.body("{\"FRMCheck\":{\"ClaimDetailsAction\":{\"Service_Request_Id\":\"12312ASDLAKSDJ1213LKJSF\",\"Service_Request_Nbr\":\"123456789012\",\"Svc_Req_Start_Date\":\"2017-07-20T12:20:18.804-04:00\",\"Svc_Req_Type_Code\":\"REPLREQ\",\"Svc_Req_Status_Code\":\"WORKING\",\"Service_Flag\":true,\"Failure_Code\":\"ADH\",\"Failure_Date\":\"2017-07-20T12:20:18.804-04:00\",\"Entitlement_Type_Code\":\"CLAIM\",\"Source\":\"CareCentral\",\"Channel_Name\":\"Agent\",\"Agent_Name\":\"Doe, Jane\",\"Claim_State_Province\":\"VA\",\"Resolution_Code\":\"DIAG\",\"Assignee\":\"112951\",\"Contract_Nbr\":\"123456789012\",\"Client_Transaction_Nbr\":\"123456789012\",\"Warranty_SKU\":\"WMT TV REPL 24M $100-300 P\",\"Warranty_Price_Low\":4.8,\"Warranty_Price_High\":667.8,\"Purchase_Price\":688.9,\"Contract_Create_Dt\":\"2017-07-20T12:20:18.804-04:00\",\"Contract_Create_Channel\":\"CARECENTRAL\",\"Contract_Created_By\":\"Doe, Jane\",\"Contract_Browser_Finger_Print\":\"12312ASDLAKSDJ1213LKJSF\",\"Program_Type\":\"\",\"Receipt_Status_Code\":\"N\",\"Client_Id\":\"167094897\",\"Client_Name\":\"WAL-WHL-SL-VA\",\"Cust_Store_Dist\":56.0,\"Product_Id\":\"12312ASDLAKSDJ1213LKJSF\",\"Is_Bulky\":\"Y\",\"Product_Name\":\"TV\",\"Product_Name_Incident\":\"LOST\",\"Product_Brand\":\"LG\",\"Product_Category\":\"TV\",\"Product_Class\":\"DEVICE\",\"Product_Industry\":\"CONSUMER ELECTRONICS\",\"Product_Purchase_Dt\":\"2017-07-20T12:20:18.804-04:00\",\"Model\":\"MS2287\",\"Serial\":\"LXPLY020449480E\",\"Product_Description\":\"LG 8500 Smart LED TV\",\"Customer_Id\":\"12312ASDLAKSDJ1213LKJSF\",\"Customer_First_Name\":\"JOHN\",\"Customer_Last_Name\":\"DOE\",\"Valid_Id_Ind\":true,\"Fulfillment_Transaction_Id\":\"12312ASDLAKSDJ1213LKJSF\",\"Auth_Type\":\"AUTH 1\",\"Auth_Status\":\"1st Authorization\",\"Total_Auth_Amount\":\"456.9\",\"PEBO_Override_Flag\":true,\"Created_Date\":\"2017-07-20T12:20:18.804-04:00\",\"Browser_Finger_Print\":\"12312ASDLAKSDJ1213LKJSF\",\"Automatic_Nbr_Id\":\"123456789012\",\"Dialed_Phone_Nbr\":\"123456789012\",\"Primary_Phone_Nbr\":\"123456789012\",\"Address_Type_Code\":\"CUST\",\"Address_Override_Flag\":true,\"Is_FL\":\"N\"},\"ScanDetailsAction\":{},\"CountsComputations\":[],\"RefereceComputations\":[]}}")
            	.when()
				.post("http://SYNLPTPF01D6F:8990/Channels/HTTPChannel/FRMCheckDest")
				.then()
	      		.log()
        		.body()
 
				.extract()
				.path("FRMCheckResp.RiskOutputs[0].ActionCode");
				System.out.println("Action Code for Rule no 6 is :"+rule_id);

	}
	
	@Test
	public void Assertion_Action_Code_RULE_Id_7() {
		
		    ValidatableResponse response = given().contentType(ContentType.JSON)
	       .body("{\"FRMCheck\":{\"ClaimDetailsAction\":{\"Service_Request_Id\":\"12312ASDLAKSDJ1213LKJSF\",\"Service_Request_Nbr\":\"123456789012\",\"Svc_Req_Start_Date\":\"2017-07-20T12:20:18.804-04:00\",\"Svc_Req_Type_Code\":\"REPLREQ\",\"Svc_Req_Status_Code\":\"WORKING\",\"Service_Flag\":true,\"Failure_Code\":\"ADH\",\"Failure_Date\":\"2017-07-20T12:20:18.804-04:00\",\"Entitlement_Type_Code\":\"CLAIM\",\"Source\":\"CareCentral\",\"Channel_Name\":\"Agent\",\"Agent_Name\":\"Doe, Jane\",\"Claim_State_Province\":\"VA\",\"Resolution_Code\":\"DIAG\",\"Assignee\":\"112951\",\"Contract_Nbr\":\"123456789012\",\"Client_Transaction_Nbr\":\"123456789012\",\"Warranty_SKU\":\"WMT TV REPL 24M $100-300 P\",\"Warranty_Price_Low\":4.8,\"Warranty_Price_High\":667.8,\"Purchase_Price\":688.9,\"Contract_Create_Dt\":\"2017-07-20T12:20:18.804-04:00\",\"Contract_Create_Channel\":\"CARECENTRAL\",\"Contract_Created_By\":\"Doe, Jane\",\"Contract_Browser_Finger_Print\":\"12312ASDLAKSDJ1213LKJSF\",\"Program_Type\":\"\",\"Receipt_Status_Code\":\"N\",\"Client_Id\":\"167094897\",\"Client_Name\":\"WAL-WHL-SL-VA\",\"Cust_Store_Dist\":56.0,\"Product_Id\":\"12312ASDLAKSDJ1213LKJSF\",\"Is_Bulky\":\"Y\",\"Product_Name\":\"TV\",\"Product_Name_Incident\":\"LOST\",\"Product_Brand\":\"LG\",\"Product_Category\":\"TV\",\"Product_Class\":\"DEVICE\",\"Product_Industry\":\"CONSUMER ELECTRONICS\",\"Product_Purchase_Dt\":\"2017-07-20T12:20:18.804-04:00\",\"Model\":\"MS2287\",\"Serial\":\"LXPLY020449480E\",\"Product_Description\":\"LG 8500 Smart LED TV\",\"Customer_Id\":\"12312ASDLAKSDJ1213LKJSF\",\"Customer_First_Name\":\"JOHN\",\"Customer_Last_Name\":\"DOE\",\"Valid_Id_Ind\":true,\"Fulfillment_Transaction_Id\":\"12312ASDLAKSDJ1213LKJSF\",\"Auth_Type\":\"AUTH 1\",\"Auth_Status\":\"1st Authorization\",\"Total_Auth_Amount\":\"456.9\",\"PEBO_Override_Flag\":true,\"Created_Date\":\"2017-07-20T12:20:18.804-04:00\",\"Browser_Finger_Print\":\"12312ASDLAKSDJ1213LKJSF\",\"Automatic_Nbr_Id\":\"123456789012\",\"Dialed_Phone_Nbr\":\"123456789012\",\"Primary_Phone_Nbr\":\"123456789012\",\"Address_Type_Code\":\"CUST\",\"Address_Override_Flag\":true,\"Is_FL\":\"N\"},\"ScanDetailsAction\":{},\"CountsComputations\":[],\"RefereceComputations\":[]}}")
		   .when()
		   .post("http://SYNLPTPF01D6F:8990/Channels/HTTPChannel/FRMCheckDest")
		   .then()
     		.log()
    		.body()

		   .statusCode(200)
			.contentType(ContentType.JSON);
	        String rule_Id = response.extract().path("FRMCheckResp.RiskOutputs[0].ActionCode");
		    Assert.assertEquals(rule_Id, "RCPT REQ");
				
	}
	
	@Test
	public void validate_Action_Code_RULE_Id_8() {
                String rule_id= given().contentType(ContentType.JSON)
            	.body("{\"FRMCheck\":{\"ClaimDetailsAction\":{\"Service_Request_Id\":\"12312ASDLAKSDJ1213LKJSF\",\"Service_Request_Nbr\":\"123456789012\",\"Svc_Req_Start_Date\":\"2017-07-20T12:20:18.804-04:00\",\"Svc_Req_Type_Code\":\"REPLREQ\",\"Svc_Req_Status_Code\":\"WORKING\",\"Service_Flag\":true,\"Failure_Code\":\"ADH\",\"Failure_Date\":\"2017-07-20T12:20:18.804-04:00\",\"Entitlement_Type_Code\":\"CLAIM\",\"Source\":\"CareCentral\",\"Channel_Name\":\"Agent\",\"Agent_Name\":\"Doe, Jane\",\"Claim_State_Province\":\"VA\",\"Resolution_Code\":\"DIAG\",\"Assignee\":\"112951\",\"Contract_Nbr\":\"123456789012\",\"Client_Transaction_Nbr\":\"123456789012\",\"Warranty_SKU\":\"WMT TV REPL 24M $100-300 P\",\"Warranty_Price_Low\":4.8,\"Warranty_Price_High\":667.8,\"Purchase_Price\":688.9,\"Contract_Create_Dt\":\"2017-07-20T12:20:18.804-04:00\",\"Contract_Create_Channel\":\"CARECENTRAL\",\"Contract_Created_By\":\"Doe, Jane\",\"Contract_Browser_Finger_Print\":\"12312ASDLAKSDJ1213LKJSF\",\"Program_Type\":\"\",\"Receipt_Status_Code\":\"N\",\"Client_Id\":\"\",\"Client_Name\":\"WAL-WHL-SL-VA\",\"Cust_Store_Dist\":56.0,\"Product_Id\":\"12312ASDLAKSDJ1213LKJSF\",\"Is_Bulky\":\"N\",\"Product_Name\":\"TV\",\"Product_Name_Incident\":\"LOST\",\"Product_Brand\":\"LG\",\"Product_Category\":\"TV\",\"Product_Class\":\"DEVICE\",\"Product_Industry\":\"CONSUMER ELECTRONICS\",\"Product_Purchase_Dt\":\"2017-07-20T12:20:18.804-04:00\",\"Model\":\"MS2287\",\"Serial\":\"LXPLY020449480E\",\"Product_Description\":\"LG 8500 Smart LED TV\",\"Customer_Id\":\"12312ASDLAKSDJ1213LKJSF\",\"Customer_First_Name\":\"JOHN\",\"Customer_Last_Name\":\"DOE\",\"Valid_Id_Ind\":true,\"Fulfillment_Transaction_Id\":\"12312ASDLAKSDJ1213LKJSF\",\"Auth_Type\":\"AUTH 1\",\"Auth_Status\":\"1st Authorization\",\"Total_Auth_Amount\":\"456.9\",\"PEBO_Override_Flag\":true,\"Created_Date\":\"2017-07-20T12:20:18.804-04:00\",\"Browser_Finger_Print\":\"12312ASDLAKSDJ1213LKJSF\",\"Automatic_Nbr_Id\":\"123456789012\",\"Dialed_Phone_Nbr\":\"123456789012\",\"Primary_Phone_Nbr\":\"123456789012\",\"Address_Type_Code\":\"CUST\",\"Address_Override_Flag\":true,\"Is_FL\":\"N\"},\"ScanDetailsAction\":{},\"CountsComputations\":[],\"RefereceComputations\":[]}}")
             	.when()
				.post("http://SYNLPTPF01D6F:8990/Channels/HTTPChannel/FRMCheckDest")
				.then()
	      		.log()
        		.body()
 
				.extract()
				.path("FRMCheckResp.RiskOutputs[0].ActionCode");
				System.out.println("Action Code for Rule no 8 is : : "+rule_id);
	}
	
	@Test
	public void Assertion_Action_Code_RULE_Id_8() {
		
	            ValidatableResponse response = given().contentType(ContentType.JSON)
	         	.body("{\"FRMCheck\":{\"ClaimDetailsAction\":{\"Service_Request_Id\":\"12312ASDLAKSDJ1213LKJSF\",\"Service_Request_Nbr\":\"123456789012\",\"Svc_Req_Start_Date\":\"2017-07-20T12:20:18.804-04:00\",\"Svc_Req_Type_Code\":\"REPLREQ\",\"Svc_Req_Status_Code\":\"WORKING\",\"Service_Flag\":true,\"Failure_Code\":\"ADH\",\"Failure_Date\":\"2017-07-20T12:20:18.804-04:00\",\"Entitlement_Type_Code\":\"CLAIM\",\"Source\":\"CareCentral\",\"Channel_Name\":\"Agent\",\"Agent_Name\":\"Doe, Jane\",\"Claim_State_Province\":\"VA\",\"Resolution_Code\":\"DIAG\",\"Assignee\":\"112951\",\"Contract_Nbr\":\"123456789012\",\"Client_Transaction_Nbr\":\"123456789012\",\"Warranty_SKU\":\"WMT TV REPL 24M $100-300 P\",\"Warranty_Price_Low\":4.8,\"Warranty_Price_High\":667.8,\"Purchase_Price\":688.9,\"Contract_Create_Dt\":\"2017-07-20T12:20:18.804-04:00\",\"Contract_Create_Channel\":\"CARECENTRAL\",\"Contract_Created_By\":\"Doe, Jane\",\"Contract_Browser_Finger_Print\":\"12312ASDLAKSDJ1213LKJSF\",\"Program_Type\":\"\",\"Receipt_Status_Code\":\"N\",\"Client_Id\":\"\",\"Client_Name\":\"WAL-WHL-SL-VA\",\"Cust_Store_Dist\":56.0,\"Product_Id\":\"12312ASDLAKSDJ1213LKJSF\",\"Is_Bulky\":\"N\",\"Product_Name\":\"TV\",\"Product_Name_Incident\":\"LOST\",\"Product_Brand\":\"LG\",\"Product_Category\":\"TV\",\"Product_Class\":\"DEVICE\",\"Product_Industry\":\"CONSUMER ELECTRONICS\",\"Product_Purchase_Dt\":\"2017-07-20T12:20:18.804-04:00\",\"Model\":\"MS2287\",\"Serial\":\"LXPLY020449480E\",\"Product_Description\":\"LG 8500 Smart LED TV\",\"Customer_Id\":\"12312ASDLAKSDJ1213LKJSF\",\"Customer_First_Name\":\"JOHN\",\"Customer_Last_Name\":\"DOE\",\"Valid_Id_Ind\":true,\"Fulfillment_Transaction_Id\":\"12312ASDLAKSDJ1213LKJSF\",\"Auth_Type\":\"AUTH 1\",\"Auth_Status\":\"1st Authorization\",\"Total_Auth_Amount\":\"456.9\",\"PEBO_Override_Flag\":true,\"Created_Date\":\"2017-07-20T12:20:18.804-04:00\",\"Browser_Finger_Print\":\"12312ASDLAKSDJ1213LKJSF\",\"Automatic_Nbr_Id\":\"123456789012\",\"Dialed_Phone_Nbr\":\"123456789012\",\"Primary_Phone_Nbr\":\"123456789012\",\"Address_Type_Code\":\"CUST\",\"Address_Override_Flag\":true,\"Is_FL\":\"N\"},\"ScanDetailsAction\":{},\"CountsComputations\":[],\"RefereceComputations\":[]}}")
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
	
	
	
	
	@Test
	public void validate_Action_Code_RULE_Id_9() {
		        String rule_id= given().contentType(ContentType.JSON)
				.body("{\"FRMCheck\":{\"ClaimDetailsAction\":{\"Service_Request_Id\":\"12312ASDLAKSDJ1213LKJSF\",\"Service_Request_Nbr\":\"123456789012\",\"Svc_Req_Start_Date\":\"2017-07-20T12:20:18.804-04:00\",\"Svc_Req_Type_Code\":\"REPLREQ\",\"Svc_Req_Status_Code\":\"WORKING\",\"Service_Flag\":true,\"Failure_Code\":\"ADH\",\"Failure_Date\":\"2017-07-20T12:20:18.804-04:00\",\"Entitlement_Type_Code\":\"CLAIM\",\"Source\":\"CareCentral\",\"Channel_Name\":\"Agent\",\"Agent_Name\":\"Doe, Jane\",\"Claim_State_Province\":\"VA\",\"Resolution_Code\":\"DIAG\",\"Assignee\":\"112951\",\"Contract_Nbr\":\"123456789012\",\"Client_Transaction_Nbr\":\"123456789012\",\"Warranty_SKU\":\"WMT TV REPL 24M $100-300 P\",\"Warranty_Price_Low\":4.8,\"Warranty_Price_High\":667.8,\"Purchase_Price\":688.9,\"Contract_Create_Dt\":\"2017-07-20T12:20:18.804-04:00\",\"Contract_Create_Channel\":\"CARECENTRAL\",\"Contract_Created_By\":\"Doe, Jane\",\"Contract_Browser_Finger_Print\":\"12312ASDLAKSDJ1213LKJSF\",\"Program_Type\":\"\",\"Receipt_Status_Code\":\"N\",\"Client_Id\":\"\",\"Client_Name\":\"WAL-WHL-SL-VA\",\"Cust_Store_Dist\":56.0,\"Product_Id\":\"12312ASDLAKSDJ1213LKJSF\",\"Is_Bulky\":\"Y\",\"Product_Name\":\"TV\",\"Product_Name_Incident\":\"LOST\",\"Product_Brand\":\"LG\",\"Product_Category\":\"TV\",\"Product_Class\":\"DEVICE\",\"Product_Industry\":\"CONSUMER ELECTRONICS\",\"Product_Purchase_Dt\":\"2017-07-20T12:20:18.804-04:00\",\"Model\":\"MS2287\",\"Serial\":\"LXPLY020449480E\",\"Product_Description\":\"LG 8500 Smart LED TV\",\"Customer_Id\":\"12312ASDLAKSDJ1213LKJSF\",\"Customer_First_Name\":\"JOHN\",\"Customer_Last_Name\":\"DOE\",\"Valid_Id_Ind\":true,\"Fulfillment_Transaction_Id\":\"12312ASDLAKSDJ1213LKJSF\",\"Auth_Type\":\"AUTH 1\",\"Auth_Status\":\"1st Authorization\",\"Total_Auth_Amount\":\"456.9\",\"PEBO_Override_Flag\":true,\"Created_Date\":\"2017-07-20T12:20:18.804-04:00\",\"Browser_Finger_Print\":\"12312ASDLAKSDJ1213LKJSF\",\"Automatic_Nbr_Id\":\"123456789012\",\"Dialed_Phone_Nbr\":\"123456789012\",\"Primary_Phone_Nbr\":\"123456789012\",\"Address_Type_Code\":\"CUST\",\"Address_Override_Flag\":true,\"Is_FL\":\"N\"},\"ScanDetailsAction\":{},\"CountsComputations\":[],\"RefereceComputations\":[]}}")
				.when()
				.post("http://SYNLPTPF01D6F:8990/Channels/HTTPChannel/FRMCheckDest")
				.then()
	      		.log()
        		.body()
 
				.extract()
				.path("FRMCheckResp.RiskOutputs[0].ActionCode");
				System.out.println("Action Code for Rule no 9 is : "+rule_id);
					
}
	

	@Test
	public void Assertion_Action_Code_RULE_Id_9() {
					
	           ValidatableResponse response = given().contentType(ContentType.JSON)
		      .body("{\"FRMCheck\":{\"ClaimDetailsAction\":{\"Service_Request_Id\":\"12312ASDLAKSDJ1213LKJSF\",\"Service_Request_Nbr\":\"123456789012\",\"Svc_Req_Start_Date\":\"2017-07-20T12:20:18.804-04:00\",\"Svc_Req_Type_Code\":\"REPLREQ\",\"Svc_Req_Status_Code\":\"WORKING\",\"Service_Flag\":true,\"Failure_Code\":\"ADH\",\"Failure_Date\":\"2017-07-20T12:20:18.804-04:00\",\"Entitlement_Type_Code\":\"CLAIM\",\"Source\":\"CareCentral\",\"Channel_Name\":\"Agent\",\"Agent_Name\":\"Doe, Jane\",\"Claim_State_Province\":\"VA\",\"Resolution_Code\":\"DIAG\",\"Assignee\":\"112951\",\"Contract_Nbr\":\"123456789012\",\"Client_Transaction_Nbr\":\"123456789012\",\"Warranty_SKU\":\"WMT TV REPL 24M $100-300 P\",\"Warranty_Price_Low\":4.8,\"Warranty_Price_High\":667.8,\"Purchase_Price\":688.9,\"Contract_Create_Dt\":\"2017-07-20T12:20:18.804-04:00\",\"Contract_Create_Channel\":\"CARECENTRAL\",\"Contract_Created_By\":\"Doe, Jane\",\"Contract_Browser_Finger_Print\":\"12312ASDLAKSDJ1213LKJSF\",\"Program_Type\":\"\",\"Receipt_Status_Code\":\"N\",\"Client_Id\":\"\",\"Client_Name\":\"WAL-WHL-SL-VA\",\"Cust_Store_Dist\":56.0,\"Product_Id\":\"12312ASDLAKSDJ1213LKJSF\",\"Is_Bulky\":\"Y\",\"Product_Name\":\"TV\",\"Product_Name_Incident\":\"LOST\",\"Product_Brand\":\"LG\",\"Product_Category\":\"TV\",\"Product_Class\":\"DEVICE\",\"Product_Industry\":\"CONSUMER ELECTRONICS\",\"Product_Purchase_Dt\":\"2017-07-20T12:20:18.804-04:00\",\"Model\":\"MS2287\",\"Serial\":\"LXPLY020449480E\",\"Product_Description\":\"LG 8500 Smart LED TV\",\"Customer_Id\":\"12312ASDLAKSDJ1213LKJSF\",\"Customer_First_Name\":\"JOHN\",\"Customer_Last_Name\":\"DOE\",\"Valid_Id_Ind\":true,\"Fulfillment_Transaction_Id\":\"12312ASDLAKSDJ1213LKJSF\",\"Auth_Type\":\"AUTH 1\",\"Auth_Status\":\"1st Authorization\",\"Total_Auth_Amount\":\"456.9\",\"PEBO_Override_Flag\":true,\"Created_Date\":\"2017-07-20T12:20:18.804-04:00\",\"Browser_Finger_Print\":\"12312ASDLAKSDJ1213LKJSF\",\"Automatic_Nbr_Id\":\"123456789012\",\"Dialed_Phone_Nbr\":\"123456789012\",\"Primary_Phone_Nbr\":\"123456789012\",\"Address_Type_Code\":\"CUST\",\"Address_Override_Flag\":true,\"Is_FL\":\"N\"},\"ScanDetailsAction\":{},\"CountsComputations\":[],\"RefereceComputations\":[]}}")
	 	      .when()
	          .post("http://SYNLPTPF01D6F:8990/Channels/HTTPChannel/FRMCheckDest")
	          .then()
	      	  .log()
        	  .body()
 
	          .statusCode(200)
		      .contentType(ContentType.JSON);
              String rule_Id = response.extract().path("FRMCheckResp.RiskOutputs[0].ActionCode");
	          Assert.assertEquals(rule_Id, "RCPT REQ");
			
					
}
	
	
	
	

}
