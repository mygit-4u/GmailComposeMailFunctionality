package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilsLayer.utilsClass;

public class LoginPage extends BaseClass {

	
	@FindBy (id = "identifierId")
	private WebElement userName;
	
	@FindBy (xpath= "//div[@class='iNstf']")
	private WebElement nextButton;
	
	@FindBy (name = "Passwd")
	private WebElement passWord;
	
	@FindBy (name= "VfPpkd-vQzf8d")
	private WebElement submitButton;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void userInformation(String userInfo) {
		utilsClass.enterValue(userName, userInfo);
	}
	public void clickNext() {
		utilsClass.clickMethod(nextButton);
	}
	public void enterPass(String pass) {
		utilsClass.enterValue(passWord, pass);
	}
	public void submit() {
		utilsClass.clickMethod(submitButton);
	}
}
