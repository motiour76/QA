package com.asurion.qa;

import static com.jayway.restassured.RestAssured.given;

import org.testng.annotations.Test;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.config.SSLConfig;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.ValidatableResponse;

public class InternalFraudCheckAPITest {
	
	@Test
	public void ASURION_FRM() {
		
		
        ValidatableResponse response = given()
		.config(RestAssured.config().sslConfig(new SSLConfig().relaxedHTTPSValidation()))
		.contentType(ContentType.JSON)
		.body("{\r\n" + 
				"  \"FRMCheck\" : {\r\n" + 
				"    \"ClaimDetailsAction\" : {\r\n" + 
				"      \"Service_Request_Id\" : \"8\",\r\n" + 
				"      \"Service_Request_Nbr\" : \"123456789012\",\r\n" + 
				"      \"Svc_Req_Start_Date\" : \"2017-07-20T12:20:18.804-04:00\",\r\n" + 
				"      \"Svc_Req_Type_Code\" : \"REPLREQ\",\r\n" + 
				"      \"Svc_Req_Status_Code\" : \"WORKING\",\r\n" + 
				"      \"Service_Flag\" : true,\r\n" + 
				"      \"Failure_Code\" : \"ADH\",\r\n" + 
				"      \"Failure_Date\" : \"2017-07-20T12:20:18.804-04:00\",\r\n" + 
				"      \"Entitlement_Type_Code\" : \"CLAIM\",\r\n" + 
				"      \"Source\" : \"CareCentral\",\r\n" + 
				"      \"Channel_Name\" : \"Agent\",\r\n" + 
				"      \"Agent_Name\" : \"Doe, Jane\",\r\n" + 
				"      \"Claim_State_Province\" : \"VA\",\r\n" + 
				"      \"Resolution_Code\" : \"DIAG\",\r\n" + 
				"      \"Assignee\" : \"112951\",\r\n" + 
				"      \"Contract_Nbr\" : \"123456789012\",\r\n" + 
				"      \"Client_Transaction_Nbr\" : \"123456789012\",\r\n" + 
				"      \"Warranty_SKU\" : \"WMT TV REPL 24M $100-300 P\",\r\n" + 
				"      \"Warranty_Price_Low\" : 4.8,\r\n" + 
				"      \"Warranty_Price_High\" : 667.8,\r\n" + 
				"      \"Purchase_Price\" : 688.9,\r\n" + 
				"      \"Contract_Create_Dt\" : \"2017-07-20T12:20:18.804-04:00\",\r\n" + 
				"      \"Contract_Create_Channel\" : \"CARECENTRAL\",\r\n" + 
				"      \"Contract_Created_By\" : \"Doe, Jane\",\r\n" + 
				"      \"Contract_Browser_Finger_Print\" : \"12312ASDLAKSDJ1213LKJSF\",\r\n" + 
				"      \"Program_Type\" : \"FEE PLAN\",\r\n" + 
				"      \"Receipt_Status_Code\" : \"N\",\r\n" + 
				"      \"Client_Id\" : \"6018553\",\r\n" + 
				"      \"Client_Name\" : \"WAL-WHL-SL-VA\",\r\n" + 
				"      \"Cust_Store_Dist\" : 56.0,\r\n" + 
				"      \"Product_Id\" : \"12312ASDLAKSDJ1213LKJSF\",\r\n" + 
				"      \"Is_Bulky\" : \"Y\",\r\n" + 
				"      \"Product_Name\" : \"TV\",\r\n" + 
				"      \"Product_Name_Incident\" : \"LOST\",\r\n" + 
				"      \"Product_Brand\" : \"LG\",\r\n" + 
				"      \"Product_Category\" : \"TV\",\r\n" + 
				"      \"Product_Class\" : \"DEVICE\",\r\n" + 
				"      \"Product_Industry\" : \"CONSUMER ELECTRONICS\",\r\n" + 
				"      \"Product_Purchase_Dt\" : \"2017-07-20T12:20:18.804-04:00\",\r\n" + 
				"      \"Model\" : \"MS2287\",\r\n" + 
				"      \"Serial\" : \"LXPLY020449480E\",\r\n" + 
				"      \"Product_Description\" : \"LG 8500 Smart LED TV\",\r\n" + 
				"      \"Customer_Id\" : \"12312ASDLAKSDJ1213LKJSF\",\r\n" + 
				"      \"Customer_First_Name\" : \"JOHN\",\r\n" + 
				"      \"Customer_Last_Name\" : \"DOE\",\r\n" + 
				"      \"Valid_Id_Ind\" : true,\r\n" + 
				"      \"Fulfillment_Transaction_Id\" : \"12312ASDLAKSDJ1213LKJSF\",\r\n" + 
				"      \"Auth_Type\" : \"AUTH 1\",\r\n" + 
				"      \"Auth_Status\" : \"1st Authorization\",\r\n" + 
				"      \"Total_Auth_Amount\" : \"456.9\",\r\n" + 
				"      \"PEBO_Override_Flag\" : true,\r\n" + 
				"      \"Created_Date\" : \"2017-07-20T12:20:18.804-04:00\",\r\n" + 
				"      \"Browser_Finger_Print\" : \"12312ASDLAKSDJ1213LKJSF\",\r\n" + 
				"      \"Automatic_Nbr_Id\" : \"123456789012\",\r\n" + 
				"      \"Dialed_Phone_Nbr\" : \"123456789012\",\r\n" + 
				"      \"Primary_Phone_Nbr\" : \"123456789012\",\r\n" + 
				"      \"Address_Type_Code\" : \"CUST\",\r\n" + 
				"      \"Address_Override_Flag\" : true,\r\n" + 
				"      \"Is_FL\" : \"Y\"\r\n" + 
				"    }\r\n" + 
				"  }\r\n" + 
				"}\r\n" + 
				"")

		.when()
		.post("https://internal-rtmbe-rtm-rtmdev-be-frm1-alb-609902234.us-east-1.elb.amazonaws.com:6301/Channels/HTTPChannel/FRMCheckDest")
		.then()
		.log()
		.body();

	
	}

}
