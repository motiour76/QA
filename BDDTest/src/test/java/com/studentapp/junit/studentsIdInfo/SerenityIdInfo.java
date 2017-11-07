package com.studentapp.junit.studentsIdInfo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

import io.restassured.RestAssured;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Title;


@RunWith(SerenityRunner.class)
public class SerenityIdInfo {
	
	@BeforeClass
	public static void init() {
		RestAssured.baseURI="http://localhost:8080/student";
	}
	
	
	
	@Title("This test will give the information of students")
	@Test
	public void getAllStudents() {
		
		
		SerenityRest.
		given().
		when().
		get("/list").
		then().
		log().
		all().
		statusCode(200);
	}
	
	@Test
	public void Test_Fail() {
		
		
		SerenityRest.
		given().
		when().
		get("/list").
		then().
		log().
		all().
		statusCode(500);
	}

	
	@Pending
	@Test
	public void thisIsAPendingTest() {
		
		
		}

	
	@Ignore
	@Test
	public void thisIsIgnoreTest() {
		
		
		}

	

	@Test
	public void thisIsATestWithError() {
		
		System.out.println("This is an error"+ (5/0));
		
		}

	
	
	
	@Test
	public void fileDoesNotExist() throws FileNotFoundException {
		File file = new File("C://file.txt");
		FileReader fr = new FileReader(file);
	}


}
