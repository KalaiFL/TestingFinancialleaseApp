package AppPages;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class SearchQueryPage {
	
	private AppiumDriver driver;
	private By Btn_ZoekOpdrachten=AppiumBy.accessibilityId("Zoekopdrachten");
	private By Btn_LoginZoekOpdrachten=AppiumBy.accessibilityId("Inloggen");
	private By Btn_BewaarZoekopdracht=AppiumBy.accessibilityId("Bewaar zoekopdracht");
	private String Vfy_ButtonUpdatedText="<<UpdatedButtonText>>";
	private String Btn_UpdatedBewaarZoekopdracht="<<UpdatedBewaarZoekopdracht>>";
	private By Btn_DeleteSearchQueryName=By.xpath("//android.view.ViewGroup[@resource-id='clear-input-button']");
	private By Txt_UpdatedSearchQueryName=By.xpath("//android.widget.EditText[@resource-id='title']");
	private By Toggle_Notification=AppiumBy.accessibilityId("Ontvang notificaties over deze zoekopdracht");
	private String Toggle_NotificationOption="<<SelectedNotificaitonOption>>";
	private String Vfy_SelectedNotificationOption="//android.widget.TextView[contains(@text,'<<VerifySelectedOption>>')]";
	private String Btn_CreatedSearchQuery="<<SearchQueryNaam>>";
	private By Btn_ZoekopdrachtVerwijderen=By.xpath("//android.widget.TextView[@text='Zoekopdracht verwijderen']");
	private By Vfy_SearchQueryDeleted=AppiumBy.accessibilityId("Bewaar zoekopdracht");
	private By Vfy_SearchQueryDeletedInZoekOpdracht=By.xpath("//android.widget.TextView[@text='Bewaar en vergelijk']");
	private String Btn_DeleteSearchQuery="//android.view.ViewGroup[@content-desc='<<SearchQueryToBeDeleted>>']/android.view.ViewGroup[1]";
	
	public SearchQueryPage(AppiumDriver driver) {
		this.driver=driver;
	}
	
	public void clickZoekopdrachten() throws InterruptedException {
		driver.findElement(Btn_ZoekOpdrachten).click();
		Thread.sleep(500);
	}
	
	public void ClickLoginZoekOpdrachten() {
		driver.findElement(Btn_LoginZoekOpdrachten).click();
	}
	
	public void ClickBewaarZoekopdracht() {
		driver.findElement(Btn_BewaarZoekopdracht).click();
	}
	
	public void VfyButtonTextUpdated(String UpdatedButtonText) throws InterruptedException {
		String RVfy_ButtonUpdatedText=Vfy_ButtonUpdatedText.replace("<<UpdatedButtonText>>",UpdatedButtonText);
		driver.findElement(AppiumBy.accessibilityId(RVfy_ButtonUpdatedText)).isDisplayed();
		Thread.sleep(1500);
	}
	
	public void ClickUpdatedBewaarZoekopdracht(String UpdatedBewaarZoekopdracht) throws InterruptedException {
		String RBtn_UpdatedBewaarZoekopdracht=Btn_UpdatedBewaarZoekopdracht.replace("<<UpdatedBewaarZoekopdracht>>",UpdatedBewaarZoekopdracht);
		driver.findElement(AppiumBy.accessibilityId(RBtn_UpdatedBewaarZoekopdracht)).click();
		Thread.sleep(500);
	}
	
	public void EnterUpdatedSearchQueryName(String UpdateSearchQueryName) {
		driver.findElement(Btn_DeleteSearchQueryName).clear();
		driver.findElement(Txt_UpdatedSearchQueryName).sendKeys(UpdateSearchQueryName);
	}
	
	public void EnableNotification() {
		driver.findElement(Toggle_Notification).click();
	}
	
	public void SelectNotificationOption(String NotificationOption) {
		String Rbtn_Toggle_NotificationOption=Toggle_NotificationOption.replace("<<SelectedNotificaitonOption>>",NotificationOption);
		driver.findElement(AppiumBy.accessibilityId(Rbtn_Toggle_NotificationOption)).click();
	}
	
	public void VerifySelectedNotificaitonOption(String SelectedOption) {
		String Rbtn_Vfy_SelectedNotificationOption=Vfy_SelectedNotificationOption.replace("<<VerifySelectedOption>>", SelectedOption);
		driver.findElement(By.xpath(Rbtn_Vfy_SelectedNotificationOption)).isDisplayed();
	}
	
	public void ClickSearchQuery(String SearchQueryName) {
		String Rbtn_CreatedSearchQuery=Btn_CreatedSearchQuery.replace("<<SearchQueryNaam>>",SearchQueryName);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Rbtn_CreatedSearchQuery']")).click();
	}
	
	public void ClickZoekopdrachtVerwijderen() {
		driver.findElement(Btn_ZoekopdrachtVerwijderen).click();
	}
	
	public void SearchQueryDeleted() {
		driver.findElement(Vfy_SearchQueryDeleted).isDisplayed();
	}
	
	public void NavigatedBacktoBewaardScreen() {
		driver.navigate().back();
	}
	
	public void VerifySearchQueryDeleted() {
		driver.findElement(Vfy_SearchQueryDeletedInZoekOpdracht).isDisplayed();
	}
	
	public void ClickDeleteSearchQuery(String SearchQueryName) {
		driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc='Tesla']/android.view.ViewGroup[1]"));
		String RBtn_DeleteSearchQuery=Btn_DeleteSearchQuery.replace("<<SearchQueryToBeDeleted>>", SearchQueryName);
		driver.findElement(By.xpath(RBtn_DeleteSearchQuery)).click();
	}
	
	

}
