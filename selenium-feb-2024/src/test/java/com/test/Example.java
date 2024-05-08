package com.test;

 
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Example {
	
	  @BeforeSuite 
	  public void setupsuite() {
		   
		  System.out.println("TestNG:@BeforeSuite setup");
	  }
	  
	  @ AfterSuite 
	  public void teardownsuite() {
		  
		  System.out.println("TestNG:@AfterSuite teardowm");
	  }
	
	  @BeforeTest
	  public void setupTest() {
		  
		  System.out.println("TestNG:@BeforeTest setup");
	  }
	
	  @AfterTest
	  public void teardownTest() {
		  
		  System.out.println("TestNG:@AfterTest teardown");
	  }
 	  @BeforeClass
	  public void setupClass() {
		 
		 System.out.println("TestNG:@BeforeClass setup");
	  }
	  @AfterClass
	  public void teardownClass() {
		  
		  System.out.println("TestNG:@AfterClass teardown");
	  }
	
	   @BeforeMethod
	   public void setupMethod() {
		   
		   System.out.println("TestNG:@BeforeMethod setup");
	   }
	   
	   @AfterMethod
	   public void teardownMethod() {
		   
		   System.out.println("TestNG:@AfterMethod teardown");
	   }
	   
       @Test
	   public void testAssert() {
		   
		   System.out.println("TestNG: testAssert");
		   
		   
	   }
       
       @Test
       public void test2() {
    	   
    	   System.out.println("TestNG:test2");
       }
	   
}
