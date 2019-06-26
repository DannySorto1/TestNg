package com.class3;

import org.testng.annotations.Test;

public class DependsOnMethods {

	
	@Test
	public void one() {
		System.out.println("one Test");
		
	}
	@Test(dependsOnMethods="one")
	public void two() {
		System.out.println("Two test");
	}
	@Test(dependsOnMethods="two")
	public void three() {
		System.out.println("three Test");
	}
}
