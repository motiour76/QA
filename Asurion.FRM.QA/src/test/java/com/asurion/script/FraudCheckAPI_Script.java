package com.asurion.script;

import static com.jayway.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.asurion.model.FraudCheckAPI_Model;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.config.SSLConfig;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.ValidatableResponse;

public class FraudCheckAPI_Script {

	
	FraudCheckAPI_Model data = new FraudCheckAPI_Model();
	
	
	
	@Test
	public void FRAUD_CHECK_API_TEST_RULE1() throws Exception {
		
		System.out.println(data.clientID1());
        ValidatableResponse response = given()
		.config(RestAssured.config().sslConfig(new SSLConfig().relaxedHTTPSValidation()))
		.contentType(ContentType.JSON)
		.body("{\r\n" + 
				"                \"RequestBody\": {\"incidentID\": \""+ data.incidentID + "\"," + 
				"                    \"incidentNumber\": \"" + data.incidentNumber+ "\"," + 
				"                    \"requestingChannel\": \"" +data.requestingChannel()+ "\"," + 
				"                    \"serviceRequestStartDate\": \""+data.serviceRequestStartDate+"\"," + 
				"                    \"serviceRequestType\": \""+ data.serviceRequestType()+ "\"," + 
				"                    \"serviceRequestStatus\": \""+ data.serviceRequestStatus()+"\"," + 
				"                    \"serviceFlag\": \""+data.serviceFlag()+"\"," + 
				"                    \"failureCode\": \""+data.failureCode()+"\"," + 
				"                    \"failureDate\": \""+data.failureDate+"\"," + 
				"                    \"entitlementType\": \""+ data.entitlementType()+"\"," + 
				"                    \"claimSource\": \""+data.claimSource()+"\"," + 
				"                    \"ccrName\": \""+data.ccrName()+"\"," + 
				"                    \"resolutionCode\": \""+data.resolutionCode()+"\"," + 
				"                    \"assignee\": \""+data.assignee+"\"," + 
				"                    \"clientID\": \""+data.clientID1()+"\"," + 
				"                    \"clientName\": \""+ data.clientName() +"\"," + 
				"                    \"customerID\": \""+data.customerID+"\"," + 
				"                    \"personFirstName\": \""+data.personFirstName()+"\"," + 
				"                    \"personLastName\": \""+data.personLastName()+"\"," + 
				"                    \"validId\": \""+data.validId()+"\"," + 
				"                    \"contractDetails\": {\r\n" + 
				"                                \"contractNumber\": \""+data.contractNumber+"\"," + 
				"                                \"clientTransactionNumber\": \""+ data.clientTransactionNumber +"\"," + 
				"                                \"warrantySku\": \""+ data.warrantySku()+"\"," + 
				"                                    \"warrantyPriceHigh\": \""+data.warranty_price_high+"\"," + 
				"                                    \"warrantyPriceLow\": \""+ data.warranty_price_low +"\"," + 
				"                                    \"programType\": \""+ data.program_Type_rule1()+"\"," + 
				"                                    \"contractCreateDt\": \""+data.contractCreateDt+"\"," + 
				"                                    \"contractCreateChannel\": \""+ data.contractCreateChannel()+"\"," + 
				"                                    \"contractCreatedBy\": \""+ data.contractCreatedBy()+"\"," + 
				"                                    \"contractBrowserFingerPrint\": \""+ data.contractBrowserFingerPrint()+"\"," + 
				"                                    \"receiptFlag\": \""+data.receiptFlag()+"\"" + 
				"                    },\r\n" + 
				"                    \"productDetails\": {\r\n" + 
				"                                                \"instanceID\": \""+data.instanceID()+"\"," + 
				"                                                \"bulkyFlag\": \""+data.bulkyFlag()+"\"," + 
				"                                                \"product\": \""+ data.product() +"\"," + 
				"                                                \"make\": \""+ data.make()+"\"," + 
				"                                                \"category\": \""+ data.category()+"\"," + 
				"                                                \"type\": \""+data.type()+"\"," + 
				"                                                \"productPurchaseDt\": \""+data.productPurchaseDt+"\"," + 
				"                                                \"model\": \""+data.model()+"\"," + 
				"                                                \"serial\": \""+ data.serial()+"\"," + 
				"                                                \"productDescription\": \""+ data.productDescription()+"\"," + 
				"                                                \"purchasePrice\": \""+ data.purchasePrice+"\"" + 
				"                    },\r\n" + 
				"                    \"paymentDetails\" : {\r\n" + 
				"                                                \"fulfillmentTransactionId\": \""+data.fulfillmentTransactionId+"\"," + 
				"                                                \"authType\": \""+data.authType()+"\"," + 
				"                                                \"authStatus\": \""+ data.authStatus()+"\"," + 
				"                                                \"totalAuthAmount\": \""+ data.totalAuthAmount+"\"," + 
				"                                                \"pEBOOriginalPrice\": \""+ data.pEBOOriginalPrice+"\"," + 
				"                                                \"pEBOOfferedPrice\": \""+data.pEBOOfferedPrice+"\"," + 
				"                                                \"pEBOOverrideFlag\": \""+ data.pEBOOverrideFlag()+"\"" + 
				"                    },\r\n" + 
				"                                \"scanAddress\": {\r\n" + 
				"                                \"geoID\": \""+data.geoID()+"\"," + 
				"                                \"addressId\": \""+ data.addressId()+"\"," + 
				"                                \"address1\": \""+ data.address1()+"\"," + 
				"                                \"address2\": \""+data.address2()+"\"," + 
				"                                \"address3\": \""+ data.address3()+"\"," + 
				"                                \"address4\": \""+ data.address4()+"\"," + 
				"                                                \"city\": \""+ data.city()+"\"," + 
				"                                                \"province\": \""+ data.province()+"\"," + 
				"                                                \"state\": \""+data.state()+"\"," + 
				"                                                \"postalCode\": \""+data.postalCode()+"\"," + 
				"                                                \"country\": \""+data.country()+"\"," + 
				"                                                \"latitude\": \""+data.latitude()+"\"," + 
				"                                                \"longitude\": \""+data.longitude()+"\"," + 
				"                                                \"addressOverrideFlag\": \""+data.addressOverrideFlag()+"\"" + 
				"                    },\r\n" + 
				"                    \"labelDetails\": {\r\n" + 
				"                                \"labelType\": \""+data.labelType()+"\"," + 
				"                                \"labelDate\": \""+data.labelDate+"\"," + 
				"                                \"trackingNumber\": \""+data.trackingNumber()+"\"" + 
				"                    },\r\n" + 
				"                    \"originScanDetails\": {\r\n" + 
				"                                \"trackingNumber\": \""+data.trackingNumber()+"\"," + 
				"                                \"scanDate\": \""+data.scanDate+"\"" + 
				"                    },\r\n" + 
				"                    \"salvageScanDetails\": {\r\n" + 
				"                                \"trackingNumber\": \""+data.trackingNumber()+"\"," + 
				"                                \"scanStatus\": \""+data.scanStatus()+"\"," + 
				"                                \"scanDate\": \""+data.scanDate+"\"" + 
				"                    },\r\n" + 
				"                    \"webID\": \""+data.webID()+"\"," + 
				"                    \"iPAddress\": \""+data.iPAddress()+"\"," + 
				"                    \"webSessionId\": \""+data.webSessionId()+"\"," + 
				"                    \"ctiPhoneNumber\": \""+data.ctiPhoneNumber+"\"," + 
				"                    \"inboundPhoneNumber\": \""+data.inboundPhoneNumber+"\"," + 
				"                    \"primaryPhoneNumber\": \""+data.primaryPhoneNumber+"\"," + 
				"                    \"emailAddress\": \""+data.emailAddress()+"\"" + 
				"                }\r\n" + 
				"}\r\n" + 
				"")
		.when()
		.post("https://rtm-frmjs-dl-vip1.use1.dev.aws.asurion.net/frauddetection/v1/fraudcheck/")
		.then().log().body()
		.statusCode(200)
		.contentType(ContentType.JSON);
        
        
        String actionCode = response.extract().path("ResponseBody.actions[0].ActionCode");
   	    Assert.assertEquals(actionCode, "PM WB");
   	    /*
        String actionType = response.extract().path("ResponseBody.actions[0].ActioType");
   	    Assert.assertEquals(actionType, "EXAMINER");

   	   
        String actionCode1 = response.extract().path("ResponseBody.actions[1].ActionCode");
	    Assert.assertEquals(actionCode1, "PM WB");
	    
        String actionType1 = response.extract().path("ResponseBody.actions[1].ActioType");
   	    Assert.assertEquals(actionType1, "EXAMINER");

*/
	    
	    

	}	    
			    
	
	

	@Test
	public void FRAUD_CHECK_API_TEST_RULE2() throws Exception {
		
		System.out.println(data.clientID2());
        ValidatableResponse response = given()
		.config(RestAssured.config().sslConfig(new SSLConfig().relaxedHTTPSValidation()))
		.contentType(ContentType.JSON)
		.body("{\r\n" + 
				"                \"RequestBody\": {\"incidentID\": \""+ data.incidentID + "\"," + 
				"                    \"incidentNumber\": \"" + data.incidentNumber+ "\"," + 
				"                    \"requestingChannel\": \"" +data.requestingChannel()+ "\"," + 
				"                    \"serviceRequestStartDate\": \""+data.serviceRequestStartDate+"\"," + 
				"                    \"serviceRequestType\": \""+ data.serviceRequestType()+ "\"," + 
				"                    \"serviceRequestStatus\": \""+ data.serviceRequestStatus()+"\"," + 
				"                    \"serviceFlag\": \""+data.serviceFlag()+"\"," + 
				"                    \"failureCode\": \""+data.failureCode()+"\"," + 
				"                    \"failureDate\": \""+data.failureDate+"\"," + 
				"                    \"entitlementType\": \""+ data.entitlementType()+"\"," + 
				"                    \"claimSource\": \""+data.claimSource()+"\"," + 
				"                    \"ccrName\": \""+data.ccrName()+"\"," + 
				"                    \"resolutionCode\": \""+data.resolutionCode()+"\"," + 
				"                    \"assignee\": \""+data.assignee+"\"," + 
				"                    \"clientID\": \""+data.clientID2()+"\"," + 
				"                    \"clientName\": \""+ data.clientName() +"\"," + 
				"                    \"customerID\": \""+data.customerID+"\"," + 
				"                    \"personFirstName\": \""+data.personFirstName()+"\"," + 
				"                    \"personLastName\": \""+data.personLastName()+"\"," + 
				"                    \"validId\": \""+data.validId()+"\"," + 
				"                    \"contractDetails\": {\r\n" + 
				"                                \"contractNumber\": \""+data.contractNumber+"\"," + 
				"                                \"clientTransactionNumber\": \""+ data.clientTransactionNumber +"\"," + 
				"                                \"warrantySku\": \""+ data.warrantySku()+"\"," + 
				"                                    \"warrantyPriceHigh\": \""+data.warranty_price_high+"\"," + 
				"                                    \"warrantyPriceLow\": \""+ data.warranty_price_low +"\"," + 
				"                                    \"programType\": \""+ data.program_Type_rule2()+"\"," + 
				"                                    \"contractCreateDt\": \""+data.contractCreateDt+"\"," + 
				"                                    \"contractCreateChannel\": \""+ data.contractCreateChannel()+"\"," + 
				"                                    \"contractCreatedBy\": \""+ data.contractCreatedBy()+"\"," + 
				"                                    \"contractBrowserFingerPrint\": \""+ data.contractBrowserFingerPrint()+"\"," + 
				"                                    \"receiptFlag\": \""+data.receiptFlag()+"\"" + 
				"                    },\r\n" + 
				"                    \"productDetails\": {\r\n" + 
				"                                                \"instanceID\": \""+data.instanceID()+"\"," + 
				"                                                \"bulkyFlag\": \""+data.bulkyFlag()+"\"," + 
				"                                                \"product\": \""+ data.product() +"\"," + 
				"                                                \"make\": \""+ data.make()+"\"," + 
				"                                                \"category\": \""+ data.category()+"\"," + 
				"                                                \"type\": \""+data.type()+"\"," + 
				"                                                \"productPurchaseDt\": \""+data.productPurchaseDt+"\"," + 
				"                                                \"model\": \""+data.model()+"\"," + 
				"                                                \"serial\": \""+ data.serial()+"\"," + 
				"                                                \"productDescription\": \""+ data.productDescription()+"\"," + 
				"                                                \"purchasePrice\": \""+ data.purchasePrice+"\"" + 
				"                    },\r\n" + 
				"                    \"paymentDetails\" : {\r\n" + 
				"                                                \"fulfillmentTransactionId\": \""+data.fulfillmentTransactionId+"\"," + 
				"                                                \"authType\": \""+data.authType()+"\"," + 
				"                                                \"authStatus\": \""+ data.authStatus()+"\"," + 
				"                                                \"totalAuthAmount\": \""+ data.totalAuthAmount+"\"," + 
				"                                                \"pEBOOriginalPrice\": \""+ data.pEBOOriginalPrice+"\"," + 
				"                                                \"pEBOOfferedPrice\": \""+data.pEBOOfferedPrice+"\"," + 
				"                                                \"pEBOOverrideFlag\": \""+ data.pEBOOverrideFlag()+"\"" + 
				"                    },\r\n" + 
				"                                \"scanAddress\": {\r\n" + 
				"                                \"geoID\": \""+data.geoID()+"\"," + 
				"                                \"addressId\": \""+ data.addressId()+"\"," + 
				"                                \"address1\": \""+ data.address1()+"\"," + 
				"                                \"address2\": \""+data.address2()+"\"," + 
				"                                \"address3\": \""+ data.address3()+"\"," + 
				"                                \"address4\": \""+ data.address4()+"\"," + 
				"                                                \"city\": \""+ data.city()+"\"," + 
				"                                                \"province\": \""+ data.province()+"\"," + 
				"                                                \"state\": \""+data.state()+"\"," + 
				"                                                \"postalCode\": \""+data.postalCode()+"\"," + 
				"                                                \"country\": \""+data.country()+"\"," + 
				"                                                \"latitude\": \""+data.latitude()+"\"," + 
				"                                                \"longitude\": \""+data.longitude()+"\"," + 
				"                                                \"addressOverrideFlag\": \""+data.addressOverrideFlag()+"\"" + 
				"                    },\r\n" + 
				"                    \"labelDetails\": {\r\n" + 
				"                                \"labelType\": \""+data.labelType()+"\"," + 
				"                                \"labelDate\": \""+data.labelDate+"\"," + 
				"                                \"trackingNumber\": \""+data.trackingNumber()+"\"" + 
				"                    },\r\n" + 
				"                    \"originScanDetails\": {\r\n" + 
				"                                \"trackingNumber\": \""+data.trackingNumber()+"\"," + 
				"                                \"scanDate\": \""+data.scanDate+"\"" + 
				"                    },\r\n" + 
				"                    \"salvageScanDetails\": {\r\n" + 
				"                                \"trackingNumber\": \""+data.trackingNumber()+"\"," + 
				"                                \"scanStatus\": \""+data.scanStatus()+"\"," + 
				"                                \"scanDate\": \""+data.scanDate+"\"" + 
				"                    },\r\n" + 
				"                    \"webID\": \""+data.webID()+"\"," + 
				"                    \"iPAddress\": \""+data.iPAddress()+"\"," + 
				"                    \"webSessionId\": \""+data.webSessionId()+"\"," + 
				"                    \"ctiPhoneNumber\": \""+data.ctiPhoneNumber+"\"," + 
				"                    \"inboundPhoneNumber\": \""+data.inboundPhoneNumber+"\"," + 
				"                    \"primaryPhoneNumber\": \""+data.primaryPhoneNumber+"\"," + 
				"                    \"emailAddress\": \""+data.emailAddress()+"\"" + 
				"                }\r\n" + 
				"}\r\n" + 
				"")
		.when()
		.post("https://rtm-frmjs-dl-vip1.use1.dev.aws.asurion.net/frauddetection/v1/fraudcheck/")
		.then().log().body()
		.statusCode(200)
		.contentType(ContentType.JSON);
        
        
        String actionCode = response.extract().path("ResponseBody.actions[0].ActionCode");
   	    Assert.assertEquals(actionCode, "RCPT REQ");
  
	}	    
			    
	
	//pass 3.46 pm
	@Test
	public void FRAUD_CHECK_API_TEST_RULE3() throws Exception {
		
		System.out.println(data.clientID3());
	    
        ValidatableResponse response = given()
		.config(RestAssured.config().sslConfig(new SSLConfig().relaxedHTTPSValidation()))
		.contentType(ContentType.JSON)
		.body("{\r\n" + 
				"                \"RequestBody\": {\"incidentID\": \""+ data.incidentID + "\"," + 
				"                    \"incidentNumber\": \"" + data.incidentNumber+ "\"," + 
				"                    \"requestingChannel\": \"" +data.requestingChannel()+ "\"," + 
				"                    \"serviceRequestStartDate\": \""+data.serviceRequestStartDate+"\"," + 
				"                    \"serviceRequestType\": \""+ data.serviceRequestType()+ "\"," + 
				"                    \"serviceRequestStatus\": \""+ data.serviceRequestStatus()+"\"," + 
				"                    \"serviceFlag\": \""+data.serviceFlag()+"\"," + 
				"                    \"failureCode\": \""+data.failureCode()+"\"," + 
				"                    \"failureDate\": \""+data.failureDate+"\"," + 
				"                    \"entitlementType\": \""+ data.entitlementType()+"\"," + 
				"                    \"claimSource\": \""+data.claimSource()+"\"," + 
				"                    \"ccrName\": \""+data.ccrName()+"\"," + 
				"                    \"resolutionCode\": \""+data.resolutionCode()+"\"," + 
				"                    \"assignee\": \""+data.assignee+"\"," + 
				"                    \"clientID\": \""+data.clientID3()+"\"," + 
				"                    \"clientName\": \""+ data.clientName() +"\"," + 
				"                    \"customerID\": \""+data.customerID+"\"," + 
				"                    \"personFirstName\": \""+data.personFirstName()+"\"," + 
				"                    \"personLastName\": \""+data.personLastName()+"\"," + 
				"                    \"validId\": \""+data.validId()+"\"," + 
				"                    \"contractDetails\": {\r\n" + 
				"                                \"contractNumber\": \""+data.contractNumber+"\"," + 
				"                                \"clientTransactionNumber\": \""+ data.clientTransactionNumber +"\"," + 
				"                                \"warrantySku\": \""+ data.warrantySku()+"\"," + 
				"                                    \"warrantyPriceHigh\": \""+data.warranty_price_high+"\"," + 
				"                                    \"warrantyPriceLow\": \""+ data.warranty_price_low +"\"," + 
				"                                    \"programType\": \""+ data.program_Type_rule3()+"\"," + 
				"                                    \"contractCreateDt\": \""+data.contractCreateDt+"\"," + 
				"                                    \"contractCreateChannel\": \""+ data.contractCreateChannel()+"\"," + 
				"                                    \"contractCreatedBy\": \""+ data.contractCreatedBy()+"\"," + 
				"                                    \"contractBrowserFingerPrint\": \""+ data.contractBrowserFingerPrint()+"\"," + 
				"                                    \"receiptFlag\": \""+data.receiptFlag()+"\"" + 
				"                    },\r\n" + 
				"                    \"productDetails\": {\r\n" + 
				"                                                \"instanceID\": \""+data.instanceID()+"\"," + 
				"                                                \"bulkyFlag\": \""+data.bulkyFlag()+"\"," + 
				"                                                \"product\": \""+ data.product() +"\"," + 
				"                                                \"make\": \""+ data.make()+"\"," + 
				"                                                \"category\": \""+ data.category()+"\"," + 
				"                                                \"type\": \""+data.type()+"\"," + 
				"                                                \"productPurchaseDt\": \""+data.productPurchaseDt+"\"," + 
				"                                                \"model\": \""+data.model()+"\"," + 
				"                                                \"serial\": \""+ data.serial()+"\"," + 
				"                                                \"productDescription\": \""+ data.productDescription()+"\"," + 
				"                                                \"purchasePrice\": \""+ data.purchasePrice+"\"" + 
				"                    },\r\n" + 
				"                    \"paymentDetails\" : {\r\n" + 
				"                                                \"fulfillmentTransactionId\": \""+data.fulfillmentTransactionId+"\"," + 
				"                                                \"authType\": \""+data.authType()+"\"," + 
				"                                                \"authStatus\": \""+ data.authStatus()+"\"," + 
				"                                                \"totalAuthAmount\": \""+ data.totalAuthAmount+"\"," + 
				"                                                \"pEBOOriginalPrice\": \""+ data.pEBOOriginalPrice+"\"," + 
				"                                                \"pEBOOfferedPrice\": \""+data.pEBOOfferedPrice+"\"," + 
				"                                                \"pEBOOverrideFlag\": \""+ data.pEBOOverrideFlag()+"\"" + 
				"                    },\r\n" + 
				"                                \"scanAddress\": {\r\n" + 
				"                                \"geoID\": \""+data.geoID()+"\"," + 
				"                                \"addressId\": \""+ data.addressId()+"\"," + 
				"                                \"address1\": \""+ data.address1()+"\"," + 
				"                                \"address2\": \""+data.address2()+"\"," + 
				"                                \"address3\": \""+ data.address3()+"\"," + 
				"                                \"address4\": \""+ data.address4()+"\"," + 
				"                                                \"city\": \""+ data.city()+"\"," + 
				"                                                \"province\": \""+ data.province()+"\"," + 
				"                                                \"state\": \""+data.state()+"\"," + 
				"                                                \"postalCode\": \""+data.postalCode()+"\"," + 
				"                                                \"country\": \""+data.country()+"\"," + 
				"                                                \"latitude\": \""+data.latitude()+"\"," + 
				"                                                \"longitude\": \""+data.longitude()+"\"," + 
				"                                                \"addressOverrideFlag\": \""+data.addressOverrideFlag()+"\"" + 
				"                    },\r\n" + 
				"                    \"labelDetails\": {\r\n" + 
				"                                \"labelType\": \""+data.labelType()+"\"," + 
				"                                \"labelDate\": \""+data.labelDate+"\"," + 
				"                                \"trackingNumber\": \""+data.trackingNumber()+"\"" + 
				"                    },\r\n" + 
				"                    \"originScanDetails\": {\r\n" + 
				"                                \"trackingNumber\": \""+data.trackingNumber()+"\"," + 
				"                                \"scanDate\": \""+data.scanDate+"\"" + 
				"                    },\r\n" + 
				"                    \"salvageScanDetails\": {\r\n" + 
				"                                \"trackingNumber\": \""+data.trackingNumber()+"\"," + 
				"                                \"scanStatus\": \""+data.scanStatus()+"\"," + 
				"                                \"scanDate\": \""+data.scanDate+"\"" + 
				"                    },\r\n" + 
				"                    \"webID\": \""+data.webID()+"\"," + 
				"                    \"iPAddress\": \""+data.iPAddress()+"\"," + 
				"                    \"webSessionId\": \""+data.webSessionId()+"\"," + 
				"                    \"ctiPhoneNumber\": \""+data.ctiPhoneNumber+"\"," + 
				"                    \"inboundPhoneNumber\": \""+data.inboundPhoneNumber+"\"," + 
				"                    \"primaryPhoneNumber\": \""+data.primaryPhoneNumber+"\"," + 
				"                    \"emailAddress\": \""+data.emailAddress()+"\"" + 
				"                }\r\n" + 
				"}\r\n" + 
				"")
		.when()
		.post("https://rtm-frmjs-dl-vip1.use1.dev.aws.asurion.net/frauddetection/v1/fraudcheck/")
		.then().log().body()
		.statusCode(200)
		.contentType(ContentType.JSON);
        
        
        String actionCode = response.extract().path("ResponseBody.actions[0].ActionCode");
   	    Assert.assertEquals(actionCode, "RCPT REQ");
  
	}	    
	
	
	
