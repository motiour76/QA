package com.studentapp.junit.studentsinfo;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.internal.MethodSorter;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;

import com.studentapp.model.StudentClass;
import com.studentapp.testbase.TestBase;
import com.studentapp.utils.TestUtils;

import io.restassured.http.ContentType;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Title;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

@RunWith(SerenityRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StudentsCRUDTest {
	
	static String firstName ="Rashed" + TestUtils.getRandomValue();
	static String lastName ="Rahman" + TestUtils.getRandomValue();
	static String programme ="Marine Science";
	static String email =TestUtils.getRandomValue()+"rashed@gmail.com";

	
	@Title("This test will create new student")
	@Test
	public void Test001() {
		ArrayList<String> courses = new ArrayList<String>();
		courses.add("JAVA");
		courses.add("C++");
		
		StudentClass student = new StudentClass();
		student.setFirstName(firstName);
		student.setLastName(lastName);
		student.setEmail(email);
		student.setProgramme(programme);
		student.setCourses(courses);
		
		SerenityRest.rest().given()
		.contentType(ContentType.JSON)
		.log()
		.all()
		.when()
		.body(student)
		.post("http://localhost:8080/student")
		.then()
		.log()
		.all()
		.statusCode(201);
		
		
	}
	
	
	@Title ("Verify student add in the application")
	@Test
	public void Test002() {
		String p1 = "findAll{it.firstName=='";
		String p2 = "'}.get(0)";
		
	HashMap<String,Object> value =	SerenityRest.rest().given()
		.when()
		.get("http://localhost:8080/student/list")
		.then()
		.log()
		.all()
		.statusCode(200)
		.extract()
		.path(p1 +firstName+p2);
	
	System.out.println("The value is "+ value);
    assertThat(value,hasValue(firstName));

		
	}
	
	
	
	

}
