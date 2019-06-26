package com.class4;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utils.CommondMethods;

public class HomeWork extends CommondMethods {

	@Parameters({ "browser", "url" })
	@BeforeClass
	public void setUp(String browser, String url) {
		setUpDriver(browser, url);
	}

	@Parameters({ "user", "pass" })
	@Test(priority = 1)
	public void login(String user, String pass) {
		sendText(driver.findElement(By.cssSelector("input#ctl00_MainContent_username")), user);
		sendText(driver.findElement(By.cssSelector("input#ctl00_MainContent_password")), pass);
		driver.findElement(By.cssSelector("input#ctl00_MainContent_login_button")).click();

	}

	@Test(priority = 2)
	public void clickAll() throws InterruptedException {
		driver.findElement(By.cssSelector("a#ctl00_MainContent_btnCheckAll")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input#ctl00_MainContent_btnDelete")).click();
		Thread.sleep(1000);

	}

	@AfterClass
	public void tearDown() {
		driver.close();
	}
}
