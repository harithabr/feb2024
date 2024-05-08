package com.selenium;


import org.testng.annotations.Test;

import org.testng.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;

public class GetExample {
	
	@Test
	public void testFacebook() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		
		String expectedMsg="Connect with friends and the world around you on Facebook.";
		
		WebElement element = driver.findElement(By.className("_8eso"));
		String actualMsg = element.getText(); 
		System.out.println(actualMsg);
		Assert.assertEquals(actualMsg,expectedMsg);
		
		
		String emailPlaceholder = driver.findElement(By.id("email")).getAttribute("placeholder");
		System.out.println("emailPlaceholder");
		Assert.assertEquals(emailPlaceholder,"Email or phone number");
		
		
		
		String passPlaceholder = driver.findElement(By.id("pass")).getAttribute("placeholder");
		System.out.println("passPlaceholder");
		Assert.assertEquals(passPlaceholder,"Password");
		
		WebElement elementLogin = driver.findElement(By.name("login"));
		String fontsize = elementLogin.getCssValue("font-size");
		String lineheight = elementLogin.getCssValue("line-height");
		String  width= elementLogin.getCssValue("width");
		System.out.println(fontsize);
		System.out.println(lineheight);
		System.out.println(width);
		Assert.assertEquals(fontsize,"20px");
		Assert.assertEquals(lineheight,"48px");
		Assert.assertEquals(width,"332px");
		
		

				
	}
}