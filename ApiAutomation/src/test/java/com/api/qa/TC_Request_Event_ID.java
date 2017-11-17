package com.api.qa;

import static com.jayway.restassured.RestAssured.given;

import org.testng.annotations.Test;

import com.jayway.restassured.http.ContentType;

public class TC_Request_Event_ID {
	
	@Test
	public void validate_json() {
		
		        int requestEventID= given().contentType(ContentType.JSON)
				.body("{\"FRMCheck\":{\"ClaimDetailsAction\":{\"Service_Request_Id\":\"12312ASDLAKSDJ1213LKJSF\",\"Service_Request_Nbr\":\"123456789012\",\"Svc_Req_Start_Date\":\"2017-07-20T12:20:18.804-04:00\",\"Svc_Req_Type_Code\":\"REPLREQ\",\"Svc_Req_Status_Code\":\"WORKING\",\"Service_Flag\":true,\"Failure_Code\":\"ADH\",\"Failure_Date\":\"2017-07-20T12:20:18.804-04:00\",\"Entitlement_Type_Code\":\"CLAIM\",\"Source\":\"CareCentral\",\"Channel_Name\":\"Agent\",\"Agent_Name\":\"Doe, Jane\",\"Claim_State_Province\":\"VA\",\"Resolution_Code\":\"DIAG\",\"Assignee\":\"112951\",\"Contract_Nbr\":\"123456789012\",\"Client_Transaction_Nbr\":\"123456789012\",\"Warranty_SKU\":\"WMT TV REPL 24M $100-300 P\",\"Warranty_Price_Low\":4.8,\"Warranty_Price_High\":667.8,\"Purchase_Price\":688.9,\"Contract_Create_Dt\":\"2017-07-20T12:20:18.804-04:00\",\"Contract_Create_Channel\":\"CARECENTRAL\",\"Contract_Created_By\":\"Doe, Jane\",\"Contract_Browser_Finger_Print\":\"12312ASDLAKSDJ1213LKJSF\",\"Program_Type\":\"\",\"Receipt_Status_Code\":\"N\",\"Client_Id\":\"\",\"Client_Name\":\"WAL-WHL-SL-VA\",\"Cust_Store_Dist\":56.0,\"Product_Id\":\"12312ASDLAKSDJ1213LKJSF\",\"Is_Bulky\":\"Y\",\"Product_Name\":\"TV\",\"Product_Name_Incident\":\"LOST\",\"Product_Brand\":\"LG\",\"Product_Category\":\"TV\",\"Product_Class\":\"DEVICE\",\"Product_Industry\":\"CONSUMER ELECTRONICS\",\"Product_Purchase_Dt\":\"2017-07-20T12:20:18.804-04:00\",\"Model\":\"MS2287\",\"Serial\":\"LXPLY020449480E\",\"Product_Description\":\"LG 8500 Smart LED TV\",\"Customer_Id\":\"12312ASDLAKSDJ1213LKJSF\",\"Customer_First_Name\":\"JOHN\",\"Customer_Last_Name\":\"DOE\",\"Valid_Id_Ind\":true,\"Fulfillment_Transaction_Id\":\"12312ASDLAKSDJ1213LKJSF\",\"Auth_Type\":\"AUTH 1\",\"Auth_Status\":\"1st Authorization\",\"Total_Auth_Amount\":\"456.9\",\"PEBO_Override_Flag\":true,\"Created_Date\":\"2017-07-20T12:20:18.804-04:00\",\"Browser_Finger_Print\":\"12312ASDLAKSDJ1213LKJSF\",\"Automatic_Nbr_Id\":\"123456789012\",\"Dialed_Phone_Nbr\":\"123456789012\",\"Primary_Phone_Nbr\":\"123456789012\",\"Address_Type_Code\":\"CUST\",\"Address_Override_Flag\":true,\"Is_FL\":\"N\"},\"ScanDetailsAction\":{},\"CountsComputations\":[],\"RefereceComputations\":[]}}")
				.when()
				.post("http://SYNLPTPF01D6F:8990/Channels/HTTPChannel/FRMCheckDest")
				.then()
				.extract()
				.path("FRMCheckResp.requestEventId");
				System.out.println(requestEventID);
		}

}
