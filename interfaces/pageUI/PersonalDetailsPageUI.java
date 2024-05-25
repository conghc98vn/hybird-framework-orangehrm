package pageUI;

public class PersonalDetailsPageUI {
	public static final String PERSONAL_DETAILS_PAGE_HEADER = "xpath=//h6[text()='Personal Details']";

	public static final String FIRSTNAME_TEXTBOX = "xpath=//input[@name='firstName']";
	public static final String LASTNAME_TEXTBOX = "xpath=//input[@name='lastName']";
	public static final String EMPLOYEE_ID_TEXTBOX = "xpath=//label[text()='Employee Id']/parent::div/following-sibling::div/input";

	public static final String DRIVERS_LICENSE_NUMBER_TEXTBOX = "xpath=//label[text()=\"Driver's License Number\"]/parent::div/following-sibling::div/input";
	public static final String LICENSE_EXPIRY_DATE_TEXTBOX = "xpath=//label[text()='License Expiry Date']/parent::div/following-sibling::div//input";

	public static final String NATIONALITY_DROPDOWN_PARENT = "xpath=//label[text()='Nationality']/parent::div/following-sibling::div";
	public static final String NATIONALITY_DROPDOWN_CHILD = "xpath=//label[text()='Nationality']/parent::div/following-sibling::div//span";
	public static final String NATIONALITY_DROPDOWN_SELECTED_TEXT = "xpath=//label[text()='Nationality']/parent::div/following-sibling::div//div[@class='oxd-select-text-input']";

	public static final String MARITAL_STATUS_DROPDOWN_PARENT = "xpath=//label[text()='Marital Status']/parent::div/following-sibling::div";
	public static final String MARITAL_STATUS_DROPDOWN_CHILD = "xpath=//label[text()='Marital Status']/parent::div/following-sibling::div//span";
	public static final String MARITAL_STATUS_DROPDOWN_SELECTED_TEXT = "xpath=//label[text()='Marital Status']/parent::div/following-sibling::div//div[@class='oxd-select-text-input']";

	public static final String DATE_OF_BIRTH_TEXTBOX = "xpath=//label[text( )='Date of Birth']/parent::div/following-sibling::div//input";
	public static final String DYNAMIC_GENDER_RADIO_BUTTON_BY_TEXT = "xpath=//label[text()='Gender']/parent::div/following-sibling::div//label[contains(., '%s')]/input";

	public static final String SAVE_BUTTON = "xpath=//button[@type='submit']";

}