	//PASS 7.35 PM
	@Test
	public void FRAUD_CHECK_API_TEST_RULE4() throws Exception {
		
		System.out.println(data.clientID4());
	    
        ValidatableResponse response = given()
		.config(RestAssured.config().sslConfig(new SSLConfig().relaxedHTTPSValidation()))
		.contentType(ContentType.JSON)
		.body("{\r\n" + 
				"                \"RequestBody\": {\"incidentID\": \""+ data.incidentID + "\"," + 
				"                    \"incidentNumber\": \"" + data.incidentNumber+ "\"," + 
				"                    \"requestingChannel\": \"" +data.requestingChannel()+ "\"," + 
				"                    \"serviceRequestStartDate\": \""+data.serviceRequestStartDate+"\"," + 
				"                    \"serviceRequestType\": \""+ data.serviceRequestType()+ "\"," + 
				"                    \"serviceRequestStatus\": \""+ data.serviceRequestStatus()+"\"," + 
				"                    \"serviceFlag\": \""+data.serviceFlag()+"\"," + 
				"                    \"failureCode\": \""+data.failureCode()+"\"," + 
				"                    \"failureDate\": \""+data.failureDate+"\"," + 
				"                    \"entitlementType\": \""+ data.entitlementType()+"\"," + 
				"                    \"claimSource\": \""+data.claimSource()+"\"," + 
				"                    \"ccrName\": \""+data.ccrName()+"\"," + 
				"                    \"resolutionCode\": \""+data.resolutionCode()+"\"," + 
				"                    \"assignee\": \""+data.assignee+"\"," + 
				"                    \"clientID\": \""+data.clientID4()+"\"," + 
				"                    \"clientName\": \""+ data.clientName() +"\"," + 
				"                    \"customerID\": \""+data.customerID+"\"," + 
				"                    \"personFirstName\": \""+data.personFirstName()+"\"," + 
				"                    \"personLastName\": \""+data.personLastName()+"\"," + 
				"                    \"validId\": \""+data.validId()+"\"," + 
				"                    \"contractDetails\": {\r\n" + 
				"                                \"contractNumber\": \""+data.contractNumber+"\"," + 
				"                                \"clientTransactionNumber\": \""+ data.clientTransactionNumber +"\"," + 
				"                                \"warrantySku\": \""+ data.warrantySku()+"\"," + 
				"                                    \"warrantyPriceHigh\": \""+data.warranty_price_high+"\"," + 
				"                                    \"warrantyPriceLow\": \""+ data.warranty_price_low +"\"," + 
				"                                    \"programType\": \""+ data.program_Type_rule4()+"\"," + 
				"                                    \"contractCreateDt\": \""+data.contractCreateDt+"\"," + 
				"                                    \"contractCreateChannel\": \""+ data.contractCreateChannel()+"\"," + 
				"                                    \"contractCreatedBy\": \""+ data.contractCreatedBy()+"\"," + 
				"                                    \"contractBrowserFingerPrint\": \""+ data.contractBrowserFingerPrint()+"\"," + 
				"                                    \"receiptFlag\": \""+data.receiptFlag()+"\"" + 
				"                    },\r\n" + 
				"                    \"productDetails\": {\r\n" + 
				"                                                \"instanceID\": \""+data.instanceID()+"\"," + 
				"                                                \"bulkyFlag\": \""+data.bulkyFlag()+"\"," + 
				"                                                \"product\": \""+ data.product() +"\"," + 
				"                                                \"make\": \""+ data.make()+"\"," + 
				"                                                \"category\": \""+ data.category()+"\"," + 
				"                                                \"type\": \""+data.type()+"\"," + 
				"                                                \"productPurchaseDt\": \""+data.productPurchaseDt+"\"," + 
				"                                                \"model\": \""+data.model()+"\"," + 
				"                                                \"serial\": \""+ data.serial()+"\"," + 
				"                                                \"productDescription\": \""+ data.productDescription()+"\"," + 
				"                                                \"purchasePrice\": \""+ data.purchasePrice+"\"" + 
				"                    },\r\n" + 
				"                    \"paymentDetails\" : {\r\n" + 
				"                                                \"fulfillmentTransactionId\": \""+data.fulfillmentTransactionId+"\"," + 
				"                                                \"authType\": \""+data.authType()+"\"," + 
				"                                                \"authStatus\": \""+ data.authStatus()+"\"," + 
				"                                                \"totalAuthAmount\": \""+ data.totalAuthAmount+"\"," + 
				"                                                \"pEBOOriginalPrice\": \""+ data.pEBOOriginalPrice+"\"," + 
				"                                                \"pEBOOfferedPrice\": \""+data.pEBOOfferedPrice+"\"," + 
				"                                                \"pEBOOverrideFlag\": \""+ data.pEBOOverrideFlag()+"\"" + 
				"                    },\r\n" + 
				"                                \"scanAddress\": {\r\n" + 
				"                                \"geoID\": \""+data.geoID()+"\"," + 
				"                                \"addressId\": \""+ data.addressId()+"\"," + 
				"                                \"address1\": \""+ data.address1()+"\"," + 
				"                                \"address2\": \""+data.address2()+"\"," + 
				"                                \"address3\": \""+ data.address3()+"\"," + 
				"                                \"address4\": \""+ data.address4()+"\"," + 
				"                                                \"city\": \""+ data.city()+"\"," + 
				"                                                \"province\": \""+ data.province()+"\"," + 
				"                                                \"state\": \""+data.state()+"\"," + 
				"                                                \"postalCode\": \""+data.postalCode()+"\"," + 
				"                                                \"country\": \""+data.country()+"\"," + 
				"                                                \"latitude\": \""+data.latitude()+"\"," + 
				"                                                \"longitude\": \""+data.longitude()+"\"," + 
				"                                                \"addressOverrideFlag\": \""+data.addressOverrideFlag()+"\"" + 
				"                    },\r\n" + 
				"                    \"labelDetails\": {\r\n" + 
				"                                \"labelType\": \""+data.labelType()+"\"," + 
				"                                \"labelDate\": \""+data.labelDate+"\"," + 
				"                                \"trackingNumber\": \""+data.trackingNumber()+"\"" + 
				"                    },\r\n" + 
				"                    \"originScanDetails\": {\r\n" + 
				"                                \"trackingNumber\": \""+data.trackingNumber()+"\"," + 
				"                                \"scanDate\": \""+data.scanDate+"\"" + 
				"                    },\r\n" + 
				"                    \"salvageScanDetails\": {\r\n" + 
				"                                \"trackingNumber\": \""+data.trackingNumber()+"\"," + 
				"                                \"scanStatus\": \""+data.scanStatus()+"\"," + 
				"                                \"scanDate\": \""+data.scanDate+"\"" + 
				"                    },\r\n" + 
				"                    \"webID\": \""+data.webID()+"\"," + 
				"                    \"iPAddress\": \""+data.iPAddress()+"\"," + 
				"                    \"webSessionId\": \""+data.webSessionId()+"\"," + 
				"                    \"ctiPhoneNumber\": \""+data.ctiPhoneNumber+"\"," + 
				"                    \"inboundPhoneNumber\": \""+data.inboundPhoneNumber+"\"," + 
				"                    \"primaryPhoneNumber\": \""+data.primaryPhoneNumber+"\"," + 
				"                    \"emailAddress\": \""+data.emailAddress()+"\"" + 
				"                }\r\n" + 
				"}\r\n" + 
				"")
		.when()
		.post("https://rtm-frmjs-dl-vip1.use1.dev.aws.asurion.net/frauddetection/v1/fraudcheck/")
		.then().log().body()
		.statusCode(200)
		.contentType(ContentType.JSON);
        
        
        String actionCode = response.extract().path("ResponseBody.actions[0].ActionCode");
   	    Assert.assertEquals(actionCode, "APPROVED");
  
	}	    
	
	
	//PASS 7.33 PM
	@Test
	public void FRAUD_CHECK_API_TEST_RULE5() throws Exception {
		
	    
        ValidatableResponse response = given()
		.config(RestAssured.config().sslConfig(new SSLConfig().relaxedHTTPSValidation()))
		.contentType(ContentType.JSON)
		.body("{\r\n" + 
				"                \"RequestBody\": {\"incidentID\": \""+ data.incidentID + "\"," + 
				"                    \"incidentNumber\": \"" + data.incidentNumber+ "\"," + 
				"                    \"requestingChannel\": \"" +data.requestingChannel()+ "\"," + 
				"                    \"serviceRequestStartDate\": \""+data.serviceRequestStartDate+"\"," + 
				"                    \"serviceRequestType\": \""+ data.serviceRequestType()+ "\"," + 
				"                    \"serviceRequestStatus\": \""+ data.serviceRequestStatus()+"\"," + 
				"                    \"serviceFlag\": \""+data.serviceFlag()+"\"," + 
				"                    \"failureCode\": \""+data.failureCode()+"\"," + 
				"                    \"failureDate\": \""+data.failureDate+"\"," + 
				"                    \"entitlementType\": \""+ data.entitlementType()+"\"," + 
				"                    \"claimSource\": \""+data.claimSource()+"\"," + 
				"                    \"ccrName\": \""+data.ccrName()+"\"," + 
				"                    \"resolutionCode\": \""+data.resolutionCode()+"\"," + 
				"                    \"assignee\": \""+data.assignee+"\"," + 
				"                    \"clientID\": \""+data.clientID5()+"\"," + 
				"                    \"clientName\": \""+ data.clientName() +"\"," + 
				"                    \"customerID\": \""+data.customerID+"\"," + 
				"                    \"personFirstName\": \""+data.personFirstName()+"\"," + 
				"                    \"personLastName\": \""+data.personLastName()+"\"," + 
				"                    \"validId\": \""+data.validId()+"\"," + 
				"                    \"contractDetails\": {\r\n" + 
				"                                \"contractNumber\": \""+data.contractNumber+"\"," + 
				"                                \"clientTransactionNumber\": \""+ data.clientTransactionNumber +"\"," + 
				"                                \"warrantySku\": \""+ data.warrantySku()+"\"," + 
				"                                    \"warrantyPriceHigh\": \""+data.warranty_price_high+"\"," + 
				"                                    \"warrantyPriceLow\": \""+ data.warranty_price_low +"\"," + 
				"                                    \"programType\": \""+ data.program_Type_rule5()+"\"," + 
				"                                    \"contractCreateDt\": \""+data.contractCreateDt+"\"," + 
				"                                    \"contractCreateChannel\": \""+ data.contractCreateChannel()+"\"," + 
				"                                    \"contractCreatedBy\": \""+ data.contractCreatedBy()+"\"," + 
				"                                    \"contractBrowserFingerPrint\": \""+ data.contractBrowserFingerPrint()+"\"," + 
				"                                    \"receiptFlag\": \""+data.receiptFlag()+"\"" + 
				"                    },\r\n" + 
				"                    \"productDetails\": {\r\n" + 
				"                                                \"instanceID\": \""+data.instanceID()+"\"," + 
				"                                                \"bulkyFlag\": \""+data.bulkyFlag()+"\"," + 
				"                                                \"product\": \""+ data.product() +"\"," + 
				"                                                \"make\": \""+ data.make()+"\"," + 
				"                                                \"category\": \""+ data.category()+"\"," + 
				"                                                \"type\": \""+data.type()+"\"," + 
				"                                                \"productPurchaseDt\": \""+data.productPurchaseDt+"\"," + 
				"                                                \"model\": \""+data.model()+"\"," + 
				"                                                \"serial\": \""+ data.serial()+"\"," + 
				"                                                \"productDescription\": \""+ data.productDescription()+"\"," + 
				"                                                \"purchasePrice\": \""+ data.purchasePrice+"\"" + 
				"                    },\r\n" + 
				"                    \"paymentDetails\" : {\r\n" + 
				"                                                \"fulfillmentTransactionId\": \""+data.fulfillmentTransactionId+"\"," + 
				"                                                \"authType\": \""+data.authType()+"\"," + 
				"                                                \"authStatus\": \""+ data.authStatus()+"\"," + 
				"                                                \"totalAuthAmount\": \""+ data.totalAuthAmount+"\"," + 
				"                                                \"pEBOOriginalPrice\": \""+ data.pEBOOriginalPrice+"\"," + 
				"                                                \"pEBOOfferedPrice\": \""+data.pEBOOfferedPrice+"\"," + 
				"                                                \"pEBOOverrideFlag\": \""+ data.pEBOOverrideFlag()+"\"" + 
				"                    },\r\n" + 
				"                                \"scanAddress\": {\r\n" + 
				"                                \"geoID\": \""+data.geoID()+"\"," + 
				"                                \"addressId\": \""+ data.addressId()+"\"," + 
				"                                \"address1\": \""+ data.address1()+"\"," + 
				"                                \"address2\": \""+data.address2()+"\"," + 
				"                                \"address3\": \""+ data.address3()+"\"," + 
				"                                \"address4\": \""+ data.address4()+"\"," + 
				"                                                \"city\": \""+ data.city()+"\"," + 
				"                                                \"province\": \""+ data.province()+"\"," + 
				"                                                \"state\": \""+data.state()+"\"," + 
				"                                                \"postalCode\": \""+data.postalCode()+"\"," + 
				"                                                \"country\": \""+data.country()+"\"," + 
				"                                                \"latitude\": \""+data.latitude()+"\"," + 
				"                                                \"longitude\": \""+data.longitude()+"\"," + 
				"                                                \"addressOverrideFlag\": \""+data.addressOverrideFlag()+"\"" + 
				"                    },\r\n" + 
				"                    \"labelDetails\": {\r\n" + 
				"                                \"labelType\": \""+data.labelType()+"\"," + 
				"                                \"labelDate\": \""+data.labelDate+"\"," + 
				"                                \"trackingNumber\": \""+data.trackingNumber()+"\"" + 
				"                    },\r\n" + 
				"                    \"originScanDetails\": {\r\n" + 
				"                                \"trackingNumber\": \""+data.trackingNumber()+"\"," + 
				"                                \"scanDate\": \""+data.scanDate+"\"" + 
				"                    },\r\n" + 
				"                    \"salvageScanDetails\": {\r\n" + 
				"                                \"trackingNumber\": \""+data.trackingNumber()+"\"," + 
				"                                \"scanStatus\": \""+data.scanStatus()+"\"," + 
				"                                \"scanDate\": \""+data.scanDate+"\"" + 
				"                    },\r\n" + 
				"                    \"webID\": \""+data.webID()+"\"," + 
				"                    \"iPAddress\": \""+data.iPAddress()+"\"," + 
				"                    \"webSessionId\": \""+data.webSessionId()+"\"," + 
				"                    \"ctiPhoneNumber\": \""+data.ctiPhoneNumber+"\"," + 
				"                    \"inboundPhoneNumber\": \""+data.inboundPhoneNumber+"\"," + 
				"                    \"primaryPhoneNumber\": \""+data.primaryPhoneNumber+"\"," + 
				"                    \"emailAddress\": \""+data.emailAddress()+"\"" + 
				"                }\r\n" + 
				"}\r\n" + 
				"")
		.when()
		.post("https://rtm-frmjs-dl-vip1.use1.dev.aws.asurion.net/frauddetection/v1/fraudcheck/")
		.then().log().body()
		.statusCode(200)
		.contentType(ContentType.JSON);
        
        
        String actionCode = response.extract().path("ResponseBody.actions[0].ActionCode");
   	    Assert.assertEquals(actionCode, "APPROVED");
  
	}	    


	

