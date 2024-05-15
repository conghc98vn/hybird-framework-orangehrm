package com.orangehrm.admin;

import static org.testng.Assert.assertEquals;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import commons.BaseTest;
import reportConfig.ExtentTestManager;

public class Admin_04_Job_Categories_01 extends BaseTest {
	WebDriver driver;
	
	@BeforeClass
	public void beforeClass() {
		driver = getBrowserDriver("chrome");
	}

	@Test
	public void TC_01(Method method) {
		
		
		ExtentTestManager.startTest(method.getName(), "TC_01_Register_Fail");

		ExtentTestManager.getTest().log(Status.INFO, "Register - Step 01: Verify Register link is displayed");
		assertEquals(true, false);
	}

	@AfterClass
	public void afterClass() {
		quitBrowserDriver();
	}

}
