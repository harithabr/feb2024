package com.test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class Dependency {
	
	@Test(priority=1)
	public void AddProduct() {
		System.out.println("TestNG:@Test AddProduct");
		assertEquals(1, 2);
	}

	@Test(priority=0,dependsOnMethods="AddProduct",alwaysRun=true)
	public void EditProduct() {
		System.out.println("TestNG:@Test EditProduct");
	}
	
	@Test(priority=2,dependsOnMethods={"AddProduct", "EditProduct"})
	public void DeleteProduct() {
		System.out.println("TestNG:@Test DeleteProduct");
	}
}
