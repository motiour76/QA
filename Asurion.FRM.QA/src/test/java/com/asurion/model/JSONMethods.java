package com.asurion.model;


import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Iterator;

/**
 * Created by cwr.abhijeet.nemade on 6/26/2017.
 */
public class JSONMethods {
	
	

	static FraudCheckAPI_Model data     = new FraudCheckAPI_Model();

    public static Object parseJSON(String paramString)
    {
        try
        {
            ObjectMapper localObjectMapper = new ObjectMapper();
            return localObjectMapper.readValue(paramString, JsonNode.class);
        }
        catch (Exception localException)
        {
            throw new RuntimeException(localException);
        }
    }

    public static String renderJson(Object paramObject)
    {
        try
        {
            ObjectMapper localObjectMapper = new ObjectMapper();

            return localObjectMapper.writeValueAsString(paramObject);
        }
        catch (Exception localException)
        {
            throw new RuntimeException(localException);
        }
    }

    public static Object getFieldNames(Object paramObject)
    {
        if ((paramObject == null) || (!(paramObject instanceof JsonNode))) {
            throw new IllegalArgumentException("Expected a non null JsonNode instance");
        }
        JsonNode localJsonNode = (JsonNode)paramObject;
        return localJsonNode.fieldNames();
    }

    public static Object getFields(Object paramObject)
    {
        if ((paramObject == null) || (!(paramObject instanceof JsonNode))) {
            throw new IllegalArgumentException("Expected a non null JsonNode instance");
        }
        JsonNode localJsonNode = (JsonNode)paramObject;
        return localJsonNode.fields();
    }

    public static String getNodeType(Object paramObject)
    {
        if ((paramObject == null) || (!(paramObject instanceof JsonNode))) {
            throw new IllegalArgumentException("Expected a non null JsonNode instance");
        }
        JsonNode localJsonNode = (JsonNode)paramObject;
        return localJsonNode.getNodeType().toString();
    }

    public static boolean isArrayNode(Object paramObject)
    {
        if ((paramObject == null) || (!(paramObject instanceof JsonNode))) {
            throw new IllegalArgumentException("Expected a non null JsonNode instance");
        }
        JsonNode localJsonNode = (JsonNode)paramObject;
        return localJsonNode.isArray();
    }

    public static boolean isValueNode(Object paramObject)
    {
        if ((paramObject == null) || (!(paramObject instanceof JsonNode))) {
            throw new IllegalArgumentException("Expected a non null JsonNode instance");
        }
        JsonNode localJsonNode = (JsonNode)paramObject;
        return localJsonNode.isValueNode();
    }

    public static String getTextValue(Object paramObject)
    {
        if ((paramObject == null) || (!(paramObject instanceof JsonNode))) {
            throw new IllegalArgumentException("Expected a non null JsonNode instance");
        }
        JsonNode localJsonNode = (JsonNode)paramObject;
        return localJsonNode.asText();
    }

    public static Object getAllElements(Object paramObject)
    {
        if ((paramObject == null) || (!(paramObject instanceof JsonNode))) {
            throw new IllegalArgumentException("Expected a non null JsonNode instance");
        }
        JsonNode localJsonNode = (JsonNode)paramObject;
        return localJsonNode.elements();
    }

    public static boolean isObjectNode(Object paramObject)
    {
        if ((paramObject == null) || (!(paramObject instanceof JsonNode))) {
            throw new IllegalArgumentException("Expected a non null JsonNode instance");
        }
        JsonNode localJsonNode = (JsonNode)paramObject;
        return localJsonNode.isObject();
    }

    public static Object getNode(Object paramObject, String paramString)
    {
        if ((paramObject == null) || (!(paramObject instanceof JsonNode))) {
            throw new IllegalArgumentException("Expected a non null JsonNode instance");
        }
        JsonNode localJsonNode = (JsonNode)paramObject;
        return localJsonNode.get(paramString);
    }

    public static boolean hasField(Object paramObject, String paramString)
    {
        if ((paramObject == null) || (!(paramObject instanceof JsonNode))) {
            throw new IllegalArgumentException("Expected a non null JsonNode instance");
        }
        JsonNode localJsonNode = (JsonNode)paramObject;
        return localJsonNode.has(paramString);
    }

    public static Object findParent(Object paramObject, String paramString)
    {
        if ((paramObject == null) || (!(paramObject instanceof JsonNode))) {
            throw new IllegalArgumentException("Expected a non null JsonNode instance");
        }
        JsonNode localJsonNode = (JsonNode)paramObject;
        return localJsonNode.findParent(paramString);
    }

    public static Object findNode(Object paramObject, String paramString)
    {
        if ((paramObject == null) || (!(paramObject instanceof JsonNode))) {
            throw new IllegalArgumentException("Expected a non null JsonNode instance");
        }
        JsonNode localJsonNode = (JsonNode)paramObject;
        return localJsonNode.findPath(paramString);
    }

    public static Object findValueNode(Object paramObject, String paramString)
    {
        if ((paramObject == null) || (!(paramObject instanceof JsonNode))) {
            throw new IllegalArgumentException("Expected a non null JsonNode instance");
        }
        JsonNode localJsonNode = (JsonNode)paramObject;
        return localJsonNode.findValue(paramString);
    }

    public static void main(String [] args){
        try{
           
            
        	 Object obj = parseJSON("   {\r\n" + 
				"  \"RequestBody\": {\"incidentID\": \""+ data.incidentID + "\"," + 
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
				"}\r\n");
            System.out.println(JSONMethods.renderJson(obj));
            
//            Iterator<Object> array= (Iterator<Object> )JSONMethods.getAllElements(obj);
//            while (array.hasNext()) {
//                System.out.println(JSONMethods.renderJson(array.next()));
//            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
