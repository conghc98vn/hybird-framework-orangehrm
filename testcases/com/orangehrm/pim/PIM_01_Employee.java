package com.orangehrm.pim;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import commons.BaseTest;
import commons.GlobalConstants;
import commons.PageGeneratorManager;
import pageObjects.AddEmployeePageObject;
import pageObjects.DashboardPageObject;
import pageObjects.EmployeeListPageObject;
import pageObjects.LoginPageObject;
import pageObjects.PersonalDetailsPageObject;
import reportConfig.ExtentTestManager;

public class PIM_01_Employee extends BaseTest {
	private WebDriver driver;
	private String browserName;

	private String employeeID, firstName, lastName;

	private LoginPageObject loginPage;
	private DashboardPageObject dashboardPage;
	private EmployeeListPageObject employeeListPage;
	private AddEmployeePageObject addEmployeePage;
	private PersonalDetailsPageObject personalDetailsPage;

	@Parameters({ "url", "browser" })
	@BeforeClass
	public void beforeClass(String url, String browserName) {
		driver = getBrowserDriver(browserName, url);
		this.browserName = browserName;

		firstName = "Michel";
		lastName = "Owen";

		loginPage = PageGeneratorManager.getLoginPage(driver);

		loginPage.enterToUsernameTextbox(GlobalConstants.ADMIN_USERNAME);
		loginPage.enterToPasswordTextbox(GlobalConstants.ADMIN_PASSWORD);
		dashboardPage = loginPage.clickToLoginButton();

		employeeListPage = dashboardPage.openToPIMModule();

	}

	@Test
	public void TC_01_Add_New(Method method) {
		ExtentTestManager.startTest(method.getName() + "- Run on " + browserName.toUpperCase(), "TC_01_Register_Fail");

		addEmployeePage = employeeListPage.clickAddEmployeeButton();

		addEmployeePage.enterToFirstNameTextbox(firstName);
		addEmployeePage.enterToLasstNameTextbox(lastName);
		employeeID = addEmployeePage.getEmployeeID();

		addEmployeePage.clickSaveButton();

		Assert.assertTrue(addEmployeePage.isDynamicSuccessMessageDisplayed("Successfully Saved"));

		addEmployeePage.waitForSpinnerIconInvisible();

		personalDetailsPage = PageGeneratorManager.getPersonalDetailsPage(driver);

		Assert.assertEquals(personalDetailsPage.getFirstNameValue(), firstName);
		Assert.assertEquals(personalDetailsPage.getLastNameValue(), lastName);
		Assert.assertEquals(personalDetailsPage.getEmployeeIDValue(), employeeID);

		employeeListPage = personalDetailsPage.openToPIMModule();

		employeeListPage.enterToEmployeeIDTextbox(employeeID);
		employeeListPage.clickToSearchButton();

		Assert.assertTrue(employeeListPage.isValueDisplayedAtColumnName("Id"), employeeID);
		Assert.assertTrue(employeeListPage.isValueDisplayedAtColumnName("First (& Middle) Name"), employeeID);
		Assert.assertTrue(employeeListPage.isValueDisplayedAtColumnName("Last Name"), employeeID);

		ExtentTestManager.getTest().log(Status.INFO, "Register - Step 01: Verify Register link is displayed");
	}

//	@Test
//	public void TC_02_Personal_Details(Method method) {
//		ExtentTestManager.startTest(method.getName() + "- Run on " + browserName.toUpperCase(), "TC_02_Personal_Details");
//	}
//
//	@Test
//	public void TC_03_Contact_Details(Method method) {
//		ExtentTestManager.startTest(method.getName() + "- Run on " + browserName.toUpperCase(), "TC_03_Contact_Details");
//	}
//
//	@Test
//	public void TC_04_Emergency_Contacts(Method method) {
//		ExtentTestManager.startTest(method.getName() + "- Run on " + browserName.toUpperCase(), "TC_04_Emergency_Contacts");
//	}
//
//	@Test
//	public void TC_05_Dependents(Method method) {
//		ExtentTestManager.startTest(method.getName() + "- Run on " + browserName.toUpperCase(), "TC_05_Dependents");
//	}
//
//	@Test
//	public void TC_06_Immigration(Method method) {
//		ExtentTestManager.startTest(method.getName() + "- Run on " + browserName.toUpperCase(), "TC_06_Immigration");
//	}
//
//	@Test
//	public void TC_07_Job(Method method) {
//		ExtentTestManager.startTest(method.getName() + "- Run on " + browserName.toUpperCase(), "TC_07_Job");
//	}
//
//	@Test
//	public void TC_08_Salary(Method method) {
//		ExtentTestManager.startTest(method.getName() + "- Run on " + browserName.toUpperCase(), "TC_08_Salary");
//	}
//
//	@Test
//	public void TC_09_Report(Method method) {
//		ExtentTestManager.startTest(method.getName() + "- Run on " + browserName.toUpperCase(), "TC_09_Report");
//	}
//
//	@Test
//	public void TC_010_Qualifications(Method method) {
//		ExtentTestManager.startTest(method.getName() + "- Run on " + browserName.toUpperCase(), "TC_010_Qualifications");
//	}

	@AfterClass
	public void afterClass() {
		closeBrowserDriver();
	}

}
