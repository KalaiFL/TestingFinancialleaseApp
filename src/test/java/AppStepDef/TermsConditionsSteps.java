package AppStepDef;

import com.qa.DriverFactory.AppiumDriverFactory;

import AppPages.TermsConditionPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TermsConditionsSteps {
	
	TermsConditionPage webpage=new TermsConditionPage(AppiumDriverFactory.getDriver());
	
	@When("the user clicks privacy policy option")
	public void the_user_clicks_privacy_policy_option() throws InterruptedException {
		webpage.ClickPrivacyPolicy();
	}
	
	@Then("the user is navigated to privacy policy webpage")
	public void the_user_is_navigated_to_privacy_policy_webpage() throws InterruptedException {
		webpage.ValidatePrivacyPolicyScreen();
	}
	
	@And("the user is navigated back to profile tab")
	public void the_user_is_navigated_back_to_profile_tab() {
		webpage.ClickBackButton();
	}
	
	@When("the user clicks TermsOfUse options")
	public void the_user_clicks_TermsOfUse_options() throws InterruptedException {
		webpage.ClickTermsOfUse();
	}
	
	@Then("the user is navigated to Terms policy webpage")
	public void the_user_is_navigated_to_Terms_policy_webpage() {
		webpage.ValidateTermsOfUseScreen();
	}


}
