package com.laeftaps.ui.test;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.laeftaps.ui.pages.LoginPage;

import Base.ProjectSpecificMethod;

public class CreateLeat_TC001 extends ProjectSpecificMethod {
	
	@BeforeTest
	public void call() {
		filename="sample";
	}

	@Test(dataProvider = "fetchdata")
	public void run_Tc001(String username, String pswd, String cname, String fname, String lname,String phno) {
		new LoginPage(driver)
		.enterUsername(username)
		.enterPassword(pswd)
		.clickLoginButton_Positive()
		.clickCRMSFA()
		.clickLead()
		.createLead()
		.enterCompanyName(cname)
		.enterFirstName(fname)
		.enterLastName(lname)
		.enterPhoneNum(phno)
		.clickSubmit()
		.verifyLead();
		
	}

}
