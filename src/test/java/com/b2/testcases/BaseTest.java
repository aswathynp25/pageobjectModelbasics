package com.b2.testcases;

import org.testng.annotations.AfterSuite;

import com.b2.base.Page;

public class BaseTest {

	@AfterSuite
	public void tearDown() {
		Page.quit();
	}
}
