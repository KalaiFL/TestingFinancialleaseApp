package AppStepDef;

import com.qa.DriverFactory.AppiumDriverFactory;

import AppPages.LeaseCalculatorPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LeaseCalculatorSteps {
	
	LeaseCalculatorPage leasecalculator=new LeaseCalculatorPage(AppiumDriverFactory.getDriver());
	
	@When("the user click particular car {string}")
	public void the_user_click_particular_car(String cardetails)  {
		leasecalculator.ScrollToCar(cardetails);
	}
	
	@When("the user scroll to calculator")
	public void the_user_scroll_to_calculator() throws InterruptedException {
		leasecalculator.ScrollToCalculator();
	}
	
	@Then("the price in Maandbedrag should be {string}")
	public void the_price_in_Maandbedrag_should_be(String defaultprice) {
		leasecalculator.DefaultMaandbedragPrice(defaultprice);
	}
	
	@When("the user adjust the Looptijd {string}")
	public void the_user_adjust_the_Looptijd(String selectedmonth) {
		leasecalculator.SelectMonth(selectedmonth);
	}
	
	@When("the user enter invalid Aanbetaling value")
	public void the_user_enter_invalid_Aanbetaling_value() {
		leasecalculator.EnterInvalidAanbetaling();
	}
	
	@When("the user enter valid Aanbetaling value")
	public void the_user_enter_valid_Aanbetaling_value() {
		leasecalculator.EnterValidAanbetaling();
	}
	
	@Then("the error message is displayed for invalid Aanbetaling {string}")
	public void the_error_message_is_displayed_for_invalid_Aanbetaling(String errormessageaanbetlaing) {
		leasecalculator.ErrorMessageAanbetaling(errormessageaanbetlaing);
	}
	
	@When("the user enter invalid Slottermijn value")
	public void the_user_enter_invalid_Slottermijn_value() {
		leasecalculator.EnterInvalidSlottermijn();
	}
	
	@When("the user enter valid Slottermijn value")
	public void the_user_enter_valid_Slottermijn_value() {
		leasecalculator.EnterValidSlottermijn();
	}
	
	@Then("the error message is displayed for invalid Slottermijn {string}")
	public void the_error_message_is_displayed_for_invalid_Slottermijn(String errormessageslottermijn) {
		leasecalculator.ErrorMessageSlottermijn(errormessageslottermijn);
	}
	
	@Then("the user clicks Gratis Offerte button")
	public void the_user_clicks_Gratis_Offerte_button() {
		leasecalculator.ClickGratisOfferte();
	}
}
