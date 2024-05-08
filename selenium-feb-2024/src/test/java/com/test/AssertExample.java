package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class AssertExample {
	
	@Test
	public void testAssert() {
		
		System.out.println("TestNG:@Test testAssert");
		int a=1;
		int b=2;
		Assert.assertEquals(a,b,"a is not equal to b");
		
		boolean status = false;
		//Assert.assertTrue(status, "Status is not true");
		String message = "user login successfully";
		
		Assert.assertTrue(message.contains("successfully"),"Login message not contains successfully");
		Assert.assertFalse(status, "user login failed");
	}
	
	
	@Test
     public void testAssert1() {
		
		System.out.println("TestNG:@Test testAssert");
		int a=1;
		int b=2;
		SoftAssert softAssert= new SoftAssert();
		softAssert.assertEquals(a,b,"a is not equal to b");
		
		boolean status = true;
		//Assert.assertTrue(status, "Status is not true");
		String message = "user login successfully";
		
		softAssert.assertTrue(message.contains("successfully"),"Login message not contains successfully");
		softAssert.assertFalse(status, "user login failed");
		softAssert.assertAll();
	}

}
