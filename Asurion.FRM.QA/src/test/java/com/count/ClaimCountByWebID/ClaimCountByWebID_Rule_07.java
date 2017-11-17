package com.count.ClaimCountByWebID;



import static com.jayway.restassured.RestAssured.given;
import org.testng.Assert;
import org.testng.annotations.Test;
//import com.asurion.CountComputationTest.AddressToConsumerComparison;
import com.asurion.model.FraudCheckAPI_Model;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.config.SSLConfig;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.ValidatableResponse;

public class ClaimCountByWebID_Rule_07 {
	
	public int counter = 0;
	public int numberOfTimes =4;
	public String serviceRequestNbr;
	
	

	@Test
	public  void ClaimCountByTransactionNumber_Rule_01() throws Exception {
		FraudCheckAPI_Model data = new FraudCheckAPI_Model();
        ValidatableResponse response = given()
		.config(RestAssured.config().sslConfig(new SSLConfig().relaxedHTTPSValidation()))
		.contentType(ContentType.JSON)
		.header("Asurion-client", "Walmart")
		.header("Asurion-apikey", "l7xx4617a5deafbb463fbca0349989208389")
		.header("Asurion-correlationid", "6478623487012")
		.header("Content-Type", "application/json")
		.header("Accept", "application/json")
		//.header("Authorization", "Basic c3ZjLlVTLWQtTEFZNy1SZWFkOnFOQmpkMDJtJCFiRQ==")
		.auth().preemptive().basic("svc.US-q-FRM-READ", "0QxqCc1H2y7DyJ5")

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
				"                    \"clientID\": \""+data.clientID_Blank()+"\"," + 
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
				"                                    \"programType\": \""+ data.program_Type_BUY_BACK()+"\"," + 
				"                                    \"contractCreateDt\": \""+data.contractCreateDt+"\"," + 
				"                                    \"contractCreateChannel\": \""+ data.contractCreateChannel()+"\"," + 
				"                                    \"contractCreatedBy\": \""+ data.contractCreatedBy()+"\"," + 
				"                                    \"contractBrowserFingerPrint\": \""+ data.contractBrowserFingerPrint()+"\"," + 
				"                                    \"receiptFlag\": \""+data.receiptFlag()+"\"" + 
				"                    },\r\n" + 
				"                    \"productDetails\": {\r\n" + 
				"                                                \"instanceID\": \""+data.instanceID()+"\"," + 
				"                                                \"bulkyFlag\": \""+data.bulkyFlagNO()+"\"," + 
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
				"                                \"locationID\": \""+ data.addressId()+"\"," + 
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
					"                                \"serviceAddress\": {\r\n" + 
					"                                \"geoID\": \""+data.geoID()+"\"," + 
					"                                \"locationID\": \""+ data.addressId()+"\"," + 
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
					"                                \"storeAddress\": {\r\n" + 
					"                                \"locationID\": \""+data.geoID()+"\"," + 
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
					"                                \"custAddress\": {\r\n" + 
					"                                \"geoID\": \""+data.geoID()+"\"," + 
					"                                \"locationID\": \""+ data.addressId()+"\"," + 
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
		.post(" https://l7-api.use1.sqa.aws.asurion.net:8443/fraudmanagement/frauddetection/v1/fraudcheck")
		.then().log().body()
		.statusCode(200)
		.contentType(ContentType.JSON);
      
       
       
        counter++;
        
        if (counter == numberOfTimes) {
        	serviceRequestNbr = data.incidentNumber;
        	ClaimCountByWebID claimCountByWebID = new ClaimCountByWebID();
        	claimCountByWebID.ClaimCountByWebID(serviceRequestNbr);
        	
        }else {
        	callInLoop();
        }
        
        
   
       
	}	 
	
	public  void callInLoop() throws Exception {
   
		
		if (counter != numberOfTimes && counter < numberOfTimes) {
			ClaimCountByTransactionNumber_Rule_01();
		}
		
	}
	

}
