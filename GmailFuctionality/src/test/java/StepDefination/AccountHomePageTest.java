package StepDefination;
import static org.junit.jupiter.api.Assertions.assertEquals;
import BaseLayer.BaseClass;
import PageLayer.AccountHomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AccountHomePageTest extends BaseClass {
	private AccountHomePage accPage;
	
	@Given("user successfully login to account")
	public void user_successfully_login_to_account() {
	    accPage.clickOnGmailIcon();
	}
	
	@When("user enter compose mail button")
	public void user_enter_compose_mail_button() {
	    accPage.clickComposeButton();
	}
	
	@Then("compose new mail frame pop-ups")
	public void compose_new_mail_frame_pop_ups() {
		assertEquals("New Message",accPage.textValue() );
	}


}
