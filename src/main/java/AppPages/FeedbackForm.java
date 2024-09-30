package AppPages;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class FeedbackForm {
	
	private AppiumDriver driver;
	private By Btn_FeedbackForm=AppiumBy.accessibilityId("Deel je feedback");
	private By Btn_Versturen=AppiumBy.accessibilityId("Versturen");
	private By Vfy_ErrMsg=By.xpath("//android.widget.TextView[@text='Vul een waarde in']");
	private By Btn_Backarrow=By.xpath("//android.view.ViewGroup[@resource-id='back-button']");
	private By txt_Feedback=By.xpath("//android.widget.EditText[@text='Typ hier je feedback']");
	private By Btn_Sluiten=AppiumBy.accessibilityId("Sluiten");
	
	public FeedbackForm(AppiumDriver driver) {
		this.driver=driver;
	}
	
	public void ScrollToFeedbackForm() {
		driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"+".scrollIntoView(new UiSelector()" + ".textMatches(\"Deel je feedback\").instance(0))"));
		driver.findElement(Btn_FeedbackForm).click();
	}
	
	public void clickVersturen() {
		driver.findElement(Btn_Versturen).click();
	}
	
	public void ValidateErrorMessage() {
	driver.findElement(Vfy_ErrMsg).isDisplayed();
	}
	
	public void ClickBackinFeedbackForm() {
		driver.findElement(Btn_Backarrow).click();
	}
	
	public void FillFeedback(String feedback) {
		driver.findElement(txt_Feedback).sendKeys(feedback);
	}
	
	public void ClickSluit() throws InterruptedException {
		driver.findElement(Btn_Sluiten).click();
		Thread.sleep(5000);
	}

}
