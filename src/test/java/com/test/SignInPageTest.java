package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SignInPageTest {
	@Test
	public void tc3() {
		System.out.println("browser name >>>>>>>>>>>>>>>>"+System.getProperty("browser"));
		System.out.println("url is >>>>>>>>>>>>>>>>>>>"+System.getProperty("url"));
		Assert.assertTrue(true);
	}

}
