package com.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class StepsDef {
	
	int a,b,result;
	
	@Given("i am a caluculator")
	public void i_am_a_caluculator() {
		//System.out.println("i am a caluculator");
	}

	@Given("two integer numbers {int} and {int}")
	public void two_integer_numbers_and(int int1, int int2) {
		a=int1;
		b=int2;
	    
	}

	
    @When("i added both numbers")
	public void i_added_both_numbers() {
	    result=a+b;
	}


	
	@Then("i verify result is {int}")
	public void i_verify_result_is(int expectedResult) {
	   Assert.assertEquals(expectedResult, result);
		
	}




}
