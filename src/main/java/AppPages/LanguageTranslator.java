package AppPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;


public class LanguageTranslator{
	
	private AppiumDriver driver;
	private By Btn_ChooseLang=By.xpath("//android.widget.TextView[@text='Choose language']");
	//private By Btn_CancelLanguageTrans=By.className("com.horcrux.svg.LineView");
	private By Btn_CancelLanguageTrans=By.xpath("//android.view.ViewGroup[@resource-id='close-button']");
	private By RadioBtn_Dutch=AppiumBy.accessibilityId("Dutch");
	private By Validate_DutchTxt=By.xpath("//android.widget.TextView[@text='Hulp en contact']");
	
	private By Btn_KiesLang=By.xpath("//android.widget.TextView[@text='Kies taal']");
	private By RadioBtn_English=AppiumBy.accessibilityId("English");
	private By Validate_EnglishText=By.xpath("//android.widget.TextView[@text='Help and contact']");
	
	public LanguageTranslator(AppiumDriver driver){
		this.driver=driver;
	}
	
	public void TranslateLanguage() throws InterruptedException{
		List<WebElement> elements=driver.findElements(By.className("android.widget.TextView"));
		for(WebElement element:elements) {
			if(element.getText().equalsIgnoreCase("Help and contact"))
			{
				driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"+".scrollIntoView(new UiSelector()" + ".textMatches(\"Choose language\").instance(0))"));
				driver.findElement(Btn_ChooseLang).click();
				Thread.sleep(500);
				driver.findElement(Btn_CancelLanguageTrans).click();
				Thread.sleep(500);
				driver.findElement(Btn_ChooseLang).click();
				driver.findElement(RadioBtn_Dutch).click();
				driver.findElement(Validate_DutchTxt).isDisplayed();
			}
			else if(element.getText().equalsIgnoreCase("Hulp en contact")) {
				driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"+".scrollIntoView(new UiSelector()" + ".textMatches(\"Kies taal\").instance(0))"));
				driver.findElement(Btn_KiesLang).click();
				driver.findElement(RadioBtn_English).click();
				driver.findElement(Validate_EnglishText).isDisplayed();
			}
			else {
				//System.out.println("Ignoring elements" +element.getText());
				}
		}
	}

}
