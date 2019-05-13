package com.b2.testcases;

import java.util.Hashtable;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.b2.base.Page;
import com.b2.pages.ZooAppPage;
import com.b2.accounts.CreateAccountPage;
import com.b2.accounts.accountsPage;
import com.b2.utilities.Utilities;

public class CreateAccountTest {
	
	@Test(dataProviderClass=Utilities.class,dataProvider="dp")
	public void createAccountTest(Hashtable<String,String> data){
		
		ZooAppPage zp = new ZooAppPage();
		zp.gotoCRM();
		accountsPage account = Page.menu.gotoAccounts();
		CreateAccountPage cap = account.gotocreateaccount();
		cap.createAccount(data.get("accountname"));
	//	Assert.fail("Create account test failed");
		
	}

}
