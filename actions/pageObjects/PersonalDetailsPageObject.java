package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.BaseActions;
import pageUI.PersonalDetailsPageUI;
import pojoData.EmployeeInfo;

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

	public boolean isPersonalDetailsHeaderDisplayed() {
		waitForElementVisible(driver, PersonalDetailsPageUI.PERSONAL_DETAILS_PAGE_HEADER);
		return isElementDisplayed(driver, PersonalDetailsPageUI.PERSONAL_DETAILS_PAGE_HEADER);
	}

	public void enterToDriversLicenseNumberTextbox(String driversLicenseNumber) {
		waitForElementVisible(driver, PersonalDetailsPageUI.DRIVERS_LICENSE_NUMBER_TEXTBOX);
		sendkeyToElement(driver, PersonalDetailsPageUI.DRIVERS_LICENSE_NUMBER_TEXTBOX, driversLicenseNumber);
	}

	public void enterToLicenseExpiryDateTextbox(String licenseExpiryDate) {
		waitForElementVisible(driver, PersonalDetailsPageUI.LICENSE_EXPIRY_DATE_TEXTBOX);
		sendkeyToElement(driver, PersonalDetailsPageUI.LICENSE_EXPIRY_DATE_TEXTBOX, licenseExpiryDate);
	}

	public void selectToNationalityDropdown(String nationality) {
		waitForElementVisible(driver, PersonalDetailsPageUI.NATIONALITY_DROPDOWN_PARENT);
		selectItemInCustomDropdown(driver, PersonalDetailsPageUI.NATIONALITY_DROPDOWN_PARENT,
				PersonalDetailsPageUI.NATIONALITY_DROPDOWN_CHILD, nationality);
	}

	public void selectToMaritalStatusDropdown(String maritalStatus) {
		waitForElementVisible(driver, PersonalDetailsPageUI.MARITAL_STATUS_DROPDOWN_PARENT);
		selectItemInCustomDropdown(driver, PersonalDetailsPageUI.MARITAL_STATUS_DROPDOWN_PARENT,
				PersonalDetailsPageUI.MARITAL_STATUS_DROPDOWN_CHILD, maritalStatus);
	}

	public void enterToDateOfBirthTextbox(String dateOfBirth) {
		waitForElementVisible(driver, PersonalDetailsPageUI.DATE_OF_BIRTH_TEXTBOX);
		sendkeyToElement(driver, PersonalDetailsPageUI.DATE_OF_BIRTH_TEXTBOX, dateOfBirth);
	}

	public void clickToGenderRadioButton(String genderStatus) {
		clickToElementByJS(driver, PersonalDetailsPageUI.DYNAMIC_GENDER_RADIO_BUTTON_BY_TEXT, genderStatus);
	}

	public void clickToSaveButton() {
		waitForElementClickable(driver, PersonalDetailsPageUI.SAVE_BUTTON);
		clickToElement(driver, PersonalDetailsPageUI.SAVE_BUTTON);
	}

	public String getNationallityDropdownSelectedText() {
		waitForListElementVisible(driver, PersonalDetailsPageUI.NATIONALITY_DROPDOWN_SELECTED_TEXT);
		return getElementText(driver, PersonalDetailsPageUI.NATIONALITY_DROPDOWN_SELECTED_TEXT);
	}

	public String getMaritalStatusDropdownSelectedText() {
		waitForListElementVisible(driver, PersonalDetailsPageUI.MARITAL_STATUS_DROPDOWN_SELECTED_TEXT);
		return getElementText(driver, PersonalDetailsPageUI.MARITAL_STATUS_DROPDOWN_SELECTED_TEXT);
	}

	public boolean isGenderStatusSelected(String genderStatus) {
		return isElementSelected(driver, PersonalDetailsPageUI.DYNAMIC_GENDER_RADIO_BUTTON_BY_TEXT, genderStatus);
	}

	public void setPersonalDetail(EmployeeInfo employeeInfo) {
		enterToDriversLicenseNumberTextbox(employeeInfo.getDriversLicenseNumber());
		enterToLicenseExpiryDateTextbox(employeeInfo.getLicenseExpiryDate());
		selectToNationalityDropdown(employeeInfo.getNationality());
		selectToMaritalStatusDropdown(employeeInfo.getMaritalStatus());
		enterToDateOfBirthTextbox(employeeInfo.getDateOfBirth());
		clickToGenderRadioButton(employeeInfo.getGenderStatus());
	}
}
