package com.asurion.script;

import java.sql.*;

public class Driver {

	public static void main(String[] args) throws SQLException {
		
		
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
					myRs = myStmt.executeQuery("SELECT * FROM ADDRESS;");
					
					// 4. Process the result set
					while (myRs.next()) {
						System.out.println(myRs.getString("CITY_NAME") + ", " + myRs.getString("STATE_PROVINCE_CODE"));
					}
				}
				catch (Exception exc) {
					exc.printStackTrace();
				}
				finally {
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