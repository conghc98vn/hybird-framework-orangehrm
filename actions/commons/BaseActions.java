package commons;

import org.openqa.selenium.WebDriver;

import pageObjects.EmployeeListPageObject;
import pageUI.BaseActionsPageUI;

public class BaseActions extends BasePage {

	WebDriver driver;

	public BaseActions(WebDriver driver) {
		this.driver = driver;
	}

	public EmployeeListPageObject openToPIMModule() {
		waitForElementClickable(driver, BaseActionsPageUI.PIM_MODULE);
		clickToElement(driver, BaseActionsPageUI.PIM_MODULE);
		waitForSpinnerIconInvisible();
		return PageGeneratorManager.getEmployeeListPage(driver);
	}

	public void waitForSpinnerIconInvisible() {
		waitForListElementInvisible(driver, BaseActionsPageUI.SPINER_ICON);
	}

	public boolean isDynamicSuccessMessageDisplayed(String messageValue) {
		waitForElementVisible(driver, BaseActionsPageUI.DYNAMIC_SUCCESS_MESSAGE, messageValue);
		return isElementDisplayed(driver, BaseActionsPageUI.DYNAMIC_SUCCESS_MESSAGE, messageValue);
	}

	public boolean isValueDisplayedAtColumnName(String columnName, String rowIndex, String rowValue) {
		// TODO Auto-generated method stub
		int columnIndex = getListElementSize(driver, BaseActionsPageUI.DYNAMIC_INDEX_BY_COLUMN_NAME, columnName) + 1;

		return isElementDisplayed(driver, BaseActionsPageUI.DYNAMIC_ROW_VALUE_BY_COLUMN_INDEX_ROW_INDEX, rowIndex,
				String.valueOf(columnIndex), rowValue);
	}

	public void clickToRadioButtonByLabelName(String radioLabelName) {
		// todo
	}

	public void clickToCheckboxByLabelName(String checkboxLabelName) {
		// todo
	}

	public boolean isRadioButtonSelectedByLabelName(String radioLabelName) {
		return false;
		// todo
	}

	public boolean isCheckboxSelectedByLabelName(String checkboxLabelName) {
		return false;
		// todo
	}
}
