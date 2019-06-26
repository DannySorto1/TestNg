package com.class5;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utils.CommondMethods;

public class Task1 extends CommondMethods {

	@Parameters({ "browser", "url", "username", "password" })
	@BeforeMethod
	public void SetUp(String browserType, String url, String username, String password) {
		setUpDriver("browseType", "url");

		if (browserType.equalsIgnoreCase("chrome")) {
			sendText(driver.findElement(By.cssSelector("input#ctl00_MainContent_username")), username);
			sendText(driver.findElement(By.cssSelector("input#ctl00_MainContent_password")), password);
			driver.findElement(By.cssSelector("input.button")).click();
			driver.findElement(By.partialLinkText("Order")).click();
		} else if (browserType.equalsIgnoreCase("firefox")) {
			sendText(driver.findElement(By.cssSelector("input#ctl00_MainContent_username")), username);
			sendText(driver.findElement(By.cssSelector("input#ctl00_MainContent_password")), password);
			driver.findElement(By.cssSelector("input.button")).click();
			driver.findElement(By.partialLinkText("Order")).click();

		}
	}

	@DataProvider
	@Test()
	public Object[][] setUpData() {
		Object[][] data = new Object[2][8];

		data[0][0] = "100";
		data[0][1] = "Johnny Bravo";
		data[0][2] = "123 Bravo Lane";
		data[0][3] = "Bronx";
		data[0][4] = "New York";
		data[0][5] = "22034";
		data[0][6] = "1003804340983";
		data[0][7] = "11/25";

		data[1][0] = "100";
		data[1][1] = "Jimmy Lehay";
		data[1][2] = "1123 Park Lane";
		data[1][3] = "Annandale";
		data[1][4] = "Virginia";
		data[1][5] = "22034";
		data[1][6] = "1003804338453";
		data[1][7] = "11/24";

		return data;
	}

	@Test(dataProvider = "setUpData")
	public void testUser(String Quantity, String userName, String street, String city, String state, String zip,
			String cCard, String EXP) throws InterruptedException {

		sendText(driver.findElement(By.cssSelector("input#ctl00_MainContent_fmwOrder_txtQuantity")), Quantity);
		sendText(driver.findElement(By.cssSelector("input#ctl00_MainContent_fmwOrder_txtName")), userName);
		sendText(driver.findElement(By.cssSelector("input#ctl00_MainContent_fmwOrder_TextBox2")), street);
		sendText(driver.findElement(By.cssSelector("input#ctl00_MainContent_fmwOrder_TextBox3")), city);
		sendText(driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox4")), state);
		sendText(driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox5")), zip);
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_0")).click();
		sendText(driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6")), cCard);
		sendText(driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox1")), EXP);
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("a.btn_light")).click();

	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}
