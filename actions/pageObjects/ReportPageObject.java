package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.BaseActions;

public class ReportPageObject extends BaseActions {
	private WebDriver driver;

	public ReportPageObject(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
}
