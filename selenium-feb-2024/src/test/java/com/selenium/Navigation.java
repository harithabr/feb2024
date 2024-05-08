package com.selenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Navigation {
	
	WebDriver driver;
	
	@Test
	public void testjsExecutor() throws IOException {
		
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement logoElement = driver.findElement(By.cssSelector("img[alt='Facebook']"));
        File file1 = logoElement.getScreenshotAs(OutputType.FILE); 	
        File file2 = new File("logo.png");
        FileUtils.copyFile(file1, file2);
        
		WebElement emailElement = driver.findElement(By.id("email"));
		emailElement.sendKeys("test123@gmail.com");
		
		WebElement passElement = driver.findElement(By.id("pass"));
		passElement.sendKeys("test123");
		
		WebElement clickElement = driver.findElement(By.name("login"));
		clickElement.click();
		
		driver.navigate().to("https://www.facebook.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}

}


















