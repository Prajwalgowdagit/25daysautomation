package com.actitime.testscript;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

public class TaskModule extends BaseClass{
	@Test(groups = "smoketest")
	public void createTask() {
		driver.findElement(By.linkText("USERS")).click();
		Reporter.log("createTask", true);
	}
	@Test(groups = "regressiontest")
	public void deleteTask() {
		driver.findElement(By.linkText("USERS")).click();
		Reporter.log("deleteTask", true);
	}
	@Test(groups = "regressiontest")
	public void modifyTask() {
		driver.findElement(By.linkText("USERS")).click();
		Reporter.log("modifyTask", true);
	}
}
