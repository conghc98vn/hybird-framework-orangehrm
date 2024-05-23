package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.BaseActions;

public class JobEmployeePageObject extends BaseActions {
	private WebDriver driver;

	public JobEmployeePageObject(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
}
