package com.parallelpracrice;

import org.testng.annotations.Test;

import utils.CommondMethods;

public class Google extends CommondMethods {

	@Test
	public void setUp() {
		setUpDriver("chrome", "https://www.google.com/");
	}

	
}
