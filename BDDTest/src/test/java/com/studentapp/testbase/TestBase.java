package com.studentapp.testbase;

import org.junit.BeforeClass;

import com.jayway.restassured.RestAssured;

public class TestBase {
	
	
	@BeforeClass
	public static void init() {
		
		RestAssured.baseURI = "http://localhost:8080/student";
	}

}
