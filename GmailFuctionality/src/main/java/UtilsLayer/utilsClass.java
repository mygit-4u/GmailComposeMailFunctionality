package UtilsLayer;

import org.openqa.selenium.WebElement;
import BaseLayer.BaseClass;

public class utilsClass extends BaseClass{

	public static void enterValue (WebElement wb, String value)
	{
		if ((wb.isDisplayed() && wb.isEnabled()))
		{
			wb.sendKeys(value);
		}
	}

	public static void clickMethod (WebElement wb)
	{
		if ((wb.isDisplayed() && wb.isEnabled()))
		{
			wb.click();
		}
	}
	
	public static String getTextValue (WebElement wb) {
		return wb.getText();
	}
	
}
