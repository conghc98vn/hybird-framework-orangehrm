package commons;

import org.openqa.selenium.WebDriver;

import pageObjects.AddEmployeePageObject;
import pageObjects.ContactDetailsPageObject;
import pageObjects.DashboardPageObject;
import pageObjects.DependentsPageObject;
import pageObjects.EmergencyContactPageObject;
import pageObjects.EmployeeListPageObject;
import pageObjects.ImmigrationPageObject;
import pageObjects.JobEmployeePageObject;
import pageObjects.LoginPageObject;
import pageObjects.PersonalDetailsPageObject;
import pageObjects.QuanlificationsPageObject;
import pageObjects.ReportPageObject;
import pageObjects.SalaryPageObject;

public class PageGeneratorManager {
	public static AddEmployeePageObject getEmployeePage(WebDriver driver) {
		return new AddEmployeePageObject(driver);
	}
	public static ContactDetailsPageObject getContactDetailsPage(WebDriver driver) {
		return new ContactDetailsPageObject(driver);
	}
	
	public static AddEmployeePageObject getAddEmployeePage(WebDriver driver) {
		return new AddEmployeePageObject(driver);
	}
	
	public static DashboardPageObject getDashboardPage(WebDriver driver) {
		return new DashboardPageObject(driver);
	}
	
	public static DependentsPageObject getDependentsPage(WebDriver driver) {
		return new DependentsPageObject(driver);
	}
	
	public static EmergencyContactPageObject getEmergencyContactPage(WebDriver driver) {
		return new EmergencyContactPageObject(driver);
	}
	
	public static EmployeeListPageObject getEmployeeListPage(WebDriver driver) {
		return new EmployeeListPageObject(driver);
	}
	
	public static ImmigrationPageObject getImmigrationPage(WebDriver driver) {
		return new ImmigrationPageObject(driver);
	}
	
	public static JobEmployeePageObject getJobEmployeePage(WebDriver driver) {
		return new JobEmployeePageObject(driver);
	}
	
	public static LoginPageObject getLoginPage(WebDriver driver) {
		return new LoginPageObject(driver);
	}
	
	public static PersonalDetailsPageObject getPersonalDetailsPage(WebDriver driver) {
		return new PersonalDetailsPageObject(driver);
	}
	
	public static QuanlificationsPageObject getQuanlificationsPage(WebDriver driver) {
		return new QuanlificationsPageObject(driver);
	}
	
	public static ReportPageObject getReportPage(WebDriver driver) {
		return new ReportPageObject(driver);
	}
	public static SalaryPageObject getSalaryPage(WebDriver driver) {
		return new SalaryPageObject(driver);
	}
}
