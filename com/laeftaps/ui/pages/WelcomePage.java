package com.laeftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import Base.ProjectSpecificMethod;

public class WelcomePage extends ProjectSpecificMethod {
public WelcomePage(RemoteWebDriver driver) {
	this.driver = driver;
}
public homePage clickCRMSFA () {
	driver.findElement(By.linkText("CRM/SFA")).click();
	return new homePage(driver);
	
}


}
