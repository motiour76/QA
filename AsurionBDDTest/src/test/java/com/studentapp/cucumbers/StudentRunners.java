package com.studentapp.cucumbers;

import org.junit.runner.RunWith;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import cucumber.api.CucumberOptions;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features= "src/test/resources/features/")
public class StudentRunners {

	}
