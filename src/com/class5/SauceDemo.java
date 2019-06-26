package com.class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utils.CommondMethods;

public class SauceDemo extends CommondMethods {
	@Parameters({"browser"})
	@Test
	public void testCrossBrowser(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
		setUpDriver(browser, "https://www.saucedemo.com/");
		sendText(driver.findElement(By.cssSelector("input#user-name")),"standard_user");
		sendText(driver.findElement(By.cssSelector("input#password")), "secret_sauce");
		driver.findElement(By.cssSelector("input.btn_action")).click();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			setUpDriver(browser, "https://www.saucedemo.com/");
			sendText(driver.findElement(By.cssSelector("input#user-name")),"standard_user");
			sendText(driver.findElement(By.cssSelector("input#password")), "secret_sauce");
			driver.findElement(By.cssSelector("input.btn_action")).click();	
		}
	}
//	
//	@DataProvider(name ="sauceData")
//	public Object [] []  setUpData(){
//		Object [] [] data = new Object [4] [2];
//		
//		data [0] [0]="standard_user";
//		data [0] [1] ="secret_sauce";
//		
//		
//		data [1][0]="locked_out_user";
//		data [1] [1] ="secret_sauce";
//		
//		
//		data [2] [0] ="problem_user";
//		data [2] [1] ="secret_sauce";
//		
//		
//		data[3][0]="performance_glitch_user";
//		data[3][1]="secret_sauce";
//		
//		
//		return data;
//		
//		
//		
//		
//	}
//	
//	@Test(dataProvider ="sauceData")
//	public void testUsers(String username, String password) {
//		sendText(driver.findElement(By.cssSelector("input#user-name")), username);
//		sendText(driver.findElement(By.cssSelector("input#password")), password);
//		driver.findElement(By.cssSelector("input.btn_action")).click();
//		WebElement mainPageTitle = driver.findElement(By.xpath("//div[text()='Products']"));
//		Assert.assertTrue(mainPageTitle.isDisplayed());
//		System.out.println("User: "+username +" successful logged in");
//		
//		
//	}
//	
//	
//	
//	
//	
//	@AfterMethod
//	public void tearDown() {
//		driver.close();
//	}
}
