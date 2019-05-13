package com.b2.accounts;

import org.openqa.selenium.By;

import com.b2.base.Page;

public class CreateAccountPage extends Page{
public void createAccount(String Accountname) {
	type("AccountName_CSS",Accountname);
}
}
