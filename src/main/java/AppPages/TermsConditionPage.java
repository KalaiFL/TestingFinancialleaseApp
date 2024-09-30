package AppPages;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class TermsConditionPage {
	
	private AppiumDriver driver;
	
	private By Btn_PrivacyPolicy=AppiumBy.accessibilityId("Privacybeleid");
	private By Vfy_PrivacyPolicyScreen=By.xpath("//android.view.View[@text='Privacyverklaring applicatie']");
	
	private By Btn_TermsOfUse=AppiumBy.accessibilityId("Gebruiksvoorwaarden");
	private By Vfy_TermsOfUseScreen=By.xpath("//android.view.View[@text='Gebruikersvoorwaarden applicatie']");
	
	public TermsConditionPage(AppiumDriver driver) {
		this.driver=driver;
	}

		public void ClickPrivacyPolicy() throws InterruptedException {
			driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"+".scrollIntoView(new UiSelector()" + ".textMatches(\"Privacybeleid\").instance(0))"));
			driver.findElement(Btn_PrivacyPolicy).click();
			Thread.sleep(5000);
		}
		
		public void ValidatePrivacyPolicyScreen() throws InterruptedException {
			driver.findElement(Vfy_PrivacyPolicyScreen).isDisplayed();
			Thread.sleep(5000);
			
		}
		
		public void ClickBackButton() {
			((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.BACK));
		}
		
		public void ClickTermsOfUse() throws InterruptedException {
			driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"+".scrollIntoView(new UiSelector()" + ".textMatches(\"Gebruiksvoorwaarden\").instance(0))"));
			driver.findElement(Btn_TermsOfUse).click();
			Thread.sleep(5000);
		}
		
		public void ValidateTermsOfUseScreen() {
			driver.findElement(Vfy_TermsOfUseScreen).isDisplayed();
		}
}

