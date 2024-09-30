package AppStepDef;

import com.qa.DriverFactory.AppiumDriverFactory;

import AppPages.SearchQueryPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchQuerySteps {
	
	SearchQueryPage searchQuery = new SearchQueryPage(AppiumDriverFactory.getDriver());
	
	@When("the user clicks zoekopdrachten tab")
	public void the_user_clicks_zoekopdrachten_tab() throws InterruptedException {
		searchQuery.clickZoekopdrachten();
	}
	
	@When("the user clicks login button in the zoekopdrachten tab")
	public void the_user_clicks_login_button_in_the_zoekopdrachten_tab() {
		searchQuery.ClickLoginZoekOpdrachten();
	}
	
	@When("the user clicks Bewaar zoekopdracht option")
	public void the_user_clicks_Bewaar_zoekopdracht_option() {
		searchQuery.ClickBewaarZoekopdracht();
	}
	
	@Then("the button text updated to {string}")
	public void the_button_text_updated_to(String UpdatedButtonText) throws InterruptedException {
		searchQuery.VfyButtonTextUpdated(UpdatedButtonText);
	}
	
	@When("the user clicks {string}")
	public void the_user_clicks(String UpdatedButtonText) throws InterruptedException {
		searchQuery.ClickUpdatedBewaarZoekopdracht(UpdatedButtonText);
	}
	
	@And("the user update the search query name {string}")
	public void the_user_update_the_search_query_name(String UpdateSearchQueryName) {
		searchQuery.EnterUpdatedSearchQueryName(UpdateSearchQueryName);
	}
	
	@And("the user enable the toggle for notifications")
	public void the_user_enable_the_toggle_for_notifications() {
		searchQuery.EnableNotification();
	}
	
	@And("the user select the notification option as {string}")
	public void the_user_select_the_notificaiton_option_as(String NotificationOption) {
		searchQuery.SelectNotificationOption(NotificationOption);
	}
	
	@When("the user clicks on created searchquery {string}")
	public void the_user_clicks_on_created_searchquery(String SearchQueryName) {
		searchQuery.ClickSearchQuery(SearchQueryName);
		
	}
	
	@Then("the user verify the option selected is {string}")
	public void the_user_verify_the_option_selected_is(String SelectedOption) {
		searchQuery.VerifySelectedNotificaitonOption(SelectedOption);
	}
	
	@When("the user clicks zoekopdracht verwijderen")
	public void the_user_clicks_zoekopdracht_verwijderen() {
		searchQuery.ClickZoekopdrachtVerwijderen();
	}
	
	@Then("the created search query is deleted")
	public void the_created_search_query_is_deleted() {
		searchQuery.SearchQueryDeleted();
	}
	
	@When("the user is navigated back to Bewaard screen")
	public void the_user_is_navigated_back_to_Bewaard_screen() {
		searchQuery.NavigatedBacktoBewaardScreen();
	}
	
	@Then("verify that the created search query is deleted")
	public void verify_that_the_created_search_query_is_deleted() {
		searchQuery.VerifySearchQueryDeleted();
	}
	
	@When("the user clicks delete icon for {string} search query")
	public void the_user_clicks_delete_icon_for_search_query(String SearchQueryName) {
		searchQuery.ClickDeleteSearchQuery(SearchQueryName);
	}

}
