package AppStepDef;

import com.qa.DriverFactory.AppiumDriverFactory;

import AppPages.AccountCreation;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AccountCreationSteps {
	
	AccountCreation Accountcreation=new AccountCreation(AppiumDriverFactory.getDriver());
	
	@When("the user clicks Account aanmaken")
	public void the_user_clicks_Account_aanmaken() {
		Accountcreation.ClickAccountAanmaken();
	}
	
	@Then("the user is in the Account Creation screen")
	public void the_user_is_in_the_Account_Creation_screen() {
		Accountcreation.AccountCreationScreen();
	}
	
	@When("the user enter new account id {string}")
	public void the_user_enter_new_account_id(String NewAccountId) {
		Accountcreation.UserEnterEmailid(NewAccountId);
	}
	
	@Then("the user should receive the error message for invalid email")
	public void the_user_should_receive_the_error_message_for_invalid_email() {
		Accountcreation.InvalidEmailErrorMessage();
	}
}
