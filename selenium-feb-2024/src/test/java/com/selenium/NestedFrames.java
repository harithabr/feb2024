package com.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class NestedFrames {
	
	  @Test
	
	 public void testNestedFrame() {
		 
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://demoqa.com/nestedframes");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 driver.switchTo().frame("frame1");
  	     String text = driver.findElement(By.xpath("//body")).getText();
		 System.out.println(text);
		 
		 driver.switchTo().frame(driver.findElement(By.xpath("//iframe")));	
		 String text1 = driver.findElement(By.xpath("//p")).getText();
		 System.out.println(text1);
		 
		 driver.switchTo().defaultContent();
		 String text2 = driver.findElement(By.tagName("h1")).getText();
		 System.out.println(text2);
		 
	 }

}
