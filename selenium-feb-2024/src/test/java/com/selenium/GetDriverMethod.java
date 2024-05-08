package com.selenium;


import org.testng.annotations.Test;

import junit.framework.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class GetDriverMethod{
	

	@Test
	public void testFacebook() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
	
		
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title,"Facebook - log in or sign up");
		
		driver.findElement(By.linkText("Forgot password?")).click();
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		System.out.println(driver.getPageSource());
		driver.quit();
		
		
	}
}
