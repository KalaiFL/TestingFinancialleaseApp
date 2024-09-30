package AppPages;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class CompareCarsPage {

	private AppiumDriver driver;
	//private String Btn_Vergelijken="//android.view.ViewGroup[@content-desc='<<SelectedProduct>>']/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup";
	private String Vfy_text="<<MatchingText>>";
	private By Btn_CompareCars=AppiumBy.accessibilityId("2 auto's geselecteerd");
	private By Vfy_VergelijkenScreen=By.xpath("//android.widget.TextView[@text='Specificaties']");
	
	public CompareCarsPage(AppiumDriver driver) {
		this.driver=driver;
	}
	
	public void ClickVergelijkenFirstOption() throws InterruptedException {
		//String RBtn_Vergelijken=Btn_Vergelijken.replace("<<SelectedProduct>>", SelectOptionOne);
		//System.out.println(RBtn_Vergelijken);
		driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc='Volkswagen Passat, € 362 p/m, Vergelijken']/android.view.ViewGroup[2]")).click();
		Thread.sleep(500);
		}
	
	public void VerifyText(String validationText) {
		String RVfy_text=Vfy_text.replace("<<MatchingText>>", validationText);
		driver.findElement(AppiumBy.accessibilityId(RVfy_text)).isDisplayed();
	}
	
	public void NavigateToCompareCarsScreen() {
		driver.findElement(Btn_CompareCars).click();
	}
	
	public void VerifyVergelijkenScreen() {
		driver.findElement(Vfy_VergelijkenScreen).isDisplayed();
	}
	
	
}
