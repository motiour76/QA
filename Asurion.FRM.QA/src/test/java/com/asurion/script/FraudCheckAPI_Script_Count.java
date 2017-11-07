
package com.asurion.script;

import static com.jayway.restassured.RestAssured.given;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.asurion.model.FraudCheckAPI_Model;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.config.SSLConfig;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.ValidatableResponse;

public class FraudCheckAPI_Script_Count {
	

	FraudCheckAPI_Model data = new FraudCheckAPI_Model();
	
	@Test
	public void FRAUD_CHECK_API_TEST_RULE1() throws Exception {
		
		System.out.println(data.incidentID());
		
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
				"  \"RequestBody\": {\"incidentID\": \""+ data.incidentID() + "\"," + 
				"                    \"incidentNumber\": \"" + data.incidentNumber()+ "\"," + 
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
	    .post(" https://l7-api.use1.sqa.aws.asurion.net:8443/fraudmanagement/frauddetection/v1/fraudcheck")
		//.post("https://rtm-frmjs-dl-vip1.use1.dev.aws.asurion.net/frauddetection/v1/fraudcheck/")
	    //.post("https://rtm-sqa-be.us-east-1.rtmbe.use1.sqa.aws.asurion.net:6301/Channels/HTTPChannel/FRMCheckDest")
		//.post("https://rtm-frmjs-sq-vip1.use1.sqa.aws.asurion.net/frauddetection/v1/fraudcheck")
		//.post("https://rtm-sqa-be.us-east-1.rtmbe.use1.sqa.aws.asurion.net:6301/Channels/HTTPChannel/FRMCheckDest")

		.then().log().body()
		.statusCode(200)
		.contentType(ContentType.JSON);
        
   
       
       //================
       
   	String url = "jdbc:mysql://rtm-qa-aur-frm-db.use1.sqa.aws.asurion.net:3306/QAFRMRTM";
	String user = "motiour.rahman";
	String password = "October2017_Reset#123";
	Connection myConn = null;
	Statement myStmt = null;
	ResultSet myRs = null;
	try {
		// 1. Get a connection to database
		myConn = DriverManager.getConnection(url, user, password);
		// 2. Create a statement
		myStmt = myConn.createStatement();

		// 3. Execute SQL query

		myRs = myStmt.executeQuery("SELECT FRAUD_ACTION_CODE, DECISION_RULE_ID, DECISION_TABLE_NAME FROM QAFRMRTM.FRAUD_ACTION where SERVICE_REQUEST_NBR = '3123123' and DECISION_TABLE_NAME = 'AddressMatch';");
		// 4. Process the result set
		while (myRs.next()) {
		
			
			System.out.println("Decision Table  Name is: " + myRs.getString("DECISION_TABLE_NAME") 
			  + " , "+ "  ActionCode is : " +myRs.getString("FRAUD_ACTION_CODE") + " , " + 
					"Rule Id is: "  + myRs.getInt("DECISION_RULE_ID"));

			String RuleName = myRs.getString("DECISION_TABLE_NAME");
			Assert.assertEquals(RuleName, "AddressMatch");
			
			String ActionCode = myRs.getString("FRAUD_ACTION_CODE");
			Assert.assertEquals(ActionCode, "SALV CONF");

			int RuleId = myRs.getInt("DECISION_RULE_ID");
			Assert.assertEquals(RuleId, 12);
			

		}
	} catch (Exception exc) {
		exc.printStackTrace();
	} finally {
		if (myRs != null) {
			myRs.close();
		}

		if (myStmt != null) {
			myStmt.close();
		}

		if (myConn != null) {
			myConn.close();
		}
	}
}

	    

	}	    
	
	
	 


