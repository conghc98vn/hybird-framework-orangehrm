package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.BaseActions;

public class QuanlificationsPageObject extends BaseActions {
	private WebDriver driver;

	public QuanlificationsPageObject(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
}