	@Test
	public void FRAUD_CHECK_API_TEST_RULE6() throws Exception {
		
		
		System.out.println(data.clientID6());

        ValidatableResponse response = given()
		.config(RestAssured.config().sslConfig(new SSLConfig().relaxedHTTPSValidation()))
		.contentType(ContentType.JSON)
		.body("{\r\n" + 
				"                \"RequestBody\": {\"incidentID\": \""+ data.incidentID + "\"," + 
				"                    \"incidentNumber\": \"" + data.incidentNumber+ "\"," + 
				"                    \"requestingChannel\": \"" +data.requestingChannel()+ "\"," + 
				"                    \"serviceRequestStartDate\": \""+data.serviceRequestStartDate+"\"," + 
				"                    \"serviceRequestType\": \""+ data.serviceRequestType()+ "\"," + 
				"                    \"serviceRequestStatus\": \""+ data.serviceRequestStatus()+"\"," + 
				"                    \"serviceFlag\": \""+data.serviceFlag()+"\"," + 
				"                    \"failureCode\": \""+data.failureCode()+"\"," + 
				"                    \"failureDate\": \""+data.failureDate+"\"," + 
				"                    \"entitlementType\": \""+ data.entitlementType()+"\"," + 
				"                    \"claimSource\": \""+data.claimSource()+"\"," + 
				"                    \"ccrName\": \""+data.ccrName()+"\"," + 
				"                    \"resolutionCode\": \""+data.resolutionCode()+"\"," + 
				"                    \"assignee\": \""+data.assignee+"\"," + 
				"                    \"clientID\": \""+data.clientID6()+"\"," + 
				"                    \"clientName\": \""+ data.clientName() +"\"," + 
				"                    \"customerID\": \""+data.customerID+"\"," + 
				"                    \"personFirstName\": \""+data.personFirstName()+"\"," + 
				"                    \"personLastName\": \""+data.personLastName()+"\"," + 
				"                    \"validId\": \""+data.validId()+"\"," + 
				"                    \"contractDetails\": {\r\n" + 
				"                                \"contractNumber\": \""+data.contractNumber+"\"," + 
				"                                \"clientTransactionNumber\": \""+ data.clientTransactionNumber +"\"," + 
				"                                \"warrantySku\": \""+ data.warrantySku()+"\"," + 
				"                                    \"warrantyPriceHigh\": \""+data.warranty_price_high+"\"," + 
				"                                    \"warrantyPriceLow\": \""+ data.warranty_price_low +"\"," + 
				"                                    \"programType\": \""+ data.program_Type_rule6()+"\"," + 
				"                                    \"contractCreateDt\": \""+data.contractCreateDt+"\"," + 
				"                                    \"contractCreateChannel\": \""+ data.contractCreateChannel()+"\"," + 
				"                                    \"contractCreatedBy\": \""+ data.contractCreatedBy()+"\"," + 
				"                                    \"contractBrowserFingerPrint\": \""+ data.contractBrowserFingerPrint()+"\"," + 
				"                                    \"receiptFlag\": \""+data.receiptFlag()+"\"" + 
				"                    },\r\n" + 
				"                    \"productDetails\": {\r\n" + 
				"                                                \"instanceID\": \""+data.instanceID()+"\"," + 
				"                                                \"bulkyFlag\": \""+data.bulkyFlag()+"\"," + 
				"                                                \"product\": \""+ data.product() +"\"," + 
				"                                                \"make\": \""+ data.make()+"\"," + 
				"                                                \"category\": \""+ data.category()+"\"," + 
				"                                                \"type\": \""+data.type()+"\"," + 
				"                                                \"productPurchaseDt\": \""+data.productPurchaseDt+"\"," + 
				"                                                \"model\": \""+data.model()+"\"," + 
				"                                                \"serial\": \""+ data.serial()+"\"," + 
				"                                                \"productDescription\": \""+ data.productDescription()+"\"," + 
				"                                                \"purchasePrice\": \""+ data.purchasePrice+"\"" + 
				"                    },\r\n" + 
				"                    \"paymentDetails\" : {\r\n" + 
				"                                                \"fulfillmentTransactionId\": \""+data.fulfillmentTransactionId+"\"," + 
				"                                                \"authType\": \""+data.authType()+"\"," + 
				"                                                \"authStatus\": \""+ data.authStatus()+"\"," + 
				"                                                \"totalAuthAmount\": \""+ data.totalAuthAmount+"\"," + 
				"                                                \"pEBOOriginalPrice\": \""+ data.pEBOOriginalPrice+"\"," + 
				"                                                \"pEBOOfferedPrice\": \""+data.pEBOOfferedPrice+"\"," + 
				"                                                \"pEBOOverrideFlag\": \""+ data.pEBOOverrideFlag()+"\"" + 
				"                    },\r\n" + 
				"                                \"scanAddress\": {\r\n" + 
				"                                \"geoID\": \""+data.geoID()+"\"," + 
				"                                \"addressId\": \""+ data.addressId()+"\"," + 
				"                                \"address1\": \""+ data.address1()+"\"," + 
				"                                \"address2\": \""+data.address2()+"\"," + 
				"                                \"address3\": \""+ data.address3()+"\"," + 
				"                                \"address4\": \""+ data.address4()+"\"," + 
				"                                                \"city\": \""+ data.city()+"\"," + 
				"                                                \"province\": \""+ data.province()+"\"," + 
				"                                                \"state\": \""+data.state()+"\"," + 
				"                                                \"postalCode\": \""+data.postalCode()+"\"," + 
				"                                                \"country\": \""+data.country()+"\"," + 
				"                                                \"latitude\": \""+data.latitude()+"\"," + 
				"                                                \"longitude\": \""+data.longitude()+"\"," + 
				"                                                \"addressOverrideFlag\": \""+data.addressOverrideFlag()+"\"" + 
				"                    },\r\n" + 
				"                    \"labelDetails\": {\r\n" + 
				"                                \"labelType\": \""+data.labelType()+"\"," + 
				"                                \"labelDate\": \""+data.labelDate+"\"," + 
				"                                \"trackingNumber\": \""+data.trackingNumber()+"\"" + 
				"                    },\r\n" + 
				"                    \"originScanDetails\": {\r\n" + 
				"                                \"trackingNumber\": \""+data.trackingNumber()+"\"," + 
				"                                \"scanDate\": \""+data.scanDate+"\"" + 
				"                    },\r\n" + 
				"                    \"salvageScanDetails\": {\r\n" + 
				"                                \"trackingNumber\": \""+data.trackingNumber()+"\"," + 
				"                                \"scanStatus\": \""+data.scanStatus()+"\"," + 
				"                                \"scanDate\": \""+data.scanDate+"\"" + 
				"                    },\r\n" + 
				"                    \"webID\": \""+data.webID()+"\"," + 
				"                    \"iPAddress\": \""+data.iPAddress()+"\"," + 
				"                    \"webSessionId\": \""+data.webSessionId()+"\"," + 
				"                    \"ctiPhoneNumber\": \""+data.ctiPhoneNumber+"\"," + 
				"                    \"inboundPhoneNumber\": \""+data.inboundPhoneNumber+"\"," + 
				"                    \"primaryPhoneNumber\": \""+data.primaryPhoneNumber+"\"," + 
				"                    \"emailAddress\": \""+data.emailAddress()+"\"" + 
				"                }\r\n" + 
				"}\r\n" + 
				"")
		.when()
		.post("https://rtm-frmjs-dl-vip1.use1.dev.aws.asurion.net/frauddetection/v1/fraudcheck/")
		.then().log().body()
		.statusCode(200)
		.contentType(ContentType.JSON);
        
        
        String actionCode = response.extract().path("ResponseBody.actions[0].ActionCode");
   	    Assert.assertEquals(actionCode, "RCPT REQ");
  
	}	    

	
	

	@Test
	public void FRAUD_CHECK_API_TEST_RULE7() throws Exception {
		
	    
        ValidatableResponse response = given()
		.config(RestAssured.config().sslConfig(new SSLConfig().relaxedHTTPSValidation()))
		.contentType(ContentType.JSON)
		.body("{\r\n" + 
				"                \"RequestBody\": {\"incidentID\": \""+ data.incidentID + "\"," + 
				"                    \"incidentNumber\": \"" + data.incidentNumber+ "\"," + 
				"                    \"requestingChannel\": \"" +data.requestingChannel()+ "\"," + 
				"                    \"serviceRequestStartDate\": \""+data.serviceRequestStartDate+"\"," + 
				"                    \"serviceRequestType\": \""+ data.serviceRequestType()+ "\"," + 
				"                    \"serviceRequestStatus\": \""+ data.serviceRequestStatus()+"\"," + 
				"                    \"serviceFlag\": \""+data.serviceFlag()+"\"," + 
				"                    \"failureCode\": \""+data.failureCode()+"\"," + 
				"                    \"failureDate\": \""+data.failureDate+"\"," + 
				"                    \"entitlementType\": \""+ data.entitlementType()+"\"," + 
				"                    \"claimSource\": \""+data.claimSource()+"\"," + 
				"                    \"ccrName\": \""+data.ccrName()+"\"," + 
				"                    \"resolutionCode\": \""+data.resolutionCode()+"\"," + 
				"                    \"assignee\": \""+data.assignee+"\"," + 
				"                    \"clientID\": \""+data.clientID7()+"\"," + 
				"                    \"clientName\": \""+ data.clientName() +"\"," + 
				"                    \"customerID\": \""+data.customerID+"\"," + 
				"                    \"personFirstName\": \""+data.personFirstName()+"\"," + 
				"                    \"personLastName\": \""+data.personLastName()+"\"," + 
				"                    \"validId\": \""+data.validId()+"\"," + 
				"                    \"contractDetails\": {\r\n" + 
				"                                \"contractNumber\": \""+data.contractNumber+"\"," + 
				"                                \"clientTransactionNumber\": \""+ data.clientTransactionNumber +"\"," + 
				"                                \"warrantySku\": \""+ data.warrantySku()+"\"," + 
				"                                    \"warrantyPriceHigh\": \""+data.warranty_price_high+"\"," + 
				"                                    \"warrantyPriceLow\": \""+ data.warranty_price_low +"\"," + 
				"                                    \"programType\": \""+ data.program_Type_rule7()+"\"," + 
				"                                    \"contractCreateDt\": \""+data.contractCreateDt+"\"," + 
				"                                    \"contractCreateChannel\": \""+ data.contractCreateChannel()+"\"," + 
				"                                    \"contractCreatedBy\": \""+ data.contractCreatedBy()+"\"," + 
				"                                    \"contractBrowserFingerPrint\": \""+ data.contractBrowserFingerPrint()+"\"," + 
				"                                    \"receiptFlag\": \""+data.receiptFlag()+"\"" + 
				"                    },\r\n" + 
				"                    \"productDetails\": {\r\n" + 
				"                                                \"instanceID\": \""+data.instanceID()+"\"," + 
				"                                                \"bulkyFlag\": \""+data.bulkyFlag()+"\"," + 
				"                                                \"product\": \""+ data.product() +"\"," + 
				"                                                \"make\": \""+ data.make()+"\"," + 
				"                                                \"category\": \""+ data.category()+"\"," + 
				"                                                \"type\": \""+data.type()+"\"," + 
				"                                                \"productPurchaseDt\": \""+data.productPurchaseDt+"\"," + 
				"                                                \"model\": \""+data.model()+"\"," + 
				"                                                \"serial\": \""+ data.serial()+"\"," + 
				"                                                \"productDescription\": \""+ data.productDescription()+"\"," + 
				"                                                \"purchasePrice\": \""+ data.purchasePrice+"\"" + 
				"                    },\r\n" + 
				"                    \"paymentDetails\" : {\r\n" + 
				"                                                \"fulfillmentTransactionId\": \""+data.fulfillmentTransactionId+"\"," + 
				"                                                \"authType\": \""+data.authType()+"\"," + 
				"                                                \"authStatus\": \""+ data.authStatus()+"\"," + 
				"                                                \"totalAuthAmount\": \""+ data.totalAuthAmount+"\"," + 
				"                                                \"pEBOOriginalPrice\": \""+ data.pEBOOriginalPrice+"\"," + 
				"                                                \"pEBOOfferedPrice\": \""+data.pEBOOfferedPrice+"\"," + 
				"                                                \"pEBOOverrideFlag\": \""+ data.pEBOOverrideFlag()+"\"" + 
				"                    },\r\n" + 
				"                                \"scanAddress\": {\r\n" + 
				"                                \"geoID\": \""+data.geoID()+"\"," + 
				"                                \"addressId\": \""+ data.addressId()+"\"," + 
				"                                \"address1\": \""+ data.address1()+"\"," + 
				"                                \"address2\": \""+data.address2()+"\"," + 
				"                                \"address3\": \""+ data.address3()+"\"," + 
				"                                \"address4\": \""+ data.address4()+"\"," + 
				"                                                \"city\": \""+ data.city()+"\"," + 
				"                                                \"province\": \""+ data.province()+"\"," + 
				"                                                \"state\": \""+data.state()+"\"," + 
				"                                                \"postalCode\": \""+data.postalCode()+"\"," + 
				"                                                \"country\": \""+data.country()+"\"," + 
				"                                                \"latitude\": \""+data.latitude()+"\"," + 
				"                                                \"longitude\": \""+data.longitude()+"\"," + 
				"                                                \"addressOverrideFlag\": \""+data.addressOverrideFlag()+"\"" + 
				"                    },\r\n" + 
				"                    \"labelDetails\": {\r\n" + 
				"                                \"labelType\": \""+data.labelType()+"\"," + 
				"                                \"labelDate\": \""+data.labelDate+"\"," + 
				"                                \"trackingNumber\": \""+data.trackingNumber()+"\"" + 
				"                    },\r\n" + 
				"                    \"originScanDetails\": {\r\n" + 
				"                                \"trackingNumber\": \""+data.trackingNumber()+"\"," + 
				"                                \"scanDate\": \""+data.scanDate+"\"" + 
				"                    },\r\n" + 
				"                    \"salvageScanDetails\": {\r\n" + 
				"                                \"trackingNumber\": \""+data.trackingNumber()+"\"," + 
				"                                \"scanStatus\": \""+data.scanStatus()+"\"," + 
				"                                \"scanDate\": \""+data.scanDate+"\"" + 
				"                    },\r\n" + 
				"                    \"webID\": \""+data.webID()+"\"," + 
				"                    \"iPAddress\": \""+data.iPAddress()+"\"," + 
				"                    \"webSessionId\": \""+data.webSessionId()+"\"," + 
				"                    \"ctiPhoneNumber\": \""+data.ctiPhoneNumber+"\"," + 
				"                    \"inboundPhoneNumber\": \""+data.inboundPhoneNumber+"\"," + 
				"                    \"primaryPhoneNumber\": \""+data.primaryPhoneNumber+"\"," + 
				"                    \"emailAddress\": \""+data.emailAddress()+"\"" + 
				"                }\r\n" + 
				"}\r\n" + 
				"")
		.when()
		.post("https://rtm-frmjs-dl-vip1.use1.dev.aws.asurion.net/frauddetection/v1/fraudcheck/")
		.then().log().body()
		.statusCode(200)
		.contentType(ContentType.JSON);
        
        
        String actionCode = response.extract().path("ResponseBody.actions[0].ActionCode");
   	    Assert.assertEquals(actionCode, "RCPT REQ");
  
	}	
	
	
	
	

