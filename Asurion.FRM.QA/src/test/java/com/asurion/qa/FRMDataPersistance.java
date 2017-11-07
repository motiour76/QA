package com.asurion.qa;

import static com.jayway.restassured.RestAssured.given;

import org.testng.annotations.Test;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.config.SSLConfig;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.ValidatableResponse;

public class FRMDataPersistance {
	
	public String incidentID = "1002";
	public String incidentNumber = "1002";
	public String requestingChannel = "PEGA";
	public String serviceRequestType = "REPLREQ";
	public String serviceRequestStatus = "WORKING";
	public String serviceFlag = "Y";
	public String failureCode = "ADH";
	public String entitlementType = "CLAIM";
	public String claimSource = "CareCentral";
	public String ccrName = "Doe, Jane";
	public String resolutionCode = "DIAG";
	public String assignee = "012121";
	public int clientID = 123456;
	public String clientName = "012121";
	public String customerID = "12312ASDLAKSDJ1213LKJSF";
	public String personFirstName = "Doe";
	public String personLastName = "Doe";
	public String validId = "Y";
	public long contractNumber = 3479693622l;
	public String clientTransactionNumber = "012121212121";
	public String warrantySku = "WMT TV REPL 24M $100-300 P";
	public double warranty_price_high = 125;
	public double warranty_price_low = 15;
	public String program_Type_rule1 = "FEE PLAN";
	public String contractCreateChannel = "CARECENTRAL"; 
	public String contractCreatedBy = "DOE JOHNS"; 
	public String contractBrowserFingerPrint = "12312ASDLAKSDJ1213LKJSF";
	public String receiptFlag = "N";
	public String instanceID = "12312ASDLAKSDJ1213LKJSF";
	public String bulkyFlag = "Y";
	public String product = "LG 8500 Smart LED TV";
	public String make = "LG Electronics";
	public String category = "LED TV";
	public String type = "VIDEO CONSUMER ELECTRONIC";
	public String model = "MS2287";
	public String serial = "LXPLY020449480E";
	public String productDescription = "LG 8500 Smart LED TV";
	public double purchasePrice = 300;
	public String fulfillmentTransactionId = "12312ASDLAKSDJ1213LKJSF";
	public String authType = "auth 1";
	public String authStatus = "1st Authorization";
	public double totalAuthAmount = 300.7;
	public double pEBOOriginalPrice = 3000;
	public double pEBOOfferedPrice = 200;
	public String pEBOOverrideFlag = "Y";
	public long geoID = 121212l;
	public long addressId = 13332l;
	public String address1 = "988 MEMORIAL DR APT 28";
	public String address2 = "Midland pkway";
	public String address3 = "1G";
	public String address4 = "2P";
	public String city = "2P";
	public String province = "PULASKI";
	public String state = "VA";
	public String postalCode = "11435";
	public String country = "US";
	public long latitude = 12l;
	public long longitude = 32l;
	public String addressOverrideFlag = "Y";
	
	public String labelType = "PRINT";
	public String trackingNumber = "123456789012";
	public String scanStatus = "ABJ";

	public String webID = "ABJ";
	public String iPAddress = "12.12.12.15";
	public String webSessionId = "12312ASDLAKSDJ12112123LKJ1SF";
	public long ctiPhoneNumber = 3479769877l;
	public long inboundPhoneNumber = 3479769877l;
	public long primaryPhoneNumber = 3479769877l;
	public String emailAddress = "de1o@testing.com";

