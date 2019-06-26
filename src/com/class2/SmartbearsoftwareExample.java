package com.class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import utils.CommondMethods;

public class SmartbearsoftwareExample extends CommondMethods {

	@BeforeClass
	public void setUp() {
		setUpDriver("chrome", "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
	}

	@Test(priority = 1)
	public void loginScreenTitle() throws InterruptedException {
		String loginScreenTitle = driver.getTitle();
		String exptitle = "Web Orders Login";
		if (loginScreenTitle.equals(exptitle)) {
			System.out.println("this is the right title");
		} else {
			System.out.println("this is the wrong  title");
		}
		Thread.sleep(2000);
	}

	@Test(priority = 2)
	public void login() throws InterruptedException {
		sendText(driver.findElement(By.xpath("//input[contains(@id,'username')]")), "Tester");
		Thread.sleep(1000);
		sendText(driver.findElement(By.xpath("//input[contains(@id,'password')]")), "test");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[contains(@id,'login_button')]")).click();
	}

	@Test(priority = 3)
	public void webOrders() throws InterruptedException {
		WebElement webOrderTitle = driver.findElement(By.xpath("//h1[text()='Web Orders']"));
		if (webOrderTitle.isDisplayed()) {
			System.out.println("webOrderTitle is Displayed");
		} else {
			System.out.println("webOrderTitle is not Displayed");
		}
		Thread.sleep(1000);
	}

	@AfterClass
	public void closed() {
		driver.close();
	}

}
