package com.laeftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import Base.ProjectSpecificMethod;

public class LoginPage extends ProjectSpecificMethod {
public LoginPage(RemoteWebDriver driver) {
	this.driver = driver;
	
}
public LoginPage enterUsername(String username) {
	driver.findElement(By.id("username")).sendKeys(username);
	return this;
	
}
public LoginPage enterPassword(String pswd) {
	driver.findElement(By.id("password")).sendKeys(pswd);
	return this;
	
}

public WelcomePage clickLoginButton_Positive() {
	driver.findElement(By.className("decorativeSubmit")).click();
	return new WelcomePage(driver);
	
	
}
public LoginPage  clickLoginButton_Negative() {
	driver.findElement(By.className("decorativeSubmit")).click();
	return this;
	
}



}
