package AppStepDef;

import com.qa.DriverFactory.AppiumDriverFactory;

import AppPages.EditPersonalCompanyDetails;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditPersonalCompanyDetailsSteps {
	
	EditPersonalCompanyDetails EditDetails=new EditPersonalCompanyDetails(AppiumDriverFactory.getDriver());
	
	@When("the user click Profile button")
	public void the_user_click_Profile_button() {
		EditDetails.ClickProfileButton();
	}
	
	@When("the user clicks Persoonsgegevens Aanpassen")
	public void the_user_clicks_Persoonsgegevens_Aanpassen() {
		EditDetails.ClickPersoonsgegevensAanpassen();
	}
	
	@When("the user Remove the existing value and submit the empty persoonsgegevens form")
	public void the_user_Remove_the_exisitng_value_and_submit_the_empty_persoonsgegevens_form() {
		EditDetails.EmptyPersoonsgegevensFormSubmission();
	}
	
	@Then("the user should get error message for all mandatory fields")
	public void the_user_should_get_error_message_for_all_mandatory_fields() {
		EditDetails.EmptyPersoonsgegevensFormSubmissionErrorValidation();
	}
	
	@When("the user edit value of Telefoonnumber as {string}")
	public void the_user_edit_value_of_Telefoonnumber_as(String invalidTelefoonNumber) {
		EditDetails.EnterInvalidTelefoonnumber(invalidTelefoonNumber);
	}
	
	@Then("the user should get error message for invalid Telefoonnumber {string}")
	public void the_user_should_get_error_message_for_invalid_Telefoonnumber(String Errormessage) throws InterruptedException{
		EditDetails.VerifyErrMsgInvalidTelefoonnumber(Errormessage);
	}
	
	@When("the user edit value for date of birth {string} {string} {string}")
	public void the_user_edit_value_for_date_of_birth(String day,String month,String year) {
		EditDetails.EnterInvalidDOB(day,month,year);
	}
	
	@Then("the user should get error message for invalid data")
	public void the_user_should_get_error_message_for_invalid_data() {
		EditDetails.InvalidDOBErrorValidation();
	}
	
	@When("the user enter valid data in all mandatory fields {string} {string} {string} {string} {string} {string} {string} {string}")
	public void the_user_enter_valid_data_in_all_mandatory_fields(String Gender, String VoorNaam, String Tussenvoegsel, String AchterNaam, String Telefoonnumber, String Dag, String Maand, String Jaar) {
		EditDetails.EnterValidDataPersoonsgegevensForm(Gender, VoorNaam, Tussenvoegsel, AchterNaam, Telefoonnumber, Dag, Maand, Jaar);
	}
	
	@Then("the user should receive the notification Opgeslagen")
	public void the_user_should_receive_the_notification_Opgeslagen() {
		EditDetails.VfyNotificaiton();
	}
	
	@When("the user clicks Bedrijfsgegevens Aanpassen")
	public void the_user_clicks_Bedrijfsgegevens_Aanpassen() {
		EditDetails.ClickBedrijfsgegevensAanpassen();
	}
	
	@When("the user Remove the existing value and submit the empty Bedrijfsgegevens form")
	public void the_user_Remove_the_existing_value_and_submit_the_empty_Bedrijfsgegevens_form() {
		EditDetails.EmptyBedrijfgegevensFormSubmission();
	}
	
	@Then("the user should get error message for all mandatory fields in Bedrijfsgegevens form")
	public void the_user_should_get_error_message_for_all_mandatory_fields_in_Bedrijfsgegevens_form() {
		EditDetails.EmptyBedrijfgegevensFormSubmissionErrorValidation();
	}
	
	@When("the user edit value of kvk as {string}")
	public void the_user_edit_value_of_kvk_as (String ValidKVKNummer) {
		EditDetails.EnterValidKVKNummer(ValidKVKNummer);
	}
	
	@And("the user is navigated back to Profile section")
	public void the_user_is_navigated_back_to_Profile_section() {
		EditDetails.ClickProfileBackButton();
	}
}
