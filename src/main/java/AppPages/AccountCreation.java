package AppPages;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class AccountCreation {
	
	private AppiumDriver driver;
	
	private By Btn_AccountAanmaken=AppiumBy.accessibilityId("Account aanmaken");
	private By Vfy_AccountCreationScreen=By.xpath("//android.view.View[@text='Account aanmaken']");
	private By Txt_NewAccountId=By.xpath("//android.widget.EditText[@resource-id='email']");
	private By Vfy_InvalidEmailErrorMessage=By.xpath("//android.widget.TextView[@text='E-mailadres is niet geldig.']");
	
	public AccountCreation(AppiumDriver driver) {
		this.driver=driver;
	}
	
	public void ClickAccountAanmaken() {
		driver.findElement(Btn_AccountAanmaken).click();
	}
	
	public void AccountCreationScreen() {
		driver.findElement(Vfy_AccountCreationScreen).isDisplayed();
	}
	
	public void UserEnterEmailid(String NewAccountId) {
		driver.findElement(Txt_NewAccountId).clear();
		driver.findElement(Txt_NewAccountId).sendKeys(NewAccountId);
	}
	
	public void InvalidEmailErrorMessage() {
		driver.findElement(Vfy_InvalidEmailErrorMessage).isDisplayed();
	}
	

}
