package AppPages;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class LogoutPage {
	
private AppiumDriver driver;
	
	private By Btn_Logout=AppiumBy.accessibilityId("Uitloggen");
	private By Btn_Login=AppiumBy.accessibilityId("Inloggen");
	
	
	public LogoutPage(AppiumDriver driver) {
		this.driver=driver;
	}
	
	public void ClickLogout() {
		driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"+".scrollIntoView(new UiSelector()" + ".textMatches(\"Uitloggen\").instance(0))"));
		driver.findElement(Btn_Logout).click();
	}
	
	public void VerifyLogoutIsSuccessful() {
		driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"+".scrollIntoView(new UiSelector()" + ".textMatches(\"Inloggen\").instance(0))"));
		driver.findElement(Btn_Login).isDisplayed();
	}


}
