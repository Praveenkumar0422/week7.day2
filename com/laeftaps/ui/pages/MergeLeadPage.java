package com.laeftaps.ui.pages;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import Base.ProjectSpecificMethod;

public class MergeLeadPage extends ProjectSpecificMethod {
	public MergeLeadPage(RemoteWebDriver driver) {
		this.driver = driver;
	}
	public WindowFromPage clickFrom() {
		 driver.findElement(By.xpath("//img[@alt='Lookup'][1]")).click();
		return new WindowFromPage(driver);

}
	public WindowFromPage clickTo() {
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		
		return new WindowFromPage(driver);
	}
	public viewLead clickMerge() {
	 driver.findElement(By.xpath("//a[text()='Merge']")).click();
     Alert alert=driver.switchTo().alert();
     alert.accept();
     String title2 = driver.getTitle();
     System.out.println(title2);
     return new viewLead(driver);
	}
}
