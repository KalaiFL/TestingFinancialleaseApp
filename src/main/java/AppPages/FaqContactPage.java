package AppPages;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class FaqContactPage {
	
	private AppiumDriver driver;
	private By Btn_ContactUs=AppiumBy.accessibilityId("Neem contact op");
	private By Vfy_Callme=AppiumBy.accessibilityId("Bel ons");
	private By Vfy_Whatsapp=AppiumBy.accessibilityId("WhatsApp");
	private By Vfy_Email=AppiumBy.accessibilityId("E-mail");
	private By Btn_Sluit=AppiumBy.accessibilityId("Sluiten");
	
	private By Btn_FAQ=AppiumBy.accessibilityId("Veelgestelde vragen");
	private By Vfy_Q1=AppiumBy.accessibilityId("Algemene informatie over Financial Lease");
	private By Vfy_Q2=AppiumBy.accessibilityId("Aanbod leasevoertuigen");
	private By Vfy_Q3=AppiumBy.accessibilityId("Ondernemerschap, KVK-nummer");
	private By Vfy_Q4=AppiumBy.accessibilityId("Fiscale voordelen");
	private By Vfy_Q5=AppiumBy.accessibilityId("Begrippen");
	private By Vfy_Q6=AppiumBy.accessibilityId("Leasen met BKR");
	private By Vfy_Q7=AppiumBy.accessibilityId("Contract");
	//private By Btn_Backarrow=By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView");
	
	public FaqContactPage(AppiumDriver driver){
		this.driver=driver;
	}
	
	public void ScrolltoContactus() {
		driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"+".scrollIntoView(new UiSelector()" + ".textMatches(\"Neem contact op\").instance(0))"));
		driver.findElement(Btn_ContactUs).click();
	}

	public void AvailableOptions() {
		driver.findElement(Vfy_Callme).isDisplayed();
		driver.findElement(Vfy_Whatsapp).isDisplayed();
		driver.findElement(Vfy_Email).isDisplayed();
	}
	
	public void ClickSluitButton() {
		driver.findElement(Btn_Sluit).click();
	}
	
	public void ScrolltoFAQ(){
		driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"+".scrollIntoView(new UiSelector()" + ".textMatches(\"Veelgestelde vragen\").instance(0))"));
		driver.findElement(Btn_FAQ).click();
	}
	
	public void AvailableQuestions() {
		driver.findElement(Vfy_Q1).isDisplayed();
		driver.findElement(Vfy_Q2).isDisplayed();
		driver.findElement(Vfy_Q3).isDisplayed();
		driver.findElement(Vfy_Q4).isDisplayed();
		driver.findElement(Vfy_Q5).isDisplayed();
		driver.findElement(Vfy_Q6).isDisplayed();
		driver.findElement(Vfy_Q7).isDisplayed();
	}
	
	public void ClickBackArrow() {
		//driver.findElement(Btn_Backarrow).click();
		((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.BACK));
	}
}
