package com.b2.testcases;

import java.util.Hashtable;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.b2.pages.HomePage;
import com.b2.pages.LoginPage;
import com.b2.pages.ZooAppPage;
import com.b2.utilities.Utilities;

public class LoginTest extends BaseTest{
	@Test(dataProviderClass = Utilities.class, dataProvider = "dp")
	public void loginTest(Hashtable<String,String> data) throws InterruptedException{
	HomePage hp=new HomePage();

	//Thread.sleep(1000);

	LoginPage lp=hp.gotoLogin();

	//Thread.sleep(2000);

	ZooAppPage zp=lp.doLogin(data.get("username"),data.get("password"));
	//Thread.sleep(2000);

	}
}
