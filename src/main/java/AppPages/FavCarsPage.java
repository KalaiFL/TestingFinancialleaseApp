package AppPages;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class FavCarsPage {

	private AppiumDriver driver;
	private By Btn_BewaardTab=By.xpath("//android.widget.TextView[@text='Bewaard']");
	private By Vfy_BewaardScreen=By.xpath("//android.widget.TextView[@text='Zoekopdrachten']");
	private By Vfy_AccountAanmaken=AppiumBy.accessibilityId("Account aanmaken");
	private By Vfy_Login=AppiumBy.accessibilityId("Inloggen");
	
	private String Btn_FavCar="(//android.view.ViewGroup[contains(@content-desc,'<<favcar>>')]/android.view.ViewGroup/android.view.ViewGroup/com.horcrux.svg.SvgView)";
	private By Vfy_SavedCarAdded=By.xpath("//android.widget.TextView[contains(@text,'Toegevoegd aan bewaarde')]");
	private By Btn_Bewaard=By.xpath("//android.widget.TextView[@text='Bewaard']");
	private String Vfy_CarAdded="//android.widget.TextView[@text='<<caradded>>']";
	
	private String Btn_RemoveFavCar="(//android.view.ViewGroup[contains(@content-desc,'<<Removefavcar>>')]/android.view.ViewGroup/android.view.ViewGroup)";
	private By Btn_CancelDeletion=AppiumBy.accessibilityId("Annuleren");
	private By Btn_ConfirmDeletion=AppiumBy.accessibilityId("Verwijderen");
	private By Vfy_DeletionNotification=By.xpath("//android.widget.TextView[contains(@text,'Verwijderd uit bewaarde')]");
	
	public FavCarsPage(AppiumDriver driver) {
		this.driver=driver;
	}
	
	public void ClickBewaardIcon() {
		driver.findElement(Btn_BewaardTab).click();
	}
	
	public void VerifyBewaardScreen() {
		driver.findElement(Vfy_BewaardScreen).isDisplayed();
	}
	
	public void VerifyAccountAaanmakenAndLogin() {
		driver.findElement(Vfy_AccountAanmaken).isDisplayed();
		driver.findElement(Vfy_Login).isDisplayed();
	}
	
	public void AddFavCar(String cardetails) throws InterruptedException {
			 Thread.sleep(500);
			 driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"+".scrollIntoView(new UiSelector()" + ".textMatches(\""+cardetails+"\").instance(0))"));
			 Thread.sleep(500);
			String RBtn_FavCar=Btn_FavCar.replace("<<favcar>>",cardetails);
			driver.findElement(By.xpath(RBtn_FavCar)).click();
			Thread.sleep(500);
		}

	public void CarAddedtoFavcarlist() {
		driver.findElement(Vfy_SavedCarAdded).isDisplayed();
	}
	
	public void OpenFavCarList() {
		driver.findElement(Btn_Bewaard).click();
		//driver.findElement(Btn_BewaardAuto).click();
	}
	
	public void VerifycarAddedtoFavcar(String cardetails) {
		String RVfy_CarAdded=Vfy_CarAdded.replace("<<caradded>>", cardetails);
		driver.findElement(By.xpath(RVfy_CarAdded)).isDisplayed();
	}
	
	public void RemoveProductFromFavlist(String ProductTobeRemoved) throws InterruptedException {
		//Thread.sleep(500);
		 Btn_RemoveFavCar=Btn_RemoveFavCar.replace("<<Removefavcar>>",ProductTobeRemoved);
		driver.findElement(By.xpath(Btn_RemoveFavCar)).click();
		Thread.sleep(500);
	}
	
	public void CancelDeletionAttempt() {
		driver.findElement(Btn_CancelDeletion).click();
	}
	
	public void DeleteAddedFavcar() {
		driver.findElement(Btn_ConfirmDeletion).click();
	}
	
	public void FavcarDeletedNotificaiton() {
		driver.findElement(Vfy_DeletionNotification).isDisplayed();
	}

	

}
