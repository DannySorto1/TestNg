package com.class4;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import utils.CommondMethods;

public class parameterExampleTwo extends CommondMethods {

	@Parameters({ "browser", "url" })
	@Test
	public void testGoogle(String browser, String url) {
		setUpDriver(browser, url);
	}

}
