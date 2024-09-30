package AppStepDef;

import com.qa.DriverFactory.AppiumDriverFactory;

import AppPages.AccountDeletionPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AccountDeletionSteps {
	
	AccountDeletionPage accountdeletion=new AccountDeletionPage(AppiumDriverFactory.getDriver());
	
	@When("the user clicks on account deletion option")
	public void the_user_clicks_on_account_deletion_option() {
		accountdeletion.ClickAccountDeletion();
	}
	
	@Then("the account deletion popup appears on the screen")
	public void the_account_deletion_popup_appears_on_the_screen() {
		accountdeletion.VerifyAccountDeletionPopup();
	}
	
	@When("the user clicks close button of Account deletion")
	public void the_user_clickcs_close_button_of_Account_deletion() {
		accountdeletion.CancelAccountDeletion();
	}
	
	@Then("the user is navigated back to persoonlijke informatie screen")
	public void the_user_is_navigated_back_to_persoonlijke_informatie_Screen() {
		accountdeletion.VfyPersoonlijkeInformatieScreen();
	}
	
	@When("the user enter the password {string}")
	public void the_user_enter_the_password(String password) {
		accountdeletion.EnterPassword(password);
	}
	
	@Then("the user clicks Account Deletion button")
	public void the_user_clicks_Account_Deletion_button() {
		accountdeletion.ClickAccountVerwijderen();
	}
}