	@Test
	public void FRAUD_CHECK_API_TEST_RULE8() throws Exception {
		
	    
        ValidatableResponse response = given()
		.config(RestAssured.config().sslConfig(new SSLConfig().relaxedHTTPSValidation()))
		.contentType(ContentType.JSON)
		.body("{\r\n" + 
				"                \"RequestBody\": {\"incidentID\": \""+ data.incidentID + "\"," + 
				"                    \"incidentNumber\": \"" + data.incidentNumber+ "\"," + 
				"                    \"requestingChannel\": \"" +data.requestingChannel()+ "\"," + 
				"                    \"serviceRequestStartDate\": \""+data.serviceRequestStartDate+"\"," + 
				"                    \"serviceRequestType\": \""+ data.serviceRequestType()+ "\"," + 
				"                    \"serviceRequestStatus\": \""+ data.serviceRequestStatus()+"\"," + 
				"                    \"serviceFlag\": \""+data.serviceFlag()+"\"," + 
				"                    \"failureCode\": \""+data.failureCode()+"\"," + 
				"                    \"failureDate\": \""+data.failureDate+"\"," + 
				"                    \"entitlementType\": \""+ data.entitlementType()+"\"," + 
				"                    \"claimSource\": \""+data.claimSource()+"\"," + 
				"                    \"ccrName\": \""+data.ccrName()+"\"," + 
				"                    \"resolutionCode\": \""+data.resolutionCode()+"\"," + 
				"                    \"assignee\": \""+data.assignee+"\"," + 
				"                    \"clientID\": \""+data.clientID8()+"\"," + 
				"                    \"clientName\": \""+ data.clientName() +"\"," + 
				"                    \"customerID\": \""+data.customerID+"\"," + 
				"                    \"personFirstName\": \""+data.personFirstName()+"\"," + 
				"                    \"personLastName\": \""+data.personLastName()+"\"," + 
				"                    \"validId\": \""+data.validId()+"\"," + 
				"                    \"contractDetails\": {\r\n" + 
				"                                \"contractNumber\": \""+data.contractNumber+"\"," + 
				"                                \"clientTransactionNumber\": \""+ data.clientTransactionNumber +"\"," + 
				"                                \"warrantySku\": \""+ data.warrantySku()+"\"," + 
				"                                    \"warrantyPriceHigh\": \""+data.warranty_price_high+"\"," + 
				"                                    \"warrantyPriceLow\": \""+ data.warranty_price_low +"\"," + 
				"                                    \"programType\": \""+ data.program_Type_rule8()+"\"," + 
				"                                    \"contractCreateDt\": \""+data.contractCreateDt+"\"," + 
				"                                    \"contractCreateChannel\": \""+ data.contractCreateChannel()+"\"," + 
				"                                    \"contractCreatedBy\": \""+ data.contractCreatedBy()+"\"," + 
				"                                    \"contractBrowserFingerPrint\": \""+ data.contractBrowserFingerPrint()+"\"," + 
				"                                    \"receiptFlag\": \""+data.receiptFlag()+"\"" + 
				"                    },\r\n" + 
				"                    \"productDetails\": {\r\n" + 
				"                                                \"instanceID\": \""+data.instanceID()+"\"," + 
				"                                                \"bulkyFlag\": \""+data.bulkyFlag()+"\"," + 
				"                                                \"product\": \""+ data.product() +"\"," + 
				"                                                \"make\": \""+ data.make()+"\"," + 
				"                                                \"category\": \""+ data.category()+"\"," + 
				"                                                \"type\": \""+data.type()+"\"," + 
				"                                                \"productPurchaseDt\": \""+data.productPurchaseDt+"\"," + 
				"                                                \"model\": \""+data.model()+"\"," + 
				"                                                \"serial\": \""+ data.serial()+"\"," + 
				"                                                \"productDescription\": \""+ data.productDescription()+"\"," + 
				"                                                \"purchasePrice\": \""+ data.purchasePrice+"\"" + 
				"                    },\r\n" + 
				"                    \"paymentDetails\" : {\r\n" + 
				"                                                \"fulfillmentTransactionId\": \""+data.fulfillmentTransactionId+"\"," + 
				"                                                \"authType\": \""+data.authType()+"\"," + 
				"                                                \"authStatus\": \""+ data.authStatus()+"\"," + 
				"                                                \"totalAuthAmount\": \""+ data.totalAuthAmount+"\"," + 
				"                                                \"pEBOOriginalPrice\": \""+ data.pEBOOriginalPrice+"\"," + 
				"                                                \"pEBOOfferedPrice\": \""+data.pEBOOfferedPrice+"\"," + 
				"                                                \"pEBOOverrideFlag\": \""+ data.pEBOOverrideFlag()+"\"" + 
				"                    },\r\n" + 
				"                                \"scanAddress\": {\r\n" + 
				"                                \"geoID\": \""+data.geoID()+"\"," + 
				"                                \"addressId\": \""+ data.addressId()+"\"," + 
				"                                \"address1\": \""+ data.address1()+"\"," + 
				"                                \"address2\": \""+data.address2()+"\"," + 
				"                                \"address3\": \""+ data.address3()+"\"," + 
				"                                \"address4\": \""+ data.address4()+"\"," + 
				"                                                \"city\": \""+ data.city()+"\"," + 
				"                                                \"province\": \""+ data.province()+"\"," + 
				"                                                \"state\": \""+data.state()+"\"," + 
				"                                                \"postalCode\": \""+data.postalCode()+"\"," + 
				"                                                \"country\": \""+data.country()+"\"," + 
				"                                                \"latitude\": \""+data.latitude()+"\"," + 
				"                                                \"longitude\": \""+data.longitude()+"\"," + 
				"                                                \"addressOverrideFlag\": \""+data.addressOverrideFlag()+"\"" + 
				"                    },\r\n" + 
				"                    \"labelDetails\": {\r\n" + 
				"                                \"labelType\": \""+data.labelType()+"\"," + 
				"                                \"labelDate\": \""+data.labelDate+"\"," + 
				"                                \"trackingNumber\": \""+data.trackingNumber()+"\"" + 
				"                    },\r\n" + 
				"                    \"originScanDetails\": {\r\n" + 
				"                                \"trackingNumber\": \""+data.trackingNumber()+"\"," + 
				"                                \"scanDate\": \""+data.scanDate+"\"" + 
				"                    },\r\n" + 
				"                    \"salvageScanDetails\": {\r\n" + 
				"                                \"trackingNumber\": \""+data.trackingNumber()+"\"," + 
				"                                \"scanStatus\": \""+data.scanStatus()+"\"," + 
				"                                \"scanDate\": \""+data.scanDate+"\"" + 
				"                    },\r\n" + 
				"                    \"webID\": \""+data.webID()+"\"," + 
				"                    \"iPAddress\": \""+data.iPAddress()+"\"," + 
				"                    \"webSessionId\": \""+data.webSessionId()+"\"," + 
				"                    \"ctiPhoneNumber\": \""+data.ctiPhoneNumber+"\"," + 
				"                    \"inboundPhoneNumber\": \""+data.inboundPhoneNumber+"\"," + 
				"                    \"primaryPhoneNumber\": \""+data.primaryPhoneNumber+"\"," + 
				"                    \"emailAddress\": \""+data.emailAddress()+"\"" + 
				"                }\r\n" + 
				"}\r\n" + 
				"")
		.when()
		.post("https://rtm-frmjs-dl-vip1.use1.dev.aws.asurion.net/frauddetection/v1/fraudcheck/")
		.then().log().body()
		.statusCode(200)
		.contentType(ContentType.JSON);
        
        
        String actionCode = response.extract().path("ResponseBody.actions[0].ActionCode");
   	    Assert.assertEquals(actionCode, "RCPT REQ");
  
	}	    
	
	
	
	
	

	@Test
	public void FRAUD_CHECK_API_TEST_RULE9() throws Exception {
		
	    
        ValidatableResponse response = given()
		.config(RestAssured.config().sslConfig(new SSLConfig().relaxedHTTPSValidation()))
		.contentType(ContentType.JSON)
		.body("{\r\n" + 
				"                \"RequestBody\": {\"incidentID\": \""+ data.incidentID + "\"," + 
				"                    \"incidentNumber\": \"" + data.incidentNumber+ "\"," + 
				"                    \"requestingChannel\": \"" +data.requestingChannel()+ "\"," + 
				"                    \"serviceRequestStartDate\": \""+data.serviceRequestStartDate+"\"," + 
				"                    \"serviceRequestType\": \""+ data.serviceRequestType()+ "\"," + 
				"                    \"serviceRequestStatus\": \""+ data.serviceRequestStatus()+"\"," + 
				"                    \"serviceFlag\": \""+data.serviceFlag()+"\"," + 
				"                    \"failureCode\": \""+data.failureCode()+"\"," + 
				"                    \"failureDate\": \""+data.failureDate+"\"," + 
				"                    \"entitlementType\": \""+ data.entitlementType()+"\"," + 
				"                    \"claimSource\": \""+data.claimSource()+"\"," + 
				"                    \"ccrName\": \""+data.ccrName()+"\"," + 
				"                    \"resolutionCode\": \""+data.resolutionCode()+"\"," + 
				"                    \"assignee\": \""+data.assignee+"\"," + 
				"                    \"clientID\": \""+data.clientID9()+"\"," + 
				"                    \"clientName\": \""+ data.clientName() +"\"," + 
				"                    \"customerID\": \""+data.customerID+"\"," + 
				"                    \"personFirstName\": \""+data.personFirstName()+"\"," + 
				"                    \"personLastName\": \""+data.personLastName()+"\"," + 
				"                    \"validId\": \""+data.validId()+"\"," + 
				"                    \"contractDetails\": {\r\n" + 
				"                                \"contractNumber\": \""+data.contractNumber+"\"," + 
				"                                \"clientTransactionNumber\": \""+ data.clientTransactionNumber +"\"," + 
				"                                \"warrantySku\": \""+ data.warrantySku()+"\"," + 
				"                                    \"warrantyPriceHigh\": \""+data.warranty_price_high+"\"," + 
				"                                    \"warrantyPriceLow\": \""+ data.warranty_price_low +"\"," + 
				"                                    \"programType\": \""+ data.program_Type_rule9()+"\"," + 
				"                                    \"contractCreateDt\": \""+data.contractCreateDt+"\"," + 
				"                                    \"contractCreateChannel\": \""+ data.contractCreateChannel()+"\"," + 
				"                                    \"contractCreatedBy\": \""+ data.contractCreatedBy()+"\"," + 
				"                                    \"contractBrowserFingerPrint\": \""+ data.contractBrowserFingerPrint()+"\"," + 
				"                                    \"receiptFlag\": \""+data.receiptFlag()+"\"" + 
				"                    },\r\n" + 
				"                    \"productDetails\": {\r\n" + 
				"                                                \"instanceID\": \""+data.instanceID()+"\"," + 
				"                                                \"bulkyFlag\": \""+data.bulkyFlag()+"\"," + 
				"                                                \"product\": \""+ data.product() +"\"," + 
				"                                                \"make\": \""+ data.make()+"\"," + 
				"                                                \"category\": \""+ data.category()+"\"," + 
				"                                                \"type\": \""+data.type()+"\"," + 
				"                                                \"productPurchaseDt\": \""+data.productPurchaseDt+"\"," + 
				"                                                \"model\": \""+data.model()+"\"," + 
				"                                                \"serial\": \""+ data.serial()+"\"," + 
				"                                                \"productDescription\": \""+ data.productDescription()+"\"," + 
				"                                                \"purchasePrice\": \""+ data.purchasePrice+"\"" + 
				"                    },\r\n" + 
				"                    \"paymentDetails\" : {\r\n" + 
				"                                                \"fulfillmentTransactionId\": \""+data.fulfillmentTransactionId+"\"," + 
				"                                                \"authType\": \""+data.authType()+"\"," + 
				"                                                \"authStatus\": \""+ data.authStatus()+"\"," + 
				"                                                \"totalAuthAmount\": \""+ data.totalAuthAmount+"\"," + 
				"                                                \"pEBOOriginalPrice\": \""+ data.pEBOOriginalPrice+"\"," + 
				"                                                \"pEBOOfferedPrice\": \""+data.pEBOOfferedPrice+"\"," + 
				"                                                \"pEBOOverrideFlag\": \""+ data.pEBOOverrideFlag()+"\"" + 
				"                    },\r\n" + 
				"                                \"scanAddress\": {\r\n" + 
				"                                \"geoID\": \""+data.geoID()+"\"," + 
				"                                \"addressId\": \""+ data.addressId()+"\"," + 
				"                                \"address1\": \""+ data.address1()+"\"," + 
				"                                \"address2\": \""+data.address2()+"\"," + 
				"                                \"address3\": \""+ data.address3()+"\"," + 
				"                                \"address4\": \""+ data.address4()+"\"," + 
				"                                                \"city\": \""+ data.city()+"\"," + 
				"                                                \"province\": \""+ data.province()+"\"," + 
				"                                                \"state\": \""+data.state()+"\"," + 
				"                                                \"postalCode\": \""+data.postalCode()+"\"," + 
				"                                                \"country\": \""+data.country()+"\"," + 
				"                                                \"latitude\": \""+data.latitude()+"\"," + 
				"                                                \"longitude\": \""+data.longitude()+"\"," + 
				"                                                \"addressOverrideFlag\": \""+data.addressOverrideFlag()+"\"" + 
				"                    },\r\n" + 
				"                    \"labelDetails\": {\r\n" + 
				"                                \"labelType\": \""+data.labelType()+"\"," + 
				"                                \"labelDate\": \""+data.labelDate+"\"," + 
				"                                \"trackingNumber\": \""+data.trackingNumber()+"\"" + 
				"                    },\r\n" + 
				"                    \"originScanDetails\": {\r\n" + 
				"                                \"trackingNumber\": \""+data.trackingNumber()+"\"," + 
				"                                \"scanDate\": \""+data.scanDate+"\"" + 
				"                    },\r\n" + 
				"                    \"salvageScanDetails\": {\r\n" + 
				"                                \"trackingNumber\": \""+data.trackingNumber()+"\"," + 
				"                                \"scanStatus\": \""+data.scanStatus()+"\"," + 
				"                                \"scanDate\": \""+data.scanDate+"\"" + 
				"                    },\r\n" + 
				"                    \"webID\": \""+data.webID()+"\"," + 
				"                    \"iPAddress\": \""+data.iPAddress()+"\"," + 
				"                    \"webSessionId\": \""+data.webSessionId()+"\"," + 
				"                    \"ctiPhoneNumber\": \""+data.ctiPhoneNumber+"\"," + 
				"                    \"inboundPhoneNumber\": \""+data.inboundPhoneNumber+"\"," + 
				"                    \"primaryPhoneNumber\": \""+data.primaryPhoneNumber+"\"," + 
				"                    \"emailAddress\": \""+data.emailAddress()+"\"" + 
				"                }\r\n" + 
				"}\r\n" + 
				"")
		.when()
		.post("https://rtm-frmjs-dl-vip1.use1.dev.aws.asurion.net/frauddetection/v1/fraudcheck/")
		.then().log().body()
		.statusCode(200)
		.contentType(ContentType.JSON);
        
        
        String actionCode = response.extract().path("ResponseBody.actions[0].ActionCode");
   	    Assert.assertEquals(actionCode, "RCPT REQ");
  
	}	    
	
	
	
	
	
	

