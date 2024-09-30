package AppStepDef;

import com.qa.DriverFactory.AppiumDriverFactory;

import AppPages.PasswordResetPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PasswordResetSteps {
	
	PasswordResetPage passwordreset=new PasswordResetPage(AppiumDriverFactory.getDriver());
	
	@When("the user clicks Persoonlijke informatie option")
	public void the_user_clicks_Persoonlijke_informatie_option() {
		passwordreset.ClickPersoonlijkeInformatie();
	}
	
	@When("the user clicks on Aanpassen option")
	public void the_user_clicks_on_Aanpassen_option() {
		passwordreset.ClickWijzig();
	}

	@Then("the user navigated to wachtwoord wijzigen screen")
	public void the_user_navigated_to_wachtwoord_wijzigen_screen() {
		passwordreset.VfyPasswordResetScreen();
	}
	
	@When("the user enter the oldpassword {string}")
	public void the_user_enter_the_oldpassword(String oldpassword) {
		passwordreset.EnterOldPassword(oldpassword);
	}
	
	@When("the user enter the newpassword {string}")
	public void the_user_enter_the_newpassword(String newpassword) {
		passwordreset.EnterNewPassword(newpassword);
	}
	
	@When("the user clicks Wachtwoord opslaan button")
	public void the_user_clicks_Wachtwoord_opslaan_button() throws InterruptedException {
		passwordreset.ClickOpslaan();
	}
	
	@Then("the user gets Wachtwoord Wijgzen notificaiton")
	public void the_user_gets_Wachtwoord_Wijgzen() {
		passwordreset.PwdResetSuccessNotification();
	}
	
	@Then("the user is navigated back to settings section")
	public void the_user_is_navigated_back_to_settings_section() {
		passwordreset.NavigateBacktoSettings();
	}
	

}
