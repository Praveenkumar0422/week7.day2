package com.laeftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import Base.ProjectSpecificMethod;

public class leadPage extends ProjectSpecificMethod {
public leadPage(RemoteWebDriver driver) {
	this.driver = driver;
}
public CreateLeadPage createLead() {
	driver.findElement(By.linkText("Create Lead")).click();
	return new CreateLeadPage(driver);
	
}
public MergeLeadPage clickMergeLead() {

	   driver.findElement(By.xpath("//a[text()='Merge Leads']")).click();
    return new MergeLeadPage(driver);
	
	
}
public FindLeadPage clickFindLead() {

	driver.findElement(By.linkText("Find Leads")).click();
 return new FindLeadPage(driver);
	
	
}






}
