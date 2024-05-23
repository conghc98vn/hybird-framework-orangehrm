package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.BaseActions;

public class ImmigrationPageObject extends BaseActions {
	private WebDriver driver;

	public ImmigrationPageObject(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
}
