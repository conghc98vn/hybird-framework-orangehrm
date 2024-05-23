package commons;

import org.openqa.selenium.WebDriver;

import pageObjects.EmployeeListPageObject;
import pageUI.BaseActionsUI;

public class BaseActions extends BasePage {

	WebDriver driver;

	public BaseActions(WebDriver driver) {
		this.driver = driver;
	}

	public EmployeeListPageObject openToPIMModule() {
		waitForElementClickable(driver, BaseActionsUI.PIM_MODULE);
		clickToElement(driver, BaseActionsUI.PIM_MODULE);
		waitForSpinnerIconInvisible();
		return PageGeneratorManager.getEmployeeListPage(driver);
	}

	public void waitForSpinnerIconInvisible() {
		waitForListElementInvisible(driver, BaseActionsUI.SPINER_ICON);
	}

	public boolean isDynamicSuccessMessageDisplayed(String messageValue) {
		waitForElementVisible(driver, BaseActionsUI.DYNAMIC_SUCCESS_MESSAGE);
		return isElementDisplayed(driver, BaseActionsUI.DYNAMIC_SUCCESS_MESSAGE);
	}
}
