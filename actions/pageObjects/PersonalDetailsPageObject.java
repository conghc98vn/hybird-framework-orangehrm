package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.BaseActions;
import pageUI.PersonalDetailsPageUI;

public class PersonalDetailsPageObject extends BaseActions {
	private WebDriver driver;

	public PersonalDetailsPageObject(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	public String getFirstNameValue() {
		waitForElementVisible(driver, PersonalDetailsPageUI.EMPLOYEE_ID_TEXTBOX);
		return getElementAttribute(driver, PersonalDetailsPageUI.FIRSTNAME_TEXTBOX, "value");
	}

	public String getLastNameValue() {
		waitForElementVisible(driver, PersonalDetailsPageUI.EMPLOYEE_ID_TEXTBOX);
		return getElementAttribute(driver, PersonalDetailsPageUI.LASTNAME_TEXTBOX, "value");
	}

	public String getEmployeeIDValue() {
		waitForElementVisible(driver, PersonalDetailsPageUI.EMPLOYEE_ID_TEXTBOX);
		return getElementAttribute(driver, PersonalDetailsPageUI.EMPLOYEE_ID_TEXTBOX, "value");
	}
}
