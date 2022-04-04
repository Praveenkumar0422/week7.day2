package com.laeftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import Base.ProjectSpecificMethod;

public class CreateLeadPage extends ProjectSpecificMethod {
	public CreateLeadPage(RemoteWebDriver driver) {
		this.driver = driver;
	}

	public CreateLeadPage enterCompanyName(String cname) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		return this;
		
	}
	public CreateLeadPage enterFirstName(String fname) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		return this;
}
	public CreateLeadPage enterLastName(String lname) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		return this;
}
	public CreateLeadPage enterPhoneNum(String phno) {
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("99");
		return this;
}
	public viewLead clickSubmit() {
		driver.findElement(By.name("submitButton")).click();
		return new viewLead(driver);
}
	
	
}

