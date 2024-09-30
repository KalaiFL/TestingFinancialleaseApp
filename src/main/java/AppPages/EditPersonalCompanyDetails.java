package AppPages;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class EditPersonalCompanyDetails {
	
	private AppiumDriver driver;
	private By Btn_Profile=By.xpath("//android.view.ViewGroup[@content-desc='Profiel']");
	private By Btn_PersoonsgegevensAanpassen=By.xpath("(//android.view.ViewGroup[@content-desc='Aanpassen'])[1]");
	private String RadioBtn_Gender="<<SelectedGender>>";
	private By Txt_Voornaam=By.xpath("//android.widget.EditText[@resource-id='firstName']");
	private By Txt_Tussenvoegsel=By.xpath("//android.widget.EditText[@resource-id='infix']");
	private By Txt_Achternaam=By.xpath("//android.widget.EditText[@resource-id='lastName']");
	private By Txt_TelefoonNumber=By.xpath("//android.widget.EditText[@resource-id='phoneNumber']");
	private By Txt_Dag=By.xpath("//android.widget.EditText[@resource-id='dayOfBirth']");
	private By Txt_Maand=By.xpath("//android.widget.EditText[@resource-id='monthOfBirth']"); 
	private By Txt_Year=By.xpath("//android.widget.EditText[@resource-id='yearOfBirth']");
	private By Btn_Opslaan=AppiumBy.accessibilityId("Opslaan");
	private By Err_Voornaam=By.xpath("//android.widget.TextView[@text='Voornaam is verplicht']");
	private By Err_Achternaam=By.xpath("//android.widget.TextView[@text='Achternaam is verplicht']");
	private By Err_TelefoonNumber=By.xpath("//android.widget.TextView[@text='Telefoonnummer is verplicht']");
	private By Err_Geboortedag=By.xpath("//android.widget.TextView[@text='Geboortedag is verplicht']");
	private By Err_GeboorteMaand=By.xpath("//android.widget.TextView[@text='Geboortemaand is verplicht']");
	private By Err_Geboortejaar=By.xpath("//android.widget.TextView[@text='Geboortejaar is verplicht']");
	private String Err_TelefoonNumberInvalidData="//android.widget.TextView[@text='<<ErrorMessage>>']";
	private By Err_GeboortedagInvalidData=By.xpath("//android.widget.TextView[@text='Geboortedag is ongeldig']");
	private By Err_GeboorteMaandInvalidData=By.xpath("//android.widget.TextView[@text='Geboortemaand is ongeldig']");
	private By Err_GeboortejaarInvalidData=By.xpath("//android.widget.TextView[@text='Geboortejaar is ongeldig']");
	private By Vfy_SuccessfulNotification=By.xpath("//android.widget.TextView[@text='Opgeslagen']");
	
	private By Btn_BedrijfsgegevensAanpassen=By.xpath("(//android.view.ViewGroup[@content-desc='Aanpassen'])[2]");
	private By Txt_KvkNumber=By.xpath("//android.widget.EditText[@resource-id='businessRegistrationNumber']");
	private By Err_KvkNumber=By.xpath("//android.widget.TextView[@text='KVK-nummer is verplicht']");
	
	private By Btn_ProfileBackButton=By.xpath("//android.view.ViewGroup[@resource-id='back-button']");
	
	public EditPersonalCompanyDetails(AppiumDriver driver) {
		this.driver=driver;
	}
	
	public void ClickProfileButton() {
		driver.findElement(Btn_Profile).click();
	}
	
	public void ClickPersoonsgegevensAanpassen() {
		driver.findElement(Btn_PersoonsgegevensAanpassen).click();
	}

	public void EmptyPersoonsgegevensFormSubmission() {
		driver.findElement(Txt_Voornaam).clear();
		driver.findElement(Txt_Tussenvoegsel).clear();
		driver.findElement(Txt_Achternaam).clear();
		driver.findElement(Txt_TelefoonNumber).clear();
		driver.findElement(Txt_Dag).clear();
		driver.findElement(Txt_Maand).clear();
		driver.findElement(Txt_Year).clear();
		driver.findElement(Btn_Opslaan).click();
	}
	
	public void EmptyPersoonsgegevensFormSubmissionErrorValidation()
	{
		driver.findElement(Err_Voornaam).isDisplayed();
		driver.findElement(Err_Achternaam).isDisplayed();
		driver.findElement(Err_TelefoonNumber).isDisplayed();
		driver.findElement(Err_Geboortedag).isDisplayed();
		driver.findElement(Err_GeboorteMaand).isDisplayed();
		driver.findElement(Err_Geboortejaar).isDisplayed();
	}
	
	public void EnterInvalidTelefoonnumber(String invalidTelefoonNumber) {
		driver.findElement(Txt_TelefoonNumber).clear();
		driver.findElement(Txt_TelefoonNumber).sendKeys(invalidTelefoonNumber);
		driver.findElement(Btn_Opslaan).click();
	}
	
	public void VerifyErrMsgInvalidTelefoonnumber(String Errormessage) throws InterruptedException {
		Err_TelefoonNumberInvalidData=Err_TelefoonNumberInvalidData.replace("<<ErrorMessage>>",Errormessage);
		driver.findElement(By.xpath(Err_TelefoonNumberInvalidData)).isDisplayed();
		Thread.sleep(3500);
	}
	
	public void EnterInvalidDOB(String Day, String Maand, String Jaar) {
		driver.findElement(Txt_Dag).sendKeys(Day, Keys.ENTER);
		driver.findElement(Txt_Maand).sendKeys(Maand,Keys.ENTER);
		driver.findElement(Txt_Year).sendKeys(Jaar, Keys.ENTER);
	}
	
	public void InvalidDOBErrorValidation() {
		driver.findElement(Err_GeboortedagInvalidData).isDisplayed();
		driver.findElement(Err_GeboorteMaandInvalidData).isDisplayed();
		driver.findElement(Err_GeboortejaarInvalidData).isDisplayed();
	}
	
	public void EnterValidDataPersoonsgegevensForm(String Gender, String VoorNaam, String Tussenvoegsel, String AchterNaam, String TelefoonNumber, String Dag, String Maand, String Jaar) {
		String RRadioBtn_Gender=RadioBtn_Gender.replace("<<SelectedGender>>", Gender);
		driver.findElement(AppiumBy.accessibilityId(RRadioBtn_Gender)).click();
		driver.findElement(Txt_Voornaam).sendKeys(VoorNaam);
		driver.findElement(Txt_Tussenvoegsel).sendKeys(Tussenvoegsel);
		driver.findElement(Txt_TelefoonNumber).clear();
		driver.findElement(Txt_TelefoonNumber).sendKeys(TelefoonNumber);
		driver.findElement(Txt_Achternaam).clear();
		driver.findElement(Txt_Achternaam).sendKeys(AchterNaam);
		driver.findElement(Txt_Dag).clear();
		driver.findElement(Txt_Dag).sendKeys(Dag, Keys.ENTER);
		driver.findElement(Txt_Maand).clear();
		driver.findElement(Txt_Maand).sendKeys(Maand, Keys.ENTER);
		driver.findElement(Txt_Year).clear();
		driver.findElement(Txt_Year).sendKeys(Jaar, Keys.ENTER);
		driver.findElement(Btn_Opslaan).click();
	}
	
	public void VfyNotificaiton() {
		driver.findElement(Vfy_SuccessfulNotification).isDisplayed();
	}
	
	public void ClickBedrijfsgegevensAanpassen() {
		driver.findElement(Btn_BedrijfsgegevensAanpassen).click();
	}
	
	public void EmptyBedrijfgegevensFormSubmission() {
		driver.findElement(Txt_KvkNumber).clear();
		driver.findElement(Btn_Opslaan).click();
	}
	
	public void EmptyBedrijfgegevensFormSubmissionErrorValidation() {
		driver.findElement(Err_KvkNumber).isDisplayed();
	}
	
	public void EnterValidKVKNummer(String ValidKVKNummer) {
		driver.findElement(Txt_KvkNumber).sendKeys(ValidKVKNummer);
		driver.findElement(Btn_Opslaan).click();
	}
	
	public void ClickProfileBackButton() {
		//driver.findElement(Btn_ProfileBackButton).click();
		((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.BACK));
	}
}
	
