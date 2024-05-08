package com.jcpenny.tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Search {
	
	@Test
	public void searchTest() {
	
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.jcpenney.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	 driver.findElement(By.id("searchInputId")).sendKeys("home expressions harper bed spread");
	 driver.findElement(By.cssSelector("button[data-automation-id='searchIconBlock']")).click();
	 
	

}
}









