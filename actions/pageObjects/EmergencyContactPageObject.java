package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.BaseActions;

public class EmergencyContactPageObject extends BaseActions {
	private WebDriver driver;

	public EmergencyContactPageObject(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
}
