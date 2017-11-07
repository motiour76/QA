package com.asurion.qa;

import static com.jayway.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.ValidatableResponse;
import com.jayway.restassured.specification.ResponseSpecification;

public class TestAPI {
	
	TestDatas data = new TestDatas();


		@Test
		public void ASURION_RuleID_2_Paramater() {

			ValidatableResponse response = given()
					.contentType(ContentType.JSON)
					.body("{\"FRMCheck\":{\"ClaimDetailsAction\":{"
							+ "\"Service_Request_Id\":\"" + data.sRId +"\" ,"
							+"\"Service_Request_Nbr\":\"" + data.sRnum +"\" ,"   
							+ "\"Svc_Req_Start_Date\":\"" + data.startDate +"\","
							+ "\"Svc_Req_Type_Code\":\"" + data.reqTypeCode + "\","
							+ "\"Svc_Req_Status_Code\":\"" + data.reqStatusCode + "\","
							+ "\"Service_Flag\":"+ data.service_Flag+","
							+ "\"Failure_Code\":\""+ data.failure_Code +"\","
							+ "\"Failure_Date\":\"" + data.failureDate + "\","
							+ "\"Entitlement_Type_Code\":\""+ data.eTypeCode + "\","
							+ "\"Source\":\"" + data.source + "\","
							+ "\"Channel_Name\":\"" + data.channelName +"\","
							+ "\"Agent_Name\":\"" + data.agentName + "\","
							+ "\"Claim_State_Province\":\""+ data.province +"\","
							+ "\"Resolution_Code\":\""+ data.resCode +"\","
							+ "\"Assignee\":\""+ data.assignee+"\","
							+ "\"Contract_Nbr\":\"" + data.contactNum +"\","
							+ "\"Client_Transaction_Nbr\":\"" + data.clientTranscNum + "\","
							+ "\"Warranty_SKU\":\""+ data.warrantySKU +"\","
							+ "\"Warranty_Price_Low\": " + data.warranty_price_low +","
							+ "\"Warranty_Price_High\": " + data.warranty_price_high +","
							+ "\"Purchase_Price\": "+ data.purchase_price +","
							+ "\"Contract_Create_Dt\":\""+ data.contract_Create_Dt+"\","
							+ "\"Contract_Create_Channel\":\"" + data.contract_Create_Channel +"\","
							+ "\"Contract_Created_By\":\""+ data.contract_Created_By +"\","
							+ "\"Contract_Browser_Finger_Print\":\""+ data.contract_Browser_Finger_Print+"\","
							+ "\"Program_Type\":\""+ data.program_Type+"\","
							+ "\"Receipt_Status_Code\":\""+ data.receipt_Status_Code +"\","
							+ "\"Client_Id\":\"" + data.client_Id+ "\","
							+ "\"Client_Name\":\""+ data.client_Name +"\","
							+ "\"Cust_Store_Dist\": "+ data.cust_Store_Dist+","
							+ "\"Product_Id\":\"" + data.product_Id+"\","
							+ "\"Is_Bulky\":\""+ data.is_Bulky+"\","
							+ "\"Product_Name\":\""+ data.product_Name +"\","
							+ "\"Product_Name_Incident\":\""+ data.product_Name_Incident+"\","
							+ "\"Product_Brand\":\""+ data.product_Brand+"\","
							+ "\"Product_Category\":\""+ data.product_Category+"\","
							+ "\"Product_Class\":\""+ data.product_Class+"\","
							+ "\"Product_Industry\":\""+ data.product_Industry +"\","
							+ "\"Product_Purchase_Dt\":\""+ data.product_Purchase_Dt+"\","
							+ "\"Model\":\""+ data.model+"\","
							+ "\"Serial\":\""+ data.serial +"\","
							+ "\"Product_Description\":\""+ data.product_Description +"\","
							+ "\"Customer_Id\":\""+ data.customer_Id +"\","
							+ "\"Customer_First_Name\":\""+ data.customer_First_Name+"\","
							+ "\"Customer_Last_Name\":\""+ data.customer_Last_Name +"\","
							+ "\"Valid_Id_Ind\":" + data.valid_Id_Ind+","
							+ "\"Fulfillment_Transaction_Id\":\""+ data.fulfillment_Transaction_Id +"\","
							+ "\"Auth_Type\":\""+ data.auth_Type +"\","
							+ "\"Auth_Status\":\""+ data.auth_Status+"\","
							+ "\"Total_Auth_Amount\":\""+  data.total_Auth_Amount +"\","
							+ "\"PEBO_Override_Flag\":"+ data.PEBO_Override_Flag+","
							+ "\"Created_Date\":\""+ data.created_Date +"\","
							+ "\"Browser_Finger_Print\":\""+ data.browser_Finger_Print +"\","
							+ "\"Automatic_Nbr_Id\":\""+ data.automatic_Nbr_Id +"\","
							+ "\"Dialed_Phone_Nbr\":\""+ data.dialed_Phone_Nbr+"\","
							+ "\"Primary_Phone_Nbr\":\""+ data.primary_Phone_Nbr+"\","
							+ "\"Address_Type_Code\":\""+ data.address_Type_Code+"\","
							+ "\"Address_Override_Flag\":"+ data.address_Override_Flag+","
							+ "\"Is_FL\":\""+ data.is_FL +"\"},"
							+ "\"ScanDetailsAction\":{},\"CountsComputations\":[],"
							+ "\"RefereceComputations\":[]}}")
					.when()
					.post("http://SYNLPTPF01D6F:8990/Channels/HTTPChannel/FRMCheckDest")
					.then()
	        		.log()
	        		.body()
					.statusCode(200)
					.contentType(ContentType.JSON);
		            int rule_Id = response.extract().path("FRMCheckResp.RiskOutputs[0].RuleID");
				    Assert.assertEquals(rule_Id, 2);
			    
	}

}

