package com.laeftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import Base.ProjectSpecificMethod;

public class DuplicateLeadPage extends ProjectSpecificMethod {
	public DuplicateLeadPage(RemoteWebDriver driver) {
		this.driver = driver;
	}
	public DuplicateLeadPage clickCreate() {
		driver.findElement(By.name("submitButton")).click();
		return this;
	}
	

}
