package AppStepDef;

import com.qa.DriverFactory.AppiumDriverFactory;

import AppPages.LanguageTranslator;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;

public class LanguageTranslatorSteps{
	
	LanguageTranslator LangTranslatorPage=new LanguageTranslator(AppiumDriverFactory.getDriver());
	
	
	@Given("the user is using the app in English")
	@When("the user selects the Dutch language option")
	@Then("the app language switches to Dutch")
	@Given("the user is using the app in Dutch")
	@When("the user selects the English language option")
	@Then("the app language switches to English")
	@And("the user clicks close button")
	@Then("the user test language translator")
	public void the_user_test_language_translator() throws InterruptedException{
		LangTranslatorPage.TranslateLanguage();
	}

}
