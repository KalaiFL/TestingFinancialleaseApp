package AppStepDef;

import com.qa.DriverFactory.AppiumDriverFactory;

import AppPages.SearchCarPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchCarSteps {
	
	SearchCarPage searchcar=new SearchCarPage(AppiumDriverFactory.getDriver());
	
	@When("the user navigates to zoeken tab")
	public void the_user_navigates_to_zoeken_tab() {
		searchcar.ZoekenTab();
	}
	
	@Then("the user is navigated to Home screen")
	public void the_user_is_navigated_to_Home_screen() {
		searchcar.VerifyHomeScreen();
	}

	@When("the user clicks Merk and Model tab")
	public void the_user_clicks_Merk_and_Model_tab() {
		searchcar.ClickMerkModel();
	}
	
	@Then("the user enter merk value {string}")
	public void the_user_enter_merk_value(String merk) {
		searchcar.EnterMerkValue(merk);
	}
	
	@Then("the user enter model value {string}")
	public void the_user_enter_model_value(String model) {
		searchcar.EnterModelValue(model);
	}
	
	@When("the user clicks Opslaan")
	public void the_user_clicks_Opslaan() throws InterruptedException {
		searchcar.ClickOpslaan();
	}
	
	@Then("the choosen values added to the field {string}")
	public void the_choosen_values_added_to_the_field(String choosenvalues) {
		searchcar.ChoosenValuesAdded(choosenvalues);
	}
	
	@When("the user clicks Bekijk button")
	public void the_user_clicks_Bekijk_button() {
		searchcar.clickBekijk();
	}
	
	@When("the user navigates back to the Home screen")
	public void the_user_navigates_back_to_the_Home_screen()  {
		searchcar.ClickBekijkInProductSearch();
	}

	


}
