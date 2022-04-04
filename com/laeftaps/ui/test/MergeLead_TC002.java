package com.laeftaps.ui.test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.laeftaps.ui.pages.LoginPage;

import Base.ProjectSpecificMethod;

public class MergeLead_TC002 extends ProjectSpecificMethod {
	@BeforeTest
	public void call() {
		filename="login";
	
	}

	@Test(dataProvider = "fetchdata")
	public void run_Tc003(String username,String pswd,String fname,String fname2) throws InterruptedException {
		new LoginPage(driver)
		.enterUsername(username)
		.enterPassword(pswd)
		.clickLoginButton_Positive()
		.clickCRMSFA()
		.clickLead()
		.clickMergeLead()
		.clickFrom()
		.clickFirstLead(fname)
		.clickTo()
		
		.clickSecondLead(fname2)
		.clickMerge()
		.verifyLead();
	}

}
