package com.test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {

	
	@Test(dataProvider = "data",dataProviderClass = MyData.class)
	public void testadd(int a,int b,int result) {
		int sum=a+b;
		Assert.assertEquals(sum,result);
	}
	
	}
		
	

