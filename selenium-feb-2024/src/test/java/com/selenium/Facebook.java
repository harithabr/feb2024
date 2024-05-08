package com.selenium;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class Facebook {
	
	@Test
	public void testFacebook() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		
		WebElement emailElement = driver.findElement(By.id("email"));
		emailElement.sendKeys("Test123@gamil.com");
		
		WebElement passElement = driver.findElement(By.id("pass"));
		passElement.sendKeys("test123");
		
		WebElement loginElement = driver.findElement(By.name("login"));
		loginElement.click();
		
		driver.quit();
		
	}

}