	@Test
	public void FRAUD_CHECK_API_TEST_RULE10() throws Exception {
		
	    
        ValidatableResponse response = given()
		.config(RestAssured.config().sslConfig(new SSLConfig().relaxedHTTPSValidation()))
		.contentType(ContentType.JSON)
		.body("{\r\n" + 
				"                \"RequestBody\": {\"incidentID\": \""+ data.incidentID + "\"," + 
				"                    \"incidentNumber\": \"" + data.incidentNumber+ "\"," + 
				"                    \"requestingChannel\": \"" +data.requestingChannel()+ "\"," + 
				"                    \"serviceRequestStartDate\": \""+data.serviceRequestStartDate+"\"," + 
				"                    \"serviceRequestType\": \""+ data.serviceRequestType()+ "\"," + 
				"                    \"serviceRequestStatus\": \""+ data.serviceRequestStatus()+"\"," + 
				"                    \"serviceFlag\": \""+data.serviceFlag()+"\"," + 
				"                    \"failureCode\": \""+data.failureCode()+"\"," + 
				"                    \"failureDate\": \""+data.failureDate+"\"," + 
				"                    \"entitlementType\": \""+ data.entitlementType()+"\"," + 
				"                    \"claimSource\": \""+data.claimSource()+"\"," + 
				"                    \"ccrName\": \""+data.ccrName()+"\"," + 
				"                    \"resolutionCode\": \""+data.resolutionCode()+"\"," + 
				"                    \"assignee\": \""+data.assignee+"\"," + 
				"                    \"clientID\": \""+data.clientID10()+"\"," + 
				"                    \"clientName\": \""+ data.clientName() +"\"," + 
				"                    \"customerID\": \""+data.customerID+"\"," + 
				"                    \"personFirstName\": \""+data.personFirstName()+"\"," + 
				"                    \"personLastName\": \""+data.personLastName()+"\"," + 
				"                    \"validId\": \""+data.validId()+"\"," + 
				"                    \"contractDetails\": {\r\n" + 
				"                                \"contractNumber\": \""+data.contractNumber+"\"," + 
				"                                \"clientTransactionNumber\": \""+ data.clientTransactionNumber +"\"," + 
				"                                \"warrantySku\": \""+ data.warrantySku()+"\"," + 
				"                                    \"warrantyPriceHigh\": \""+data.warranty_price_high+"\"," + 
				"                                    \"warrantyPriceLow\": \""+ data.warranty_price_low +"\"," + 
				"                                    \"programType\": \""+ data.program_Type_rule10()+"\"," + 
				"                                    \"contractCreateDt\": \""+data.contractCreateDt+"\"," + 
				"                                    \"contractCreateChannel\": \""+ data.contractCreateChannel()+"\"," + 
				"                                    \"contractCreatedBy\": \""+ data.contractCreatedBy()+"\"," + 
				"                                    \"contractBrowserFingerPrint\": \""+ data.contractBrowserFingerPrint()+"\"," + 
				"                                    \"receiptFlag\": \""+data.receiptFlag()+"\"" + 
				"                    },\r\n" + 
				"                    \"productDetails\": {\r\n" + 
				"                                                \"instanceID\": \""+data.instanceID()+"\"," + 
				"                                                \"bulkyFlag\": \""+data.bulkyFlag()+"\"," + 
				"                                                \"product\": \""+ data.product() +"\"," + 
				"                                                \"make\": \""+ data.make()+"\"," + 
				"                                                \"category\": \""+ data.category()+"\"," + 
				"                                                \"type\": \""+data.type()+"\"," + 
				"                                                \"productPurchaseDt\": \""+data.productPurchaseDt+"\"," + 
				"                                                \"model\": \""+data.model()+"\"," + 
				"                                                \"serial\": \""+ data.serial()+"\"," + 
				"                                                \"productDescription\": \""+ data.productDescription()+"\"," + 
				"                                                \"purchasePrice\": \""+ data.purchasePrice+"\"" + 
				"                    },\r\n" + 
				"                    \"paymentDetails\" : {\r\n" + 
				"                                                \"fulfillmentTransactionId\": \""+data.fulfillmentTransactionId+"\"," + 
				"                                                \"authType\": \""+data.authType()+"\"," + 
				"                                                \"authStatus\": \""+ data.authStatus()+"\"," + 
				"                                                \"totalAuthAmount\": \""+ data.totalAuthAmount+"\"," + 
				"                                                \"pEBOOriginalPrice\": \""+ data.pEBOOriginalPrice+"\"," + 
				"                                                \"pEBOOfferedPrice\": \""+data.pEBOOfferedPrice+"\"," + 
				"                                                \"pEBOOverrideFlag\": \""+ data.pEBOOverrideFlag()+"\"" + 
				"                    },\r\n" + 
				"                                \"scanAddress\": {\r\n" + 
				"                                \"geoID\": \""+data.geoID()+"\"," + 
				"                                \"addressId\": \""+ data.addressId()+"\"," + 
				"                                \"address1\": \""+ data.address1()+"\"," + 
				"                                \"address2\": \""+data.address2()+"\"," + 
				"                                \"address3\": \""+ data.address3()+"\"," + 
				"                                \"address4\": \""+ data.address4()+"\"," + 
				"                                                \"city\": \""+ data.city()+"\"," + 
				"                                                \"province\": \""+ data.province()+"\"," + 
				"                                                \"state\": \""+data.state()+"\"," + 
				"                                                \"postalCode\": \""+data.postalCode()+"\"," + 
				"                                                \"country\": \""+data.country()+"\"," + 
				"                                                \"latitude\": \""+data.latitude()+"\"," + 
				"                                                \"longitude\": \""+data.longitude()+"\"," + 
				"                                                \"addressOverrideFlag\": \""+data.addressOverrideFlag()+"\"" + 
				"                    },\r\n" + 
				"                    \"labelDetails\": {\r\n" + 
				"                                \"labelType\": \""+data.labelType()+"\"," + 
				"                                \"labelDate\": \""+data.labelDate+"\"," + 
				"                                \"trackingNumber\": \""+data.trackingNumber()+"\"" + 
				"                    },\r\n" + 
				"                    \"originScanDetails\": {\r\n" + 
				"                                \"trackingNumber\": \""+data.trackingNumber()+"\"," + 
				"                                \"scanDate\": \""+data.scanDate+"\"" + 
				"                    },\r\n" + 
				"                    \"salvageScanDetails\": {\r\n" + 
				"                                \"trackingNumber\": \""+data.trackingNumber()+"\"," + 
				"                                \"scanStatus\": \""+data.scanStatus()+"\"," + 
				"                                \"scanDate\": \""+data.scanDate+"\"" + 
				"                    },\r\n" + 
				"                    \"webID\": \""+data.webID()+"\"," + 
				"                    \"iPAddress\": \""+data.iPAddress()+"\"," + 
				"                    \"webSessionId\": \""+data.webSessionId()+"\"," + 
				"                    \"ctiPhoneNumber\": \""+data.ctiPhoneNumber+"\"," + 
				"                    \"inboundPhoneNumber\": \""+data.inboundPhoneNumber+"\"," + 
				"                    \"primaryPhoneNumber\": \""+data.primaryPhoneNumber+"\"," + 
				"                    \"emailAddress\": \""+data.emailAddress()+"\"" + 
				"                }\r\n" + 
				"}\r\n" + 
				"")
		.when()
		.post("https://rtm-frmjs-dl-vip1.use1.dev.aws.asurion.net/frauddetection/v1/fraudcheck/")
		.then().log().body()
		.statusCode(200)
		.contentType(ContentType.JSON);
        
        
        String actionCode = response.extract().path("ResponseBody.actions[0].ActionCode");
   	    Assert.assertEquals(actionCode, "RCPT REQ");
  
	}	    
	
	
	
	
	

	@Test
	public void FRAUD_CHECK_API_TEST_RULE11() throws Exception {
		
	    
        ValidatableResponse response = given()
		.config(RestAssured.config().sslConfig(new SSLConfig().relaxedHTTPSValidation()))
		.contentType(ContentType.JSON)
		.body("{\r\n" + 
				"                \"RequestBody\": {\"incidentID\": \""+ data.incidentID + "\"," + 
				"                    \"incidentNumber\": \"" + data.incidentNumber+ "\"," + 
				"                    \"requestingChannel\": \"" +data.requestingChannel()+ "\"," + 
				"                    \"serviceRequestStartDate\": \""+data.serviceRequestStartDate+"\"," + 
				"                    \"serviceRequestType\": \""+ data.serviceRequestType()+ "\"," + 
				"                    \"serviceRequestStatus\": \""+ data.serviceRequestStatus()+"\"," + 
				"                    \"serviceFlag\": \""+data.serviceFlag()+"\"," + 
				"                    \"failureCode\": \""+data.failureCode()+"\"," + 
				"                    \"failureDate\": \""+data.failureDate+"\"," + 
				"                    \"entitlementType\": \""+ data.entitlementType()+"\"," + 
				"                    \"claimSource\": \""+data.claimSource()+"\"," + 
				"                    \"ccrName\": \""+data.ccrName()+"\"," + 
				"                    \"resolutionCode\": \""+data.resolutionCode()+"\"," + 
				"                    \"assignee\": \""+data.assignee+"\"," + 
				"                    \"clientID\": \""+data.clientID11()+"\"," + 
				"                    \"clientName\": \""+ data.clientName() +"\"," + 
				"                    \"customerID\": \""+data.customerID+"\"," + 
				"                    \"personFirstName\": \""+data.personFirstName()+"\"," + 
				"                    \"personLastName\": \""+data.personLastName()+"\"," + 
				"                    \"validId\": \""+data.validId()+"\"," + 
				"                    \"contractDetails\": {\r\n" + 
				"                                \"contractNumber\": \""+data.contractNumber+"\"," + 
				"                                \"clientTransactionNumber\": \""+ data.clientTransactionNumber +"\"," + 
				"                                \"warrantySku\": \""+ data.warrantySku()+"\"," + 
				"                                    \"warrantyPriceHigh\": \""+data.warranty_price_high+"\"," + 
				"                                    \"warrantyPriceLow\": \""+ data.warranty_price_low +"\"," + 
				"                                    \"programType\": \""+ data.program_Type_rule11()+"\"," + 
				"                                    \"contractCreateDt\": \""+data.contractCreateDt+"\"," + 
				"                                    \"contractCreateChannel\": \""+ data.contractCreateChannel()+"\"," + 
				"                                    \"contractCreatedBy\": \""+ data.contractCreatedBy()+"\"," + 
				"                                    \"contractBrowserFingerPrint\": \""+ data.contractBrowserFingerPrint()+"\"," + 
				"                                    \"receiptFlag\": \""+data.receiptFlag()+"\"" + 
				"                    },\r\n" + 
				"                    \"productDetails\": {\r\n" + 
				"                                                \"instanceID\": \""+data.instanceID()+"\"," + 
				"                                                \"bulkyFlag\": \""+data.bulkyFlag()+"\"," + 
				"                                                \"product\": \""+ data.product() +"\"," + 
				"                                                \"make\": \""+ data.make()+"\"," + 
				"                                                \"category\": \""+ data.category()+"\"," + 
				"                                                \"type\": \""+data.type()+"\"," + 
				"                                                \"productPurchaseDt\": \""+data.productPurchaseDt+"\"," + 
				"                                                \"model\": \""+data.model()+"\"," + 
				"                                                \"serial\": \""+ data.serial()+"\"," + 
				"                                                \"productDescription\": \""+ data.productDescription()+"\"," + 
				"                                                \"purchasePrice\": \""+ data.purchasePrice+"\"" + 
				"                    },\r\n" + 
				"                    \"paymentDetails\" : {\r\n" + 
				"                                                \"fulfillmentTransactionId\": \""+data.fulfillmentTransactionId+"\"," + 
				"                                                \"authType\": \""+data.authType()+"\"," + 
				"                                                \"authStatus\": \""+ data.authStatus()+"\"," + 
				"                                                \"totalAuthAmount\": \""+ data.totalAuthAmount+"\"," + 
				"                                                \"pEBOOriginalPrice\": \""+ data.pEBOOriginalPrice+"\"," + 
				"                                                \"pEBOOfferedPrice\": \""+data.pEBOOfferedPrice+"\"," + 
				"                                                \"pEBOOverrideFlag\": \""+ data.pEBOOverrideFlag()+"\"" + 
				"                    },\r\n" + 
				"                                \"scanAddress\": {\r\n" + 
				"                                \"geoID\": \""+data.geoID()+"\"," + 
				"                                \"addressId\": \""+ data.addressId()+"\"," + 
				"                                \"address1\": \""+ data.address1()+"\"," + 
				"                                \"address2\": \""+data.address2()+"\"," + 
				"                                \"address3\": \""+ data.address3()+"\"," + 
				"                                \"address4\": \""+ data.address4()+"\"," + 
				"                                                \"city\": \""+ data.city()+"\"," + 
				"                                                \"province\": \""+ data.province()+"\"," + 
				"                                                \"state\": \""+data.state()+"\"," + 
				"                                                \"postalCode\": \""+data.postalCode()+"\"," + 
				"                                                \"country\": \""+data.country()+"\"," + 
				"                                                \"latitude\": \""+data.latitude()+"\"," + 
				"                                                \"longitude\": \""+data.longitude()+"\"," + 
				"                                                \"addressOverrideFlag\": \""+data.addressOverrideFlag()+"\"" + 
				"                    },\r\n" + 
				"                    \"labelDetails\": {\r\n" + 
				"                                \"labelType\": \""+data.labelType()+"\"," + 
				"                                \"labelDate\": \""+data.labelDate+"\"," + 
				"                                \"trackingNumber\": \""+data.trackingNumber()+"\"" + 
				"                    },\r\n" + 
				"                    \"originScanDetails\": {\r\n" + 
				"                                \"trackingNumber\": \""+data.trackingNumber()+"\"," + 
				"                                \"scanDate\": \""+data.scanDate+"\"" + 
				"                    },\r\n" + 
				"                    \"salvageScanDetails\": {\r\n" + 
				"                                \"trackingNumber\": \""+data.trackingNumber()+"\"," + 
				"                                \"scanStatus\": \""+data.scanStatus()+"\"," + 
				"                                \"scanDate\": \""+data.scanDate+"\"" + 
				"                    },\r\n" + 
				"                    \"webID\": \""+data.webID()+"\"," + 
				"                    \"iPAddress\": \""+data.iPAddress()+"\"," + 
				"                    \"webSessionId\": \""+data.webSessionId()+"\"," + 
				"                    \"ctiPhoneNumber\": \""+data.ctiPhoneNumber+"\"," + 
				"                    \"inboundPhoneNumber\": \""+data.inboundPhoneNumber+"\"," + 
				"                    \"primaryPhoneNumber\": \""+data.primaryPhoneNumber+"\"," + 
				"                    \"emailAddress\": \""+data.emailAddress()+"\"" + 
				"                }\r\n" + 
				"}\r\n" + 
				"")
		.when()
		.post("https://rtm-frmjs-dl-vip1.use1.dev.aws.asurion.net/frauddetection/v1/fraudcheck/")
		.then().log().body()
		.statusCode(200)
		.contentType(ContentType.JSON);
        
        
        String actionCode = response.extract().path("ResponseBody.actions[0].ActionCode");
   	    Assert.assertEquals(actionCode, "RCPT REQ");
  
	}	    
	
	

