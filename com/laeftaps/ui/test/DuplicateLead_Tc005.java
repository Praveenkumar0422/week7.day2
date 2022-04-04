package com.laeftaps.ui.test;

import org.testng.annotations.BeforeTest;

import com.laeftaps.ui.pages.LoginPage;

import Base.ProjectSpecificMethod;

public class DuplicateLead_Tc005 extends ProjectSpecificMethod{
	@BeforeTest
	public void call() {
		filename="credential";
	}
	
	public void run_TC004(String username,String pswd,String phno) throws InterruptedException {
		new LoginPage(driver)
		.enterUsername(username)
		.enterPassword(pswd)
		.clickLoginButton_Positive()
		.clickCRMSFA()
		.clickLead()
		.clickFindLead()
		.clickPhone()
		.enterPhone(phno)
		.clickLeadId()
		.clickDuplicate()
		.clickCreate();
		
	}

}
