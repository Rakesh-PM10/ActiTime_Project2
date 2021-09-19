package com.actitime.test;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ProjectModule {
	@Test
	public void createProject() {
		Reporter.log("create project", true);
	}
	@Test
	public void modifyProject() {
		Reporter.log("modify project", true);
	}
	@Test
	public void deleteProject() {
		Reporter.log("delete project", true);
	}

}
