package com.class5;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import utils.CommondMethods;

public class GoogleParallelTest extends CommondMethods {

	@Test
	public void SetUpSearch() {
		setUpDriver("chrome", "https://www.google.com/");
		sendText(driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")), "40funk.com");
		driver.findElement(By.xpath("//div[@class='VlcLAe']//input[@name='btnK']")).click();
		driver.findElement(By.xpath("//h3[text()='40FUNK']")).click();
		
		//Shop
		driver.findElement(By.partialLinkText("SHOP")).click();
		driver.findElement(By.cssSelector("div#thumb-va-hat")).click();
		driver.findElement(By.cssSelector("div#yui_3_17_2_1_1560464088610_119")).click();

	}

}
