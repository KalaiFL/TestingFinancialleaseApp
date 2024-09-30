package AppStepDef;

import com.qa.DriverFactory.AppiumDriverFactory;

import AppPages.FavCarsPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FavCarsSteps {
	
	FavCarsPage favcar=new FavCarsPage(AppiumDriverFactory.getDriver());
	
	@When("the user clicks Bewaard icon")
	public void the_user_clicks_Bewaard_icon() {
		favcar.ClickBewaardIcon();
	}
	
	@Then("the user is navigated to Bewaard screen")
	public void the_user_is_navigated_to_Bewaard_screen() {
		favcar.VerifyBewaardScreen();
	}
	
	@Then("the user should be able to see Account aanmaken and login option")
	public void the_user_should_be_able_to_see_Account_aanmaken_and_login_option() {
		favcar.VerifyAccountAaanmakenAndLogin();
	}
	
	@When("the user add car to favlist {string}")
	public void the_user_add_car_to_favlist(String cardetails) throws InterruptedException {
		favcar.AddFavCar(cardetails);
	}
	
	@Then("the car is added to Fav car")
	public void the_car_is_added_to_Fav_car() {
		favcar.CarAddedtoFavcarlist();
	}
	
	@Then("the user verifies that the car is added to fav list {string}")
	public void the_user_verifies_that_the_car_is_Added_to_fav_list(String cardetails) {
		favcar.VerifycarAddedtoFavcar(cardetails);
	}
	
	@When("the user remove the product from favlist {string}")
	public void the_user_remove_the_product_from_favlist(String productTobeRemoved) throws InterruptedException {
		favcar.RemoveProductFromFavlist(productTobeRemoved);
	}
	
	@Then("the user cancel the deletion attempt")
	public void the_user_cancel_the_deletion_attempt() {
		favcar.CancelDeletionAttempt();
	}
	
	@When("the user clicks verwijderen")
	public void the_user_clicks_verwijderen() {
		favcar.DeleteAddedFavcar();
	}
	
	
	@Then("the user should receive notification for successful deletion")
	public void the_user_should_receive_notification_for_successful_deletion() {
		favcar.FavcarDeletedNotificaiton();
	}
	
	

}
