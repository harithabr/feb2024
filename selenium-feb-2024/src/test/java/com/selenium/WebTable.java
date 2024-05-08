package com.selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class WebTable {
	
	@Test
	public void testwebTable() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement table = driver.findElement(By.id("customers"));
		
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		
		for(WebElement row:rows) {
			List<WebElement> columns = row.findElements(By.tagName("td"));
			for(WebElement column : columns) {
				System.out.println(column.getText()+"\t");
				
			}
			System.out.println();
			
    	}
		
		
	}
	
	@Test
	public void testWebTable2() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/webtables");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		List<WebElement> emailElements = driver.findElements(By.xpath("//div[@class=\"rt-table\"]/div[2]/div/div/div[4]"));
		
		for (WebElement emailElement : emailElements) {
			System.out.println(emailElement.getText());
		}
	
	}
}
