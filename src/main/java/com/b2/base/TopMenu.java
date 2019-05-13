package com.b2.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.b2.accounts.accountsPage;

public class TopMenu  {
	/*
	 * 
	 */
	
	WebDriver driver;
	
	public TopMenu(WebDriver driver) {
		this.driver=driver;
	}
	
	
public void gotoHome() {
	
}
public void gotoFeeds() {
	
}

public void gotoLeads() {
	
}

public accountsPage gotoAccounts() {
	Page.click("GoAccount_XPATH");
	return new accountsPage();
}
public void signout() {
	
}
}
