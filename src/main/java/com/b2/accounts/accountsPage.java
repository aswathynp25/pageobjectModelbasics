package com.b2.accounts;


import org.openqa.selenium.By;

import com.b2.base.Page;

public class accountsPage extends Page{
	
	public CreateAccountPage gotocreateaccount(){
		
		// creating account
	click("CreateAccountPage_XPATH");
	return new CreateAccountPage();
	}
	
	public void gotoimportAccounts() {
		
	}

}
