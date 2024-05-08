package com.selenium;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class Buttons {
	
	@Test
	public void testFacebook() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		
        WebElement doubleclickbutton = driver.findElement(By.id("doubleClickBtn"));
        Actions action = new Actions(driver);
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();",doubleclickbutton);
        
        action.doubleClick(doubleclickbutton).build().perform();
        
        WebElement rightclickbutton = driver.findElement(By.id("rightClickBtn"));
        action.contextClick(rightclickbutton).build().perform();
        
        WebElement clickbutton = driver.findElement(By.xpath("//button[text()='Click Me']"));
        action.click(clickbutton).build().perform();
        
        WebElement doubleclicktext = driver.findElement(By.id("doubleClickMessage"));
        String actualmsg = doubleclicktext.getText();
        System.out.println(actualmsg);
        Assert.assertEquals(actualmsg,"You have done a double click");
        
        WebElement rightclicktext = driver.findElement(By.id("rightClickMessage"));
        String actualmsg1 = rightclicktext.getText();
        System.out.println(actualmsg1);
        Assert.assertEquals(actualmsg1,"You have done a right click");
        
        WebElement clicktext = driver.findElement(By.id("dynamicClickMessage"));
        String actualmsg2 = clicktext.getText();
        System.out.println(actualmsg2);
        Assert.assertEquals(actualmsg2,"You have done a dynamic click");
        
        
        
        
	
	}

}
