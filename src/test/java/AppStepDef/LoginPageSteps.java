package AppStepDef;


import com.qa.DriverFactory.AppiumDriverFactory;
//import com.qa.DriverFactory.BrowserDriverFactory;

import AppPages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps {
	LoginPage loginpage=new LoginPage(AppiumDriverFactory.getDriver());
	//LoginPage loginpage=new LoginPage(AppiumDriverFactory.getDriver(),BrowserDriverFactory.getwebDriver());
	
	@Given("the user launches the financiallease app")
	public void the_user_launches_the_financiallease_app(){
		loginpage.userLaunchApp();
	}

	@And("the user navigates to profile tab")
	public void the_user_navigates_to_profile_tab() throws InterruptedException {
		loginpage.userNavigateProfileTab();
		}
	
	@When("the user clicks login button")
	public void the_user_clicks_login_button() {
		loginpage.userClickLogin();
	}
	
	@Then("the user is in the login screen")
	public void the_user_is_in_the_login_screen() {
		loginpage.userLoginWebPage();
	}
	
	@When("the user clicks back button")
	public void the_user_clicks_back_button() {
		loginpage.UserClickBackButtonLoginScreen();
	}
	
	@Then("the user is in the App profile tab")
	public void the_user_is_in_the_App_profile_tab() {
		loginpage.profileTab();
	}
	
	@When("the user enter username {string}")
	public void the_user_enter_username(String username){
		loginpage.userEnterUsername(username);
	}
	
	@And("the user clicks Doorgaan")
	public void the_user_clicks_Doorgaan() {
		loginpage.userClickDoorgaan();
	}
	
	@Then("the user should receive the error message")
	public void the_user_should_receive_the_error_message() {
		loginpage.InvalidUsernameErrorMessage();
	}
	
	@When("the user enter password {string}")
	public void the_user_enter_password(String password) {
		loginpage.userEnterPassword(password);
	}
	
	@When("the user clicks Wachtwoord weergeven button")
	public void the_user_clicks_Wachtwoord_weergeven_button() {
		loginpage.clickWachtwoordweergeven();
	}
	
	@Then("the password is visible to the user {string}")
	public void the_password_is_visible_to_the_user (String passwordvisible) {
		loginpage.pwdVisible(passwordvisible);
	}
	
	@When("the user clicks Wachtwoord verbergen button")
	public void the_user_clicks_Wachtwoord_verbergen_button() {
		loginpage.clickWachtwoordverbergen();
	}
	
	@Then("the password is hashed to the user {string}")
	public void the_password_is_hashed_to_the_user(String hashedpassword){
		loginpage.passwordHashed(hashedpassword);
	}
	

	
}
