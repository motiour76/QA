package com.asurion.script;


import static com.jayway.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.config.SSLConfig;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.ValidatableResponse;

public class JunitTestQA {
	
	
	
	
	@Test
	public void FRAUD_CHECK_API_TEST_RULE1() throws Exception {
		
		System.out.println("{\r\n" + 
				"  \"FRMCheck\" : {\r\n" + 
				"    \"ClaimDetailsAction\" : {\r\n" + 
				"      \"Service_Request_Id\" : \"444411113\",\r\n" + 
				"      \"Service_Request_Nbr\" :\"444411113\",\r\n" + 
				"      \"Svc_Req_Start_Date\" : \"2017-07-20T12:20:18.804-04:00\",\r\n" + 
				"      \"Svc_Req_Type_Code\" : \"REPLREQ\",\r\n" + 
				"      \"Svc_Req_Status_Code\" : \"WORKING\",\r\n" + 
				"      \"Service_Flag\" : true,\r\n" + 
				"      \"Failure_Code\" : \"ADH\",\r\n" + 
				"      \"Failure_Date\" : \"2017-09-20T12:20:18.804-04:00\",\r\n" + 
				"      \"Entitlement_Type_Code\" : \"CLAIM\",\r\n" + 
				"      \"Source\" : \"CareCentral\",\r\n" + 
				"      \"Channel_Name\" : \"Agent\",\r\n" + 
				"      \"Agent_Name\" : \"Doe, Jane\",\r\n" + 
				"      \"Claim_State_Province\" : \"VA\",\r\n" + 
				"      \"Resolution_Code\" : \"BYOT\",\r\n" + 
				"      \"Assignee\" : \"112951\",\r\n" + 
				"      \"Contract_Nbr\" : \"123456789012\",\r\n" + 
				"      \"Client_Transaction_Nbr\" : \"123456789012\",\r\n" + 
				"      \"Warranty_SKU\" : \"WMT TV REPL 24M $100-300 P\",\r\n" + 
				"      \"Warranty_Price_Low\" : 4.8,\r\n" + 
				"      \"Warranty_Price_High\" : 667.8,\r\n" + 
				"      \"Purchase_Price\" : 500.00,\r\n" + 
				"      \"Contract_Create_Dt\" : \"2017-07-20T12:20:18.804-04:00\",\r\n" + 
				"      \"Contract_Create_Channel\" : \"CARECENTRAL\",\r\n" + 
				"      \"Contract_Created_By\" : \"Doe, Jane\",\r\n" + 
				"      \"Contract_Browser_Finger_Print\" : \"12312ASDLAKSDJ1213LKJSF\",\r\n" + 
				"      \"Program_Type\" : \"POSTPAID SERVICE\",\r\n" + 
				"      \"Receipt_Status_Code\" : \"N\",\r\n" + 
				"      \"Client_Id\" : \"123456789\",\r\n" + 
				"      \"Client_Name\" : \"WAL-WHL-SL-VA\",\r\n" + 
				"      \"Cust_Store_Dist\" : 56.0,\r\n" + 
				"      \"Product_Id\" : \"12312ASDLAKSDJ1213LKJSF\",\r\n" + 
				"      \"Is_Bulky\" : \"Y\",\r\n" + 
				"      \"Product_Name\" : \"TV\",\r\n" + 
				"      \"Make\" : \"LG\",\r\n" + 
				"      \"Product_Category\" : \"TV\",\r\n" + 
				"      \"Product_Type\" : \"DEVICE\",\r\n" + 
				"      \"Product_Purchase_Dt\" : \"2017-01-20T12:20:18.804-04:00\",\r\n" + 
				"      \"Model\" : \"MS2287\",\r\n" + 
				"      \"Serial\" : \"LXPLY020449480E\",\r\n" + 
				"      \"Product_Description\" : \"LG 8500 Smart LED TV\",\r\n" + 
				"      \"Client_Prod_Description\" : \"LG 8500 Smart LED TV\",\r\n" + 
				"      \"Customer_Id\" : \"787897\",\r\n" + 
				"      \"Customer_First_Name\" : \"JOHN\",\r\n" + 
				"      \"Customer_Last_Name\" : \"DOE\",\r\n" + 
				"      \"Valid_Id_Ind\" : false,\r\n" + 
				"      \"Fulfillment_Transaction_Id\" : \"12312ASDLAKSDJ1213LKJSF\",\r\n" + 
				"      \"Auth_Type\" : \"AUTH 1\",\r\n" + 
				"      \"Auth_Status\" : \"1st Authorization\",\r\n" + 
				"      \"Total_Auth_Amount\" : \"456.9\",\r\n" + 
				"      \"PEBO_Original_Price\" : \"500.9\",\r\n" + 
				"      \"PEBO_Offered_Price\" : \"600.9\",\r\n" + 
				"      \"PEBO_Override_Flag\" : true,\r\n" + 
				"      \"Created_Date\" : \"2017-07-20T12:20:18.804-04:00\",\r\n" + 
				"      \"Browser_Finger_Print\" : \"12312ASDLAKSDJ1213LKJSF\",\r\n" + 
				"      \"Automatic_Nbr_Id\" : \"123456789012\",\r\n" + 
				"      \"Dialed_Phone_Nbr\" : \"123456789012\",\r\n" + 
				"      \"Primary_Phone_Nbr\" : \"123456789012\",\r\n" + 
				"      \"Address_Usage\" : \"CUST\",\r\n" + 
				"      \"Address_Override_Flag\" : true,\r\n" + 
				"      \"Valid_Address\" : \"N\",\r\n" + 
				"      \"Is_FL\" : \"N\"\r\n" + 
				"    },\r\n" + 
				"    \"ScanDetailsAction\" : {\r\n" + 
				"      \"Service_Request_Id\" : \"12312ASDLAKSDJ1213LKJSF\",\r\n" + 
				"      \"Service_Request_Nbr\" : \"123456789012\",\r\n" + 
				"      \"Shipment_Tracking_Nbr\" : \"123456789012\",\r\n" + 
				"      \"Label_Type\" : \"MAIL\",\r\n" + 
				"      \"Label_Date\" : \"2017-07-20T13:18:18.964-04:00\",\r\n" + 
				"      \"Origin_Tracking_Nbr\" : \"123456789012\",\r\n" + 
				"      \"Scan_Distance\" : 12.0,\r\n" + 
				"      \"Origin_Scan_Date\" : \"2017-07-20T13:18:18.964-04:00\",\r\n" + 
				"      \"Salvage_Tracking_Nbr\" : \"123456789012\",\r\n" + 
				"      \"Salvage_Scan_Status\" : \"ABJ\",\r\n" + 
				"      \"Salvage_Scan_Date\" : \"2017-07-20T13:18:18.964-04:00\",\r\n" + 
				"      \"Created_Date\" : \"2017-07-20T13:18:18.964-04:00\",\r\n" + 
				"      \"Updated_Date\" : \"2017-07-20T13:18:18.964-04:00\"\r\n" + 
				"    },\r\n" + 
				"    \"CountsComputations\" : [ {\r\n" + 
				"      \"Name\" : \"CustomerIDByTransactionNumber\",\r\n" + 
				"      \"CountType\" : \"CustomerID\",\r\n" + 
				"      \"Count\" : 15,\r\n" + 
				"      \"Service_Request_Id\" : \"12312ASDLAKSDJ1213LKJSF\",\r\n" + 
				"      \"Service_Request_Nbr\" : \"123456789012\",\r\n" + 
				"      \"DTName\" : \"CustomerIDByTransactionNumber\"\r\n" + 
				"    }, {\r\n" + 
				"       \r\n" + 
				"      \"Name\" : \"CustomersByIPaddress\",\r\n" + 
				"      \"CountType\" : \"CustomerID\",\r\n" + 
				"      \"Count\" : 15,\r\n" + 
				"      \"Service_Request_Id\" : \"12312ASDLAKSDJ1213LKJSF\",\r\n" + 
				"      \"Service_Request_Nbr\" : \"123456789012\",\r\n" + 
				"      \"DTName\" : \"CustomersByIPaddress\"\r\n" + 
				"    }, {\r\n" + 
				"      \"Name\" : \"EmailIDByTransactionNumber\",\r\n" + 
				"      \"CountType\" : \"EmailID\",\r\n" + 
				"      \"Count\" : 10,\r\n" + 
				"      \"Service_Request_Id\" : \"12312ASDLAKSDJ1213LKJSF\",\r\n" + 
				"      \"Service_Request_Nbr\" : \"123456789012\",\r\n" + 
				"      \"DTName\" : \"EmailIDByTransactionNumber\"\r\n" + 
				"    }, {\r\n" + 
				"       \r\n" + 
				"      \"Name\" : \"GeoIDByTransactionNumber\",\r\n" + 
				"      \"CountType\" : \"GeoID\",\r\n" + 
				"      \"Count\" : 10,\r\n" + 
				"      \"Service_Request_Id\" : \"12312ASDLAKSDJ1213LKJSF\",\r\n" + 
				"      \"Service_Request_Nbr\" : \"123456789012\",\r\n" + 
				"      \"DTName\" : \"GeoIDByTransactionNumber\"\r\n" + 
				"    }, {\r\n" + 
				"       \r\n" + 
				"      \"Name\" : \"PrimaryPhoneByConsumer\",\r\n" + 
				"      \"CountType\" : \"ConsumerNo\",\r\n" + 
				"      \"Count\" : 15,\r\n" + 
				"      \"Service_Request_Id\" : \"12312ASDLAKSDJ1213LKJSF\",\r\n" + 
				"      \"Service_Request_Nbr\" : \"123456789012\",\r\n" + 
				"      \"DTName\" : \"PrimaryPhoneByConsumer\"\r\n" + 
				"    }, {\r\n" + 
				"       \r\n" + 
				"      \"Name\" : \"PrimaryPhoneByEmailIDs\",\r\n" + 
				"      \"CountType\" : \"EmailID\",\r\n" + 
				"      \"Count\" : 20,\r\n" + 
				"      \"Service_Request_Id\" : \"12312ASDLAKSDJ1213LKJSF\",\r\n" + 
				"      \"Service_Request_Nbr\" : \"123456789012\",\r\n" + 
				"      \"DTName\" : \"PrimaryPhoneByEmailIDs\"\r\n" + 
				"       \r\n" + 
				"    }, {\r\n" + 
				"       \r\n" + 
				"      \"Name\" : \"PrimaryPhoneByGeoIDs\",\r\n" + 
				"      \"CountType\" : \"GeoID\",\r\n" + 
				"      \"Count\" : 20,\r\n" + 
				"      \"Service_Request_Id\" : \"12312ASDLAKSDJ1213LKJSF\",\r\n" + 
				"      \"Service_Request_Nbr\" : \"123456789012\",\r\n" + 
				"      \"DTName\" : \"PrimaryPhoneByGeoIDs\"\r\n" + 
				"    }, {\r\n" + 
				"       \r\n" + 
				"      \"Name\" : \"PrimaryPhoneByTransactionNumber\",\r\n" + 
				"      \"CountType\" : \"PrimaryPhone\",\r\n" + 
				"      \"Count\" : 20,\r\n" + 
				"      \"Service_Request_Id\" : \"12312ASDLAKSDJ1213LKJSF\",\r\n" + 
				"      \"Service_Request_Nbr\" : \"123456789012\",\r\n" + 
				"      \"DTName\" : \"PrimaryPhoneByTransactionNumber\"\r\n" + 
				"    }, {\r\n" + 
				"       \r\n" + 
				"      \"Name\" : \"SalvageCommentsToAddress\",\r\n" + 
				"      \"CountType\" : \"SalvageScan\",\r\n" + 
				"      \"Count\" : 20,\r\n" + 
				"      \"Service_Request_Id\" : \"12312ASDLAKSDJ1213LKJSF\",\r\n" + 
				"      \"Service_Request_Nbr\" : \"123456789012\",\r\n" + 
				"      \"DTName\" : \"SalvageCommentsToAddress\"\r\n" + 
				"    }, {\r\n" + 
				"       \r\n" + 
				"      \"Name\" : \"SalvageCommentsToANI\",\r\n" + 
				"      \"CountType\" : \"SalvageScan\",\r\n" + 
				"      \"Count\" : 20,\r\n" + 
				"      \"Service_Request_Id\" : \"12312ASDLAKSDJ1213LKJSF\",\r\n" + 
				"      \"Service_Request_Nbr\" : \"123456789012\",\r\n" + 
				"      \"DTName\" : \"SalvageCommentsToANI\"\r\n" + 
				"    }, {\r\n" + 
				"       \r\n" + 
				"      \"Name\" : \"SalvageCommentsToWebID\",\r\n" + 
				"      \"CountType\" : \"SalvageScan\",\r\n" + 
				"      \"Count\" : 20,\r\n" + 
				"      \"Service_Request_Id\" : \"12312ASDLAKSDJ1213LKJSF\",\r\n" + 
				"      \"Service_Request_Nbr\" : \"123456789012\",\r\n" + 
				"      \"DTName\" : \"SalvageCommentsToWebID\"\r\n" + 
				"    }, {\r\n" + 
				"       \r\n" + 
				"      \"Name\" : \"AddressMatch\",\r\n" + 
				"      \"CountType\" : \"SRNumber\",\r\n" + 
				"      \"Count\" : 20,\r\n" + 
				"      \"Service_Request_Id\" : \"12312ASDLAKSDJ1213LKJSF\",\r\n" + 
				"      \"Service_Request_Nbr\" : \"123456789012\",\r\n" + 
				"      \"DTName\" : \"AddressMatch\"\r\n" + 
				"    }, {\r\n" + 
				"       \r\n" + 
				"      \"Name\" : \"AddressToConsumerComparison\",\r\n" + 
				"      \"CountType\" : \"ConsumerNo\",\r\n" + 
				"      \"Count\" : 20,\r\n" + 
				"      \"Service_Request_Id\" : \"12312ASDLAKSDJ1213LKJSF\",\r\n" + 
				"      \"Service_Request_Nbr\" : \"123456789012\",\r\n" + 
				"      \"DTName\" : \"AddressToConsumerComparison\"\r\n" + 
				"    }, {\r\n" + 
				"       \r\n" + 
				"      \"Name\" : \"AddressToEmailComparison\",\r\n" + 
				"      \"CountType\" : \"EmailID\",\r\n" + 
				"      \"Count\" : 20,\r\n" + 
				"      \"Service_Request_Id\" : \"12312ASDLAKSDJ1213LKJSF\",\r\n" + 
				"      \"Service_Request_Nbr\" : \"123456789012\",\r\n" + 
				"      \"DTName\" : \"AddressToEmailComparison\"\r\n" + 
				"    }, {\r\n" + 
				"       \r\n" + 
				"      \"Name\" : \"AddressToPrimaryPhoneComparison\",\r\n" + 
				"      \"CountType\" : \"PrimaryPhone\",\r\n" + 
				"      \"Count\" : 20,\r\n" + 
				"      \"Service_Request_Id\" : \"12312ASDLAKSDJ1213LKJSF\",\r\n" + 
				"      \"Service_Request_Nbr\" : \"123456789012\",\r\n" + 
				"      \"DTName\" : \"AddressToPrimaryPhoneComparison\"\r\n" + 
				"    }, {\r\n" + 
				"       \r\n" + 
				"      \"Name\" : \"ClaimCountByFulfillmentTransactionID\",\r\n" + 
				"      \"CountType\" : \"SRNumber\",\r\n" + 
				"      \"Count\" : 20,\r\n" + 
				"      \"Service_Request_Id\" : \"12312ASDLAKSDJ1213LKJSF\",\r\n" + 
				"      \"Service_Request_Nbr\" : \"123456789012\",\r\n" + 
				"      \"DTName\" : \"ClaimCountByFulfillmentTransactionID\"\r\n" + 
				"    }, {\r\n" + 
				"       \r\n" + 
				"      \"Name\" : \"ClaimCountByTransactionNumber\",\r\n" + 
				"      \"CountType\" : \"SRNumber\",\r\n" + 
				"      \"Count\" : 20,\r\n" + 
				"      \"Service_Request_Id\" : \"12312ASDLAKSDJ1213LKJSF\",\r\n" + 
				"      \"Service_Request_Nbr\" : \"123456789012\",\r\n" + 
				"      \"DTName\" : \"ClaimCountByTransactionNumber\"\r\n" + 
				"    }, {\r\n" + 
				"       \r\n" + 
				"      \"Name\" : \"ClaimCountByWebID\",\r\n" + 
				"      \"CountType\" : \"SRNumber\",\r\n" + 
				"      \"Count\" : 20,\r\n" + 
				"      \"Service_Request_Id\" : \"12312ASDLAKSDJ1213LKJSF\",\r\n" + 
				"      \"Service_Request_Nbr\" : \"123456789012\",\r\n" + 
				"      \"DTName\" : \"ClaimCountByWebID\"\r\n" + 
				"    }, {\r\n" + 
				"       \r\n" + 
				"      \"Name\" : \"ClaimsByIPAddress\",\r\n" + 
				"      \"CountType\" : \"Claims\",\r\n" + 
				"      \"Count\" : 20,\r\n" + 
				"      \"Service_Request_Id\" : \"12312ASDLAKSDJ1213LKJSF\",\r\n" + 
				"      \"Service_Request_Nbr\" : \"123456789012\",\r\n" + 
				"      \"DTName\" : \"ClaimsByIPAddress\"\r\n" + 
				"    }, {\r\n" + 
				"       \r\n" + 
				"      \"Name\" : \"CountOfAddressesByIPaddress\",\r\n" + 
				"      \"CountType\" : \"GeoID\",\r\n" + 
				"      \"Count\" : 20,\r\n" + 
				"      \"Service_Request_Id\" : \"12312ASDLAKSDJ1213LKJSF\",\r\n" + 
				"      \"Service_Request_Nbr\" : \"123456789012\",\r\n" + 
				"      \"DTName\" : \"CountOfAddressesByIPaddress\"\r\n" + 
				"    }, {\r\n" + 
				"       \r\n" + 
				"      \"Name\" : \"CountOfEmailAddressesByIPaddress\",\r\n" + 
				"      \"CountType\" : \"EmailID\",\r\n" + 
				"      \"Count\" : 20,\r\n" + 
				"      \"Service_Request_Id\" : \"12312ASDLAKSDJ1213LKJSF\",\r\n" + 
				"      \"Service_Request_Nbr\" : \"123456789012\",\r\n" + 
				"      \"DTName\" : \"CountOfEmailAddressesByIPaddress\"\r\n" + 
				"    }, {\r\n" + 
				"       \r\n" + 
				"      \"Name\" : \"CourtesyRegistrationAddressCheckByClient\",\r\n" + 
				"      \"CountType\" : \"ReceiptFlag\",\r\n" + 
				"      \"Count\" : 20,\r\n" + 
				"      \"Service_Request_Id\" : \"12312ASDLAKSDJ1213LKJSF\",\r\n" + 
				"      \"Service_Request_Nbr\" : \"123456789012\",\r\n" + 
				"      \"DTName\" : \"CourtesyRegistrationAddressCheckByClient\"\r\n" + 
				"    }, {\r\n" + 
				"       \r\n" + 
				"      \"Name\" : \"CourtesyRegistrationEmailCheckByClient\",\r\n" + 
				"      \"CountType\" : \"ReceiptFlag\",\r\n" + 
				"      \"Count\" : 20,\r\n" + 
				"      \"Service_Request_Id\" : \"12312ASDLAKSDJ1213LKJSF\",\r\n" + 
				"      \"Service_Request_Nbr\" : \"123456789012\",\r\n" + 
				"      \"DTName\" : \"CourtesyRegistrationEmailCheckByClient\"\r\n" + 
				"    }, {\r\n" + 
				"       \r\n" + 
				"      \"Name\" : \"ANIByConsumer\",\r\n" + 
				"      \"CountType\" : \"ConsumerNo\",\r\n" + 
				"      \"Count\" : 20,\r\n" + 
				"      \"Service_Request_Id\" : \"12312ASDLAKSDJ1213LKJSF\",\r\n" + 
				"      \"Service_Request_Nbr\" : \"123456789012\",\r\n" + 
				"      \"DTName\" : \"ANIByConsumer\"\r\n" + 
				"    }, {\r\n" + 
				"       \r\n" + 
				"      \"Name\" : \"ANIByEmailIDs\",\r\n" + 
				"      \"CountType\" : \"EmailID\",\r\n" + 
				"      \"Count\" : 20,\r\n" + 
				"      \"Service_Request_Id\" : \"12312ASDLAKSDJ1213LKJSF\",\r\n" + 
				"      \"Service_Request_Nbr\" : \"123456789012\",\r\n" + 
				"      \"DTName\" : \"ANIByEmailIDs\"\r\n" + 
				"    } ],\r\n" + 
				"    \"RefereceComputations\" : [ {\r\n" + 
				"       \r\n" + 
				"      \"Name\" : \"ANINegativeListCheck\",\r\n" + 
				"      \"Category\" : \"NA\",\r\n" + 
				"      \"EntityType\" : \"ANI\",\r\n" + 
				"      \"TriggerHold\" : true,\r\n" + 
				"      \"Service_Request_Id\" : \"12312ASDLAKSDJ1213LKJSF\",\r\n" + 
				"      \"Service_Request_Nbr\" : \"123456789012\",\r\n" + 
				"      \"DTName\" : \"ANINegativeListCheck\"\r\n" + 
				"    }, {\r\n" + 
				"       \r\n" + 
				"      \"Name\" : \"PrimaryPhoneNegativeListCheck\",\r\n" + 
				"      \"Category\" : \"NA\",\r\n" + 
				"      \"EntityType\" : \"PrimaryPhone\",\r\n" + 
				"      \"TriggerHold\" : true,\r\n" + 
				"      \"Service_Request_Id\" : \"12312ASDLAKSDJ1213LKJSF\",\r\n" + 
				"      \"Service_Request_Nbr\" : \"123456789012\",\r\n" + 
				"      \"DTName\" : \"PrimaryPhoneNegativeListCheck\"\r\n" + 
				"    }, {\r\n" + 
				"       \r\n" + 
				"      \"Name\" : \"ScanCityStateToNegativeList\",\r\n" + 
				"      \"Category\" : \"NA\",\r\n" + 
				"      \"EntityType\" : \"Address\",\r\n" + 
				"      \"TriggerHold\" : true,\r\n" + 
				"      \"Service_Request_Id\" : \"12312ASDLAKSDJ1213LKJSF\",\r\n" + 
				"      \"Service_Request_Nbr\" : \"123456789012\",\r\n" + 
				"      \"DTName\" : \"ScanCityStateToNegativeList\"\r\n" + 
				"    }, {\r\n" + 
				"       \r\n" + 
				"      \"Name\" : \"EmailToNegativeList\",\r\n" + 
				"      \"Category\" : \"NA\",\r\n" + 
				"      \"EntityType\" : \"EmailAddress\",\r\n" + 
				"      \"TriggerHold\" : true,\r\n" + 
				"      \"Service_Request_Id\" : \"12312ASDLAKSDJ1213LKJSF\",\r\n" + 
				"      \"Service_Request_Nbr\" : \"123456789012\",\r\n" + 
				"      \"DTName\" : \"EmailToNegativeList\"\r\n" + 
				"    }, {\r\n" + 
				"       \r\n" + 
				"      \"Name\" : \"AddressNegativeListCheck\",\r\n" + 
				"      \"Category\" : \"NA\",\r\n" + 
				"      \"EntityType\" : \"Address\",\r\n" + 
				"      \"TriggerHold\" : true,\r\n" + 
				"      \"Service_Request_Id\" : \"12312ASDLAKSDJ1213LKJSF\",\r\n" + 
				"      \"Service_Request_Nbr\" : \"123456789012\",\r\n" + 
				"      \"DTName\" : \"AddressNegativeListCheck\"\r\n" + 
				"    }, {\r\n" + 
				"       \r\n" + 
				"      \"Name\" : \"WebIDToNegativeList\",\r\n" + 
				"      \"Category\" : \"NA\",\r\n" + 
				"      \"EntityType\" : \"WebID\",\r\n" + 
				"      \"TriggerHold\" : true,\r\n" + 
				"      \"Service_Request_Id\" : \"12312ASDLAKSDJ1213LKJSF\",\r\n" + 
				"      \"Service_Request_Nbr\" : \"123456789012\",\r\n" + 
				"      \"DTName\" : \"WebIDToNegativeList\"\r\n" + 
				"    }  ]\r\n" + 
				"  }\r\n" + 
				"}");
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
				"  \"FRMCheck\" : {\r\n" + 
				"    \"ClaimDetailsAction\" : {\r\n" + 
				"      \"Service_Request_Id\" : \"444411113\",\r\n" + 
				"      \"Service_Request_Nbr\" :\"444411113\",\r\n" + 
				"      \"Svc_Req_Start_Date\" : \"2017-07-20T12:20:18.804-04:00\",\r\n" + 
				"      \"Svc_Req_Type_Code\" : \"REPLREQ\",\r\n" + 
				"      \"Svc_Req_Status_Code\" : \"WORKING\",\r\n" + 
				"      \"Service_Flag\" : true,\r\n" + 
				"      \"Failure_Code\" : \"ADH\",\r\n" + 
				"      \"Failure_Date\" : \"2017-09-20T12:20:18.804-04:00\",\r\n" + 
				"      \"Entitlement_Type_Code\" : \"CLAIM\",\r\n" + 
				"      \"Source\" : \"CareCentral\",\r\n" + 
				"      \"Channel_Name\" : \"Agent\",\r\n" + 
				"      \"Agent_Name\" : \"Doe, Jane\",\r\n" + 
				"      \"Claim_State_Province\" : \"VA\",\r\n" + 
				"      \"Resolution_Code\" : \"BYOT\",\r\n" + 
				"      \"Assignee\" : \"112951\",\r\n" + 
				"      \"Contract_Nbr\" : \"123456789012\",\r\n" + 
				"      \"Client_Transaction_Nbr\" : \"123456789012\",\r\n" + 
				"      \"Warranty_SKU\" : \"WMT TV REPL 24M $100-300 P\",\r\n" + 
				"      \"Warranty_Price_Low\" : 4.8,\r\n" + 
				"      \"Warranty_Price_High\" : 667.8,\r\n" + 
				"      \"Purchase_Price\" : 500.00,\r\n" + 
				"      \"Contract_Create_Dt\" : \"2017-07-20T12:20:18.804-04:00\",\r\n" + 
				"      \"Contract_Create_Channel\" : \"CARECENTRAL\",\r\n" + 
				"      \"Contract_Created_By\" : \"Doe, Jane\",\r\n" + 
				"      \"Contract_Browser_Finger_Print\" : \"12312ASDLAKSDJ1213LKJSF\",\r\n" + 
				"      \"Program_Type\" : \"POSTPAID SERVICE\",\r\n" + 
				"      \"Receipt_Status_Code\" : \"N\",\r\n" + 
				"      \"Client_Id\" : \"123456789\",\r\n" + 
				"      \"Client_Name\" : \"WAL-WHL-SL-VA\",\r\n" + 
				"      \"Cust_Store_Dist\" : 56.0,\r\n" + 
				"      \"Product_Id\" : \"12312ASDLAKSDJ1213LKJSF\",\r\n" + 
				"      \"Is_Bulky\" : \"Y\",\r\n" + 
				"      \"Product_Name\" : \"TV\",\r\n" + 
				"      \"Make\" : \"LG\",\r\n" + 
				"      \"Product_Category\" : \"TV\",\r\n" + 
				"      \"Product_Type\" : \"DEVICE\",\r\n" + 
				"      \"Product_Purchase_Dt\" : \"2017-01-20T12:20:18.804-04:00\",\r\n" + 
				"      \"Model\" : \"MS2287\",\r\n" + 
				"      \"Serial\" : \"LXPLY020449480E\",\r\n" + 
				"      \"Product_Description\" : \"LG 8500 Smart LED TV\",\r\n" + 
				"      \"Client_Prod_Description\" : \"LG 8500 Smart LED TV\",\r\n" + 
				"      \"Customer_Id\" : \"787897\",\r\n" + 
				"      \"Customer_First_Name\" : \"JOHN\",\r\n" + 
				"      \"Customer_Last_Name\" : \"DOE\",\r\n" + 
				"      \"Valid_Id_Ind\" : false,\r\n" + 
				"      \"Fulfillment_Transaction_Id\" : \"12312ASDLAKSDJ1213LKJSF\",\r\n" + 
				"      \"Auth_Type\" : \"AUTH 1\",\r\n" + 
				"      \"Auth_Status\" : \"1st Authorization\",\r\n" + 
				"      \"Total_Auth_Amount\" : \"456.9\",\r\n" + 
				"      \"PEBO_Original_Price\" : \"500.9\",\r\n" + 
				"      \"PEBO_Offered_Price\" : \"600.9\",\r\n" + 
				"      \"PEBO_Override_Flag\" : true,\r\n" + 
				"      \"Created_Date\" : \"2017-07-20T12:20:18.804-04:00\",\r\n" + 
				"      \"Browser_Finger_Print\" : \"12312ASDLAKSDJ1213LKJSF\",\r\n" + 
				"      \"Automatic_Nbr_Id\" : \"123456789012\",\r\n" + 
				"      \"Dialed_Phone_Nbr\" : \"123456789012\",\r\n" + 
				"      \"Primary_Phone_Nbr\" : \"123456789012\",\r\n" + 
				"      \"Address_Usage\" : \"CUST\",\r\n" + 
				"      \"Address_Override_Flag\" : true,\r\n" + 
				"      \"Valid_Address\" : \"N\",\r\n" + 
				"      \"Is_FL\" : \"N\"\r\n" + 
				"    },\r\n" + 
				"    \"ScanDetailsAction\" : {\r\n" + 
				"      \"Service_Request_Id\" : \"12312ASDLAKSDJ1213LKJSF\",\r\n" + 
				"      \"Service_Request_Nbr\" : \"123456789012\",\r\n" + 
				"      \"Shipment_Tracking_Nbr\" : \"123456789012\",\r\n" + 
				"      \"Label_Type\" : \"MAIL\",\r\n" + 
				"      \"Label_Date\" : \"2017-07-20T13:18:18.964-04:00\",\r\n" + 
				"      \"Origin_Tracking_Nbr\" : \"123456789012\",\r\n" + 
				"      \"Scan_Distance\" : 12.0,\r\n" + 
				"      \"Origin_Scan_Date\" : \"2017-07-20T13:18:18.964-04:00\",\r\n" + 
				"      \"Salvage_Tracking_Nbr\" : \"123456789012\",\r\n" + 
				"      \"Salvage_Scan_Status\" : \"ABJ\",\r\n" + 
				"      \"Salvage_Scan_Date\" : \"2017-07-20T13:18:18.964-04:00\",\r\n" + 
				"      \"Created_Date\" : \"2017-07-20T13:18:18.964-04:00\",\r\n" + 
				"      \"Updated_Date\" : \"2017-07-20T13:18:18.964-04:00\"\r\n" + 
				"    },\r\n" + 
				"    \"CountsComputations\" : [ {\r\n" + 
				"      \"Name\" : \"CustomerIDByTransactionNumber\",\r\n" + 
				"      \"CountType\" : \"CustomerID\",\r\n" + 
				"      \"Count\" : 15,\r\n" + 
				"      \"Service_Request_Id\" : \"12312ASDLAKSDJ1213LKJSF\",\r\n" + 
				"      \"Service_Request_Nbr\" : \"123456789012\",\r\n" + 
				"      \"DTName\" : \"CustomerIDByTransactionNumber\"\r\n" + 
				"    }, {\r\n" + 
				"       \r\n" + 
				"      \"Name\" : \"CustomersByIPaddress\",\r\n" + 
				"      \"CountType\" : \"CustomerID\",\r\n" + 
				"      \"Count\" : 15,\r\n" + 
				"      \"Service_Request_Id\" : \"12312ASDLAKSDJ1213LKJSF\",\r\n" + 
				"      \"Service_Request_Nbr\" : \"123456789012\",\r\n" + 
				"      \"DTName\" : \"CustomersByIPaddress\"\r\n" + 
				"    }, {\r\n" + 
				"      \"Name\" : \"EmailIDByTransactionNumber\",\r\n" + 
				"      \"CountType\" : \"EmailID\",\r\n" + 
				"      \"Count\" : 10,\r\n" + 
				"      \"Service_Request_Id\" : \"12312ASDLAKSDJ1213LKJSF\",\r\n" + 
				"      \"Service_Request_Nbr\" : \"123456789012\",\r\n" + 
				"      \"DTName\" : \"EmailIDByTransactionNumber\"\r\n" + 
				"    }, {\r\n" + 
				"       \r\n" + 
				"      \"Name\" : \"GeoIDByTransactionNumber\",\r\n" + 
				"      \"CountType\" : \"GeoID\",\r\n" + 
				"      \"Count\" : 10,\r\n" + 
				"      \"Service_Request_Id\" : \"12312ASDLAKSDJ1213LKJSF\",\r\n" + 
				"      \"Service_Request_Nbr\" : \"123456789012\",\r\n" + 
				"      \"DTName\" : \"GeoIDByTransactionNumber\"\r\n" + 
				"    }, {\r\n" + 
				"       \r\n" + 
				"      \"Name\" : \"PrimaryPhoneByConsumer\",\r\n" + 
				"      \"CountType\" : \"ConsumerNo\",\r\n" + 
				"      \"Count\" : 15,\r\n" + 
				"      \"Service_Request_Id\" : \"12312ASDLAKSDJ1213LKJSF\",\r\n" + 
				"      \"Service_Request_Nbr\" : \"123456789012\",\r\n" + 
				"      \"DTName\" : \"PrimaryPhoneByConsumer\"\r\n" + 
				"    }, {\r\n" + 
				"       \r\n" + 
				"      \"Name\" : \"PrimaryPhoneByEmailIDs\",\r\n" + 
				"      \"CountType\" : \"EmailID\",\r\n" + 
				"      \"Count\" : 20,\r\n" + 
				"      \"Service_Request_Id\" : \"12312ASDLAKSDJ1213LKJSF\",\r\n" + 
				"      \"Service_Request_Nbr\" : \"123456789012\",\r\n" + 
				"      \"DTName\" : \"PrimaryPhoneByEmailIDs\"\r\n" + 
				"       \r\n" + 
				"    }, {\r\n" + 
				"       \r\n" + 
				"      \"Name\" : \"PrimaryPhoneByGeoIDs\",\r\n" + 
				"      \"CountType\" : \"GeoID\",\r\n" + 
				"      \"Count\" : 20,\r\n" + 
				"      \"Service_Request_Id\" : \"12312ASDLAKSDJ1213LKJSF\",\r\n" + 
				"      \"Service_Request_Nbr\" : \"123456789012\",\r\n" + 
				"      \"DTName\" : \"PrimaryPhoneByGeoIDs\"\r\n" + 
				"    }, {\r\n" + 
				"       \r\n" + 
				"      \"Name\" : \"PrimaryPhoneByTransactionNumber\",\r\n" + 
				"      \"CountType\" : \"PrimaryPhone\",\r\n" + 
				"      \"Count\" : 20,\r\n" + 
				"      \"Service_Request_Id\" : \"12312ASDLAKSDJ1213LKJSF\",\r\n" + 
				"      \"Service_Request_Nbr\" : \"123456789012\",\r\n" + 
				"      \"DTName\" : \"PrimaryPhoneByTransactionNumber\"\r\n" + 
				"    }, {\r\n" + 
				"       \r\n" + 
				"      \"Name\" : \"SalvageCommentsToAddress\",\r\n" + 
				"      \"CountType\" : \"SalvageScan\",\r\n" + 
				"      \"Count\" : 20,\r\n" + 
				"      \"Service_Request_Id\" : \"12312ASDLAKSDJ1213LKJSF\",\r\n" + 
				"      \"Service_Request_Nbr\" : \"123456789012\",\r\n" + 
				"      \"DTName\" : \"SalvageCommentsToAddress\"\r\n" + 
				"    }, {\r\n" + 
				"       \r\n" + 
				"      \"Name\" : \"SalvageCommentsToANI\",\r\n" + 
				"      \"CountType\" : \"SalvageScan\",\r\n" + 
				"      \"Count\" : 20,\r\n" + 
				"      \"Service_Request_Id\" : \"12312ASDLAKSDJ1213LKJSF\",\r\n" + 
				"      \"Service_Request_Nbr\" : \"123456789012\",\r\n" + 
				"      \"DTName\" : \"SalvageCommentsToANI\"\r\n" + 
				"    }, {\r\n" + 
				"       \r\n" + 
				"      \"Name\" : \"SalvageCommentsToWebID\",\r\n" + 
				"      \"CountType\" : \"SalvageScan\",\r\n" + 
				"      \"Count\" : 20,\r\n" + 
				"      \"Service_Request_Id\" : \"12312ASDLAKSDJ1213LKJSF\",\r\n" + 
				"      \"Service_Request_Nbr\" : \"123456789012\",\r\n" + 
				"      \"DTName\" : \"SalvageCommentsToWebID\"\r\n" + 
				"    }, {\r\n" + 
				"       \r\n" + 
				"      \"Name\" : \"AddressMatch\",\r\n" + 
				"      \"CountType\" : \"SRNumber\",\r\n" + 
				"      \"Count\" : 20,\r\n" + 
				"      \"Service_Request_Id\" : \"12312ASDLAKSDJ1213LKJSF\",\r\n" + 
				"      \"Service_Request_Nbr\" : \"123456789012\",\r\n" + 
				"      \"DTName\" : \"AddressMatch\"\r\n" + 
				"    }, {\r\n" + 
				"       \r\n" + 
				"      \"Name\" : \"AddressToConsumerComparison\",\r\n" + 
				"      \"CountType\" : \"ConsumerNo\",\r\n" + 
				"      \"Count\" : 20,\r\n" + 
				"      \"Service_Request_Id\" : \"12312ASDLAKSDJ1213LKJSF\",\r\n" + 
				"      \"Service_Request_Nbr\" : \"123456789012\",\r\n" + 
				"      \"DTName\" : \"AddressToConsumerComparison\"\r\n" + 
				"    }, {\r\n" + 
				"       \r\n" + 
				"      \"Name\" : \"AddressToEmailComparison\",\r\n" + 
				"      \"CountType\" : \"EmailID\",\r\n" + 
				"      \"Count\" : 20,\r\n" + 
				"      \"Service_Request_Id\" : \"12312ASDLAKSDJ1213LKJSF\",\r\n" + 
				"      \"Service_Request_Nbr\" : \"123456789012\",\r\n" + 
				"      \"DTName\" : \"AddressToEmailComparison\"\r\n" + 
				"    }, {\r\n" + 
				"       \r\n" + 
				"      \"Name\" : \"AddressToPrimaryPhoneComparison\",\r\n" + 
				"      \"CountType\" : \"PrimaryPhone\",\r\n" + 
				"      \"Count\" : 20,\r\n" + 
				"      \"Service_Request_Id\" : \"12312ASDLAKSDJ1213LKJSF\",\r\n" + 
				"      \"Service_Request_Nbr\" : \"123456789012\",\r\n" + 
				"      \"DTName\" : \"AddressToPrimaryPhoneComparison\"\r\n" + 
				"    }, {\r\n" + 
				"       \r\n" + 
				"      \"Name\" : \"ClaimCountByFulfillmentTransactionID\",\r\n" + 
				"      \"CountType\" : \"SRNumber\",\r\n" + 
				"      \"Count\" : 20,\r\n" + 
				"      \"Service_Request_Id\" : \"12312ASDLAKSDJ1213LKJSF\",\r\n" + 
				"      \"Service_Request_Nbr\" : \"123456789012\",\r\n" + 
				"      \"DTName\" : \"ClaimCountByFulfillmentTransactionID\"\r\n" + 
				"    }, {\r\n" + 
				"       \r\n" + 
				"      \"Name\" : \"ClaimCountByTransactionNumber\",\r\n" + 
				"      \"CountType\" : \"SRNumber\",\r\n" + 
				"      \"Count\" : 20,\r\n" + 
				"      \"Service_Request_Id\" : \"12312ASDLAKSDJ1213LKJSF\",\r\n" + 
				"      \"Service_Request_Nbr\" : \"123456789012\",\r\n" + 
				"      \"DTName\" : \"ClaimCountByTransactionNumber\"\r\n" + 
				"    }, {\r\n" + 
				"       \r\n" + 
				"      \"Name\" : \"ClaimCountByWebID\",\r\n" + 
				"      \"CountType\" : \"SRNumber\",\r\n" + 
				"      \"Count\" : 20,\r\n" + 
				"      \"Service_Request_Id\" : \"12312ASDLAKSDJ1213LKJSF\",\r\n" + 
				"      \"Service_Request_Nbr\" : \"123456789012\",\r\n" + 
				"      \"DTName\" : \"ClaimCountByWebID\"\r\n" + 
				"    }, {\r\n" + 
				"       \r\n" + 
				"      \"Name\" : \"ClaimsByIPAddress\",\r\n" + 
				"      \"CountType\" : \"Claims\",\r\n" + 
				"      \"Count\" : 20,\r\n" + 
				"      \"Service_Request_Id\" : \"12312ASDLAKSDJ1213LKJSF\",\r\n" + 
				"      \"Service_Request_Nbr\" : \"123456789012\",\r\n" + 
				"      \"DTName\" : \"ClaimsByIPAddress\"\r\n" + 
				"    }, {\r\n" + 
				"       \r\n" + 
				"      \"Name\" : \"CountOfAddressesByIPaddress\",\r\n" + 
				"      \"CountType\" : \"GeoID\",\r\n" + 
				"      \"Count\" : 20,\r\n" + 
				"      \"Service_Request_Id\" : \"12312ASDLAKSDJ1213LKJSF\",\r\n" + 
				"      \"Service_Request_Nbr\" : \"123456789012\",\r\n" + 
				"      \"DTName\" : \"CountOfAddressesByIPaddress\"\r\n" + 
				"    }, {\r\n" + 
				"       \r\n" + 
				"      \"Name\" : \"CountOfEmailAddressesByIPaddress\",\r\n" + 
				"      \"CountType\" : \"EmailID\",\r\n" + 
				"      \"Count\" : 20,\r\n" + 
				"      \"Service_Request_Id\" : \"12312ASDLAKSDJ1213LKJSF\",\r\n" + 
				"      \"Service_Request_Nbr\" : \"123456789012\",\r\n" + 
				"      \"DTName\" : \"CountOfEmailAddressesByIPaddress\"\r\n" + 
				"    }, {\r\n" + 
				"       \r\n" + 
				"      \"Name\" : \"CourtesyRegistrationAddressCheckByClient\",\r\n" + 
				"      \"CountType\" : \"ReceiptFlag\",\r\n" + 
				"      \"Count\" : 20,\r\n" + 
				"      \"Service_Request_Id\" : \"12312ASDLAKSDJ1213LKJSF\",\r\n" + 
				"      \"Service_Request_Nbr\" : \"123456789012\",\r\n" + 
				"      \"DTName\" : \"CourtesyRegistrationAddressCheckByClient\"\r\n" + 
				"    }, {\r\n" + 
				"       \r\n" + 
				"      \"Name\" : \"CourtesyRegistrationEmailCheckByClient\",\r\n" + 
				"      \"CountType\" : \"ReceiptFlag\",\r\n" + 
				"      \"Count\" : 20,\r\n" + 
				"      \"Service_Request_Id\" : \"12312ASDLAKSDJ1213LKJSF\",\r\n" + 
				"      \"Service_Request_Nbr\" : \"123456789012\",\r\n" + 
				"      \"DTName\" : \"CourtesyRegistrationEmailCheckByClient\"\r\n" + 
				"    }, {\r\n" + 
				"       \r\n" + 
				"      \"Name\" : \"ANIByConsumer\",\r\n" + 
				"      \"CountType\" : \"ConsumerNo\",\r\n" + 
				"      \"Count\" : 20,\r\n" + 
				"      \"Service_Request_Id\" : \"12312ASDLAKSDJ1213LKJSF\",\r\n" + 
				"      \"Service_Request_Nbr\" : \"123456789012\",\r\n" + 
				"      \"DTName\" : \"ANIByConsumer\"\r\n" + 
				"    }, {\r\n" + 
				"       \r\n" + 
				"      \"Name\" : \"ANIByEmailIDs\",\r\n" + 
				"      \"CountType\" : \"EmailID\",\r\n" + 
				"      \"Count\" : 20,\r\n" + 
				"      \"Service_Request_Id\" : \"12312ASDLAKSDJ1213LKJSF\",\r\n" + 
				"      \"Service_Request_Nbr\" : \"123456789012\",\r\n" + 
				"      \"DTName\" : \"ANIByEmailIDs\"\r\n" + 
				"    } ],\r\n" + 
				"    \"RefereceComputations\" : [ {\r\n" + 
				"       \r\n" + 
				"      \"Name\" : \"ANINegativeListCheck\",\r\n" + 
				"      \"Category\" : \"NA\",\r\n" + 
				"      \"EntityType\" : \"ANI\",\r\n" + 
				"      \"TriggerHold\" : true,\r\n" + 
				"      \"Service_Request_Id\" : \"12312ASDLAKSDJ1213LKJSF\",\r\n" + 
				"      \"Service_Request_Nbr\" : \"123456789012\",\r\n" + 
				"      \"DTName\" : \"ANINegativeListCheck\"\r\n" + 
				"    }, {\r\n" + 
				"       \r\n" + 
				"      \"Name\" : \"PrimaryPhoneNegativeListCheck\",\r\n" + 
				"      \"Category\" : \"NA\",\r\n" + 
				"      \"EntityType\" : \"PrimaryPhone\",\r\n" + 
				"      \"TriggerHold\" : true,\r\n" + 
				"      \"Service_Request_Id\" : \"12312ASDLAKSDJ1213LKJSF\",\r\n" + 
				"      \"Service_Request_Nbr\" : \"123456789012\",\r\n" + 
				"      \"DTName\" : \"PrimaryPhoneNegativeListCheck\"\r\n" + 
				"    }, {\r\n" + 
				"       \r\n" + 
				"      \"Name\" : \"ScanCityStateToNegativeList\",\r\n" + 
				"      \"Category\" : \"NA\",\r\n" + 
				"      \"EntityType\" : \"Address\",\r\n" + 
				"      \"TriggerHold\" : true,\r\n" + 
				"      \"Service_Request_Id\" : \"12312ASDLAKSDJ1213LKJSF\",\r\n" + 
				"      \"Service_Request_Nbr\" : \"123456789012\",\r\n" + 
				"      \"DTName\" : \"ScanCityStateToNegativeList\"\r\n" + 
				"    }, {\r\n" + 
				"       \r\n" + 
				"      \"Name\" : \"EmailToNegativeList\",\r\n" + 
				"      \"Category\" : \"NA\",\r\n" + 
				"      \"EntityType\" : \"EmailAddress\",\r\n" + 
				"      \"TriggerHold\" : true,\r\n" + 
				"      \"Service_Request_Id\" : \"12312ASDLAKSDJ1213LKJSF\",\r\n" + 
				"      \"Service_Request_Nbr\" : \"123456789012\",\r\n" + 
				"      \"DTName\" : \"EmailToNegativeList\"\r\n" + 
				"    }, {\r\n" + 
				"       \r\n" + 
				"      \"Name\" : \"AddressNegativeListCheck\",\r\n" + 
				"      \"Category\" : \"NA\",\r\n" + 
				"      \"EntityType\" : \"Address\",\r\n" + 
				"      \"TriggerHold\" : true,\r\n" + 
				"      \"Service_Request_Id\" : \"12312ASDLAKSDJ1213LKJSF\",\r\n" + 
				"      \"Service_Request_Nbr\" : \"123456789012\",\r\n" + 
				"      \"DTName\" : \"AddressNegativeListCheck\"\r\n" + 
				"    }, {\r\n" + 
				"       \r\n" + 
				"      \"Name\" : \"WebIDToNegativeList\",\r\n" + 
				"      \"Category\" : \"NA\",\r\n" + 
				"      \"EntityType\" : \"WebID\",\r\n" + 
				"      \"TriggerHold\" : true,\r\n" + 
				"      \"Service_Request_Id\" : \"12312ASDLAKSDJ1213LKJSF\",\r\n" + 
				"      \"Service_Request_Nbr\" : \"123456789012\",\r\n" + 
				"      \"DTName\" : \"WebIDToNegativeList\"\r\n" + 
				"    }  ]\r\n" + 
				"  }\r\n" + 
				"}")
		.when()
		//.post(" https://l7-api.use1.sqa.aws.asurion.net:8443/fraudmanagement/frauddetection/v1/fraudcheck")
		//.post("https://rtm-frmjs-dl-vip1.use1.dev.aws.asurion.net/frauddetection/v1/fraudcheck/")
		//.post("https://rtm-sqa-be.us-east-1.rtmbe.use1.sqa.aws.asurion.net:6301/Channels/HTTPChannel/FRMCheckDest")
		.post("https://rtm-frmjs-sq-vip1.use1.sqa.aws.asurion.net/frauddetection/v1/fraudcheck")

		//.post("https://rtm-sqa-be.us-east-1.rtmbe.use1.sqa.aws.asurion.net:6301/Channels/HTTPChannel/FRMCheckDest")

		
		.then().log().body()
		.statusCode(200)
		.contentType(ContentType.JSON);
        
        
      //  String actionCode = response.extract().path("ResponseBody.actions[0].ActionCode");
   	  //  Assert.assertEquals(actionCode, "APPROVED");
  	    
	    

	}	    
			    




}
