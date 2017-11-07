

package com.asurion.CountComputationTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddressMatch {

	@Test
	public void AddressMatch() throws SQLException {

		String url = "jdbc:mysql://rtm-qa-aur-frm-db.use1.sqa.aws.asurion.net:3306/QAFRMRTM";
		String user = "motiour.rahman";
		String password = "October2017_Reset#123";
		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;
		try {
			myConn = DriverManager.getConnection(url, user, password);
			myStmt = myConn.createStatement();
			myRs = myStmt.executeQuery("SELECT FRAUD_ACTION_CODE, DECISION_RULE_ID, DECISION_TABLE_NAME FROM QAFRMRTM.FRAUD_ACTION where SERVICE_REQUEST_NBR = '3123123' and DECISION_TABLE_NAME = 'AddressMatch';");
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
