package AppStepDef;

import com.qa.DriverFactory.AppiumDriverFactory;

import AppPages.CompareCarsPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CompareCarsSteps {
	
	CompareCarsPage compareCars=new CompareCarsPage(AppiumDriverFactory.getDriver());
	
	@When("the user clicks vergelijken option")
	public void the_user_clicks_vergelijken_option() throws InterruptedException {
		compareCars.ClickVergelijkenFirstOption();
	}
	
	@Then("the {string} is visible on the screen")
	public void the_is_visible_on_the_screen(String validationText) {
		compareCars.VerifyText(validationText);
	}
	
	@When("the user clicks compare option to compare cars")
	public void the_user_clicks_compare_option_to_compare_cars() {
		compareCars.NavigateToCompareCarsScreen();
	}
	
	@Then("the user is navigated to vergelijken screen")
	public void the_user_is_naviagated_to_vergelijken_screen() {
		compareCars.VerifyVergelijkenScreen();
	}

}
