package com.b2.rough;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.b2.accounts.CreateAccountPage;
import com.b2.accounts.accountsPage;
import com.b2.base.Page;
import com.b2.pages.HomePage;
import com.b2.pages.LoginPage;
import com.b2.pages.ZooAppPage;

public class LoginTest {
	public static void main(String[] args) throws InterruptedException {
HomePage hp=new HomePage();

Thread.sleep(1000);

LoginPage lp=hp.gotoLogin();

Thread.sleep(2000);

ZooAppPage zp=lp.doLogin("9496768227", "Aswathy@123");
//zp.gotoCRM();

Thread.sleep(2000);
//accountsPage account=Page.menu.gotoAccounts();

Thread.sleep(2000);

//CreateAccountPage cap=account.gotocreateaccount();
//cap.createAccount("Achu");

}
}