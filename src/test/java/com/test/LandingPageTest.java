package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LandingPageTest {
	@Test
	public void tc1() {
		System.out.println("browser name >>>>>>>>>>>>>>>>"+System.getProperty("browser"));
		System.out.println("url is >>>>>>>>>>>>>>>>>>>"+System.getProperty("url"));
		Assert.assertTrue(true);
	}
	
	@Test
	public void tc2() {
		System.out.println("browser name >>>>>>>>>>>>>>>>"+System.getProperty("browser"));
		System.out.println("url is >>>>>>>>>>>>>>>>>>>"+System.getProperty("url"));
		Assert.assertTrue(true);
		
	}
	
	@Test
	public void tc3() {
		System.out.println("browser name >>>>>>>>>>>>>>>>"+System.getProperty("browser"));
		System.out.println("url is >>>>>>>>>>>>>>>>>>>"+System.getProperty("url"));
		Assert.assertTrue(true);
	}

}
