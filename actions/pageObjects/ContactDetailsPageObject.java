package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.BaseActions;

public class ContactDetailsPageObject extends BaseActions {
	private WebDriver driver;

	public ContactDetailsPageObject(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
}
