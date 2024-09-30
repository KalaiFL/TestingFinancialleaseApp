package AppStepDef;

import com.qa.DriverFactory.AppiumDriverFactory;

import AppPages.FeedbackForm;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class FeedbackFormSteps {
	
	FeedbackForm FeedbackformPage=new FeedbackForm(AppiumDriverFactory.getDriver());
	
	@When("the user clicks on the feedback form")
	public void the_user_clicks_on_the_feedback_form() {
		FeedbackformPage.ScrollToFeedbackForm();
	}
	
	@And("the user clicks Versturen")
	public void the_user_clicks_Versturen() {
		FeedbackformPage.clickVersturen();
	}

	@Then("the user should get error message for empty submission")
	public void the_user_should_get_error_message_for_empty_submission() {
		FeedbackformPage.ValidateErrorMessage();
	}
	
	@And("the user is navigated back from feedback screen")
	public void the_user_is_navigated_back_from_feedback_screen() {
		FeedbackformPage.ClickBackinFeedbackForm();
	}
	
	@Then("the user enters valid feedback {string}")
	public void the_user_enters_valid_feedback(String feedback) {
		FeedbackformPage.FillFeedback(feedback);
	}
	
	@When("the user clicks sluit button")
	public void the_user_clicks_sluit_button() throws InterruptedException {
		FeedbackformPage.ClickSluit();
	}
}