	@Test
	public void FRAUD_CHECK_API_TEST_RULE12() throws Exception {
		
	    
        ValidatableResponse response = given()
		.config(RestAssured.config().sslConfig(new SSLConfig().relaxedHTTPSValidation()))
		.contentType(ContentType.JSON)
		.body("{\r\n" + 
				"                \"RequestBody\": {\"incidentID\": \""+ data.incidentID + "\"," + 
				"                    \"incidentNumber\": \"" + data.incidentNumber+ "\"," + 
				"                    \"requestingChannel\": \"" +data.requestingChannel()+ "\"," + 
				"                    \"serviceRequestStartDate\": \""+data.serviceRequestStartDate+"\"," + 
				"                    \"serviceRequestType\": \""+ data.serviceRequestType()+ "\"," + 
				"                    \"serviceRequestStatus\": \""+ data.serviceRequestStatus()+"\"," + 
				"                    \"serviceFlag\": \""+data.serviceFlag()+"\"," + 
				"                    \"failureCode\": \""+data.failureCode()+"\"," + 
				"                    \"failureDate\": \""+data.failureDate+"\"," + 
				"                    \"entitlementType\": \""+ data.entitlementType()+"\"," + 
				"                    \"claimSource\": \""+data.claimSource()+"\"," + 
				"                    \"ccrName\": \""+data.ccrName()+"\"," + 
				"                    \"resolutionCode\": \""+data.resolutionCode()+"\"," + 
				"                    \"assignee\": \""+data.assignee+"\"," + 
				"                    \"clientID\": \""+data.clientID12()+"\"," + 
				"                    \"clientName\": \""+ data.clientName() +"\"," + 
				"                    \"customerID\": \""+data.customerID+"\"," + 
				"                    \"personFirstName\": \""+data.personFirstName()+"\"," + 
				"                    \"personLastName\": \""+data.personLastName()+"\"," + 
				"                    \"validId\": \""+data.validId()+"\"," + 
				"                    \"contractDetails\": {\r\n" + 
				"                                \"contractNumber\": \""+data.contractNumber+"\"," + 
				"                                \"clientTransactionNumber\": \""+ data.clientTransactionNumber +"\"," + 
				"                                \"warrantySku\": \""+ data.warrantySku()+"\"," + 
				"                                    \"warrantyPriceHigh\": \""+data.warranty_price_high+"\"," + 
				"                                    \"warrantyPriceLow\": \""+ data.warranty_price_low +"\"," + 
				"                                    \"programType\": \""+ data.program_Type_rule12()+"\"," + 
				"                                    \"contractCreateDt\": \""+data.contractCreateDt+"\"," + 
				"                                    \"contractCreateChannel\": \""+ data.contractCreateChannel()+"\"," + 
				"                                    \"contractCreatedBy\": \""+ data.contractCreatedBy()+"\"," + 
				"                                    \"contractBrowserFingerPrint\": \""+ data.contractBrowserFingerPrint()+"\"," + 
				"                                    \"receiptFlag\": \""+data.receiptFlag()+"\"" + 
				"                    },\r\n" + 
				"                    \"productDetails\": {\r\n" + 
				"                                                \"instanceID\": \""+data.instanceID()+"\"," + 
				"                                                \"bulkyFlag\": \""+data.bulkyFlag()+"\"," + 
				"                                                \"product\": \""+ data.product() +"\"," + 
				"                                                \"make\": \""+ data.make()+"\"," + 
				"                                                \"category\": \""+ data.category()+"\"," + 
				"                                                \"type\": \""+data.type()+"\"," + 
				"                                                \"productPurchaseDt\": \""+data.productPurchaseDt+"\"," + 
				"                                                \"model\": \""+data.model()+"\"," + 
				"                                                \"serial\": \""+ data.serial()+"\"," + 
				"                                                \"productDescription\": \""+ data.productDescription()+"\"," + 
				"                                                \"purchasePrice\": \""+ data.purchasePrice+"\"" + 
				"                    },\r\n" + 
				"                    \"paymentDetails\" : {\r\n" + 
				"                                                \"fulfillmentTransactionId\": \""+data.fulfillmentTransactionId+"\"," + 
				"                                                \"authType\": \""+data.authType()+"\"," + 
				"                                                \"authStatus\": \""+ data.authStatus()+"\"," + 
				"                                                \"totalAuthAmount\": \""+ data.totalAuthAmount+"\"," + 
				"                                                \"pEBOOriginalPrice\": \""+ data.pEBOOriginalPrice+"\"," + 
				"                                                \"pEBOOfferedPrice\": \""+data.pEBOOfferedPrice+"\"," + 
				"                                                \"pEBOOverrideFlag\": \""+ data.pEBOOverrideFlag()+"\"" + 
				"                    },\r\n" + 
				"                                \"scanAddress\": {\r\n" + 
				"                                \"geoID\": \""+data.geoID()+"\"," + 
				"                                \"addressId\": \""+ data.addressId()+"\"," + 
				"                                \"address1\": \""+ data.address1()+"\"," + 
				"                                \"address2\": \""+data.address2()+"\"," + 
				"                                \"address3\": \""+ data.address3()+"\"," + 
				"                                \"address4\": \""+ data.address4()+"\"," + 
				"                                                \"city\": \""+ data.city()+"\"," + 
				"                                                \"province\": \""+ data.province()+"\"," + 
				"                                                \"state\": \""+data.state()+"\"," + 
				"                                                \"postalCode\": \""+data.postalCode()+"\"," + 
				"                                                \"country\": \""+data.country()+"\"," + 
				"                                                \"latitude\": \""+data.latitude()+"\"," + 
				"                                                \"longitude\": \""+data.longitude()+"\"," + 
				"                                                \"addressOverrideFlag\": \""+data.addressOverrideFlag()+"\"" + 
				"                    },\r\n" + 
				"                    \"labelDetails\": {\r\n" + 
				"                                \"labelType\": \""+data.labelType()+"\"," + 
				"                                \"labelDate\": \""+data.labelDate+"\"," + 
				"                                \"trackingNumber\": \""+data.trackingNumber()+"\"" + 
				"                    },\r\n" + 
				"                    \"originScanDetails\": {\r\n" + 
				"                                \"trackingNumber\": \""+data.trackingNumber()+"\"," + 
				"                                \"scanDate\": \""+data.scanDate+"\"" + 
				"                    },\r\n" + 
				"                    \"salvageScanDetails\": {\r\n" + 
				"                                \"trackingNumber\": \""+data.trackingNumber()+"\"," + 
				"                                \"scanStatus\": \""+data.scanStatus()+"\"," + 
				"                                \"scanDate\": \""+data.scanDate+"\"" + 
				"                    },\r\n" + 
				"                    \"webID\": \""+data.webID()+"\"," + 
				"                    \"iPAddress\": \""+data.iPAddress()+"\"," + 
				"                    \"webSessionId\": \""+data.webSessionId()+"\"," + 
				"                    \"ctiPhoneNumber\": \""+data.ctiPhoneNumber+"\"," + 
				"                    \"inboundPhoneNumber\": \""+data.inboundPhoneNumber+"\"," + 
				"                    \"primaryPhoneNumber\": \""+data.primaryPhoneNumber+"\"," + 
				"                    \"emailAddress\": \""+data.emailAddress()+"\"" + 
				"                }\r\n" + 
				"}\r\n" + 
				"")
		.when()
		.post("https://rtm-frmjs-dl-vip1.use1.dev.aws.asurion.net/frauddetection/v1/fraudcheck/")
		.then().log().body()
		.statusCode(200)
		.contentType(ContentType.JSON);
        
        
        String actionCode = response.extract().path("ResponseBody.actions[0].ActionCode");
   	    Assert.assertEquals(actionCode, "RCPT REQ");
  
	}	    
	
	
	
	
	
	

	@Test
	public void FRAUD_CHECK_API_TEST_RULE13() throws Exception {
		
	    
        ValidatableResponse response = given()
		.config(RestAssured.config().sslConfig(new SSLConfig().relaxedHTTPSValidation()))
		.contentType(ContentType.JSON)
		.body("{\r\n" + 
				"                \"RequestBody\": {\"incidentID\": \""+ data.incidentID + "\"," + 
				"                    \"incidentNumber\": \"" + data.incidentNumber+ "\"," + 
				"                    \"requestingChannel\": \"" +data.requestingChannel()+ "\"," + 
				"                    \"serviceRequestStartDate\": \""+data.serviceRequestStartDate+"\"," + 
				"                    \"serviceRequestType\": \""+ data.serviceRequestType()+ "\"," + 
				"                    \"serviceRequestStatus\": \""+ data.serviceRequestStatus()+"\"," + 
				"                    \"serviceFlag\": \""+data.serviceFlag()+"\"," + 
				"                    \"failureCode\": \""+data.failureCode()+"\"," + 
				"                    \"failureDate\": \""+data.failureDate+"\"," + 
				"                    \"entitlementType\": \""+ data.entitlementType()+"\"," + 
				"                    \"claimSource\": \""+data.claimSource()+"\"," + 
				"                    \"ccrName\": \""+data.ccrName()+"\"," + 
				"                    \"resolutionCode\": \""+data.resolutionCode()+"\"," + 
				"                    \"assignee\": \""+data.assignee+"\"," + 
				"                    \"clientID\": \""+data.clientID13()+"\"," + 
				"                    \"clientName\": \""+ data.clientName() +"\"," + 
				"                    \"customerID\": \""+data.customerID+"\"," + 
				"                    \"personFirstName\": \""+data.personFirstName()+"\"," + 
				"                    \"personLastName\": \""+data.personLastName()+"\"," + 
				"                    \"validId\": \""+data.validId()+"\"," + 
				"                    \"contractDetails\": {\r\n" + 
				"                                \"contractNumber\": \""+data.contractNumber+"\"," + 
				"                                \"clientTransactionNumber\": \""+ data.clientTransactionNumber +"\"," + 
				"                                \"warrantySku\": \""+ data.warrantySku()+"\"," + 
				"                                    \"warrantyPriceHigh\": \""+data.warranty_price_high+"\"," + 
				"                                    \"warrantyPriceLow\": \""+ data.warranty_price_low +"\"," + 
				"                                    \"programType\": \""+ data.program_Type_rule13()+"\"," + 
				"                                    \"contractCreateDt\": \""+data.contractCreateDt+"\"," + 
				"                                    \"contractCreateChannel\": \""+ data.contractCreateChannel()+"\"," + 
				"                                    \"contractCreatedBy\": \""+ data.contractCreatedBy()+"\"," + 
				"                                    \"contractBrowserFingerPrint\": \""+ data.contractBrowserFingerPrint()+"\"," + 
				"                                    \"receiptFlag\": \""+data.receiptFlag()+"\"" + 
				"                    },\r\n" + 
				"                    \"productDetails\": {\r\n" + 
				"                                                \"instanceID\": \""+data.instanceID()+"\"," + 
				"                                                \"bulkyFlag\": \""+data.bulkyFlag()+"\"," + 
				"                                                \"product\": \""+ data.product() +"\"," + 
				"                                                \"make\": \""+ data.make()+"\"," + 
				"                                                \"category\": \""+ data.category()+"\"," + 
				"                                                \"type\": \""+data.type()+"\"," + 
				"                                                \"productPurchaseDt\": \""+data.productPurchaseDt+"\"," + 
				"                                                \"model\": \""+data.model()+"\"," + 
				"                                                \"serial\": \""+ data.serial()+"\"," + 
				"                                                \"productDescription\": \""+ data.productDescription()+"\"," + 
				"                                                \"purchasePrice\": \""+ data.purchasePrice+"\"" + 
				"                    },\r\n" + 
				"                    \"paymentDetails\" : {\r\n" + 
				"                                                \"fulfillmentTransactionId\": \""+data.fulfillmentTransactionId+"\"," + 
				"                                                \"authType\": \""+data.authType()+"\"," + 
				"                                                \"authStatus\": \""+ data.authStatus()+"\"," + 
				"                                                \"totalAuthAmount\": \""+ data.totalAuthAmount+"\"," + 
				"                                                \"pEBOOriginalPrice\": \""+ data.pEBOOriginalPrice+"\"," + 
				"                                                \"pEBOOfferedPrice\": \""+data.pEBOOfferedPrice+"\"," + 
				"                                                \"pEBOOverrideFlag\": \""+ data.pEBOOverrideFlag()+"\"" + 
				"                    },\r\n" + 
				"                                \"scanAddress\": {\r\n" + 
				"                                \"geoID\": \""+data.geoID()+"\"," + 
				"                                \"addressId\": \""+ data.addressId()+"\"," + 
				"                                \"address1\": \""+ data.address1()+"\"," + 
				"                                \"address2\": \""+data.address2()+"\"," + 
				"                                \"address3\": \""+ data.address3()+"\"," + 
				"                                \"address4\": \""+ data.address4()+"\"," + 
				"                                                \"city\": \""+ data.city()+"\"," + 
				"                                                \"province\": \""+ data.province()+"\"," + 
				"                                                \"state\": \""+data.state()+"\"," + 
				"                                                \"postalCode\": \""+data.postalCode()+"\"," + 
				"                                                \"country\": \""+data.country()+"\"," + 
				"                                                \"latitude\": \""+data.latitude()+"\"," + 
				"                                                \"longitude\": \""+data.longitude()+"\"," + 
				"                                                \"addressOverrideFlag\": \""+data.addressOverrideFlag()+"\"" + 
				"                    },\r\n" + 
				"                    \"labelDetails\": {\r\n" + 
				"                                \"labelType\": \""+data.labelType()+"\"," + 
				"                                \"labelDate\": \""+data.labelDate+"\"," + 
				"                                \"trackingNumber\": \""+data.trackingNumber()+"\"" + 
				"                    },\r\n" + 
				"                    \"originScanDetails\": {\r\n" + 
				"                                \"trackingNumber\": \""+data.trackingNumber()+"\"," + 
				"                                \"scanDate\": \""+data.scanDate+"\"" + 
				"                    },\r\n" + 
				"                    \"salvageScanDetails\": {\r\n" + 
				"                                \"trackingNumber\": \""+data.trackingNumber()+"\"," + 
				"                                \"scanStatus\": \""+data.scanStatus()+"\"," + 
				"                                \"scanDate\": \""+data.scanDate+"\"" + 
				"                    },\r\n" + 
				"                    \"webID\": \""+data.webID()+"\"," + 
				"                    \"iPAddress\": \""+data.iPAddress()+"\"," + 
				"                    \"webSessionId\": \""+data.webSessionId()+"\"," + 
				"                    \"ctiPhoneNumber\": \""+data.ctiPhoneNumber+"\"," + 
				"                    \"inboundPhoneNumber\": \""+data.inboundPhoneNumber+"\"," + 
				"                    \"primaryPhoneNumber\": \""+data.primaryPhoneNumber+"\"," + 
				"                    \"emailAddress\": \""+data.emailAddress()+"\"" + 
				"                }\r\n" + 
				"}\r\n" + 
				"")
		.when()
		.post("https://rtm-frmjs-dl-vip1.use1.dev.aws.asurion.net/frauddetection/v1/fraudcheck/")
		.then().log().body()
		.statusCode(200)
		.contentType(ContentType.JSON);
        
        
        String actionCode = response.extract().path("ResponseBody.actions[0].ActionCode");
   	    Assert.assertEquals(actionCode, "RCPT REQ");
  
	}	    
	
	

