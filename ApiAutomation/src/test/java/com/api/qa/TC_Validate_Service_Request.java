package com.api.qa;

import static com.jayway.restassured.RestAssured.given;
import static com.jayway.restassured.RestAssured.when;
import org.hamcrest.Matcher;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.config.SSLConfig;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.matcher.ResponseAwareMatcher;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.response.ResponseBodyData;
import com.jayway.restassured.response.ValidatableResponse;

public class TC_Validate_Service_Request {
	

	
	@Test
	public void TEST1() {
        ValidatableResponse response = given()
		.config(RestAssured.config().sslConfig(new SSLConfig().relaxedHTTPSValidation()))
		.contentType(ContentType.JSON)

		//given().contentType(ContentType.JSON)
		.body("{\r\n" + 
				"        \"RequestBody\": {\r\n" + 
				"            \"incidentID\": \"55223312\",\r\n" + 
				"            \"incidentNumber\": \"55223312\",\r\n" + 
				"            \"requestingChannel\": \"PEGA\",\r\n" + 
				"            \"serviceRequestStartDate\": \"01/12/2017 00:00:00\",\r\n" + 
				"            \"serviceRequestType\": \"ADJCLAIM\",\r\n" + 
				"            \"serviceRequestStatus\": \"WORKING\",\r\n" + 
				"            \"serviceFlag\": \"Y\",\r\n" + 
				"            \"failureCode\": \"ALCP\",\r\n" + 
				"            \"failureDate\": \"01/12/2017\",\r\n" + 
				"            \"entitlementType\": \"CLAIM\",\r\n" + 
				"            \"claimSource\": \"CareCentral\",\r\n" + 
				"            \"ccrName\": \"Doe, Jane\",\r\n" + 
				"            \"resolutionCode\": \"DIAG\",\r\n" + 
				"            \"assignee\": \"012121\",\r\n" + 
				"            \"clientID\": \"1173986370\",\r\n" + 
				"            \"clientName\": \"WAL-WHL-SL-VA\",\r\n" + 
				"            \"customerID\": \"131221222\",\r\n" + 
				"            \"personFirstName\": \"JOHN\",\r\n" + 
				"            \"personLastName\": \"DOE\",\r\n" + 
				"            \"validId\": \"Y\",\r\n" + 
				"            \"contractDetails\": {\r\n" + 
				"                \"contractNumber\": \"347969362212\",\r\n" + 
				"                \"clientTransactionNumber\": \"3355521\",\r\n" + 
				"                \"warrantySku\": \"WMT TV REPL 24M $100-300 P\",\r\n" + 
				"                    \"warrantyPriceHigh\": \"125\",\r\n" + 
				"                    \"warrantyPriceLow\": \"12.32\",\r\n" + 
				"                    \"programType\": \"WHOLE HOME\",\r\n" + 
				"                    \"contractCreateDt\": \"12/01/2017\",\r\n" + 
				"                    \"contractCreateChannel\": \"CARECENTRAL\",\r\n" + 
				"                    \"contractCreatedBy\": \"Doe, Jane\",\r\n" + 
				"                    \"contractBrowserFingerPrint\": \"12312ASDLAKSDJ1213LKJSF\",\r\n" + 
				"                    \"receiptFlag\": \"Y\"\r\n" + 
				"            },\r\n" + 
				"            \"productDetails\": {\r\n" + 
				"                        \"instanceID\": \"12312ASDLAKSDJ1213LKJSF\",\r\n" + 
				"                        \"bulkyFlag\": \"Y\",\r\n" + 
				"                        \"product\": \"LG 8500 Smart LED TV\",\r\n" + 
				"                        \"make\": \"LG Electronics\",\r\n" + 
				"                        \"category\": \"LED TV\",\r\n" + 
				"                        \"type\": \"VIDEO CONSUMER ELECTRONICS\",\r\n" + 
				"                        \"productPurchaseDt\": \"12/01/2017\",\r\n" + 
				"                        \"model\": \"MS22871\",\r\n" + 
				"                        \"serial\": \"LXPLY020449480E1\",\r\n" + 
				"                        \"productDescription\": \"LG 8500 Smart LED TV\",\r\n" + 
				"                        \"purchasePrice\": \"300.00\"\r\n" + 
				"            },\r\n" + 
				"            \"paymentDetails\" : {\r\n" + 
				"                        \"fulfillmentTransactionId\": \"6644LYLLAA\",\r\n" + 
				"                        \"authType\": \"AUTH 1\",\r\n" + 
				"                        \"authStatus\": \"1st Authorization\",\r\n" + 
				"                        \"totalAuthAmount\": \"322.7\",\r\n" + 
				"                        \"pEBOOriginalPrice\": \"3000\",\r\n" + 
				"                        \"pEBOOfferedPrice\": \"200\",\r\n" + 
				"                        \"pEBOOverrideFlag\": \"Y\"\r\n" + 
				"            },\r\n" + 
				"                 \r\n" + 
				"            \"serviceAddress\": {\r\n" + 
				"                \"geoID\": \"914112112331\",\r\n" + 
				"                \"addressId\": \"8675\",\r\n" + 
				"                \"address1\": \"Midland pkway\",\r\n" + 
				"                \"address2\": \"1 G\",\r\n" + 
				"                \"address3\": \"Jamaica\",\r\n" + 
				"                \"address4\": \"New York\",\r\n" + 
				"                        \"city\": \"NewYork\",\r\n" + 
				"                        \"province\": \"NYC\",\r\n" + 
				"                        \"state\": \"NY\",\r\n" + 
				"                        \"postalCode\": \"11432\",\r\n" + 
				"                        \"country\": \"US\",\r\n" + 
				"                        \"latitude\": \"12\",\r\n" + 
				"                        \"longitude\": \"32\",\r\n" + 
				"                        \"addressOverrideFlag\": \"Y\"\r\n" + 
				"            },\r\n" + 
				"            \r\n" + 
				"            \"labelDetails\": {\r\n" + 
				"                \"labelType\": \"EL\",\r\n" + 
				"                \"labelDate\": \"01-JAN-00\",\r\n" + 
				"                \"trackingNumber\": \"123456789012\"\r\n" + 
				"            },\r\n" + 
				"            \"originScanDetails\": {\r\n" + 
				"                \"trackingNumber\": \"123456789012\",\r\n" + 
				"                \"scanDate\": \"01-JAN-00\"\r\n" + 
				"            },\r\n" + 
				"            \"salvageScanDetails\": {\r\n" + 
				"                \"trackingNumber\": \"123456789012\",\r\n" + 
				"                \"scanStatus\": \"ABM\",\r\n" + 
				"                \"scanDate\": \"01-JAN-00\"\r\n" + 
				"            },\r\n" + 
				"            \"webID\": \"12312A1\",\r\n" + 
				"            \"ipAddress\": \"12.12.12.1612121\",\r\n" + 
				"            \"webSessionId\": \"1663231\",\r\n" + 
				"            \"ctiPhoneNumber\": \"1234567890\",\r\n" + 
				"            \"inboundPhoneNumber\": \"1234567890\",\r\n" + 
				"            \"primaryPhoneNumber\": \"646600157022\",\r\n" + 
				"            \"emailAddress\": \"qaqw13@demo.com\"\r\n" + 
				"        }\r\n" + 
				"}")
		.when()
		.post("https://rtm-frmjs-dl-vip1.use1.dev.aws.asurion.net/frauddetection/v1/fraudcheck/")
		
		.then().log().body()
		.statusCode(200)
		.contentType(ContentType.JSON);
 		
	}
	
	
	
