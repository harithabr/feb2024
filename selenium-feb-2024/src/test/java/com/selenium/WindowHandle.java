package com.selenium;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowHandle {
	
	@Test
	public void windowHanlde() {
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://demoqa.com/browser-windows");
	driver.manage().window().maximize();
	driver .manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.findElement(By.id("tabButton")).click();
	
	String parentWindow = driver.getWindowHandle();
	Set<String> windowID = driver.getWindowHandles();
	
	for(String id : windowID) {
		driver.switchTo().window(id);
	}
	String text = driver.findElement(By.id("sampleHeading")).getText();
	System.out.println(text);
	driver.close();
	
	driver.switchTo().window(parentWindow);
	driver.findElement(By.id("windowButton")).click();
	
	String parentWindow1 = driver.getWindowHandle();
	Set<String> windowID1 = driver.getWindowHandles();
	
	for(String id : windowID1) {
		driver.switchTo().window(id);
	}
	String text1 = driver.findElement(By.id("sampleHeading")).getText();
	System.out.println(text1);
	driver.close();
	
	driver.switchTo().window(parentWindow1);
	driver.findElement(By.id("fixedban")).click();
	
	String parentWindow2 = driver.getWindowHandle();
	Set<String> windowID2 = driver.getWindowHandles();
	
	for(String id : windowID2) {
		driver.switchTo().window(id);
	}	
}
	
	@Test
	public void testNewWindow() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.navigate().to("https://demoqa.com/elements");
		
		String parentWindow = driver.getWindowHandle();
		Set<String> windowID = driver.getWindowHandles();
		
		for(String id : windowID) {
			driver.switchTo().window(id);
		}
		
	}
}