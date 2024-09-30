package AppStepDef;

import com.qa.DriverFactory.AppiumDriverFactory;
import AppPages.SearchQueryCreationPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchQueryCreationSteps {
	
	SearchQueryCreationPage searchquerycreation=new SearchQueryCreationPage(AppiumDriverFactory.getDriver());
	
	@When("the user clicks Bewaar zoekopdracht")
	public void the_user_clicks_Bewaar_zoekopdracht() {
		searchquerycreation.ClickBewaaropdracht();
	}
	
	@Then("the user is navigated to zoekopdracht opslaan screen")
	public void the_user_is_navigated_to_zoekopdracht_opslaan_screen() {
		searchquerycreation.VfyZoekopdrachtOpslaanscreen();
	}
	
	@Then("verify selected merk and model name is displayed {string}")
	public void verify_selected_merk_and_model_name_is_displayed(String merkmodelname) throws InterruptedException {
		searchquerycreation.VerfiyMerkModelName(merkmodelname);
	}
	
	@When("the user add the name to the search query {string}")
	public void the_user_add_the_name_to_the_search_query(String searchqueryname) {
		searchquerycreation.AddsearchQueryName(searchqueryname);
	}
	
	@Then("the search query is saved {string}")
	public void the_search_query_is_saved(String searchquerysaved) {
		searchquerycreation.SearchQuerySaved(searchquerysaved);
	}
	

	

	
}
