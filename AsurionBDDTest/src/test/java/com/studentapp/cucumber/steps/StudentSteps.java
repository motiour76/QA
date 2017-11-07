package com.studentapp.cucumber.steps;

import cucumber.api.java.en.When;
import net.serenitybdd.rest.SerenityRest;

public class StudentSteps {
	
	
	@When("^User send a GET request to the list endpoint, they must get back a valid status code 200\r\n" + 
			"$")
	public void verify_status_code_200_for_listenedpoint() {
		SerenityRest.rest()
		.given()
		.when()
		.get()
		.then()
		.statusCode(200);
	}

}
