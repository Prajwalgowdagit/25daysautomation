package com.actitime.testscript;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
@Listeners(com.actitime.generic.ListenerImplementation.class)
public class CustomerModule extends BaseClass {
	@Test(groups = "smoketest")
	public void createCustomer() {
		driver.findElement(By.linkText("TASKS")).click();
		Reporter.log("createCustomer", true);
	}
	@Test(groups = "regressiontest")
	public void deleteCustomer() {
		driver.findElement(By.linkText("TASKS")).click();
		Reporter.log("deleteCustomer", true);
	}
	@Test(groups = "regressiontest")
	public void modifyCustomer() {
		driver.findElement(By.linkText("TASKS")).click();
		Reporter.log("modifyCustomer", true);
	}
}


//@Test(groups = "smoketest")
//@Test(groups = {"regressiontest","smoketest"})