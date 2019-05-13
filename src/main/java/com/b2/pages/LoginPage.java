package com.b2.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.b2.base.Page;

public class LoginPage extends Page{

	public ZooAppPage doLogin(String username,String password) throws InterruptedException {
		
		type("email_CSS",username);
		Thread.sleep(2000);
		type("password_CSS",password);
		Thread.sleep(2000);
		click("signbtn_CSS");
		Thread.sleep(2000);
		return new ZooAppPage();
	}
	
	
	
	public void dosignup() {
		
	}
}
