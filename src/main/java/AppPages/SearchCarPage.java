package AppPages;

import org.openqa.selenium.By;


import io.appium.java_client.AppiumDriver;

	public class SearchCarPage {
		
		
		private AppiumDriver driver;
		
		private By Btn_Zoeken=By.xpath("//android.widget.TextView[@text='Zoeken']");
		private By Vfy_HomeScreen=By.xpath("//android.widget.TextView[@text='Vind jouw zakelijk auto']");
		private By Btn_Merk=By.xpath("//android.widget.TextView[@text='Merk & model']");
		private By Txt_Merk=By.xpath("//android.widget.EditText[@text='Zoek merk']");
		private String Btn_Select_Merk="//android.widget.TextView[@text='<<merkname>>']";
		private By Txt_Model=By.xpath("//android.widget.EditText[@text='Zoek model']");
		private String Btn_Select_Model="//android.widget.TextView[@text='<<modelname>>']";
		private By Btn_Opslaan=By.xpath("//android.widget.TextView[contains(@text,'Opslaan')]");
		private String Vfy_Choosen_Values="//android.widget.TextView[@text='<<choosenvaluesadded>>']";
		private By Btn_BekijkResult=By.xpath("//android.widget.TextView[contains(@text,'Bekijk')]");
		private String Vfy_AppliedFiltervalues="//android.widget.TextView[@text='<<filtervalue>>']";
		
		
		public SearchCarPage(AppiumDriver driver) {
			this.driver=driver;
		}
		
		public void ZoekenTab() {
			driver.findElement(Btn_Zoeken).click();
		}
		
		public void VerifyHomeScreen() {
			driver.findElement(Vfy_HomeScreen).isDisplayed();
		}
		
		public void ClickMerkModel() {
			driver.findElement(Btn_Merk).click();
		}
		
		public void EnterMerkValue(String merk) {
			driver.findElement(Txt_Merk).sendKeys(merk);
			Btn_Select_Merk=Btn_Select_Merk.replace("<<merkname>>",merk);
			driver.findElement(By.xpath(Btn_Select_Merk)).click();
		}
		
		public void EnterModelValue(String model) {
			driver.findElement(Txt_Model).sendKeys(model);
			String replacedBtn_Select_Model=Btn_Select_Model.replace("<<modelname>>",model);
			driver.findElement(By.xpath(replacedBtn_Select_Model)).click();;
		}
		
		public void ClickOpslaan() throws InterruptedException {
			driver.findElement(Btn_Opslaan).click();
			Thread.sleep(2000);
		}
		
		public void ChoosenValuesAdded(String choosenvalues) {
			String RVfy_Choosen_Values=Vfy_Choosen_Values.replace("<<choosenvaluesadded>>",choosenvalues);
			driver.findElement(By.xpath(RVfy_Choosen_Values)).isDisplayed();
		}
		
		public void AppliedFilterValue(String appliedfiltervalue) {
			Vfy_AppliedFiltervalues=Vfy_AppliedFiltervalues.replace("<<filtervalue>>",appliedfiltervalue);
			driver.findElement(By.xpath(Vfy_AppliedFiltervalues)).isDisplayed();
		}
		
		public void clickBekijk() {
			driver.findElement(Btn_BekijkResult).click();
		}
		
		public void ClickBekijkInProductSearch() {
			driver.navigate().back();
			driver.navigate().back();
		}
	

}
