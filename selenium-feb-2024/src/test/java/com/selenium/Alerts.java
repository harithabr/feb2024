package com.selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.tracing.Status;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;


public class Alerts {
	
	 @Test
	 
	 public void handleAlerts() {
		 
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://demoqa.com/alerts");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 WebElement alertButton1 = driver.findElement(By.id("alertButton"));
		 JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].scrollIntoView();",alertButton1);
		 alertButton1.click();
		 Alert alert1 = driver.switchTo().alert();
		 System.out.println(alert1.getText());
		 alert1.accept();
		 
		 driver.findElement(By.id("timerAlertButton")).click();
		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		 wait.until(ExpectedConditions.alertIsPresent());
		 Alert alert4 = driver.switchTo().alert();
		 System.out.println(alert4.getText());
		 alert4.accept();
		 
		 driver.findElement(By.id("confirmButton")).click();
		 Alert alert2 =driver.switchTo().alert();
		 System.out.println(alert2.getText());
		 alert2.dismiss();
	 
		 driver.findElement(By.id("promtButton")).click();
		 Alert alert3 = driver.switchTo().alert();
		 System.out.println(alert3.getText());
		 alert3.sendKeys("Haritha");
		 alert3.accept();
	 
	 
	 
	 
	 }

	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
