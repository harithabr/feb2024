package com.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;


public class CaptureScreen {
	
	WebDriver driver;
	
    @Test
	public void testCaptureScreen() throws IOException {
		
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
		
		/*TakesScreenshot scrshot = ((TakesScreenshot)driver);
		File file1 = scrshot.getScreenshotAs(OutputType.FILE);
		File file2 = new File("screenshot.png");
		FileUtils.copyFile(file1,file2);*/
		
		}
    
    @AfterMethod
    public void tearDown(ITestResult result) {
    	
    	if(result.getStatus() == ITestResult.FAILURE) {
    		TakesScreenshot scrshot = ((TakesScreenshot) driver);
    		File file1=scrshot.getScreenshotAs(OutputType.FILE);
    		File file2= new File("screenshot1.png");
    		try {
    			
    			FileUtils.copyFile(file1, file2);
    		}catch(IOException e) {
    			e.printStackTrace();
    		}
    		
    	}
    	driver.quit();
    }
    
    
 }











































