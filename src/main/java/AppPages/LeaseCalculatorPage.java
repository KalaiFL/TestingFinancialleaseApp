package AppPages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class LeaseCalculatorPage {
	
	private AppiumDriver driver;
	
	private String Vfy_DefaultMaandbedrag="//android.widget.TextView[contains(@text,'<<defaultmaandbedrag>>')]";
	private String Btn_Month="<<monthselected>>";
	private By Txt_InvalidAanbetaling=By.xpath("//android.view.ViewGroup[10]/android.widget.EditText");
	private String vfy_ErrorMessageAanbetaling="//android.widget.TextView[contains(@text,'<<errmessageaanbetaling>>')]";
	private By Txt_InvalidSlottermijn=By.xpath("//android.view.ViewGroup[11]/android.widget.EditText");
	private String Vfy_ErrorMessageSlottermijn="//android.widget.TextView[contains(@text,'<<errormessageslottermijn>>')]";
	private By Btn_GratisOfferte=By.xpath("//android.widget.TextView[@text='Gratis offerte']");
	private String Btn_Car="<<selectedcar>>";
	
	public LeaseCalculatorPage(AppiumDriver driver) {
		this.driver=driver;
	}
	
	public void ScrollToCalculator() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"+".scrollIntoView(new UiSelector()" + ".textMatches(\"Bereken je leasetermijn\").instance(0))"));
	}
	
	public void DefaultMaandbedragPrice(String defaultprice) {
		Vfy_DefaultMaandbedrag=Vfy_DefaultMaandbedrag.replace("<<defaultmaandbedrag>>",defaultprice);
		System.out.println(Vfy_DefaultMaandbedrag);
		driver.findElement(By.xpath(Vfy_DefaultMaandbedrag)).isDisplayed();
	}
	
	public void SelectMonth(String selectedmonth) {
		Btn_Month=Btn_Month.replace("<<monthselected>>", selectedmonth);
		driver.findElement(AppiumBy.accessibilityId(Btn_Month)).click();
	}
	
	public void EnterInvalidAanbetaling() {
		String Aanbetalingvalue=driver.findElement(Txt_InvalidAanbetaling).getText();
		System.out.println("The string value is" +Aanbetalingvalue);
		driver.findElement(Txt_InvalidAanbetaling).clear();
		double aanbetalingvalue=Double.parseDouble(Aanbetalingvalue);
		System.out.println("The Int value is" +aanbetalingvalue);
		String addinvalidaanbetaling=Double.toString(++aanbetalingvalue);
		System.out.println("The string value is" +addinvalidaanbetaling);
		driver.findElement(Txt_InvalidAanbetaling).sendKeys(addinvalidaanbetaling, Keys.ENTER);
	}
	
	public void ErrorMessageAanbetaling(String errormessageaanbetaling) {
		vfy_ErrorMessageAanbetaling=vfy_ErrorMessageAanbetaling.replace("<<errmessageaanbetaling>>", errormessageaanbetaling);
		driver.findElement(By.xpath(vfy_ErrorMessageAanbetaling)).isDisplayed();
	}
	
	public void EnterValidAanbetaling() {
		String Aanbetalingvalue=driver.findElement(Txt_InvalidAanbetaling).getText();
		System.out.println("The string value is" +Aanbetalingvalue);
		driver.findElement(Txt_InvalidAanbetaling).clear();
		double aanbetalingvalue=Double.parseDouble(Aanbetalingvalue); 
		System.out.println("The Int value is" +aanbetalingvalue);
		String addinvalidaanbetaling=Double.toString(--aanbetalingvalue);
		System.out.println("The string value is" +addinvalidaanbetaling);
		driver.findElement(Txt_InvalidAanbetaling).sendKeys(addinvalidaanbetaling, Keys.ENTER);
	}
	
	public void EnterInvalidSlottermijn() {
	  String Slottermijnvalue=driver.findElement(Txt_InvalidSlottermijn).getText();
		System.out.println("The string value is" +Slottermijnvalue);
		driver.findElement(Txt_InvalidSlottermijn).clear();
		int slotermijnvalue=Integer.parseInt(Slottermijnvalue);
		System.out.println("The Int value is" +slotermijnvalue);
		String addinvalidslotermijn=Integer.toString(++slotermijnvalue);
		System.out.println("The string value is" +addinvalidslotermijn);
		driver.findElement(Txt_InvalidSlottermijn).sendKeys(addinvalidslotermijn, Keys.ENTER);
	}
	
	public void EnterValidSlottermijn() {
		String Slottermijnvalue=driver.findElement(Txt_InvalidSlottermijn).getText();
		System.out.println("The string value is" +Slottermijnvalue);
		driver.findElement(Txt_InvalidSlottermijn).clear();
		int slotermijnvalue=Integer.parseInt(Slottermijnvalue);
		System.out.println("The Int value is" +slotermijnvalue);
		String addinvalidslotermijn=Integer.toString(--slotermijnvalue);
		System.out.println("The string value is" +addinvalidslotermijn);
		driver.findElement(Txt_InvalidSlottermijn).sendKeys(addinvalidslotermijn, Keys.ENTER);
	}
	
	public void ErrorMessageSlottermijn(String errormessageslottermijn) {
		Vfy_ErrorMessageSlottermijn=Vfy_ErrorMessageSlottermijn.replace("<<errormessageslottermijn>>",errormessageslottermijn);
		driver.findElement(By.xpath(Vfy_ErrorMessageSlottermijn)).isDisplayed();
	}
	
	public void ClickGratisOfferte() {
		driver.findElement(Btn_GratisOfferte).click();
	}
	
	public void ScrollToCar(String cardetails) {
		Btn_Car=Btn_Car.replace("<<selectedcar>>", cardetails);
		driver.findElement(AppiumBy.accessibilityId(Btn_Car)).click();
	}


}
