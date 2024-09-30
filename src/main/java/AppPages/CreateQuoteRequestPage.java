package AppPages;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class CreateQuoteRequestPage {
	
	private AppiumDriver driver;
	private  WebDriver webdriver;
	private String Btn_Product="//android.widget.TextView[@text='<<SelectedProductDetails>>']";
	private By Btn_GratisOfferte=AppiumBy.accessibilityId("Gratis offerte");
	private By Btn_ToevoegenBedrijfsgegevens=AppiumBy.accessibilityId("Toevoegen");
	private By Vfy_Notificaiton=AppiumBy.accessibilityId("Opgeslagen");
	private By Btn_ToevoegenPersoonsgegevens=By.xpath("//android.widget.TextView[@text='Toevoegen']");
	private By Btn_BekijkAanvraag=AppiumBy.accessibilityId("Bekijk aanvraag");
	private By Vfy_JouwAanvraag=By.xpath("//android.widget.TextView[@text='Jouw aanvraag']");
	
	private By Txt_SA_Search=By.xpath("//button[@aria-label='Zoeken']");
	private By Txt_SA_EnterSearchText=By.xpath("//input[@placeholder='Zoeken in Web Activities en meer...']");
	//private String Clk_SA_Lead="//a[@normalize-space()='<<ActualLead>>']";
	private By Clk_SA_Lead=By.xpath("//a[contains(@href, '/lightning/r/')]");
	private By Vfy_SA_Email=By.xpath("(//a[@class='emailuiFormattedEmail'])[1]");
	private By Btn_SA_Convert=By.name("Convert");
	
	
	
	public CreateQuoteRequestPage(AppiumDriver driver, WebDriver webdriver) {
		this.driver=driver;
		this.webdriver=webdriver;
	}
	
	public void ClickSelectProduct(String ProductDetails) {
		String Btn_RProduct=Btn_Product.replace("<<SelectedProductDetails>>", ProductDetails);
		driver.findElement(By.xpath(Btn_RProduct)).click();
	}
	
	public void ClickGratisOfferte() {
		driver.findElement(Btn_GratisOfferte).click();
	}
	
	public void ClickToevoegenBedrijfsgegevens() {
		driver.findElement(Btn_ToevoegenBedrijfsgegevens).click();
	}
	
	public void VfyNotification() {
		driver.findElement(Vfy_Notificaiton).isDisplayed();
	}
	
	public void ClickToevoegenPersoonsgegevens() {
		driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"+".scrollIntoView(new UiSelector()" + ".textMatches(\"Toevoegen\").instance(0))"));
		driver.findElement(Btn_ToevoegenPersoonsgegevens).click();
	}
	
	public void ClickBekijkAanvraag() {
		driver.findElement(Btn_BekijkAanvraag).click();
	}
	
	public void VfyJouwAanvraag() {
		driver.findElement(Vfy_JouwAanvraag).isDisplayed();
	}
	
	public void FindWebactivity(String SearchString) throws InterruptedException {
		webdriver.findElement(Txt_SA_Search).click();
		webdriver.findElement(Txt_SA_EnterSearchText).sendKeys(SearchString, Keys.ENTER);
		Thread.sleep(1500);
	}
	
	public void ClickLeads(String LeadName) throws InterruptedException {
		//String RClk_SA_Lead=Clk_SA_Lead.replace("<<ActualLead>>", LeadName);
		//System.out.println(RClk_SA_Lead);
		//Thread.sleep(1000);
		//webdriver.findElement(By.xpath(RClk_SA_Lead)).click();
		webdriver.findElement(Clk_SA_Lead).click();
	}
	
	public void VfyLeadEmail(String Email) {
		String LeadEmail=webdriver.findElement(Vfy_SA_Email).getText();
		if(LeadEmail==Email) {
			webdriver.findElement(Btn_SA_Convert).click();
		}
	}
	
	public void ConvertLeadToOpportunitys() {
		webdriver.findElement(By.xpath("(//button[normalize-space()='Converteren'])[1]")).click();
		webdriver.findElement(By.xpath("(//button[@type='button'][normalize-space()='Converteren'])[2]")).click();
	}
	
	public void ClickWebActivity() {
		webdriver.findElement(By.xpath("//a[@title='BlackEagle BEAST']")).click();
	}
	
	public void ClickZoeken() {
		webdriver.findElement(By.xpath("(//button[normalize-space()='Zoeken...'])[1]")).click();
	}
	
	public void EnterZoekenText(String ZoekenText) {
		webdriver.findElement(By.xpath("//input[@placeholder='Zoeken in Web Activities en meer...']")).click();
		webdriver.findElement(By.xpath("//input[@placeholder='Zoeken in Web Activities en meer...']")).sendKeys(ZoekenText,Keys.ENTER);
	}
	
	public void ClickCorrectWebActivity() {
		webdriver.findElement(By.xpath("(//a[@title='11-03-2024-225130'])[1]")).click();
	}
	
	public void ClickLead(String LeadName) {
		webdriver.findElement(By.xpath("//*[@id='window']")).click();
	}
	
	public void ConvertLeadToOpportunity() throws InterruptedException {
		webdriver.findElement(By.xpath("(//button[normalize-space()='Converteren'])[1]")).click();
		Thread.sleep(2000);
		webdriver.findElement(By.xpath("(//button[@type='button'][normalize-space()='Converteren'])[2]")).click();
	}
	
	public void OpenOpportunity() throws InterruptedException {
		webdriver.findElement(By.xpath("(//a[contains(text(),'Geel-Astra Sports Tourer- €')])[1]")).click();
		Thread.sleep(1000);
	}
	
	public void CreateEmptyBankRequest() throws InterruptedException{
		webdriver.findElement(By.xpath("//button[@title='Kennisgeving negeren']//lightning-primitive-icon[@variant='bare']")).click();
		//webdriver.findElement(By.xpath("(//lightning-primitive-icon[@variant='bare'])[22]")).click();
		webdriver.findElement(By.xpath("(//span[normalize-space()='Lege Bankaanvraag'])[1]")).click();
		webdriver.findElement(By.xpath("(//input[@placeholder='Zoeken in Accounts...'])[1]")).click();
		Thread.sleep(500);
		webdriver.findElement(By.xpath("(//input[@placeholder='Zoeken in Accounts...'])[1]")).sendKeys("Hiltermann Lease B.V.",Keys.ARROW_DOWN, Keys.ENTER);
		webdriver.findElement(By.xpath("(//button[normalize-space()='Lege bankaanvraag aanmaken'])[1]")).click();
		Thread.sleep(1000);
		webdriver.findElement(By.xpath("//button[@title='Kennisgeving negeren']//lightning-primitive-icon[@variant='bare']")).click();
		System.out.println("Bankvraag button click");
		webdriver.findElement(By.xpath("//a[contains(@href, '/lightning/r/Opportunity/') and contains(@href, '/related/Bankaanvragen__r/view')]")).click();
		Thread.sleep(500);
		System.out.println("Bankvraag button click finished");
		System.out.println("Bankvraag click");
		//webdriver.findElement(By.xpath("(//slot[contains(text(),'B-000062')])[1]")).click();
		System.out.println("Bankvraag click finished");
		webdriver.findElement(By.xpath("(//button[@title='Beoordeling bewerken'])[1]")).click()	;
		webdriver.findElement(By.xpath("(//span[contains(text(),'-- Geen --')])[1]")).click();
		webdriver.findElement(By.xpath("//span[@title='100% akkoord']")).click();
		Thread.sleep(100);
		webdriver.findElement(By.xpath("(//button[@name='SaveEdit'])[1]")).click();
		Thread.sleep(100);
		//webdriver.findElement(By.xpath("(//slot[contains(text(),'Geel-Astra Sports Tourer- €')])[2]")).click();
		Thread.sleep(500);
		webdriver.findElement(By.xpath("//button[@title='Kennisgeving negeren']//lightning-primitive-icon[@variant='bare']")).click();
		Thread.sleep(500);
		webdriver.findElement(By.xpath("(//runtime_platform_actions-action-renderer[@title='Verander Leasegegevens'])[1]")).click();
		Thread.sleep(500);
		WebElement element = webdriver.findElement(By.xpath("(//span[contains(text(),'-- Geen --')])[1]"));
		
		 JavascriptExecutor js = (JavascriptExecutor) driver;
	     js.executeScript("arguments[0].scrollIntoView(true);", element);
	     
	     element.click();
	        
	        
		//webdriver.findElement(By.xpath("(//span[contains(text(),'-- Geen --')])[1]")).click();
		webdriver.findElement(By.xpath("(//span[contains(text(),'-- Geen --')])[1]")).sendKeys("H", Keys.ENTER);
		//webdriver.findElement(By.xpath("(//span[contains(text(),'-- Geen --')])[2]")).click();
		//webdriver.findElement(By.xpath("(//span[contains(text(),'-- Geen --')])[2]")).sendKeys("H", Keys.ENTER);
		}

}