	@Test
	public void ASURION_FRAUD_API() {
		
		
        ValidatableResponse response = given()
		.config(RestAssured.config().sslConfig(new SSLConfig().relaxedHTTPSValidation()))
		.contentType(ContentType.JSON)
		.body("{\r\n" + 
				"                \"RequestBody\": {\"incidentID\": \""+ incidentID + "\"," + 
				"                    \"incidentNumber\": \"" +incidentNumber+ "\"," + 
				"                    \"requestingChannel\": \"" +requestingChannel+ "\"," + 
				"                    \"serviceRequestStartDate\": \"01/12/2017 00:00:00\"," + 
				"                    \"serviceRequestType\": \""+ serviceRequestType+ "\"," + 
				"                    \"serviceRequestStatus\": \""+ serviceRequestStatus+"\"," + 
				"                    \"serviceFlag\": \""+serviceFlag+"\"," + 
				"                    \"failureCode\": \""+failureCode+"\"," + 
				"                    \"failureDate\": \"01/12/2017\"," + 
				"                    \"entitlementType\": \""+ entitlementType+"\"," + 
				"                    \"claimSource\": \""+claimSource+"\"," + 
				"                    \"ccrName\": \""+ccrName+"\"," + 
				"                    \"resolutionCode\": \""+resolutionCode+"\"," + 
				"                    \"assignee\": \""+assignee+"\"," + 
				"                    \"clientID\": \""+clientID+"\"," + 
				"                    \"clientName\": \""+ clientName +"\"," + 
				"                    \"customerID\": \""+customerID+"\"," + 
				"                    \"personFirstName\": \""+personFirstName+"\"," + 
				"                    \"personLastName\": \""+personLastName+"\"," + 
				"                    \"validId\": \""+validId+"\"," + 
				"                    \"contractDetails\": {\r\n" + 
				"                                \"contractNumber\": \""+contractNumber+"\"," + 
				"                                \"clientTransactionNumber\": \""+ clientTransactionNumber +"\"," + 
				"                                \"warrantySku\": \""+ warrantySku+"\"," + 
				"                                    \"warrantyPriceHigh\": \""+warranty_price_high+"\"," + 
				"                                    \"warrantyPriceLow\": \""+warranty_price_low +"\"," + 
				"                                    \"programType\": \""+program_Type_rule1+"\"," + 
				"                                    \"contractCreateDt\": \"12/01/2017\"," + 
				"                                    \"contractCreateChannel\": \""+contractCreateChannel+"\"," + 
				"                                    \"contractCreatedBy\": \""+contractCreatedBy+"\"," + 
				"                                    \"contractBrowserFingerPrint\": \""+contractBrowserFingerPrint+"\"," + 
				"                                    \"receiptFlag\": \""+receiptFlag+"\"" + 
				"                    },\r\n" + 
				"                    \"productDetails\": {\r\n" + 
				"                                                \"instanceID\": \""+instanceID+"\"," + 
				"                                                \"bulkyFlag\": \""+bulkyFlag+"\"," + 
				"                                                \"product\": \""+product +"\"," + 
				"                                                \"make\": \""+make+"\"," + 
				"                                                \"category\": \""+category+"\"," + 
				"                                                \"type\": \""+type+"\"," + 
				"                                                \"productPurchaseDt\": \"12/01/2017\"," + 
				"                                                \"model\": \""+model+"\"," + 
				"                                                \"serial\": \""+serial+"\"," + 
				"                                                \"productDescription\": \""+productDescription+"\"," + 
				"                                                \"purchasePrice\": \""+purchasePrice+"\"" + 
				"                    },\r\n" + 
				"                    \"paymentDetails\" : {\r\n" + 
				"                                                \"fulfillmentTransactionId\": \""+fulfillmentTransactionId+"\"," + 
				"                                                \"authType\": \""+authType+"\"," + 
				"                                                \"authStatus\": \""+authStatus+"\"," + 
				"                                                \"totalAuthAmount\": \""+totalAuthAmount+"\"," + 
				"                                                \"pEBOOriginalPrice\": \""+pEBOOriginalPrice+"\"," + 
				"                                                \"pEBOOfferedPrice\": \""+pEBOOfferedPrice+"\"," + 
				"                                                \"pEBOOverrideFlag\": \""+pEBOOverrideFlag+"\"" + 
				"                    },\r\n" + 
				"                                \"scanAddress\": {\r\n" + 
				"                                \"geoID\": \""+geoID+"\"," + 
				"                                \"addressId\": \""+addressId+"\"," + 
				"                                \"address1\": \""+address1+"\"," + 
				"                                \"address2\": \""+address2+"\"," + 
				"                                \"address3\": \""+address3+"\"," + 
				"                                \"address4\": \""+address4+"\"," + 
				"                                                \"city\": \""+city+"\"," + 
				"                                                \"province\": \""+province+"\"," + 
				"                                                \"state\": \""+state+"\"," + 
				"                                                \"postalCode\": \""+postalCode+"\"," + 
				"                                                \"country\": \""+country+"\"," + 
				"                                                \"latitude\": \""+latitude+"\"," + 
				"                                                \"longitude\": \""+longitude+"\"," + 
				"                                                \"addressOverrideFlag\": \""+addressOverrideFlag+"\"" + 
				"                    },\r\n" + 
				"                    \"labelDetails\": {\r\n" + 
				"                                \"labelType\": \""+labelType+"\"," + 
				"                                \"labelDate\": \"01-JAN-00\"," + 
				"                                \"trackingNumber\": \""+trackingNumber+"\"" + 
				"                    },\r\n" + 
				"                    \"originScanDetails\": {\r\n" + 
				"                                \"trackingNumber\": \""+trackingNumber+"\"," + 
				"                                \"scanDate\": \"01-JAN-00\"" + 
				"                    },\r\n" + 
				"                    \"salvageScanDetails\": {\r\n" + 
				"                                \"trackingNumber\": \""+trackingNumber+"\"," + 
				"                                \"scanStatus\": \""+scanStatus+"\"," + 
				"                                \"scanDate\": \"01-JAN-00\"" + 
				"                    },\r\n" + 
				"                    \"webID\": \""+webID+"\"," + 
				"                    \"iPAddress\": \""+iPAddress+"\"," + 
				"                    \"webSessionId\": \""+iPAddress+"\"," + 
				"                    \"ctiPhoneNumber\": \""+ctiPhoneNumber+"\"," + 
				"                    \"inboundPhoneNumber\": \""+inboundPhoneNumber+"\"," + 
				"                    \"primaryPhoneNumber\": \""+primaryPhoneNumber+"\"," + 
				"                    \"emailAddress\": \""+emailAddress+"\"" + 
				"                }\r\n" + 
				"}\r\n" + 
				"")
		.when()
		.post("https://rtm-frm-dl-vip1.use1.dev.aws.asurion.net/frauddetection/v1/fraudcheck/")
		.then().log().body()
		.statusCode(200)
		.contentType(ContentType.JSON);

	}

}
