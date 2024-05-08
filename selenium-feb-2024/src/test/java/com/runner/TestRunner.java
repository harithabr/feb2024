package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "src/test/resources/features",
			glue = {"com.steps"},
			plugin = {
			"json:target/report/Execution.json",
			"html:target/report/Execution.html" })
			//tags="@smoke")
			
			
			
			
	public class TestRunner {			

}
