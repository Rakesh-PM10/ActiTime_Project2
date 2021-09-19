package com.actitime.test;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CustomerModule {
	@Test(priority=1)
	public void createCustomer() {
		Reporter.log("create customer", true);
		System.out.println();
	}
	@Test(priority=2, invocationCount=4)
	public void modifyCustomer() {
		Reporter.log("modify customer", true);
	}
	@Test(dependsOnMethods= {"createCustomer"})
	public void deleteCustomer() {
		Reporter.log("delete customer", true);
	}

}
