package com.count.AddressToPrimaryPhoneComparison;




import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddressToPrimaryPhoneComparison {
	
	//@Test
	public void AddressToPrimaryPhoneComparison(String serviceRequestNbr) throws SQLException {

		String url = "jdbc:mysql://rtm-qa-aur-frm-db.use1.sqa.aws.asurion.net:3306/QAFRMRTM";
		String user = "motiour.rahman";
		String password = "October2017_Reset#123";
		Connection myConn = null;
		PreparedStatement myStmt = null;
		ResultSet myRs = null;
		System.out.println(" get serviceRequestNbr value is " + serviceRequestNbr);
		try {
			myConn = DriverManager.getConnection(url, user, password);
			
			//myStmt =myConn.prepareStatement("SELECT FRAUD_ACTION_CODE, DECISION_RULE_ID, DECISION_TABLE_NAME FROM QAFRMRTM.FRAUD_ACTION where SERVICE_REQUEST_NBR =?");
			
			myStmt =myConn.prepareStatement("SELECT FRAUD_ACTION_CODE, DECISION_RULE_ID, DECISION_TABLE_NAME FROM QAFRMRTM.FRAUD_ACTION where SERVICE_REQUEST_NBR =? and DECISION_TABLE_NAME = 'AddressToPrimaryPhoneComparison';");
			((PreparedStatement) myStmt).setString(1, serviceRequestNbr);
			
			myRs=myStmt.executeQuery();
			while (myRs.next()) {
				System.out.println("Decision Table  Name is: " + myRs.getString("DECISION_TABLE_NAME") + " , "
						+ "  ActionCode is : " + myRs.getString("FRAUD_ACTION_CODE") + " , " + "Rule Id is: "
						+ myRs.getInt("DECISION_RULE_ID"));

					
				

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



