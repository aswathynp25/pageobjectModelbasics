package com.b2.accounts;


import org.openqa.selenium.By;

import com.b2.base.Page;

public class accountsPage extends Page{
	
	public CreateAccountPage gotocreateaccount(){
		//driver.findElement(By.xpath("/html[1]/body[1]/div[13]/div[13]/crm-begin-page[1]/crm-accounts-blankpage[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/link-to[1]/lyte-button[1]/button[1]/lyte-yield[1]")).click();
		//driver.findElement(By.cssSelector("button.lyte-button.lytePrimaryBtn > lyte-yield")).click();
	//driver.findElement(By.xpath(".//*[normalize-space(text()) and normalize-space(.)='Other businesses'])[1]/following::lyte-yield[1]")).click();
	click("CreateAccountPage_XPATH");
	return new CreateAccountPage();
	}
	
	public void gotoimportAccounts() {
		
	}

}
