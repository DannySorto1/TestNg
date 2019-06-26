package com.class4;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utils.CommondMethods;

public class parametersSauceDemo extends CommondMethods {

	@Parameters({ "browser", "url" })
	@BeforeMethod(alwaysRun = true)
	public void setUp(String browser, String url) {
		setUpDriver(browser, url);
	}

//	@Parameters({ "user", "pass" })
//	@Test
//	public void userName1(String user, String pass) {
//		sendText(driver.findElement(By.cssSelector("input#user-name")), user);
//		sendText(driver.findElement(By.cssSelector("input#password")), pass);
//		driver.findElement(By.cssSelector("input.btn_action")).click();
//		Assert.assertEquals(driver.findElement(By.xpath("//div[text()='Products']")).isDisplayed(), true);
//	}
//
//	@Parameters({ "user2", "pass2" })
//	@Test()
//	public void userName2(String user2, String pass2) {
//		sendText(driver.findElement(By.cssSelector("input#user-name")), user2);
//		sendText(driver.findElement(By.cssSelector("input#password")), pass2);
//		driver.findElement(By.cssSelector("input.btn_action")).click();
//		Assert.assertEquals(driver.findElement(By.xpath("//div[text()='Products']")).isDisplayed(), true);
//	}
//
//	@AfterMethod(alwaysRun = true)
//	public void tearDown() {
//		driver.close();
//	}
}
