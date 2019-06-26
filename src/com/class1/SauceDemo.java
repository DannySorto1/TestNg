package com.class1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utils.CommondMethods;

//TC 1: Swag Lab Title and Login Verification
//
//@BeforeMethod should contain navigation to the URL and title verification
//
//@Test should contain steps to login and “Product” word verification
//
//@AfterMethod should logOut from the application and close the browser

public class SauceDemo extends CommondMethods {

	@BeforeMethod
	public void beforeMethod() {
		setUpDriver("chrome", "https://www.saucedemo.com/");
	}

	@Test
	public void login() {
		sendText(driver.findElement(By.cssSelector("input#user-name")), "standard_user");
		sendText(driver.findElement(By.cssSelector("input#password")), "secret_sauce");
		driver.findElement(By.className("btn_action")).click();
		WebElement text = driver.findElement(By.xpath("//div[text()='Products']"));
		String tex = text.getText();
		System.out.println(tex);

		if (tex.contains("Products")) {
			System.out.println("Text is available");
		} else {
			System.out.println("Text is not available");
		}
	}

	@AfterMethod
	public void close() {
		driver.close();
	}

}
