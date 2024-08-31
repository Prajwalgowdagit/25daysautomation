package demotest;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class CustomerModule {
	@Test(invocationCount = 3)
	public void createCustomer() {
		Assert.fail();
		Reporter.log("createCustomer", true);
	}
	@Test(priority = 1,dependsOnMethods = "createCustomer")
	public void deleteCustomer() {
		Reporter.log("deleteCustomer", true);
	}
	@Test(priority = 0,dependsOnMethods = {"createCustomer","deleteCustomer"})
	public void modifyCustomer() {
		Reporter.log("modifyCustomer", true);
	}
}
//@Test(dependsOnMethods = "createCustomer")==>depends on single method

//@Test(dependsOnMethods = {"createCustomer","modifyCustomer"})==>depending on multiple methods