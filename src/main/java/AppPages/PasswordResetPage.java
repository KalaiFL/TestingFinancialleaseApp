package AppPages;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;




public class PasswordResetPage {
	
	private AppiumDriver driver;

	private By Btn_PersoonlijkeInformatie=By.xpath("//android.widget.TextView[@text='Profiel']");
	private By Btn_Bewerk=By.xpath("//android.widget.TextView[@text='Aanpassen']");
	private By Vfy_PasswordResetScreen=By.xpath("//android.widget.TextView[@text='Wachtwoord wijzigen']");
	private By Txt_OldPassword=By.xpath("//android.widget.EditText[@resource-id='currentPassword']");
	//private By Txt_OldPassword=By.xpath("//android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText");
	private By Txt_NewPassword=By.xpath("//android.widget.EditText[@resource-id='newPassword']");
	//private By Txt_NewPassword=By.xpath("//android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.EditText");
	private By Btn_WachtwoordOpslaan=AppiumBy.accessibilityId("Wachtwoord opslaan");
	private By Vfy_SuccessfulNotification=AppiumBy.accessibilityId("Wachtwoord gewijzigd");
	
	public PasswordResetPage(AppiumDriver driver) {
		this.driver=driver;
	}
	
	public void ClickPersoonlijkeInformatie() {
		driver.findElement(Btn_PersoonlijkeInformatie).click();
	}
	
	public void ClickWijzig() {
		driver.findElement(Btn_Bewerk).click();
	}
	
	public void VfyPasswordResetScreen() {
		driver.findElement(Vfy_PasswordResetScreen).isDisplayed();
	}

	
	public void EnterOldPassword(String oldpassword) {
		driver.findElement(Txt_OldPassword).clear();
		driver.findElement(Txt_OldPassword).sendKeys(oldpassword);
	}
	
	public void EnterNewPassword(String newpassword) {
		driver.findElement(Txt_NewPassword).clear();
		driver.findElement(Txt_NewPassword).sendKeys(newpassword);
	}
	
	public void ClickOpslaan() throws InterruptedException {
		driver.findElement(Btn_WachtwoordOpslaan).click();
		Thread.sleep(500);
	}

	
	public void PwdResetSuccessNotification() {
		driver.findElement(Vfy_SuccessfulNotification).isDisplayed();
	}
	
	public void NavigateBacktoSettings() {
		driver.findElement(By.xpath("//android.view.ViewGroup[@resource-id='back-button']")).click();
	}
	
}
