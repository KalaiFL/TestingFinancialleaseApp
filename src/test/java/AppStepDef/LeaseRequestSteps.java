package AppStepDef;

import com.qa.DriverFactory.AppiumDriverFactory;

import AppPages.LeaseRequests;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LeaseRequestSteps {
	
	LeaseRequests leaseRequest=new LeaseRequests(AppiumDriverFactory.getDriver());
	
	@When("the user clicks LeaseRequests option")
	public void the_user_clicks_LeaseRequests_option() {
		leaseRequest.ClickLeaseRequests();
	}
	
	@Then("the user is in the alle aanvragen screen")
	public void the_user_is_in_the_alle_Aanvragen_screen() {
		leaseRequest.ValidateAlleaanvragen();
	}
	
	@Then("the user should get {string}")
	public void the_user_should_get(String message) {
		leaseRequest.VerifyMessage(message);
	}
	
	@And("the user closes the App update popup")
	public void the_user_closes_the_App_update_popup() {
		leaseRequest.ClickCloseButton();
	}
	
	@And("the user clicks back button in the alle aanvragen screen")
	public void the_user_clicks_back_button_in_the_alle_aanvragen_screen() {
		leaseRequest.BackButtonAlleAanvragen();
	}
	

}
