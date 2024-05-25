package pageUI;

public class BaseActionsPageUI {

	public static final String PIM_MODULE = "xpath=//ul[@class='oxd-main-menu']//span[text()='PIM']";

	public static final String SPINER_ICON = "xpath=//div[@class='oxd-form-loader']";
	public static final String DYNAMIC_SUCCESS_MESSAGE = "xpath=//p[contains(@class, 'toast-message') and text()='%s']";

	public static final String DYNAMIC_INDEX_BY_COLUMN_NAME = "xpath=//div[text()='%s']/preceding-sibling::div";
	public static final String DYNAMIC_ROW_VALUE_BY_COLUMN_INDEX_ROW_INDEX = "xpath=(//div[@class='oxd-table-body']//div[@role='row'])[%s]/div[%s]/div[contains(text(),'%s')]";
}
