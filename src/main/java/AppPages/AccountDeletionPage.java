package AppPages;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;


public class AccountDeletionPage {
	
	private AppiumDriver driver;
	
	private By Btn_AccountDeletionOption=AppiumBy.accessibilityId("Account verwijderen");
	private By Vfy_AccountDeletionPopup=By.xpath("//android.widget.TextView[@text='Account verwijderen']");
	private By Btn_AccountDeletionCloseButton=By.xpath("//android.view.ViewGroup[@resource-id='close-button']");
	private By Vfy_PersoonlijkeInformatieScreen=By.xpath("//android.widget.TextView[@text='Accountgegevens']");
	private By Txt_AccountPassword=By.xpath("//android.widget.EditText[@resource-id='password']");
	//private By Txt_AccountPassword=By.xpath("//android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText");
	private By Btn_AccountDeletion=AppiumBy.accessibilityId("Account verwijderen");
	
	public AccountDeletionPage(AppiumDriver driver) {
		this.driver=driver;
	}
	
	public void ClickAccountDeletion() {
		driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"+".scrollIntoView(new UiSelector()" + ".textMatches(\"Account verwijderen\").instance(0))"));
		driver.findElement(Btn_AccountDeletionOption).click();
	}
	
	public void VerifyAccountDeletionPopup() {
		driver.findElement(Vfy_AccountDeletionPopup).isDisplayed();
	}
	
	public void CancelAccountDeletion() {
		//((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.BACK));
		driver.findElement(Btn_AccountDeletionCloseButton).click();
		}
	
	public void VfyPersoonlijkeInformatieScreen() {
		driver.findElement(Vfy_PersoonlijkeInformatieScreen).isDisplayed();
	}
	
	public void EnterPassword(String Password) {
		driver.findElement(Txt_AccountPassword).clear();
		driver.findElement(Txt_AccountPassword).sendKeys(Password);
	}
	
	public void ClickAccountVerwijderen() {
		driver.findElement(Btn_AccountDeletion).click();
	}

}
