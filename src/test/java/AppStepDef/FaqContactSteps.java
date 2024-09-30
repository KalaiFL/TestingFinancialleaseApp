package AppStepDef;

import com.qa.DriverFactory.AppiumDriverFactory;

import AppPages.FaqContactPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FaqContactSteps {
	
	FaqContactPage contactscreen=new FaqContactPage(AppiumDriverFactory.getDriver());
	
	@When("the user clicks Contact us option")
	public void the_user_clicks_Contact_us_option() {
		contactscreen.ScrolltoContactus();
	}
	
	@Then("the contact options are visible on the screen")
	public void the_contact_options_are_visible_on_the_screen() {
		contactscreen.AvailableOptions();
	}
	
	@When("the user click sluit button")
	public void the_user_click_sluit_button() {
		contactscreen.ClickSluitButton();
	}
	
	@When("the user clicks FAQ Option")
	public void the_user_clicks_FAQ_Option(){
		contactscreen.ScrolltoFAQ();
	}
	
	@Then("the user navigates to FAQ screen")
	public void the_user_navigates_to_FAQ_screen() {
		contactscreen.AvailableQuestions();
	}
	
	
	@When("the user clicks back arrow of FAQ screen")
	public void the_user_clicks_back_arrow_of_FAQ_screen() {
		contactscreen.ClickBackArrow();
	}

	

}
