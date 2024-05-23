package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.BaseActions;

public class DashboardPageObject extends BaseActions {
	private WebDriver driver;

	public DashboardPageObject(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

}
