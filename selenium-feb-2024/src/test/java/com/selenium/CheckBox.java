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
import org.openqa.selenium.By;

public class CheckBox {
	
	WebDriver driver;
	
	@BeforeMethod
	@Parameters({"browser"})
	public void  setup(String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}else if(browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
	    }
		/*else if(browser.equalsIgnoreCase("edge")) {
	    	driver = new edgedriver();
	    }*/
	  }
		
		@Test
		
		public void testCheckbox()	{
			
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		driver.manage().window().maximize();
		
		WebElement checkBox1 = driver.findElement(By.xpath("//form[@id='checkboxes']/input[1]"));
		boolean status1 = checkBox1.isSelected();
		System.out.println(status1);
		checkBox1.click();
		boolean status2 = checkBox1.isSelected();
		System.out.println(status2);
		
		WebElement checkBox2 = driver.findElement(By.xpath("//form[@id='checkboxes']/input[2]"));
		boolean status3 = checkBox2.isSelected();
		System.out.println(status3);
		checkBox2.click();
		boolean status4 = checkBox2.isSelected();
		System.out.println(status4);
		
		}
		
		@AfterMethod
		public void teardown() {
		driver.quit();
			
		}

	}


