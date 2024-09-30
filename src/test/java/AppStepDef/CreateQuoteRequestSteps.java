package AppStepDef;

import com.qa.DriverFactory.AppiumDriverFactory;
import com.qa.DriverFactory.BrowserDriverFactory;

import AppPages.CreateQuoteRequestPage;
import AppPages.EditPersonalCompanyDetails;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class CreateQuoteRequestSteps {

	CreateQuoteRequestPage CreateQuoteRequest=new CreateQuoteRequestPage(AppiumDriverFactory.getDriver());
	
	@When("the user select the product {string}")
	public void the_user_select_the_product(String ProductDetails) {
		CreateQuoteRequest.ClickSelectProduct(ProductDetails);
	}
	
	@Then("the user clicks Gratis Offerte button in the product screen")
	public void the_user_clicks_Gratis_Offerte_button_in_the_product_screen() {
		CreateQuoteRequest.ClickGratisOfferte();
	}
	
	@When("the user clicks Toevoegen of Bedrijfsgegevens")
	public void the_user_clicks_Toevoegen_of_Bedrijfsgegevens() {
		CreateQuoteRequest.ClickToevoegenBedrijfsgegevens();
	}
	
	@Then("the user should receive notificaiton opgeslagen")
	public void the_user_should_receive_notification_opgeslagen() {
		CreateQuoteRequest.VfyNotification();
	}
	
	@When("the user scroll and click Toevoegen of Persoonsgegevens")
	public void the_user_scroll_and_click_Toevoegen_of_Persoonsgegevens() {
		CreateQuoteRequest.ClickToevoegenPersoonsgegevens();
	}
	
	@When("the user clicks Bekijk Aanvraag button")
	public void the_user_clicks_Bekijk_Aanvraag_button() {
		CreateQuoteRequest.ClickBekijkAanvraag();
	}
	
	@Then("the user should be navigated Jouw Aanvraag screen")
	public void the_user_should_be_navigated_Jouw_Aanvraag_screen() {
		CreateQuoteRequest.VfyJouwAanvraag();
	}
	
	@When("the user enter the search string in salesforce acceptance {string}")
	public void the_user_enter_the_search_string_in_salesforce_acceptance(String SearchString) throws InterruptedException {
		CreateQuoteRequest.FindWebactivity(SearchString);
	}
	
	@Then("verify the email of the lead {string}")
	public void verify_the_email_of_the_lead(String email) {
		CreateQuoteRequest.VfyLeadEmail(email);
	}
	
	@When("the user clicks the lead {string}")
	public void the_user_clicks_the_lead(String LeadName) throws InterruptedException {
		CreateQuoteRequest.ClickLeads(LeadName);
	}
	
	@When("the user clicks Zoeken textbox")
	public void the_user_clicks_Zoeken_textbox() {
		CreateQuoteRequest.ClickZoeken();
	}
	
	@Then("the user enter the zoeken text {string}")
	public void the_user_enter_the_zoeken_text(String ZoekenText) {
		CreateQuoteRequest.EnterZoekenText(ZoekenText);
	}
	
	@And("the user navigated to the correct webactivity")
	public void the_user_navigated_to_the_correct_webactivity() {
		CreateQuoteRequest.ClickCorrectWebActivity();
	}
	
	@When("the user clicks Lead {string}")
	public void the_user_clicks_Lead(String LeadName) {
		CreateQuoteRequest.ClickLead(LeadName);	
	}
	
	@When("the user convert the Lead into Opportunity")
	public void the_use_convert_the_Lead_into_Opportunity() throws InterruptedException {
		CreateQuoteRequest.ConvertLeadToOpportunity();
	}
	
	@And("the Opportunity is created")
	public void the_Opportunity_is_created() throws InterruptedException {
		CreateQuoteRequest.OpenOpportunity();
	}
	
	@Then("the leaseAdvisor creates an empty BankRequest")
	public void the_leaseAdvisor_creates_an_empty_BankRequest() throws InterruptedException {
		CreateQuoteRequest.CreateEmptyBankRequest();
	}
	

}