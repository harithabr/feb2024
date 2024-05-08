package com.steps;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class SeleniumSteps {
	
	WebDriver driver;
	
	@Given("I navigated url on browser")
	public void i_navigated_url_on_browser() {
		 WebDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	     driver.manage().window().maximize();
		 driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@When("I enter user name into user input field")
	public void i_enter_user_name_into_user_input_field() {
		  driver.findElement(By.name("username")).sendKeys("admin");
		
		}
	@When("I enter password into password field")
	public void i_enter_user_name_into_user_password_field() {
		  driver.findElement(By.name("password")).sendKeys("admin123");
		
		}
	@When("I click on login button")
	public void i_click_on_login_button() {
		  driver.findElement(By.tagName("button")).click();
		
		}
	@Then("I verify user login successfully")
	public void i_verify_user_loginsucessfully() {
		Assert.assertTrue(driver.findElement(By.cssSelector
				("[alt=\"profile picture\"]")).isDisplayed());
	
	}
	@Then("Verify all menus option")
	public void verify_all_menus_option(DataTable table) {
		
		List<Map<String, String>> datas =table.asMaps();
		
		for(Map<String, String> map: datas) {
			System.out.println(map.get("Header"));
			Assert.assertTrue(driver.findElement(By.xpath
					("//*[@class=\"oxd-main-menu-item-wrapper\"]/a/span[text()"
							+ "='"+map.get("Header")+"']")).isDisplayed());
		}
		
	}
	
}

