	@Test
	public void ASURION_RuleID_9() {

		given().contentType(ContentType.JSON)
		.body("{\"FRMCheck\":{\"ClaimDetailsAction\":{\"Service_Request_Id\":\"12312ASDLAKSDJ1213LKJSF\",\"Service_Request_Nbr\":\"123456789012\",\"Svc_Req_Start_Date\":\"2017-07-20T12:20:18.804-04:00\",\"Svc_Req_Type_Code\":\"REPLREQ\",\"Svc_Req_Status_Code\":\"WORKING\",\"Service_Flag\":true,\"Failure_Code\":\"ADH\",\"Failure_Date\":\"2017-07-20T12:20:18.804-04:00\",\"Entitlement_Type_Code\":\"CLAIM\",\"Source\":\"CareCentral\",\"Channel_Name\":\"Agent\",\"Agent_Name\":\"Doe, Jane\",\"Claim_State_Province\":\"VA\",\"Resolution_Code\":\"DIAG\",\"Assignee\":\"112951\",\"Contract_Nbr\":\"123456789012\",\"Client_Transaction_Nbr\":\"123456789012\",\"Warranty_SKU\":\"WMT TV REPL 24M $100-300 P\",\"Warranty_Price_Low\":4.8,\"Warranty_Price_High\":667.8,\"Purchase_Price\":688.9,\"Contract_Create_Dt\":\"2017-07-20T12:20:18.804-04:00\",\"Contract_Create_Channel\":\"CARECENTRAL\",\"Contract_Created_By\":\"Doe, Jane\",\"Contract_Browser_Finger_Print\":\"12312ASDLAKSDJ1213LKJSF\",\"Program_Type\":\"\",\"Receipt_Status_Code\":\"N\",\"Client_Id\":\"\",\"Client_Name\":\"WAL-WHL-SL-VA\",\"Cust_Store_Dist\":56.0,\"Product_Id\":\"12312ASDLAKSDJ1213LKJSF\",\"Is_Bulky\":\"Y\",\"Product_Name\":\"TV\",\"Product_Name_Incident\":\"LOST\",\"Product_Brand\":\"LG\",\"Product_Category\":\"TV\",\"Product_Class\":\"DEVICE\",\"Product_Industry\":\"CONSUMER ELECTRONICS\",\"Product_Purchase_Dt\":\"2017-07-20T12:20:18.804-04:00\",\"Model\":\"MS2287\",\"Serial\":\"LXPLY020449480E\",\"Product_Description\":\"LG 8500 Smart LED TV\",\"Customer_Id\":\"12312ASDLAKSDJ1213LKJSF\",\"Customer_First_Name\":\"JOHN\",\"Customer_Last_Name\":\"DOE\",\"Valid_Id_Ind\":true,\"Fulfillment_Transaction_Id\":\"12312ASDLAKSDJ1213LKJSF\",\"Auth_Type\":\"AUTH 1\",\"Auth_Status\":\"1st Authorization\",\"Total_Auth_Amount\":\"456.9\",\"PEBO_Override_Flag\":true,\"Created_Date\":\"2017-07-20T12:20:18.804-04:00\",\"Browser_Finger_Print\":\"12312ASDLAKSDJ1213LKJSF\",\"Automatic_Nbr_Id\":\"123456789012\",\"Dialed_Phone_Nbr\":\"123456789012\",\"Primary_Phone_Nbr\":\"123456789012\",\"Address_Type_Code\":\"CUST\",\"Address_Override_Flag\":true,\"Is_FL\":\"N\"},\"ScanDetailsAction\":{},\"CountsComputations\":[],\"RefereceComputations\":[]}}")
		.when()
		.post("http://SYNLPTPF01D6F:8990/Channels/HTTPChannel/FRMCheckDest")
		.then()
		.statusCode(200)
		.contentType(ContentType.JSON);
		
 
		
	}
	
	
	
	
	
	
	@Test
	public void validate_json_Multipleresponse1() {
		ValidatableResponse response =  given().contentType(ContentType.JSON)
				.body("{\"FRMCheck\":{\"ClaimDetailsAction\":{\"Service_Request_Id\":\"12312ASDLAKSDJ1213LKJSF\",\"Service_Request_Nbr\":\"123456789012\",\"Svc_Req_Start_Date\":\"2017-07-20T12:20:18.804-04:00\",\"Svc_Req_Type_Code\":\"REPLREQ\",\"Svc_Req_Status_Code\":\"WORKING\",\"Service_Flag\":true,\"Failure_Code\":\"ADH\",\"Failure_Date\":\"2017-07-20T12:20:18.804-04:00\",\"Entitlement_Type_Code\":\"CLAIM\",\"Source\":\"CareCentral\",\"Channel_Name\":\"Agent\",\"Agent_Name\":\"Doe, Jane\",\"Claim_State_Province\":\"VA\",\"Resolution_Code\":\"DIAG\",\"Assignee\":\"112951\",\"Contract_Nbr\":\"123456789012\",\"Client_Transaction_Nbr\":\"123456789012\",\"Warranty_SKU\":\"WMT TV REPL 24M $100-300 P\",\"Warranty_Price_Low\":4.8,\"Warranty_Price_High\":667.8,\"Purchase_Price\":688.9,\"Contract_Create_Dt\":\"2017-07-20T12:20:18.804-04:00\",\"Contract_Create_Channel\":\"CARECENTRAL\",\"Contract_Created_By\":\"Doe, Jane\",\"Contract_Browser_Finger_Print\":\"12312ASDLAKSDJ1213LKJSF\",\"Program_Type\":\"\",\"Receipt_Status_Code\":\"N\",\"Client_Id\":\"\",\"Client_Name\":\"WAL-WHL-SL-VA\",\"Cust_Store_Dist\":56.0,\"Product_Id\":\"12312ASDLAKSDJ1213LKJSF\",\"Is_Bulky\":\"Y\",\"Product_Name\":\"TV\",\"Product_Name_Incident\":\"LOST\",\"Product_Brand\":\"LG\",\"Product_Category\":\"TV\",\"Product_Class\":\"DEVICE\",\"Product_Industry\":\"CONSUMER ELECTRONICS\",\"Product_Purchase_Dt\":\"2017-07-20T12:20:18.804-04:00\",\"Model\":\"MS2287\",\"Serial\":\"LXPLY020449480E\",\"Product_Description\":\"LG 8500 Smart LED TV\",\"Customer_Id\":\"12312ASDLAKSDJ1213LKJSF\",\"Customer_First_Name\":\"JOHN\",\"Customer_Last_Name\":\"DOE\",\"Valid_Id_Ind\":true,\"Fulfillment_Transaction_Id\":\"12312ASDLAKSDJ1213LKJSF\",\"Auth_Type\":\"AUTH 1\",\"Auth_Status\":\"1st Authorization\",\"Total_Auth_Amount\":\"456.9\",\"PEBO_Override_Flag\":true,\"Created_Date\":\"2017-07-20T12:20:18.804-04:00\",\"Browser_Finger_Print\":\"12312ASDLAKSDJ1213LKJSF\",\"Automatic_Nbr_Id\":\"123456789012\",\"Dialed_Phone_Nbr\":\"123456789012\",\"Primary_Phone_Nbr\":\"123456789012\",\"Address_Type_Code\":\"CUST\",\"Address_Override_Flag\":true,\"Is_FL\":\"N\"},\"ScanDetailsAction\":{},\"CountsComputations\":[],\"RefereceComputations\":[]}}")
				.when()
				.post("http://SYNLPTPF01D6F:8990/Channels/HTTPChannel/FRMCheckDest")
				.then()
				.statusCode(200)
				.contentType(ContentType.JSON);
		
//				String bodystring=response.extract().asString();
//				JsonPath jsonPath = new JsonPath(bodystring);
//				String name_value= jsonPath.get("name");
    	        String actualId = response.extract().path("RuleID");
			    Assert.assertEquals(actualId, 2);
			    
		 
	}
	
	
	@Test
	public void validate_json_Service_Request_Id() {
		ValidatableResponse response =  given().contentType(ContentType.JSON)
				.body("{\"FRMCheck\":{\"ClaimDetailsAction\":{\"Service_Request_Id\":\"12312ASDLAKSDJ1213LKJSF\",\"Service_Request_Nbr\":\"123456789012\",\"Svc_Req_Start_Date\":\"2017-07-20T12:20:18.804-04:00\",\"Svc_Req_Type_Code\":\"REPLREQ\",\"Svc_Req_Status_Code\":\"WORKING\",\"Service_Flag\":true,\"Failure_Code\":\"ADH\",\"Failure_Date\":\"2017-07-20T12:20:18.804-04:00\",\"Entitlement_Type_Code\":\"CLAIM\",\"Source\":\"CareCentral\",\"Channel_Name\":\"Agent\",\"Agent_Name\":\"Doe, Jane\",\"Claim_State_Province\":\"VA\",\"Resolution_Code\":\"DIAG\",\"Assignee\":\"112951\",\"Contract_Nbr\":\"123456789012\",\"Client_Transaction_Nbr\":\"123456789012\",\"Warranty_SKU\":\"WMT TV REPL 24M $100-300 P\",\"Warranty_Price_Low\":4.8,\"Warranty_Price_High\":667.8,\"Purchase_Price\":688.9,\"Contract_Create_Dt\":\"2017-07-20T12:20:18.804-04:00\",\"Contract_Create_Channel\":\"CARECENTRAL\",\"Contract_Created_By\":\"Doe, Jane\",\"Contract_Browser_Finger_Print\":\"12312ASDLAKSDJ1213LKJSF\",\"Program_Type\":\"\",\"Receipt_Status_Code\":\"N\",\"Client_Id\":\"\",\"Client_Name\":\"WAL-WHL-SL-VA\",\"Cust_Store_Dist\":56.0,\"Product_Id\":\"12312ASDLAKSDJ1213LKJSF\",\"Is_Bulky\":\"Y\",\"Product_Name\":\"TV\",\"Product_Name_Incident\":\"LOST\",\"Product_Brand\":\"LG\",\"Product_Category\":\"TV\",\"Product_Class\":\"DEVICE\",\"Product_Industry\":\"CONSUMER ELECTRONICS\",\"Product_Purchase_Dt\":\"2017-07-20T12:20:18.804-04:00\",\"Model\":\"MS2287\",\"Serial\":\"LXPLY020449480E\",\"Product_Description\":\"LG 8500 Smart LED TV\",\"Customer_Id\":\"12312ASDLAKSDJ1213LKJSF\",\"Customer_First_Name\":\"JOHN\",\"Customer_Last_Name\":\"DOE\",\"Valid_Id_Ind\":true,\"Fulfillment_Transaction_Id\":\"12312ASDLAKSDJ1213LKJSF\",\"Auth_Type\":\"AUTH 1\",\"Auth_Status\":\"1st Authorization\",\"Total_Auth_Amount\":\"456.9\",\"PEBO_Override_Flag\":true,\"Created_Date\":\"2017-07-20T12:20:18.804-04:00\",\"Browser_Finger_Print\":\"12312ASDLAKSDJ1213LKJSF\",\"Automatic_Nbr_Id\":\"123456789012\",\"Dialed_Phone_Nbr\":\"123456789012\",\"Primary_Phone_Nbr\":\"123456789012\",\"Address_Type_Code\":\"CUST\",\"Address_Override_Flag\":true,\"Is_FL\":\"N\"},\"ScanDetailsAction\":{},\"CountsComputations\":[],\"RefereceComputations\":[]}}")
				.when()
				.post("http://SYNLPTPF01D6F:8990/Channels/HTTPChannel/FRMCheckDest")
				.then()
				.statusCode(200)
				.contentType(ContentType.JSON);
    	       String service_request_Id = response.extract().path("FRMCheckResp.Service_Request_Id");
     	      
			    Assert.assertEquals(service_request_Id, "12312ASDLAKSDJ1213LKJSF");
	}
	
