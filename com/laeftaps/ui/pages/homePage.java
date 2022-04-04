package com.laeftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import Base.ProjectSpecificMethod;

public class homePage extends ProjectSpecificMethod {
public homePage(RemoteWebDriver driver) {
	this.driver = driver;
}
public leadPage clickLead() {
	driver.findElement(By.linkText("Leads")).click();
	return new leadPage(driver);
	
}

	



}
