package com.laeftaps.ui.test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.laeftaps.ui.pages.LoginPage;

import Base.ProjectSpecificMethod;

public class EditLead_TC004 extends ProjectSpecificMethod {
	@BeforeTest
	public void call() {
		filename="editLead";
	
	}

	@Test(dataProvider = "fetchdata")
	public void run_Tc003(String username,String pswd,String phno,String cname) throws InterruptedException {
		new LoginPage(driver)
		.enterUsername(username)
		.enterPassword(pswd)
		.clickLoginButton_Positive()
		.clickCRMSFA()
		.clickLead()
		.clickFindLead()
		.clickPhone()
		.enterPhone(phno)
		.clickFind()
		.clickLeadId()
		.clickEdit()
		.enterCompanyname(cname)
		.clickUpdate()
		.verifyLead();
	
		
	}

}
