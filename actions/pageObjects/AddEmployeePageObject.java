package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.BaseActions;
import pageUI.AddEmployeePageUI;

public class AddEmployeePageObject extends BaseActions {
	private WebDriver driver;

	public AddEmployeePageObject(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	public void enterToFirstNameTextbox(String firstNameValue) {
		waitForElementVisible(driver, AddEmployeePageUI.FIRST_NAME_TEXTBOX);
		sendkeyToElement(driver, AddEmployeePageUI.FIRST_NAME_TEXTBOX, firstNameValue);
	}

	public void enterToLasstNameTextbox(String lastNameValue) {
		waitForElementVisible(driver, AddEmployeePageUI.LAST_NAME_TEXTBOX);
		sendkeyToElement(driver, AddEmployeePageUI.LAST_NAME_TEXTBOX, lastNameValue);
	}

	public String getEmployeeID() {
		waitForElementVisible(driver, AddEmployeePageUI.EMPLOYEE_ID_TEXTBOX);
		return getElementAttribute(driver, AddEmployeePageUI.EMPLOYEE_ID_TEXTBOX, "value");
	}

	public void clickSaveButton() {
		waitForElementClickable(driver, AddEmployeePageUI.SAVE_BUTTON);
		clickToElement(driver, AddEmployeePageUI.SAVE_BUTTON);
	}

}
