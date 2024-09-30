package AppStepDef;

import com.qa.DriverFactory.AppiumDriverFactory;
import AppPages.LogoutPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogOutSteps {
	
	LogoutPage logoutpage=new LogoutPage(AppiumDriverFactory.getDriver());
	

	@When("the user clicks on the Uitloggen button")
	public void the_user_clicks_on_the_Uitloggen_button() {
		logoutpage.ClickLogout();
	}
	
	@Then("the Inloggen option is available to the user")
	public void the_Inloggen_option_is_available_to_the_user() {
		logoutpage.VerifyLogoutIsSuccessful();
	}

}
