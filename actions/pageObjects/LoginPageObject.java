package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.BaseActions;
import commons.PageGeneratorManager;
import pageUI.LoginPageUI;

public class LoginPageObject extends BaseActions {
	private WebDriver driver;

	public LoginPageObject(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	public void enterToUsernameTextbox(String userNameValue) {
		waitForElementVisible(driver, LoginPageUI.USERNAME_TEXTBOX);
		sendkeyToElement(driver, LoginPageUI.USERNAME_TEXTBOX, userNameValue);

	}

	public void enterToPasswordTextbox(String passwordValue) {
		waitForElementVisible(driver, LoginPageUI.PASSWORD_TEXTBOX);
		sendkeyToElement(driver, LoginPageUI.PASSWORD_TEXTBOX, passwordValue);
	}

	public DashboardPageObject clickToLoginButton() {
		waitForElementClickable(driver, LoginPageUI.LOGIN_BUTTON);
		clickToElement(driver, LoginPageUI.LOGIN_BUTTON);
		waitForSpinnerIconInvisible();
		return PageGeneratorManager.getDashboardPage(driver);
	}
}
