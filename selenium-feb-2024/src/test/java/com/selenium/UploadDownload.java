package com.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class UploadDownload {
	
	@Test
	public void testUploadDownload() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/upload-download");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("downloadButton")).click();
		
		driver.findElement(By.id("uploadFile")).sendKeys("/Users/sreeharsha/Desktop/Murali House warm/1000150585.jpg");
		
	}

}
