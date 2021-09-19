package com.actitime.test;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CustomerModule1 {
	@BeforeClass
	public void openBrowser() {
		Reporter.log("open Browser", true);
	}
	@AfterClass
	public void closeBrowser() {
		Reporter.log("close Browser", true);
	}
	@BeforeMethod
	public void login() {
		Reporter.log("Login", true);
	}
	@AfterMethod
	public void logout() {
		Reporter.log("logout", true);
	}
	@Test(priority=1, invocationCount=2)
	public void editCustomer() {
		Reporter.log("edit customer", true);
	}
	@Test
	public void registerCustomer() {
		Reporter.log("register customer", true);
	}
	@Test
	public void deleteCustomer() {
		Reporter.log("delete customer", true);
	}
	
	

}
