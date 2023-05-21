package StepDefination;

import BaseLayer.BaseClass;
import PageLayer.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageTest extends BaseClass{
	private LoginPage loginpage;
	
	@Given("user at login page")
	public void user_at_login_page() {
	  BaseClass.initialization();
	}
	@When("user enter valid username and password")
	public void user_enter_valid_username_and_password() {
	    loginpage = new LoginPage();
	    loginpage.userInformation(prop.getProperty("username"));
	    loginpage.clickNext();
	    loginpage.enterPass(prop.getProperty("password"));
	}
	@Then("user enter submitt button")
	public void user_enter_submitt_button() {
		   loginpage = new LoginPage();
		   loginpage.submit();
	}



}
