package com.class5;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import utils.CommondMethods;

public class Website40FunkCom extends CommondMethods {

	@Test
	public void setUp() {
		setUpDriver("chrome", "https://www.40funk.com/");
	}

	@Test
	public void shop() {
		driver.findElement(By.partialLinkText("SHOP")).click();
		driver.findElement(By.cssSelector("div#thumb-va-hat")).click();
		driver.findElement(By.cssSelector("div#yui_3_17_2_1_1560464088610_119")).click();
	}

}
