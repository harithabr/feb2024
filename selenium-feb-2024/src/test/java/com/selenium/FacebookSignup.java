package com.selenium;


import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

import org.openqa.selenium.By;

public class FacebookSignup {
	
	@Test
	public void testFacebook() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		WebElement signupbutton = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		signupbutton.click();
		
		WebElement firstname = driver.findElement(By.name("firstname"));
		firstname.clear();
		firstname.sendKeys("John");
		
		WebElement lastname = driver.findElement(By.name("lastname"));
		lastname.clear();		
		lastname.sendKeys("doe");
		
		WebElement email = driver.findElement(By.name("reg_email__"));
		email.sendKeys("john123@gmail.com");
		
		WebElement password = driver.findElement(By.name("reg_passwd__"));
		password.sendKeys("1234");
		
		Select month = new Select(driver.findElement(By.id("month"))); 
		month.selectByVisibleText("Oct");		
        
		Select day = new Select(driver.findElement(By.id("day")));
		day.selectByIndex(29);
		
		Select year = new Select(driver.findElement(By.id("year")));
		year.selectByValue("1995");
		
		WebElement radiobutton = driver.findElement(By.xpath("//input[@value=\"-1\"]"));
		boolean status1 =  radiobutton.isSelected();
		System.out.println(status1);
		radiobutton.click();
		boolean status2 = radiobutton.isSelected();
		System.out.println(status2);
		
	}
	
}
