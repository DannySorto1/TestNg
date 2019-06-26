package com.class3;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utils.CommondMethods;

public class FaceBookTask extends CommondMethods {

	@Parameters({ "browser", "url" })
	@BeforeMethod(alwaysRun = true)
	public void setUp(String browser, String url) {
		setUpDriver(browser, url);
	}

	@Parameters({ "user", "pass" })
	@Test
	public void login(String user, String pass) {
		sendText(driver.findElement(By.cssSelector("input#email")), user);
		sendText(driver.findElement(By.cssSelector("input#pass")), pass);
		driver.findElement(By.cssSelector("input#u_0_2")).click();
	}

	@Test
	public void Dms() {

	}

	@AfterMethod(alwaysRun = true)
	public void tearDown() {
		driver.close();
	}
}