	@Test
	public void FRAUD_CHECK_API_TEST_RULE14() throws Exception {
		
	    
        ValidatableResponse response = given()
		.config(RestAssured.config().sslConfig(new SSLConfig().relaxedHTTPSValidation()))
		.contentType(ContentType.JSON)
		.body("{\r\n" + 
				"                \"RequestBody\": {\"incidentID\": \""+ data.incidentID + "\"," + 
				"                    \"incidentNumber\": \"" + data.incidentNumber+ "\"," + 
				"                    \"requestingChannel\": \"" +data.requestingChannel()+ "\"," + 
				"                    \"serviceRequestStartDate\": \""+data.serviceRequestStartDate+"\"," + 
				"                    \"serviceRequestType\": \""+ data.serviceRequestType()+ "\"," + 
				"                    \"serviceRequestStatus\": \""+ data.serviceRequestStatus()+"\"," + 
				"                    \"serviceFlag\": \""+data.serviceFlag()+"\"," + 
				"                    \"failureCode\": \""+data.failureCode()+"\"," + 
				"                    \"failureDate\": \""+data.failureDate+"\"," + 
				"                    \"entitlementType\": \""+ data.entitlementType()+"\"," + 
				"                    \"claimSource\": \""+data.claimSource()+"\"," + 
				"                    \"ccrName\": \""+data.ccrName()+"\"," + 
				"                    \"resolutionCode\": \""+data.resolutionCode()+"\"," + 
				"                    \"assignee\": \""+data.assignee+"\"," + 
				"                    \"clientID\": \""+data.clientID14()+"\"," + 
				"                    \"clientName\": \""+ data.clientName() +"\"," + 
				"                    \"customerID\": \""+data.customerID+"\"," + 
				"                    \"personFirstName\": \""+data.personFirstName()+"\"," + 
				"                    \"personLastName\": \""+data.personLastName()+"\"," + 
				"                    \"validId\": \""+data.validId()+"\"," + 
				"                    \"contractDetails\": {\r\n" + 
				"                                \"contractNumber\": \""+data.contractNumber+"\"," + 
				"                                \"clientTransactionNumber\": \""+ data.clientTransactionNumber +"\"," + 
				"                                \"warrantySku\": \""+ data.warrantySku()+"\"," + 
				"                                    \"warrantyPriceHigh\": \""+data.warranty_price_high+"\"," + 
				"                                    \"warrantyPriceLow\": \""+ data.warranty_price_low +"\"," + 
				"                                    \"programType\": \""+ data.program_Type_rule14()+"\"," + 
				"                                    \"contractCreateDt\": \""+data.contractCreateDt+"\"," + 
				"                                    \"contractCreateChannel\": \""+ data.contractCreateChannel()+"\"," + 
				"                                    \"contractCreatedBy\": \""+ data.contractCreatedBy()+"\"," + 
				"                                    \"contractBrowserFingerPrint\": \""+ data.contractBrowserFingerPrint()+"\"," + 
				"                                    \"receiptFlag\": \""+data.receiptFlag()+"\"" + 
				"                    },\r\n" + 
				"                    \"productDetails\": {\r\n" + 
				"                                                \"instanceID\": \""+data.instanceID()+"\"," + 
				"                                                \"bulkyFlag\": \""+data.bulkyFlag()+"\"," + 
				"                                                \"product\": \""+ data.product() +"\"," + 
				"                                                \"make\": \""+ data.make()+"\"," + 
				"                                                \"category\": \""+ data.category()+"\"," + 
				"                                                \"type\": \""+data.type()+"\"," + 
				"                                                \"productPurchaseDt\": \""+data.productPurchaseDt+"\"," + 
				"                                                \"model\": \""+data.model()+"\"," + 
				"                                                \"serial\": \""+ data.serial()+"\"," + 
				"                                                \"productDescription\": \""+ data.productDescription()+"\"," + 
				"                                                \"purchasePrice\": \""+ data.purchasePrice+"\"" + 
				"                    },\r\n" + 
				"                    \"paymentDetails\" : {\r\n" + 
				"                                                \"fulfillmentTransactionId\": \""+data.fulfillmentTransactionId+"\"," + 
				"                                                \"authType\": \""+data.authType()+"\"," + 
				"                                                \"authStatus\": \""+ data.authStatus()+"\"," + 
				"                                                \"totalAuthAmount\": \""+ data.totalAuthAmount+"\"," + 
				"                                                \"pEBOOriginalPrice\": \""+ data.pEBOOriginalPrice+"\"," + 
				"                                                \"pEBOOfferedPrice\": \""+data.pEBOOfferedPrice+"\"," + 
				"                                                \"pEBOOverrideFlag\": \""+ data.pEBOOverrideFlag()+"\"" + 
				"                    },\r\n" + 
				"                                \"scanAddress\": {\r\n" + 
				"                                \"geoID\": \""+data.geoID()+"\"," + 
				"                                \"addressId\": \""+ data.addressId()+"\"," + 
				"                                \"address1\": \""+ data.address1()+"\"," + 
				"                                \"address2\": \""+data.address2()+"\"," + 
				"                                \"address3\": \""+ data.address3()+"\"," + 
				"                                \"address4\": \""+ data.address4()+"\"," + 
				"                                                \"city\": \""+ data.city()+"\"," + 
				"                                                \"province\": \""+ data.province()+"\"," + 
				"                                                \"state\": \""+data.state()+"\"," + 
				"                                                \"postalCode\": \""+data.postalCode()+"\"," + 
				"                                                \"country\": \""+data.country()+"\"," + 
				"                                                \"latitude\": \""+data.latitude()+"\"," + 
				"                                                \"longitude\": \""+data.longitude()+"\"," + 
				"                                                \"addressOverrideFlag\": \""+data.addressOverrideFlag()+"\"" + 
				"                    },\r\n" + 
				"                    \"labelDetails\": {\r\n" + 
				"                                \"labelType\": \""+data.labelType()+"\"," + 
				"                                \"labelDate\": \""+data.labelDate+"\"," + 
				"                                \"trackingNumber\": \""+data.trackingNumber()+"\"" + 
				"                    },\r\n" + 
				"                    \"originScanDetails\": {\r\n" + 
				"                                \"trackingNumber\": \""+data.trackingNumber()+"\"," + 
				"                                \"scanDate\": \""+data.scanDate+"\"" + 
				"                    },\r\n" + 
				"                    \"salvageScanDetails\": {\r\n" + 
				"                                \"trackingNumber\": \""+data.trackingNumber()+"\"," + 
				"                                \"scanStatus\": \""+data.scanStatus()+"\"," + 
				"                                \"scanDate\": \""+data.scanDate+"\"" + 
				"                    },\r\n" + 
				"                    \"webID\": \""+data.webID()+"\"," + 
				"                    \"iPAddress\": \""+data.iPAddress()+"\"," + 
				"                    \"webSessionId\": \""+data.webSessionId()+"\"," + 
				"                    \"ctiPhoneNumber\": \""+data.ctiPhoneNumber+"\"," + 
				"                    \"inboundPhoneNumber\": \""+data.inboundPhoneNumber+"\"," + 
				"                    \"primaryPhoneNumber\": \""+data.primaryPhoneNumber+"\"," + 
				"                    \"emailAddress\": \""+data.emailAddress()+"\"" + 
				"                }\r\n" + 
				"}\r\n" + 
				"")
		.when()
		.post("https://rtm-frmjs-dl-vip1.use1.dev.aws.asurion.net/frauddetection/v1/fraudcheck/")
		.then().log().body()
		.statusCode(200)
		.contentType(ContentType.JSON);
        
        
        String actionCode = response.extract().path("ResponseBody.actions[0].ActionCode");
   	    Assert.assertEquals(actionCode, "RCPT REQ");
  
	}	    
	
	
	
	
	

	@Test
	public void FRAUD_CHECK_API_TEST_RULE15() throws Exception {
		
	    
        ValidatableResponse response = given()
		.config(RestAssured.config().sslConfig(new SSLConfig().relaxedHTTPSValidation()))
		.contentType(ContentType.JSON)
		.body("{\r\n" + 
				"                \"RequestBody\": {\"incidentID\": \""+ data.incidentID + "\"," + 
				"                    \"incidentNumber\": \"" + data.incidentNumber+ "\"," + 
				"                    \"requestingChannel\": \"" +data.requestingChannel()+ "\"," + 
				"                    \"serviceRequestStartDate\": \""+data.serviceRequestStartDate+"\"," + 
				"                    \"serviceRequestType\": \""+ data.serviceRequestType()+ "\"," + 
				"                    \"serviceRequestStatus\": \""+ data.serviceRequestStatus()+"\"," + 
				"                    \"serviceFlag\": \""+data.serviceFlag()+"\"," + 
				"                    \"failureCode\": \""+data.failureCode()+"\"," + 
				"                    \"failureDate\": \""+data.failureDate+"\"," + 
				"                    \"entitlementType\": \""+ data.entitlementType()+"\"," + 
				"                    \"claimSource\": \""+data.claimSource()+"\"," + 
				"                    \"ccrName\": \""+data.ccrName()+"\"," + 
				"                    \"resolutionCode\": \""+data.resolutionCode()+"\"," + 
				"                    \"assignee\": \""+data.assignee+"\"," + 
				"                    \"clientID\": \""+data.clientID15()+"\"," + 
				"                    \"clientName\": \""+ data.clientName() +"\"," + 
				"                    \"customerID\": \""+data.customerID+"\"," + 
				"                    \"personFirstName\": \""+data.personFirstName()+"\"," + 
				"                    \"personLastName\": \""+data.personLastName()+"\"," + 
				"                    \"validId\": \""+data.validId()+"\"," + 
				"                    \"contractDetails\": {\r\n" + 
				"                                \"contractNumber\": \""+data.contractNumber+"\"," + 
				"                                \"clientTransactionNumber\": \""+ data.clientTransactionNumber +"\"," + 
				"                                \"warrantySku\": \""+ data.warrantySku()+"\"," + 
				"                                    \"warrantyPriceHigh\": \""+data.warranty_price_high+"\"," + 
				"                                    \"warrantyPriceLow\": \""+ data.warranty_price_low +"\"," + 
				"                                    \"programType\": \""+ data.program_Type_rule15()+"\"," + 
				"                                    \"contractCreateDt\": \""+data.contractCreateDt+"\"," + 
				"                                    \"contractCreateChannel\": \""+ data.contractCreateChannel()+"\"," + 
				"                                    \"contractCreatedBy\": \""+ data.contractCreatedBy()+"\"," + 
				"                                    \"contractBrowserFingerPrint\": \""+ data.contractBrowserFingerPrint()+"\"," + 
				"                                    \"receiptFlag\": \""+data.receiptFlag()+"\"" + 
				"                    },\r\n" + 
				"                    \"productDetails\": {\r\n" + 
				"                                                \"instanceID\": \""+data.instanceID()+"\"," + 
				"                                                \"bulkyFlag\": \""+data.bulkyFlag()+"\"," + 
				"                                                \"product\": \""+ data.product() +"\"," + 
				"                                                \"make\": \""+ data.make()+"\"," + 
				"                                                \"category\": \""+ data.category()+"\"," + 
				"                                                \"type\": \""+data.type()+"\"," + 
				"                                                \"productPurchaseDt\": \""+data.productPurchaseDt+"\"," + 
				"                                                \"model\": \""+data.model()+"\"," + 
				"                                                \"serial\": \""+ data.serial()+"\"," + 
				"                                                \"productDescription\": \""+ data.productDescription()+"\"," + 
				"                                                \"purchasePrice\": \""+ data.purchasePrice+"\"" + 
				"                    },\r\n" + 
				"                    \"paymentDetails\" : {\r\n" + 
				"                                                \"fulfillmentTransactionId\": \""+data.fulfillmentTransactionId+"\"," + 
				"                                                \"authType\": \""+data.authType()+"\"," + 
				"                                                \"authStatus\": \""+ data.authStatus()+"\"," + 
				"                                                \"totalAuthAmount\": \""+ data.totalAuthAmount+"\"," + 
				"                                                \"pEBOOriginalPrice\": \""+ data.pEBOOriginalPrice+"\"," + 
				"                                                \"pEBOOfferedPrice\": \""+data.pEBOOfferedPrice+"\"," + 
				"                                                \"pEBOOverrideFlag\": \""+ data.pEBOOverrideFlag()+"\"" + 
				"                    },\r\n" + 
				"                                \"scanAddress\": {\r\n" + 
				"                                \"geoID\": \""+data.geoID()+"\"," + 
				"                                \"addressId\": \""+ data.addressId()+"\"," + 
				"                                \"address1\": \""+ data.address1()+"\"," + 
				"                                \"address2\": \""+data.address2()+"\"," + 
				"                                \"address3\": \""+ data.address3()+"\"," + 
				"                                \"address4\": \""+ data.address4()+"\"," + 
				"                                                \"city\": \""+ data.city()+"\"," + 
				"                                                \"province\": \""+ data.province()+"\"," + 
				"                                                \"state\": \""+data.state()+"\"," + 
				"                                                \"postalCode\": \""+data.postalCode()+"\"," + 
				"                                                \"country\": \""+data.country()+"\"," + 
				"                                                \"latitude\": \""+data.latitude()+"\"," + 
				"                                                \"longitude\": \""+data.longitude()+"\"," + 
				"                                                \"addressOverrideFlag\": \""+data.addressOverrideFlag()+"\"" + 
				"                    },\r\n" + 
				"                    \"labelDetails\": {\r\n" + 
				"                                \"labelType\": \""+data.labelType()+"\"," + 
				"                                \"labelDate\": \""+data.labelDate+"\"," + 
				"                                \"trackingNumber\": \""+data.trackingNumber()+"\"" + 
				"                    },\r\n" + 
				"                    \"originScanDetails\": {\r\n" + 
				"                                \"trackingNumber\": \""+data.trackingNumber()+"\"," + 
				"                                \"scanDate\": \""+data.scanDate+"\"" + 
				"                    },\r\n" + 
				"                    \"salvageScanDetails\": {\r\n" + 
				"                                \"trackingNumber\": \""+data.trackingNumber()+"\"," + 
				"                                \"scanStatus\": \""+data.scanStatus()+"\"," + 
				"                                \"scanDate\": \""+data.scanDate+"\"" + 
				"                    },\r\n" + 
				"                    \"webID\": \""+data.webID()+"\"," + 
				"                    \"iPAddress\": \""+data.iPAddress()+"\"," + 
				"                    \"webSessionId\": \""+data.webSessionId()+"\"," + 
				"                    \"ctiPhoneNumber\": \""+data.ctiPhoneNumber+"\"," + 
				"                    \"inboundPhoneNumber\": \""+data.inboundPhoneNumber+"\"," + 
				"                    \"primaryPhoneNumber\": \""+data.primaryPhoneNumber+"\"," + 
				"                    \"emailAddress\": \""+data.emailAddress()+"\"" + 
				"                }\r\n" + 
				"}\r\n" + 
				"")
		.when()
		.post("https://rtm-frmjs-dl-vip1.use1.dev.aws.asurion.net/frauddetection/v1/fraudcheck/")
		.then().log().body()
		.statusCode(200)
		.contentType(ContentType.JSON);
        
        
        String actionCode = response.extract().path("ResponseBody.actions[0].ActionCode");
   	    Assert.assertEquals(actionCode, "RCPT REQ");
  
	}	  
	
	
	
	
	
	

	@Test
	public void FRAUD_CHECK_API_TEST_RULE16() throws Exception {
		
	    
        ValidatableResponse response = given()
		.config(RestAssured.config().sslConfig(new SSLConfig().relaxedHTTPSValidation()))
		.contentType(ContentType.JSON)
		.body("{\r\n" + 
				"                \"RequestBody\": {\"incidentID\": \""+ data.incidentID + "\"," + 
				"                    \"incidentNumber\": \"" + data.incidentNumber+ "\"," + 
				"                    \"requestingChannel\": \"" +data.requestingChannel()+ "\"," + 
				"                    \"serviceRequestStartDate\": \""+data.serviceRequestStartDate+"\"," + 
				"                    \"serviceRequestType\": \""+ data.serviceRequestType()+ "\"," + 
				"                    \"serviceRequestStatus\": \""+ data.serviceRequestStatus()+"\"," + 
				"                    \"serviceFlag\": \""+data.serviceFlag()+"\"," + 
				"                    \"failureCode\": \""+data.failureCode()+"\"," + 
				"                    \"failureDate\": \""+data.failureDate+"\"," + 
				"                    \"entitlementType\": \""+ data.entitlementType()+"\"," + 
				"                    \"claimSource\": \""+data.claimSource()+"\"," + 
				"                    \"ccrName\": \""+data.ccrName()+"\"," + 
				"                    \"resolutionCode\": \""+data.resolutionCode()+"\"," + 
				"                    \"assignee\": \""+data.assignee+"\"," + 
				"                    \"clientID\": \""+data.clientID16()+"\"," + 
				"                    \"clientName\": \""+ data.clientName() +"\"," + 
				"                    \"customerID\": \""+data.customerID+"\"," + 
				"                    \"personFirstName\": \""+data.personFirstName()+"\"," + 
				"                    \"personLastName\": \""+data.personLastName()+"\"," + 
				"                    \"validId\": \""+data.validId()+"\"," + 
				"                    \"contractDetails\": {\r\n" + 
				"                                \"contractNumber\": \""+data.contractNumber+"\"," + 
				"                                \"clientTransactionNumber\": \""+ data.clientTransactionNumber +"\"," + 
				"                                \"warrantySku\": \""+ data.warrantySku()+"\"," + 
				"                                    \"warrantyPriceHigh\": \""+data.warranty_price_high+"\"," + 
				"                                    \"warrantyPriceLow\": \""+ data.warranty_price_low +"\"," + 
				"                                    \"programType\": \""+ data.program_Type_rule16()+"\"," + 
				"                                    \"contractCreateDt\": \""+data.contractCreateDt+"\"," + 
				"                                    \"contractCreateChannel\": \""+ data.contractCreateChannel()+"\"," + 
				"                                    \"contractCreatedBy\": \""+ data.contractCreatedBy()+"\"," + 
				"                                    \"contractBrowserFingerPrint\": \""+ data.contractBrowserFingerPrint()+"\"," + 
				"                                    \"receiptFlag\": \""+data.receiptFlag()+"\"" + 
				"                    },\r\n" + 
				"                    \"productDetails\": {\r\n" + 
				"                                                \"instanceID\": \""+data.instanceID()+"\"," + 
				"                                                \"bulkyFlag\": \""+data.bulkyFlag()+"\"," + 
				"                                                \"product\": \""+ data.product() +"\"," + 
				"                                                \"make\": \""+ data.make()+"\"," + 
				"                                                \"category\": \""+ data.category()+"\"," + 
				"                                                \"type\": \""+data.type()+"\"," + 
				"                                                \"productPurchaseDt\": \""+data.productPurchaseDt+"\"," + 
				"                                                \"model\": \""+data.model()+"\"," + 
				"                                                \"serial\": \""+ data.serial()+"\"," + 
				"                                                \"productDescription\": \""+ data.productDescription()+"\"," + 
				"                                                \"purchasePrice\": \""+ data.purchasePrice+"\"" + 
				"                    },\r\n" + 
				"                    \"paymentDetails\" : {\r\n" + 
				"                                                \"fulfillmentTransactionId\": \""+data.fulfillmentTransactionId+"\"," + 
				"                                                \"authType\": \""+data.authType()+"\"," + 
				"                                                \"authStatus\": \""+ data.authStatus()+"\"," + 
				"                                                \"totalAuthAmount\": \""+ data.totalAuthAmount+"\"," + 
				"                                                \"pEBOOriginalPrice\": \""+ data.pEBOOriginalPrice+"\"," + 
				"                                                \"pEBOOfferedPrice\": \""+data.pEBOOfferedPrice+"\"," + 
				"                                                \"pEBOOverrideFlag\": \""+ data.pEBOOverrideFlag()+"\"" + 
				"                    },\r\n" + 
				"                                \"scanAddress\": {\r\n" + 
				"                                \"geoID\": \""+data.geoID()+"\"," + 
				"                                \"addressId\": \""+ data.addressId()+"\"," + 
				"                                \"address1\": \""+ data.address1()+"\"," + 
				"                                \"address2\": \""+data.address2()+"\"," + 
				"                                \"address3\": \""+ data.address3()+"\"," + 
				"                                \"address4\": \""+ data.address4()+"\"," + 
				"                                                \"city\": \""+ data.city()+"\"," + 
				"                                                \"province\": \""+ data.province()+"\"," + 
				"                                                \"state\": \""+data.state()+"\"," + 
				"                                                \"postalCode\": \""+data.postalCode()+"\"," + 
				"                                                \"country\": \""+data.country()+"\"," + 
				"                                                \"latitude\": \""+data.latitude()+"\"," + 
				"                                                \"longitude\": \""+data.longitude()+"\"," + 
				"                                                \"addressOverrideFlag\": \""+data.addressOverrideFlag()+"\"" + 
				"                    },\r\n" + 
				"                    \"labelDetails\": {\r\n" + 
				"                                \"labelType\": \""+data.labelType()+"\"," + 
				"                                \"labelDate\": \""+data.labelDate+"\"," + 
				"                                \"trackingNumber\": \""+data.trackingNumber()+"\"" + 
				"                    },\r\n" + 
				"                    \"originScanDetails\": {\r\n" + 
				"                                \"trackingNumber\": \""+data.trackingNumber()+"\"," + 
				"                                \"scanDate\": \""+data.scanDate+"\"" + 
				"                    },\r\n" + 
				"                    \"salvageScanDetails\": {\r\n" + 
				"                                \"trackingNumber\": \""+data.trackingNumber()+"\"," + 
				"                                \"scanStatus\": \""+data.scanStatus()+"\"," + 
				"                                \"scanDate\": \""+data.scanDate+"\"" + 
				"                    },\r\n" + 
				"                    \"webID\": \""+data.webID()+"\"," + 
				"                    \"iPAddress\": \""+data.iPAddress()+"\"," + 
				"                    \"webSessionId\": \""+data.webSessionId()+"\"," + 
				"                    \"ctiPhoneNumber\": \""+data.ctiPhoneNumber+"\"," + 
				"                    \"inboundPhoneNumber\": \""+data.inboundPhoneNumber+"\"," + 
				"                    \"primaryPhoneNumber\": \""+data.primaryPhoneNumber+"\"," + 
				"                    \"emailAddress\": \""+data.emailAddress()+"\"" + 
				"                }\r\n" + 
				"}\r\n" + 
				"")
		.when()
		.post("https://rtm-frmjs-dl-vip1.use1.dev.aws.asurion.net/frauddetection/v1/fraudcheck/")
		.then().log().body()
		.statusCode(200)
		.contentType(ContentType.JSON);
        
        
        String actionCode = response.extract().path("ResponseBody.actions[0].ActionCode");
   	    Assert.assertEquals(actionCode, "RCPT REQ");
  
	}	    
	
	
	
	

