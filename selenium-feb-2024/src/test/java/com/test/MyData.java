package com.test;

import org.testng.annotations.DataProvider;

public class MyData {

	@DataProvider(name="data")
	public Object[][] getData() {
		Object[][] data = {
				{10,20,30},
				{30,40,70},
				{80,90,170},
				{20,20,50},
				{60,20,80}
		};
	return data;	
	}

}
