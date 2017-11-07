package com.asurion.qa;

import static com.jayway.restassured.RestAssured.given;

import org.testng.annotations.Test;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.config.SSLConfig;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.ValidatableResponse;

public class FRMAddressNegativeTest {
	
	

	@Test
	public void AddressNegativeTest_Shasank() {
		
		
        ValidatableResponse response = given()
		.config(RestAssured.config().sslConfig(new SSLConfig().relaxedHTTPSValidation()))
		.contentType(ContentType.JSON)
		.body("{\r\n" + 
				"                \"FRMCheck\": {\r\n" + 
				"          \"ClaimDetailsAction\": {\r\n" + 
				"            \"Service_Request_Id\": \"1002\",\r\n" + 
				"            \"Service_Request_Nbr\": \"1002\",\r\n" + 
				"            \"Svc_Req_Start_Date\": \"2017-01-11T13:00:00.000Z\",\r\n" + 
				"            \"Svc_Req_Type_Code\": \"REPLREQ\",\r\n" + 
				"            \"Svc_Req_Status_Code\": \"WORKING\",\r\n" + 
				"            \"Service_Flag\": true,\r\n" + 
				"            \"Failure_Code\": \"ADH\",\r\n" + 
				"            \"Failure_Date\": \"2017-01-11T13:00:00.000Z\",\r\n" + 
				"            \"Entitlement_Type_Code\": \"CLAIM\",\r\n" + 
				"            \"Source\": \"CareCentral\",\r\n" + 
				"            \"Channel_Name\": \"PEGA\",\r\n" + 
				"            \"Agent_Name\": \"voltage:fpe:1:us.enterprise.frm@asurion.com||Hsh, Hbai\",\r\n" + 
				"            \"Resolution_Code\": \"DIAG\",\r\n" + 
				"            \"Assignee\": \"012121\",\r\n" + 
				"            \"Contract_Nbr\": \"812345789\",\r\n" + 
				"            \"Client_Transaction_Nbr\": \"012121212121\",\r\n" + 
				"            \"Warranty_SKU\": \"WMT TV REPL 24M $100-300 P\",\r\n" + 
				"            \"Warranty_Price_Low\": 12.32,\r\n" + 
				"            \"Warranty_Price_High\": 12.32,\r\n" + 
				"            \"Purchase_Price\": 300,\r\n" + 
				"            \"Contract_Create_Dt\": \"2017-11-30T13:00:00.000Z\",\r\n" + 
				"            \"Contract_Create_Channel\": \"CARECENTRAL\",\r\n" + 
				"            \"Contract_Created_By\": \"Doe, Jane\",\r\n" + 
				"           \"Contract_Browser_Finger_Print\": \"12312ASDLAKSDJ1213LKJSF\",\r\n" + 
				"            \"Program_Type\": \"FEE PLAN\",\r\n" + 
				"            \"Receipt_Status_Code\": \"N\",\r\n" + 
				"            \"Client_Id\": \"12312ASDLAKSDJ1213LK\",\r\n" + 
				"            \"Client_Name\": \"voltage:fpe:1:us.enterprise.frm@asurion.com||JUW-PMR-LW-AR\",\r\n" + 
				"            \"Cust_Store_Dist\": 0,\r\n" + 
				"            \"Product_Id\": \"12312ASDLAKSDJ1213LK\",\r\n" + 
				"            \"Is_Bulky\": true,\r\n" + 
				"            \"Product_Name\": \"LG 8500 Smart LED TV\",\r\n" + 
				"            \"Make\": \"LG Electronics\",\r\n" + 
				"            \"Product_Category\": \"LED TV\",\r\n" + 
				"            \"Product_Type\": \"VIDEO CONSUMER ELECTRONICS\",\r\n" + 
				"            \"Product_Purchase_Dt\": \"2017-11-30T13:00:00.000Z\",\r\n" + 
				"            \"Model\": \"MS2287\",\r\n" + 
				"            \"Serial\": \"LXPLY020449480E\",\r\n" + 
				"            \"Product_Description\": \"LG 8500 Smart LED TV\",\r\n" + 
				"            \"Customer_Id\": \"12312ASDLAKSDJ1213LK\",\r\n" + 
				"            \"Customer_First_Name\": \"voltage:fpe:1:us.enterprise.frm@asurion.com||BCRK\",\r\n" + 
				"            \"Customer_Last_Name\": \"voltage:fpe:1:us.enterprise.frm@asurion.com||TRN\",\r\n" + 
				"            \"Valid_Id_Ind\": true,\r\n" + 
				"            \"Fulfillment_Transaction_Id\": \"12312ASDLAKSDJ1213LKJSF\",\r\n" + 
				"            \"Auth_Type\": \"auth 1\",\r\n" + 
				"            \"Auth_Status\": \"1st Authorization\",\r\n" + 
				"            \"Total_Auth_Amount\": 322.7,\r\n" + 
				"            \"PEBO_Override_Flag\": true,\r\n" + 
				"            \"Created_Date\": \"2017-09-22T07:46:57.000Z\",\r\n" + 
				"            \"Address_Override_Flag\": true,\r\n" + 
				"            \"Is_FL\": \"N\"\r\n" + 
				"          },\r\n" + 
				"          \"ScanDetailsAction\": {},\r\n" + 
				"          \"CountsComputations\": [],\r\n" + 
				"          \"RefereceComputations\": [\r\n" + 
				"            {\r\n" + 
				"              \"Name\": \"ScanCityStateToNegativeList\",\r\n" + 
				"              \"Category\": \"NA\",\r\n" + 
				"              \"EntityType\": \"Address\",\r\n" + 
				"              \"TriggerHold\": true,\r\n" + 
				"              \"Service_Request_Id\": \"1002\",\r\n" + 
				"              \"Service_Request_Nbr\": \"1002\",\r\n" + 
				"              \"DTName\": \"ScanCityStateToNegativeList\"\r\n" + 
				"            },\r\n" + 
				"            {\r\n" + 
				"              \"Name\": \"CTINegativeListCheck\",\r\n" + 
				"              \"Category\": \"NA\",\r\n" + 
				"              \"EntityType\": \"ANI\",\r\n" + 
				"              \"TriggerHold\": true,\r\n" + 
				"              \"Service_Request_Id\": \"1002\",\r\n" + 
				"              \"Service_Request_Nbr\": \"1002\",\r\n" + 
				"              \"DTName\": \"CTINegativeListCheck\"\r\n" + 
				"            },\r\n" + 
				"            {\r\n" + 
				"              \"Name\": \"EmailToNegativeList\",\r\n" + 
				"              \"Category\": \"NA\",\r\n" + 
				"              \"EntityType\": \"EmailAddress\",\r\n" + 
				"              \"TriggerHold\": true,\r\n" + 
				"              \"Service_Request_Id\": \"1002\",\r\n" + 
				"              \"Service_Request_Nbr\": \"1002\",\r\n" + 
				"              \"DTName\": \"EmailToNegativeList\"\r\n" + 
				"            },\r\n" + 
				"            {\r\n" + 
				"              \"Name\": \"WebIDToNegativeList\",\r\n" + 
				"              \"Category\": \"NA\",\r\n" + 
				"              \"EntityType\": \"WebID\",\r\n" + 
				"              \"TriggerHold\": true,\r\n" + 
				"              \"Service_Request_Id\": \"1002\",\r\n" + 
				"              \"Service_Request_Nbr\": \"1002\",\r\n" + 
				"              \"DTName\": \"WebIDToNegativeList\"\r\n" + 
				"            }\r\n" + 
				"          ]\r\n" + 
				"        }\r\n" + 
				"}\r\n" + 
				"")

		.when()
		.post("https://rtm-dev-be.us-east-1.rtmbe.use1.dev.aws.asurion.net:6301/Channels/HTTPChannel/FRMCheckDest")
		.then()
		.log()
		.body();

	
	}


}
