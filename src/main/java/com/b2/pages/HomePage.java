package com.b2.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.b2.base.Page;

public class HomePage extends Page {
	
public void gotoSignupnow() {
		
	}
public LoginPage gotoLogin() {
	click("loginlink_CSS");
	return new LoginPage();
}

public void gotocustomer() {
	//driver.findElement(By.cssSelector("")).click();
}

public void gotoSupport() {
	driver.findElement(By.cssSelector("a.zh-contact")).click();
}

public void gotoContactSales() {
	
}

public void ValidatefooterLinks() {
	
}
}
