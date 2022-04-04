package com.laeftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import Base.ProjectSpecificMethod;

public class editPage extends ProjectSpecificMethod {
	public editPage(RemoteWebDriver driver) {
		this.driver = driver;
	}
	public editPage enterCompanyname(String cname) {
		
	WebElement compname = driver.findElement(By.id("updateLeadForm_companyName"));
	compname.clear();
	compname.sendKeys(cname);
	
	
	return this;
	}
	
	public viewLead clickUpdate() {
		driver.findElement(By.name("submitButton")).click();
		return new viewLead(driver);
	}
		
}