	@Test
	public void validate_json_Service_Request_Id_2() {
		        String service_id= given().contentType(ContentType.JSON)
				.body("{\"FRMCheck\":{\"ClaimDetailsAction\":{\"Service_Request_Id\":\"12312ASDLAKSDJ1213LKJSF\",\"Service_Request_Nbr\":\"123456789012\",\"Svc_Req_Start_Date\":\"2017-07-20T12:20:18.804-04:00\",\"Svc_Req_Type_Code\":\"REPLREQ\",\"Svc_Req_Status_Code\":\"WORKING\",\"Service_Flag\":true,\"Failure_Code\":\"ADH\",\"Failure_Date\":\"2017-07-20T12:20:18.804-04:00\",\"Entitlement_Type_Code\":\"CLAIM\",\"Source\":\"CareCentral\",\"Channel_Name\":\"Agent\",\"Agent_Name\":\"Doe, Jane\",\"Claim_State_Province\":\"VA\",\"Resolution_Code\":\"DIAG\",\"Assignee\":\"112951\",\"Contract_Nbr\":\"123456789012\",\"Client_Transaction_Nbr\":\"123456789012\",\"Warranty_SKU\":\"WMT TV REPL 24M $100-300 P\",\"Warranty_Price_Low\":4.8,\"Warranty_Price_High\":667.8,\"Purchase_Price\":688.9,\"Contract_Create_Dt\":\"2017-07-20T12:20:18.804-04:00\",\"Contract_Create_Channel\":\"CARECENTRAL\",\"Contract_Created_By\":\"Doe, Jane\",\"Contract_Browser_Finger_Print\":\"12312ASDLAKSDJ1213LKJSF\",\"Program_Type\":\"\",\"Receipt_Status_Code\":\"N\",\"Client_Id\":\"\",\"Client_Name\":\"WAL-WHL-SL-VA\",\"Cust_Store_Dist\":56.0,\"Product_Id\":\"12312ASDLAKSDJ1213LKJSF\",\"Is_Bulky\":\"Y\",\"Product_Name\":\"TV\",\"Product_Name_Incident\":\"LOST\",\"Product_Brand\":\"LG\",\"Product_Category\":\"TV\",\"Product_Class\":\"DEVICE\",\"Product_Industry\":\"CONSUMER ELECTRONICS\",\"Product_Purchase_Dt\":\"2017-07-20T12:20:18.804-04:00\",\"Model\":\"MS2287\",\"Serial\":\"LXPLY020449480E\",\"Product_Description\":\"LG 8500 Smart LED TV\",\"Customer_Id\":\"12312ASDLAKSDJ1213LKJSF\",\"Customer_First_Name\":\"JOHN\",\"Customer_Last_Name\":\"DOE\",\"Valid_Id_Ind\":true,\"Fulfillment_Transaction_Id\":\"12312ASDLAKSDJ1213LKJSF\",\"Auth_Type\":\"AUTH 1\",\"Auth_Status\":\"1st Authorization\",\"Total_Auth_Amount\":\"456.9\",\"PEBO_Override_Flag\":true,\"Created_Date\":\"2017-07-20T12:20:18.804-04:00\",\"Browser_Finger_Print\":\"12312ASDLAKSDJ1213LKJSF\",\"Automatic_Nbr_Id\":\"123456789012\",\"Dialed_Phone_Nbr\":\"123456789012\",\"Primary_Phone_Nbr\":\"123456789012\",\"Address_Type_Code\":\"CUST\",\"Address_Override_Flag\":true,\"Is_FL\":\"N\"},\"ScanDetailsAction\":{},\"CountsComputations\":[],\"RefereceComputations\":[]}}")
				.when()
				.post("http://SYNLPTPF01D6F:8990/Channels/HTTPChannel/FRMCheckDest")
				.then()
				.extract()
				.path("FRMCheckResp.Service_Request_Id");
				System.out.println(service_id);
			

		
		       //String service_request_Id = response.extract().path("FRMCheckResp.Service_Request_Id");
     	      
			   // Assert.assertEquals(service_request_Id, "12312ASDLAKSDJ1213LKJSF");
	}
	
	
	
	
	
	
	@Test
	public void validate_json_Rule_ID() {
		ValidatableResponse response =  given().contentType(ContentType.JSON)
				.body("{\"FRMCheck\":{\"ClaimDetailsAction\":{\"Service_Request_Id\":\"12312ASDLAKSDJ1213LKJSF\",\"Service_Request_Nbr\":\"123456789012\",\"Svc_Req_Start_Date\":\"2017-07-20T12:20:18.804-04:00\",\"Svc_Req_Type_Code\":\"REPLREQ\",\"Svc_Req_Status_Code\":\"WORKING\",\"Service_Flag\":true,\"Failure_Code\":\"ADH\",\"Failure_Date\":\"2017-07-20T12:20:18.804-04:00\",\"Entitlement_Type_Code\":\"CLAIM\",\"Source\":\"CareCentral\",\"Channel_Name\":\"Agent\",\"Agent_Name\":\"Doe, Jane\",\"Claim_State_Province\":\"VA\",\"Resolution_Code\":\"DIAG\",\"Assignee\":\"112951\",\"Contract_Nbr\":\"123456789012\",\"Client_Transaction_Nbr\":\"123456789012\",\"Warranty_SKU\":\"WMT TV REPL 24M $100-300 P\",\"Warranty_Price_Low\":4.8,\"Warranty_Price_High\":667.8,\"Purchase_Price\":688.9,\"Contract_Create_Dt\":\"2017-07-20T12:20:18.804-04:00\",\"Contract_Create_Channel\":\"CARECENTRAL\",\"Contract_Created_By\":\"Doe, Jane\",\"Contract_Browser_Finger_Print\":\"12312ASDLAKSDJ1213LKJSF\",\"Program_Type\":\"\",\"Receipt_Status_Code\":\"N\",\"Client_Id\":\"\",\"Client_Name\":\"WAL-WHL-SL-VA\",\"Cust_Store_Dist\":56.0,\"Product_Id\":\"12312ASDLAKSDJ1213LKJSF\",\"Is_Bulky\":\"Y\",\"Product_Name\":\"TV\",\"Product_Name_Incident\":\"LOST\",\"Product_Brand\":\"LG\",\"Product_Category\":\"TV\",\"Product_Class\":\"DEVICE\",\"Product_Industry\":\"CONSUMER ELECTRONICS\",\"Product_Purchase_Dt\":\"2017-07-20T12:20:18.804-04:00\",\"Model\":\"MS2287\",\"Serial\":\"LXPLY020449480E\",\"Product_Description\":\"LG 8500 Smart LED TV\",\"Customer_Id\":\"12312ASDLAKSDJ1213LKJSF\",\"Customer_First_Name\":\"JOHN\",\"Customer_Last_Name\":\"DOE\",\"Valid_Id_Ind\":true,\"Fulfillment_Transaction_Id\":\"12312ASDLAKSDJ1213LKJSF\",\"Auth_Type\":\"AUTH 1\",\"Auth_Status\":\"1st Authorization\",\"Total_Auth_Amount\":\"456.9\",\"PEBO_Override_Flag\":true,\"Created_Date\":\"2017-07-20T12:20:18.804-04:00\",\"Browser_Finger_Print\":\"12312ASDLAKSDJ1213LKJSF\",\"Automatic_Nbr_Id\":\"123456789012\",\"Dialed_Phone_Nbr\":\"123456789012\",\"Primary_Phone_Nbr\":\"123456789012\",\"Address_Type_Code\":\"CUST\",\"Address_Override_Flag\":true,\"Is_FL\":\"N\"},\"ScanDetailsAction\":{},\"CountsComputations\":[],\"RefereceComputations\":[]}}")
				.when()
				.post("http://SYNLPTPF01D6F:8990/Channels/HTTPChannel/FRMCheckDest")
				.then()
				.statusCode(200)
				.contentType(ContentType.JSON);
	            String ruleName = response.extract().path("FRMCheckResp.RiskOutputs.RuleName");
		        Assert.assertEquals(ruleName, "CourtesyRegistrationCheck");
	}
	



}
