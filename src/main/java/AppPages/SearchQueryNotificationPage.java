package AppPages;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class SearchQueryNotificationPage {

	private AppiumDriver driver;
	private String Btn_SavedSearchQuery="//android.widget.TextView[contains(@text,'<<savedsearchqueryname>>')]";
	private By Toggle_Notification=By.xpath("//android.widget.TextView[@text='Ontvang notificaties over deze zoekopdracht']");
	private By Vfy_ToggleNotification=By.xpath("//android.widget.TextView[@text='Hoe vaak wil je notificaties ontvangen?']");
	private String Btn_Notificationoption="//android.widget.TextView[@text='<<selectoption>>']";
	private By Btn_DeleteSearchQuery=By.xpath("//android.widget.TextView[@text='Zoekopdracht verwijderen']");
	private By Vfy_BewaarOpdracht=By.xpath("//android.widget.TextView[@text='Bewaar zoekopdracht']");
	
	public SearchQueryNotificationPage(AppiumDriver driver) {
		this.driver=driver;
	}
	
	public void OpenSavedSearchQuery(String searchqueryname) {
		Btn_SavedSearchQuery=Btn_SavedSearchQuery.replace("<<savedsearchqueryname>>", searchqueryname);
		driver.findElement(By.xpath(Btn_SavedSearchQuery)).click();
	}
	
	public void ToggleNotification() {
		driver.findElement(Toggle_Notification).click();
	}
	
	public void VfyToggleNotifications() {
		driver.findElement(Vfy_ToggleNotification).isDisplayed();
	}
	
	public void SelectNotificationOption(String selectoption) throws InterruptedException{
		Btn_Notificationoption=Btn_Notificationoption.replace("<<selectoption>>", selectoption);
		driver.findElement(By.xpath(Btn_Notificationoption)).click();
		Thread.sleep(500);
	}
	
	public void DeleteSearchQuery() throws InterruptedException {
		Thread.sleep(500);
		driver.findElement(Btn_DeleteSearchQuery).click();
	}
	
	public void VfyDeletion() {
		driver.findElement(Vfy_BewaarOpdracht).isDisplayed();
	}
	
	
}
