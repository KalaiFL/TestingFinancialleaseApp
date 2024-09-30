package AppPages;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;


public class LoginPage {
	
	private AppiumDriver driver;
	//private  WebDriver webdriver;
	
	private By Featurescreen_Filters=AppiumBy.accessibilityId("Volgende");
	private By Featurescreen_Notifications=AppiumBy.accessibilityId("Volgende");
	private By Featurescreen_Favcars=AppiumBy.accessibilityId("Volgende");
	private By Featurescreen_LeaseRequestStatus=AppiumBy.accessibilityId("Beginnen");
	
	private By Btn_ProfileTab=By.xpath("//android.widget.TextView[@text='Profiel']");
	
	private By Btn_Login=AppiumBy.accessibilityId("Inloggen");
	private By Vfy_ProfileTab=By.xpath("//android.widget.TextView[@text='Hulp en contact']");
	private By Vfy_Loginscreen=By.xpath("//android.view.View[@text='Welkom']");
	private By Txt_Username=By.xpath("//android.widget.EditText[@resource-id='username']");
	private By Vfy_InvalidUsernameErrMsg=By.xpath("//android.widget.TextView[@text='Voer een geldig e-mailadres in (bijv. gebruiker@domein.com).']");
	private By Btn_Doorgaan=By.xpath("//android.widget.Button[@text='Doorgaan']");
	private By Txt_Password=By.xpath("//android.widget.EditText[@resource-id='password']");
	private By Btn_Wachtwoordweergeven=By.xpath("//android.widget.Button[@text='Wachtwoord weergeven']");
	private String Btn_PwdVisible="//android.widget.EditText[@text='<<password>>']";
	private By Btn_Wachtwoordverbergen=By.xpath("//android.widget.Button[@text='Wachtwoord verbergen']");
	private String Btn_PasswordHash="//android.widget.EditText[@text='<<hashed>>']";

	//public LoginPage(AppiumDriver driver, WebDriver webdriver) {
		//this.driver=driver;
		//this.webdriver=webdriver;
	//}
	
	public LoginPage(AppiumDriver driver) {
		this.driver=driver;
	}

	public void userLaunchApp(){
		driver.findElement(Featurescreen_Filters).click();
		driver.findElement(Featurescreen_Notifications).click();
		driver.findElement(Featurescreen_Favcars).click();
		driver.findElement(Featurescreen_LeaseRequestStatus).click();
	}
	
	public void userNavigateProfileTab() throws InterruptedException {
		driver.findElement(Btn_ProfileTab).click();
		Thread.sleep(1000);
	}
	
	public void userClickLogin() {
		driver.findElement(Btn_Login).click();
	}
	
	public void userLoginWebPage() {
		driver.findElement(Vfy_Loginscreen).isDisplayed();
	}
	
	public void UserClickBackButtonLoginScreen() {
		((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.BACK));
	}
	
	public void profileTab() {
		driver.findElement(Vfy_ProfileTab).isDisplayed();
	}
	
	public void userEnterUsername(String username)  {
		driver.findElement(Txt_Username).clear();
		driver.findElement(Txt_Username).sendKeys(username);
	}
	
	public void userClickDoorgaan() {
		driver.findElement(Btn_Doorgaan).click();
	}
	
	public void InvalidUsernameErrorMessage() {
		driver.findElement(Vfy_InvalidUsernameErrMsg).isDisplayed();
	}
	
	public void userEnterPassword(String password)  {
		driver.findElement(Txt_Password).clear();
		driver.findElement(Txt_Password).sendKeys(password);
	}
	
	public void clickWachtwoordweergeven() {
		driver.findElement(Btn_Wachtwoordweergeven).click();
	}
	
	public void pwdVisible(String passwordvisible) {
		Btn_PwdVisible=Btn_PwdVisible.replace("<<password>>", passwordvisible);
		driver.findElement(By.xpath(Btn_PwdVisible)).isDisplayed();
	}
	
	public void clickWachtwoordverbergen() {
		driver.findElement(Btn_Wachtwoordverbergen).click();
	}
	
	public void passwordHashed(String hashedpassword) {
		Btn_PasswordHash=Btn_PasswordHash.replace("<<hashed>>",hashedpassword);
		driver.findElement(By.xpath(Btn_PasswordHash)).isDisplayed();
	}
	
	
}
