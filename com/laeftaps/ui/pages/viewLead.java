package com.laeftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import Base.ProjectSpecificMethod;

public class viewLead extends ProjectSpecificMethod {
public viewLead(RemoteWebDriver driver) {
	this.driver = driver;
}
public viewLead verifyLead() {
	String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
	System.out.println(text);
	return this;
	
}
public leadPage clickdelete() {
	driver.findElement(By.linkText("Delete")).click();
	
	return new leadPage(driver);
	
}
public editPage clickEdit() {
	driver.findElement(By.linkText("Edit")).click();
	
	return new editPage(driver);
	
}
public DuplicateLeadPage clickDuplicate() {
	driver.findElement(By.linkText("Duplicate Lead")).click();
	
	return new DuplicateLeadPage(driver);


}
}