	@Test
	public void FRAUD_CHECK_API_TEST_RULE17() throws Exception {
		
	    
        ValidatableResponse response = given()
		.config(RestAssured.config().sslConfig(new SSLConfig().relaxedHTTPSValidation()))
		.contentType(ContentType.JSON)
		.body("{\r\n" + 
				"                \"RequestBody\": {\"incidentID\": \""+ data.incidentID + "\"," + 
				"                    \"incidentNumber\": \"" + data.incidentNumber+ "\"," + 
				"                    \"requestingChannel\": \"" +data.requestingChannel()+ "\"," + 
				"                    \"serviceRequestStartDate\": \""+data.serviceRequestStartDate+"\"," + 
				"                    \"serviceRequestType\": \""+ data.serviceRequestType()+ "\"," + 
				"                    \"serviceRequestStatus\": \""+ data.serviceRequestStatus()+"\"," + 
				"                    \"serviceFlag\": \""+data.serviceFlag()+"\"," + 
				"                    \"failureCode\": \""+data.failureCode()+"\"," + 
				"                    \"failureDate\": \""+data.failureDate+"\"," + 
				"                    \"entitlementType\": \""+ data.entitlementType()+"\"," + 
				"                    \"claimSource\": \""+data.claimSource()+"\"," + 
				"                    \"ccrName\": \""+data.ccrName()+"\"," + 
				"                    \"resolutionCode\": \""+data.resolutionCode()+"\"," + 
				"                    \"assignee\": \""+data.assignee+"\"," + 
				"                    \"clientID\": \""+data.clientID17()+"\"," + 
				"                    \"clientName\": \""+ data.clientName() +"\"," + 
				"                    \"customerID\": \""+data.customerID+"\"," + 
				"                    \"personFirstName\": \""+data.personFirstName()+"\"," + 
				"                    \"personLastName\": \""+data.personLastName()+"\"," + 
				"                    \"validId\": \""+data.validId()+"\"," + 
				"                    \"contractDetails\": {\r\n" + 
				"                                \"contractNumber\": \""+data.contractNumber+"\"," + 
				"                                \"clientTransactionNumber\": \""+ data.clientTransactionNumber +"\"," + 
				"                                \"warrantySku\": \""+ data.warrantySku()+"\"," + 
				"                                    \"warrantyPriceHigh\": \""+data.warranty_price_high+"\"," + 
				"                                    \"warrantyPriceLow\": \""+ data.warranty_price_low +"\"," + 
				"                                    \"programType\": \""+ data.program_Type_rule17()+"\"," + 
				"                                    \"contractCreateDt\": \""+data.contractCreateDt+"\"," + 
				"                                    \"contractCreateChannel\": \""+ data.contractCreateChannel()+"\"," + 
				"                                    \"contractCreatedBy\": \""+ data.contractCreatedBy()+"\"," + 
				"                                    \"contractBrowserFingerPrint\": \""+ data.contractBrowserFingerPrint()+"\"," + 
				"                                    \"receiptFlag\": \""+data.receiptFlag()+"\"" + 
				"                    },\r\n" + 
				"                    \"productDetails\": {\r\n" + 
				"                                                \"instanceID\": \""+data.instanceID()+"\"," + 
				"                                                \"bulkyFlag\": \""+data.bulkyFlag()+"\"," + 
				"                                                \"product\": \""+ data.product() +"\"," + 
				"                                                \"make\": \""+ data.make()+"\"," + 
				"                                                \"category\": \""+ data.category()+"\"," + 
				"                                                \"type\": \""+data.type()+"\"," + 
				"                                                \"productPurchaseDt\": \""+data.productPurchaseDt+"\"," + 
				"                                                \"model\": \""+data.model()+"\"," + 
				"                                                \"serial\": \""+ data.serial()+"\"," + 
				"                                                \"productDescription\": \""+ data.productDescription()+"\"," + 
				"                                                \"purchasePrice\": \""+ data.purchasePrice+"\"" + 
				"                    },\r\n" + 
				"                    \"paymentDetails\" : {\r\n" + 
				"                                                \"fulfillmentTransactionId\": \""+data.fulfillmentTransactionId+"\"," + 
				"                                                \"authType\": \""+data.authType()+"\"," + 
				"                                                \"authStatus\": \""+ data.authStatus()+"\"," + 
				"                                                \"totalAuthAmount\": \""+ data.totalAuthAmount+"\"," + 
				"                                                \"pEBOOriginalPrice\": \""+ data.pEBOOriginalPrice+"\"," + 
				"                                                \"pEBOOfferedPrice\": \""+data.pEBOOfferedPrice+"\"," + 
				"                                                \"pEBOOverrideFlag\": \""+ data.pEBOOverrideFlag()+"\"" + 
				"                    },\r\n" + 
				"                                \"scanAddress\": {\r\n" + 
				"                                \"geoID\": \""+data.geoID()+"\"," + 
				"                                \"addressId\": \""+ data.addressId()+"\"," + 
				"                                \"address1\": \""+ data.address1()+"\"," + 
				"                                \"address2\": \""+data.address2()+"\"," + 
				"                                \"address3\": \""+ data.address3()+"\"," + 
				"                                \"address4\": \""+ data.address4()+"\"," + 
				"                                                \"city\": \""+ data.city()+"\"," + 
				"                                                \"province\": \""+ data.province()+"\"," + 
				"                                                \"state\": \""+data.state()+"\"," + 
				"                                                \"postalCode\": \""+data.postalCode()+"\"," + 
				"                                                \"country\": \""+data.country()+"\"," + 
				"                                                \"latitude\": \""+data.latitude()+"\"," + 
				"                                                \"longitude\": \""+data.longitude()+"\"," + 
				"                                                \"addressOverrideFlag\": \""+data.addressOverrideFlag()+"\"" + 
				"                    },\r\n" + 
				"                    \"labelDetails\": {\r\n" + 
				"                                \"labelType\": \""+data.labelType()+"\"," + 
				"                                \"labelDate\": \""+data.labelDate+"\"," + 
				"                                \"trackingNumber\": \""+data.trackingNumber()+"\"" + 
				"                    },\r\n" + 
				"                    \"originScanDetails\": {\r\n" + 
				"                                \"trackingNumber\": \""+data.trackingNumber()+"\"," + 
				"                                \"scanDate\": \""+data.scanDate+"\"" + 
				"                    },\r\n" + 
				"                    \"salvageScanDetails\": {\r\n" + 
				"                                \"trackingNumber\": \""+data.trackingNumber()+"\"," + 
				"                                \"scanStatus\": \""+data.scanStatus()+"\"," + 
				"                                \"scanDate\": \""+data.scanDate+"\"" + 
				"                    },\r\n" + 
				"                    \"webID\": \""+data.webID()+"\"," + 
				"                    \"iPAddress\": \""+data.iPAddress()+"\"," + 
				"                    \"webSessionId\": \""+data.webSessionId()+"\"," + 
				"                    \"ctiPhoneNumber\": \""+data.ctiPhoneNumber+"\"," + 
				"                    \"inboundPhoneNumber\": \""+data.inboundPhoneNumber+"\"," + 
				"                    \"primaryPhoneNumber\": \""+data.primaryPhoneNumber+"\"," + 
				"                    \"emailAddress\": \""+data.emailAddress()+"\"" + 
				"                }\r\n" + 
				"}\r\n" + 
				"")
		.when()
		.post("https://rtm-frmjs-dl-vip1.use1.dev.aws.asurion.net/frauddetection/v1/fraudcheck/")
		.then().log().body()
		.statusCode(200)
		.contentType(ContentType.JSON);
        
        
        String actionCode = response.extract().path("ResponseBody.actions[0].ActionCode");
   	    Assert.assertEquals(actionCode, "RCPT REQ");
  
	}	    
	
	
	
	

	@Test
	public void FRAUD_CHECK_API_TEST_RULE18() throws Exception {
		
	    
        ValidatableResponse response = given()
		.config(RestAssured.config().sslConfig(new SSLConfig().relaxedHTTPSValidation()))
		.contentType(ContentType.JSON)
		.body("{\r\n" + 
				"                \"RequestBody\": {\"incidentID\": \""+ data.incidentID + "\"," + 
				"                    \"incidentNumber\": \"" + data.incidentNumber+ "\"," + 
				"                    \"requestingChannel\": \"" +data.requestingChannel()+ "\"," + 
				"                    \"serviceRequestStartDate\": \""+data.serviceRequestStartDate+"\"," + 
				"                    \"serviceRequestType\": \""+ data.serviceRequestType()+ "\"," + 
				"                    \"serviceRequestStatus\": \""+ data.serviceRequestStatus()+"\"," + 
				"                    \"serviceFlag\": \""+data.serviceFlag()+"\"," + 
				"                    \"failureCode\": \""+data.failureCode()+"\"," + 
				"                    \"failureDate\": \""+data.failureDate+"\"," + 
				"                    \"entitlementType\": \""+ data.entitlementType()+"\"," + 
				"                    \"claimSource\": \""+data.claimSource()+"\"," + 
				"                    \"ccrName\": \""+data.ccrName()+"\"," + 
				"                    \"resolutionCode\": \""+data.resolutionCode()+"\"," + 
				"                    \"assignee\": \""+data.assignee+"\"," + 
				"                    \"clientID\": \""+data.clientID18()+"\"," + 
				"                    \"clientName\": \""+ data.clientName() +"\"," + 
				"                    \"customerID\": \""+data.customerID+"\"," + 
				"                    \"personFirstName\": \""+data.personFirstName()+"\"," + 
				"                    \"personLastName\": \""+data.personLastName()+"\"," + 
				"                    \"validId\": \""+data.validId()+"\"," + 
				"                    \"contractDetails\": {\r\n" + 
				"                                \"contractNumber\": \""+data.contractNumber+"\"," + 
				"                                \"clientTransactionNumber\": \""+ data.clientTransactionNumber +"\"," + 
				"                                \"warrantySku\": \""+ data.warrantySku()+"\"," + 
				"                                    \"warrantyPriceHigh\": \""+data.warranty_price_high+"\"," + 
				"                                    \"warrantyPriceLow\": \""+ data.warranty_price_low +"\"," + 
				"                                    \"programType\": \""+ data.program_Type_rule18()+"\"," + 
				"                                    \"contractCreateDt\": \""+data.contractCreateDt+"\"," + 
				"                                    \"contractCreateChannel\": \""+ data.contractCreateChannel()+"\"," + 
				"                                    \"contractCreatedBy\": \""+ data.contractCreatedBy()+"\"," + 
				"                                    \"contractBrowserFingerPrint\": \""+ data.contractBrowserFingerPrint()+"\"," + 
				"                                    \"receiptFlag\": \""+data.receiptFlag()+"\"" + 
				"                    },\r\n" + 
				"                    \"productDetails\": {\r\n" + 
				"                                                \"instanceID\": \""+data.instanceID()+"\"," + 
				"                                                \"bulkyFlag\": \""+data.bulkyFlag()+"\"," + 
				"                                                \"product\": \""+ data.product() +"\"," + 
				"                                                \"make\": \""+ data.make()+"\"," + 
				"                                                \"category\": \""+ data.category()+"\"," + 
				"                                                \"type\": \""+data.type()+"\"," + 
				"                                                \"productPurchaseDt\": \""+data.productPurchaseDt+"\"," + 
				"                                                \"model\": \""+data.model()+"\"," + 
				"                                                \"serial\": \""+ data.serial()+"\"," + 
				"                                                \"productDescription\": \""+ data.productDescription()+"\"," + 
				"                                                \"purchasePrice\": \""+ data.purchasePrice+"\"" + 
				"                    },\r\n" + 
				"                    \"paymentDetails\" : {\r\n" + 
				"                                                \"fulfillmentTransactionId\": \""+data.fulfillmentTransactionId+"\"," + 
				"                                                \"authType\": \""+data.authType()+"\"," + 
				"                                                \"authStatus\": \""+ data.authStatus()+"\"," + 
				"                                                \"totalAuthAmount\": \""+ data.totalAuthAmount+"\"," + 
				"                                                \"pEBOOriginalPrice\": \""+ data.pEBOOriginalPrice+"\"," + 
				"                                                \"pEBOOfferedPrice\": \""+data.pEBOOfferedPrice+"\"," + 
				"                                                \"pEBOOverrideFlag\": \""+ data.pEBOOverrideFlag()+"\"" + 
				"                    },\r\n" + 
				"                                \"scanAddress\": {\r\n" + 
				"                                \"geoID\": \""+data.geoID()+"\"," + 
				"                                \"addressId\": \""+ data.addressId()+"\"," + 
				"                                \"address1\": \""+ data.address1()+"\"," + 
				"                                \"address2\": \""+data.address2()+"\"," + 
				"                                \"address3\": \""+ data.address3()+"\"," + 
				"                                \"address4\": \""+ data.address4()+"\"," + 
				"                                                \"city\": \""+ data.city()+"\"," + 
				"                                                \"province\": \""+ data.province()+"\"," + 
				"                                                \"state\": \""+data.state()+"\"," + 
				"                                                \"postalCode\": \""+data.postalCode()+"\"," + 
				"                                                \"country\": \""+data.country()+"\"," + 
				"                                                \"latitude\": \""+data.latitude()+"\"," + 
				"                                                \"longitude\": \""+data.longitude()+"\"," + 
				"                                                \"addressOverrideFlag\": \""+data.addressOverrideFlag()+"\"" + 
				"                    },\r\n" + 
				"                    \"labelDetails\": {\r\n" + 
				"                                \"labelType\": \""+data.labelType()+"\"," + 
				"                                \"labelDate\": \""+data.labelDate+"\"," + 
				"                                \"trackingNumber\": \""+data.trackingNumber()+"\"" + 
				"                    },\r\n" + 
				"                    \"originScanDetails\": {\r\n" + 
				"                                \"trackingNumber\": \""+data.trackingNumber()+"\"," + 
				"                                \"scanDate\": \""+data.scanDate+"\"" + 
				"                    },\r\n" + 
				"                    \"salvageScanDetails\": {\r\n" + 
				"                                \"trackingNumber\": \""+data.trackingNumber()+"\"," + 
				"                                \"scanStatus\": \""+data.scanStatus()+"\"," + 
				"                                \"scanDate\": \""+data.scanDate+"\"" + 
				"                    },\r\n" + 
				"                    \"webID\": \""+data.webID()+"\"," + 
				"                    \"iPAddress\": \""+data.iPAddress()+"\"," + 
				"                    \"webSessionId\": \""+data.webSessionId()+"\"," + 
				"                    \"ctiPhoneNumber\": \""+data.ctiPhoneNumber+"\"," + 
				"                    \"inboundPhoneNumber\": \""+data.inboundPhoneNumber+"\"," + 
				"                    \"primaryPhoneNumber\": \""+data.primaryPhoneNumber+"\"," + 
				"                    \"emailAddress\": \""+data.emailAddress()+"\"" + 
				"                }\r\n" + 
				"}\r\n" + 
				"")
		.when()
		.post("https://rtm-frmjs-dl-vip1.use1.dev.aws.asurion.net/frauddetection/v1/fraudcheck/")
		.then().log().body()
		.statusCode(200)
		.contentType(ContentType.JSON);
        
        
        String actionCode = response.extract().path("ResponseBody.actions[0].ActionCode");
   	    Assert.assertEquals(actionCode, "RCPT REQ");
  
	}	    
	
	
}
