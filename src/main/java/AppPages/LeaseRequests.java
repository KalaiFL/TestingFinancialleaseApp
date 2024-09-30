package AppPages;


import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class LeaseRequests {
	
	private AppiumDriver driver;
	private By Btn_LeaseRequests=AppiumBy.accessibilityId("Aanvragen");
	private By Vfy_AlleAanvragenScreen=By.xpath("//android.widget.TextView[@text='Alle aanvragen']");
	private String Vfy_NoLeaseReqMessage="//android.widget.TextView[@text='<<message>>']";
	private By Btn_CloseAppUpdatePopup=By.xpath("//android.view.ViewGroup[@resource-id='close-button']");
	private By Btn_BackButtonAlleAanvragen= By.xpath("//android.view.ViewGroup[@resource-id='back-button']");
	
	public LeaseRequests(AppiumDriver driver) {
		this.driver=driver;
	}
	
	public void ClickLeaseRequests() {
		driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"+".scrollIntoView(new UiSelector()" + ".textMatches(\"Aanvragen\").instance(0))"));
		driver.findElement(Btn_LeaseRequests).click();
	}
	
	public void ValidateAlleaanvragen() {
		driver.findElement(Vfy_AlleAanvragenScreen).isDisplayed();
	}
	
	public void VerifyMessage(String message) {
		Vfy_NoLeaseReqMessage=Vfy_NoLeaseReqMessage.replace("<<message>>", message);
		driver.findElement(By.xpath(Vfy_NoLeaseReqMessage)).isDisplayed();
	}
	
	public void ClickCloseButton() {
		driver.findElement(Btn_CloseAppUpdatePopup).click();
	}
	
	public void BackButtonAlleAanvragen() {
		driver.findElement(Btn_BackButtonAlleAanvragen).click();
	}

}
