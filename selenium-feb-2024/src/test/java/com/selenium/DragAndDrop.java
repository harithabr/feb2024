package com.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class DragAndDrop {
	
	@Test
	public void testDragAndDrop() {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/droppable");
		driver.manage().window().maximize();
		
        
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));

		Actions action = new Actions(driver);
		action.dragAndDrop(source, target).build().perform();
		//driver.quit();
			
	}
	
	@Test
	public void testDragAndDropBy() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/dragabble");
		driver.manage().window().maximize();
		
		WebElement source = driver.findElement(By.id("dragBox"));
		
		Actions action = new Actions(driver);
		action.dragAndDropBy(source, 50,50).build().perform();
		//driver.quit();
		
		
	}
	
}
