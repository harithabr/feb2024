package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SeleniumExample {
	
	public static void main(String[] args) {
		
		System.out.println("Selenium webdriver Example");
		WebDriver  driver = new SafariDriver();
		driver.get("http://www.google.com");
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("Selenium webdriver");
		element.submit();
		//driver.quit();
				
	}

}
