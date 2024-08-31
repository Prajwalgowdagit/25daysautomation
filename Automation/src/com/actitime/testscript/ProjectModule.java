package com.actitime.testscript;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

public class ProjectModule extends BaseClass{
	
	@Test(groups = "smoketest")
	public void createProject() {
		driver.findElement(By.linkText("REPORTS")).click();
		Reporter.log("createProject", true);
	}
	@Test(groups = "regressiontest")
	public void deleteProject() {
		driver.findElement(By.linkText("REPORTS")).click();
		Reporter.log("deleteProject", true);
	}
	@Test(groups = "regressiontest")
	public void modifyProject() {
		driver.findElement(By.linkText("REPORTS")).click();
		Reporter.log("modifyProject", true);
	}
}
