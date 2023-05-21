package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilsLayer.utilsClass;

public class AccountHomePage extends BaseClass{

	
	@FindBy (xpath="//div[@class='T-I T-I-KE L3']")
	private WebElement composeMail;
	
	@FindBy(xpath="(//span[text()='New Message'])[3]")
	private WebElement composeBox;
	
	@FindBy (xpath="//img[@class='gb_Jc']")
	private WebElement gmailIcon;
	
	public AccountHomePage() {
		PageFactory.initElements(driver,this);
		
	}
	
	public void clickOnGmailIcon() {
		utilsClass.clickMethod(gmailIcon);
	}
	
	public void clickComposeButton() {
		utilsClass.clickMethod(composeMail);
	}
	
	public String textValue () {
		return utilsClass.getTextValue(composeBox);
	}
}
