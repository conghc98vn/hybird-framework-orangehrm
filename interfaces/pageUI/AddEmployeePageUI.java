package pageUI;

public class AddEmployeePageUI {
	public static final String FIRST_NAME_TEXTBOX = "xpath=//input[@name='firstName']";
	public static final String LAST_NAME_TEXTBOX = "xpath=//input[@name='lastName']";
	public static final String EMPLOYEE_ID = "xpath=//label[text()='Employee Id']/parent::div/following-sibling::div/input";
	public static final String SAVE_BUTTON = "xpath=//button[contains(., 'Save')]";
}