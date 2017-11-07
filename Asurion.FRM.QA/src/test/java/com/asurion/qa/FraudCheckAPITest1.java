package com.asurion.qa;

import static com.jayway.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.config.SSLConfig;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.ValidatableResponse;

public class FraudCheckAPITest1 {
	
	@Test
	public void ASURION_FRM() {
		
		
        ValidatableResponse response = given()
		.config(RestAssured.config().sslConfig(new SSLConfig().relaxedHTTPSValidation()))
		.contentType(ContentType.JSON)
		.body("{\r\n" + 
				"        \"RequestBody\": {\r\n" + 
				"            \"incidentID\": \"105\",\r\n" + 
				"            \"incidentNumber\": \"103536341\",\r\n" + 
				"            \"requestingChannel\": \" PEGA\",\r\n" + 
				"            \"serviceRequestStartDate\": \"01/12/2017 00:00:00\",\r\n" + 
				"            \"serviceRequestType\": \" REPLREQ\",\r\n" + 
				"            \"serviceRequestStatus\": \"WORKING\",\r\n" + 
				"            \"serviceFlag\": \"Y\",\r\n" + 
				"            \"failureCode\": \"ADH\",\r\n" + 
				"            \"failureDate\": \"01/12/2017\",\r\n" + 
				"            \"entitlementType\": \"CLAIM\",\r\n" + 
				"            \"claimSource\": \"CareCentral\",\r\n" + 
				"            \"ccrName\": \"Doe, Jane\",\r\n" + 
				"            \"resolutionCode\": \"DIAG\",\r\n" + 
				"            \"assignee\": \"012121\",\r\n" + 
				"            \"clientID\": \"  723555  \",\r\n" + 
				"            \"clientName\": \"WAL-WHL-SL-VA\",\r\n" + 
				"            \"customerID\": \"12312ASDLAKSDJ1213LKJSF\",\r\n" + 
				"            \"personFirstName\": \"Samia\",\r\n" + 
				"            \"personLastName\": \"Synthia\",\r\n" + 
				"            \"validId\": \"Y\",\r\n" + 
				"            \"contractDetails\": {\r\n" + 
				"                \"contractNumber\": \"812345789\",\r\n" + 
				"                \"clientTransactionNumber\": \"012121212121\",\r\n" + 
				"                \"warrantySku\": \"WMT TV REPL 24M $100-300 P\",\r\n" + 
				"                    \"warrantyPriceHigh\": \"125\",\r\n" + 
				"                    \"warrantyPriceLow\": \"12.32\",\r\n" + 
				"                    \"programType\": \" FEE PLAN \",\r\n" + 
				"                    \"contractCreateDt\": \"12/01/2017\",\r\n" + 
				"                    \"contractCreateChannel\": \"CARECENTRAL\",\r\n" + 
				"                    \"contractCreatedBy\": \"Doe, Jane\",\r\n" + 
				"                    \"contractBrowserFingerPrint\": \"12312ASDLAKSDJ1213LKJSF\",\r\n" + 
				"                    \"receiptFlag\": \"N\"\r\n" + 
				"            },\r\n" + 
				"            \"productDetails\": {\r\n" + 
				"                        \"instanceID\": \"12312ASDLAKSDJ1213LKJSF\",\r\n" + 
				"                        \"bulkyFlag\": \"Y\",\r\n" + 
				"                        \"product\": \"LG 8500 Smart LED TV\",\r\n" + 
				"                        \"make\": \"LG Electronics\",\r\n" + 
				"                        \"category\": \"LED TV\",\r\n" + 
				"                        \"type\": \"VIDEO CONSUMER ELECTRONICS\",\r\n" + 
				"                        \"productPurchaseDt\": \"12/01/2017\",\r\n" + 
				"                        \"model\": \"MS2287\",\r\n" + 
				"                        \"serial\": \"LXPLY020449480E\",\r\n" + 
				"                        \"productDescription\": \"LG 8500 Smart LED TV\",\r\n" + 
				"                        \"purchasePrice\": \"300.00\"\r\n" + 
				"            },\r\n" + 
				"            \"paymentDetails\" : {\r\n" + 
				"                        \"fulfillmentTransactionId\": \"12312ASDLAKSDJ1213LKJSF\",\r\n" + 
				"                        \"authType\": \"auth 1\",\r\n" + 
				"                        \"authStatus\": \"1st Authorization\",\r\n" + 
				"                        \"totalAuthAmount\": \"322.7\",\r\n" + 
				"                        \"pEBOOriginalPrice\": \"3000\",\r\n" + 
				"                        \"pEBOOfferedPrice\": \"200\",\r\n" + 
				"                        \"pEBOOverrideFlag\": \"Y\"\r\n" + 
				"            },\r\n" + 
				"                \"custAddress\": {\r\n" + 
				"                \"geoID\": \"455\",\r\n" + 
				"                \"addressId\": \"12\",\r\n" + 
				"                \"address1\": \"988 1 MEMORIAL DR APT 28\",\r\n" + 
				"                \"address2\": \"2\",\r\n" + 
				"                \"address3\": \"3\",\r\n" + 
				"                \"address4\": \"4\",\r\n" + 
				"                        \"city\": \"PULASKI\",\r\n" + 
				"                        \"province\": \"province\",\r\n" + 
				"                        \"state\": \"VA\",\r\n" + 
				"                        \"postalCode\": \"24301\",\r\n" + 
				"                        \"country\": \"US\",\r\n" + 
				"                        \"latitude\": \"12\",\r\n" + 
				"                        \"longitude\": \"32\",\r\n" + 
				"                        \"addressOverrideFlag\": \"Y\"\r\n" + 
				"            },\r\n" + 
				"            \"labelDetails\": {\r\n" + 
				"                \"labelType\": \"PRINT\",\r\n" + 
				"                \"labelDate\": \"01-JAN-00\",\r\n" + 
				"                \"trackingNumber\": \"123456789012\"\r\n" + 
				"            },\r\n" + 
				"            \"originScanDetails\": {\r\n" + 
				"                \"trackingNumber\": \"123456789012\",\r\n" + 
				"                \"scanDate\": \"01-JAN-00\"\r\n" + 
				"            },\r\n" + 
				"            \"salvageScanDetails\": {\r\n" + 
				"                \"trackingNumber\": \"123456789012\",\r\n" + 
				"                \"scanStatus\": \"ABJ\",\r\n" + 
				"                \"scanDate\": \"01-JAN-00\"\r\n" + 
				"            },\r\n" + 
				"            \"webID\": \"12312ASDLAKSDJ1213LKJSF\",\r\n" + 
				"            \"iPAddress\": \"12.12.12.16\",\r\n" + 
				"            \"webSessionId\": \"12312ASDLAKSDJ12112123LKJ1SF\",\r\n" + 
				"            \"ctiPhoneNumber\": \" 3478693622 \",\r\n" + 
				"            \"inboundPhoneNumber\": \"1234567890\",\r\n" + 
				"            \"primaryPhoneNumber\": \"848771878\",\r\n" + 
				"            \"emailAddress\": \"demo@testing.com\"\r\n" + 
				"        }\r\n" + 
				"}")

		.when()
		.post("https://rtm-dev-be.us-east-1.rtmbe.use1.dev.aws.asurion.net:6301/Channels/HTTPChannel/FRMCheckDest")
		.then()
		.log()
		.body();

	
	}

}
