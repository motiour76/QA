

package com.asurion.CountComputationTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GeoIDByTransactionNumber {

	@Test
	public void GeoIDByTransactionNumber() throws SQLException {

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

			myRs = myStmt.executeQuery("SELECT FRAUD_ACTION_CODE, DECISION_RULE_ID, DECISION_TABLE_NAME FROM QAFRMRTM.FRAUD_ACTION where SERVICE_REQUEST_NBR = '3123123' and DECISION_TABLE_NAME = 'GeoIDByTransactionNumber';");
			// 4. Process the result set
			while (myRs.next()) {
			
				
				System.out.println("Decision Table  Name is: " + myRs.getString("DECISION_TABLE_NAME") 
				  + " , "+ "  ActionCode is : " +myRs.getString("FRAUD_ACTION_CODE") + " , " + 
						"Rule Id is: "  + myRs.getInt("DECISION_RULE_ID"));

				String RuleName = myRs.getString("DECISION_TABLE_NAME");
				Assert.assertEquals(RuleName, "GeoIDByTransactionNumber");
				
				String ActionCode = myRs.getString("FRAUD_ACTION_CODE");
				Assert.assertEquals(ActionCode, "RCPT REQ");
	
				int RuleId = myRs.getInt("DECISION_RULE_ID");
				Assert.assertEquals(RuleId, 3);
				
	
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
