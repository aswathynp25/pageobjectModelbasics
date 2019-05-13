package com.b2.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.b2.base.Page;
import com.b2.pages.crm.crmhomepage;

public class ZooAppPage extends Page {
	
	public void gotoMail() {
	click("Goemail_CSS");
		
	}
	public crmhomepage gotoCRM() {
		click("GoCRM_CSS");
		return new crmhomepage();
	}
	
	public void gotoCalender() {
		click("GoCalender_CSS");
	}
	

}
