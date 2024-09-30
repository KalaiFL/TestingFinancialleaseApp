package AppPages;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;

public class SearchQueryCreationPage {
	
	private AppiumDriver driver;
	private By Btn_Bewaaropdracht=By.xpath("//android.widget.TextView[@text='Bewaar zoekopdracht']");
	private By Vfy_Zoekopdrachtopslaan=By.xpath("//android.widget.TextView[@text='Zoekopdracht opslaan']");
	private String Vfy_Product="//android.widget.EditText[contains(@text,'<<choosenproduct>>')]";
	private By TxtSsearchQueryName=By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText");
	private By Btn_Opslaan=By.xpath("//android.widget.TextView[@text='Opslaan']");
	private String Vfy_SearchQuerySaved="//android.widget.TextView[contains(@text,'<<savedsearchqueryname>>')]";
	
	
	public SearchQueryCreationPage(AppiumDriver driver) {
		this.driver=driver;
	}
	
	public void ClickBewaaropdracht() {
		driver.findElement(Btn_Bewaaropdracht).click();
	}
	
	public void VfyZoekopdrachtOpslaanscreen() {
		driver.findElement(Vfy_Zoekopdrachtopslaan).isDisplayed();
	}
	
	public void VerfiyMerkModelName(String merkmodelname) throws InterruptedException {
		Vfy_Product=Vfy_Product.replace("<<choosenproduct>>", merkmodelname);
		driver.findElement(By.xpath(Vfy_Product)).isDisplayed();
		Thread.sleep(500);
	}
	
	public void AddsearchQueryName(String searchqueryname) {
		driver.findElement(TxtSsearchQueryName).clear();
		driver.findElement(TxtSsearchQueryName).sendKeys(searchqueryname);
	}
	
	public void ClickOpslaan() {
		driver.findElement(Btn_Opslaan).click();
	}
	
	public void SearchQuerySaved(String savedsearchquery) {
		Vfy_SearchQuerySaved=Vfy_SearchQuerySaved.replace("<<savedsearchqueryname>>", savedsearchquery);
		driver.findElement(By.xpath(Vfy_SearchQuerySaved)).isDisplayed();
	}

}
