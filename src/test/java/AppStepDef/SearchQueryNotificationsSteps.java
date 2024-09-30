package AppStepDef;

import com.qa.DriverFactory.AppiumDriverFactory;
import AppPages.SearchQueryNotificationPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchQueryNotificationsSteps {
	
	SearchQueryNotificationPage searchquerynotification=new SearchQueryNotificationPage(AppiumDriverFactory.getDriver());
	
	@When("the user click Bewaar button {string}")
	public void the_user_click_Bewaar_button(String queryname) {
		searchquerynotification.OpenSavedSearchQuery(queryname);
	}
	
	@When("the user enable the notification toggle")
	public void the_user_enable_the_notification_toggle() {
		searchquerynotification.ToggleNotification();
	}
	
	@Then("notification options are visible to the user")
	public void notification_options_are_visible_to_the_user() {
		searchquerynotification.VfyToggleNotifications();
	}
	
	@When("the user select option {string}")
	public void the_user_select_option(String selectedoption) throws InterruptedException  {
		searchquerynotification.SelectNotificationOption(selectedoption);
		}
	
	@When("the user click zoekopdracht verwijderen")
	public void the_user_click_zoekopdracht_verwijderen() throws InterruptedException {
		searchquerynotification.DeleteSearchQuery();
	}
	
	@Then("the search query is deleted")
	public void the_search_query_is_deleted() {
		searchquerynotification.VfyDeletion();
	}
	


}
