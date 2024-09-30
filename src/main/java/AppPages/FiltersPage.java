package AppPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class FiltersPage {
	
	private AppiumDriver driver;
	private By Btn_AlleFilters=By.xpath("//android.widget.TextView[@text='Alle filters']");
	private By Btn_Reset=By.xpath("//android.widget.TextView[@text='Reset']");
	private By Btn_BekijkMeerBrandstofOptions=By.xpath("//android.widget.TextView[@text='Bekijk meer brandstof types']");
	
	private String Btn_Option="//android.view.ViewGroup[@content-desc='<<option>>']";
	private String Btn_SecondOption="//android.view.ViewGroup[@content-desc='<<secondoption>>']";
	private String Btn_TransmissieOption="//android.widget.TextView[@text='<<Transmissieoption>>']";
	private String Btn_VoertuigsoortOption="//android.widget.TextView[@text='<<VoertuigsoortOption>>']";
	private String Btn_CarroserieFirstOption="//android.widget.TextView[@text='<<CarroserieFirstOption>>']";
	private String Btn_CarroserieSecondOption="//android.widget.TextView[@text='<<CarroserieSecondOption>>']";
	private String Toggle_BtwOfMarge="//android.widget.TextView[contains(@text,'<<BtwOfMargeOpt>>')]";
	
	private By Btn_MeerFilter=By.xpath("//android.widget.TextView[@text='Meer filters']");
	private String Btn_NieuweAutoOption="//android.widget.TextView[@text='<<NieuweAutoChoice>>']";
	private String Btn_AantalDeurenOption="//android.widget.TextView[@text='<<AantalDeurenChoice>>']";
	private String Btn_LengteOption="//android.widget.TextView[@text='<<LengteChoice>>']";
	private String Btn_HoogteOption="//android.widget.TextView[@text='<<HoogteChoice>>']";
	private String Btn_CabineOption="//android.widget.TextView[@text='<<CabineChoice>>']";
	private String Btn_CilinderOption="//android.widget.TextView[@text='<<CilinderChoice>>']";
	private String Btn_TypeBekledingOption="//android.widget.TextView[@text='<<TypeBekledingChoice>>']";
	private String Btn_KleurBekledingOption="//android.widget.TextView[@text='<<KleurBekledingChoice>>']";
	private String Btn_KleurExterieurOption="(//android.widget.TextView[@text='<<KleurExterieurChoice>>'])[2]";
	
	public FiltersPage(AppiumDriver driver) {
		this.driver=driver;
	}
	
	public void ClickAlleFilters() {
		driver.findElement(Btn_AlleFilters).click();
	}
	
	public void ClickReset() {
		driver.findElement(Btn_Reset).click();
	}
	
	public void ClickBekijkMeerOptions() {
		driver.findElement(Btn_BekijkMeerBrandstofOptions).click();
	}
	
	public void ClickOption(String options) {
		Btn_Option=Btn_Option.replace("<<option>>", options);
		System.out.println(options);
		driver.findElement(By.xpath(Btn_Option)).click();
		}
	
	public void ClickSecondOption(String secondoption) {
		Btn_SecondOption=Btn_SecondOption.replace("<<secondoption>>", secondoption);
		System.out.println(secondoption);
		driver.findElement(By.xpath(Btn_SecondOption)).click();
	}
	
	public void ScrollToTransmissie(String Transmissie) {
		String scrollCommand = "new UiScrollable(new UiSelector().scrollable(true).instance(0))" +
	                ".scrollIntoView(new UiSelector().textMatches(\"" + Transmissie + "\").instance(0))";

	        driver.findElement(new AppiumBy.ByAndroidUIAutomator(scrollCommand));
	}
	
	public void TransmissieOption(String TransmissieOption) {
		Btn_TransmissieOption=Btn_TransmissieOption.replace("<<Transmissieoption>>", TransmissieOption);
		driver.findElement(By.xpath(Btn_TransmissieOption)).click();
	}
	
	public void ScrollToVoertuigsoort(String Voertuigsoort) {
		 String scrollCommand = "new UiScrollable(new UiSelector().scrollable(true).instance(0))" +
	                ".scrollIntoView(new UiSelector().textMatches(\"" + Voertuigsoort + "\").instance(0))";

	        driver.findElement(new AppiumBy.ByAndroidUIAutomator(scrollCommand));
	}
	
	public void VoertuigsoortOption(String VoertuigsoortOption) {
		Btn_VoertuigsoortOption=Btn_VoertuigsoortOption.replace("<<VoertuigsoortOption>>", VoertuigsoortOption);
		driver.findElement(By.xpath(Btn_VoertuigsoortOption)).click();
	}
	
	public void ScrollToCarroserie(String Carroserie) {
		 String scrollCommand = "new UiScrollable(new UiSelector().scrollable(true).instance(0))" +
	                ".scrollIntoView(new UiSelector().textMatches(\"" + Carroserie + "\").instance(0))";

	        driver.findElement(new AppiumBy.ByAndroidUIAutomator(scrollCommand));
	}
	
	public void CarroserieFirstOption(String CarroserieFirstOption) {
		Btn_CarroserieFirstOption=Btn_CarroserieFirstOption.replace("<<CarroserieFirstOption>>", CarroserieFirstOption);
		driver.findElement(By.xpath(Btn_CarroserieFirstOption)).click();
	}
	
	public void ClickMeerCarrosserieOption() {
		driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"+".scrollIntoView(new UiSelector()" + ".textMatches(\"Bekijk meer carrosserieën\").instance(0))")).click();
	}
	
	public void SelectCarrosserieSecondOption(String CarrosserieSecondOption) {
		Btn_CarroserieSecondOption=Btn_CarroserieSecondOption.replace("<<CarroserieSecondOption>>", CarrosserieSecondOption);
		driver.findElement(By.xpath(Btn_CarroserieSecondOption)).click();
	}
	
	public void ScrollToLeasePrijsFilter(String LeasePrijs) {
		String scrollCommand = "new UiScrollable(new UiSelector().scrollable(true).instance(0))" +
                ".scrollIntoView(new UiSelector().textMatches(\"" + LeasePrijs + "\").instance(0))";

        driver.findElement(new AppiumBy.ByAndroidUIAutomator(scrollCommand));
        driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'Leaseprijs')]")).click();
        }
	
	public void ScrollToBtwOfMarge(String BtwOfMarge) {
		String scrollCommand = "new UiScrollable(new UiSelector().scrollable(true).instance(0))" +
                ".scrollIntoView(new UiSelector().textMatches(\"" + BtwOfMarge + "\").instance(0))";

        driver.findElement(new AppiumBy.ByAndroidUIAutomator(scrollCommand));
	}
	
	public void SelectBtwOfMargeOption(String BtwOfMargeOption) {
		Toggle_BtwOfMarge=Toggle_BtwOfMarge.replace("<<BtwOfMargeOpt>>", BtwOfMargeOption);
		driver.findElement(By.xpath(Toggle_BtwOfMarge)).click();
	}
	
	public void SetMinimaalValue(String MinimaalValue) {
		WebElement MinEle=driver.findElement(By.xpath("//android.widget.TextView[@text='€ 10.000']"));
		
		
	}
	
	public void ClickMeerFilter() {
		driver.findElement(Btn_MeerFilter).click();
	}
	
	public void ScrollToNieuweFilter(String NieuweFilter) {
		String scrollCommand = "new UiScrollable(new UiSelector().scrollable(true).instance(0))" +
                ".scrollIntoView(new UiSelector().textMatches(\"" + NieuweFilter + "\").instance(0))";

        driver.findElement(new AppiumBy.ByAndroidUIAutomator(scrollCommand));
	}
	
	public void SelectNieuweAutoOption(String  NieuweAutoOption) {
		Btn_NieuweAutoOption=Btn_NieuweAutoOption.replace("<<NieuweAutoChoice>>", NieuweAutoOption);
		driver.findElement(By.xpath(Btn_NieuweAutoOption)).click();
	}
	
	public void ScrollToAantalDeuren(String AantalDeuren) {
		String scrollCommand = "new UiScrollable(new UiSelector().scrollable(true).instance(0))" +
                ".scrollIntoView(new UiSelector().textMatches(\"" + AantalDeuren + "\").instance(0))";

        driver.findElement(new AppiumBy.ByAndroidUIAutomator(scrollCommand));
	}
	
	public void SelectAantalDeuren(String AantalDeurenOption) {
		Btn_AantalDeurenOption=Btn_AantalDeurenOption.replace("<<AantalDeurenChoice>>", AantalDeurenOption);
		driver.findElement(By.xpath(Btn_AantalDeurenOption)).click();
	}
	
	public void ScrollToLengte(String Lengte) {
		String scrollCommand = "new UiScrollable(new UiSelector().scrollable(true).instance(0))" +
                ".scrollIntoView(new UiSelector().textMatches(\"" + Lengte + "\").instance(0))";

        driver.findElement(new AppiumBy.ByAndroidUIAutomator(scrollCommand));
	}
	
	public void SelectLengtheOption(String LengteOption) {
		Btn_LengteOption=Btn_LengteOption.replace("<<LengteChoice>>", LengteOption);
		driver.findElement(By.xpath(Btn_LengteOption)).click();
	}
	
	public void ScrollToHoogte(String Hoogte) {
		String scrollCommand = "new UiScrollable(new UiSelector().scrollable(true).instance(0))" +
                ".scrollIntoView(new UiSelector().textMatches(\"" + Hoogte + "\").instance(0))";

        driver.findElement(new AppiumBy.ByAndroidUIAutomator(scrollCommand));
	}
	
	public void SelectHoogteOption(String HoogteOption) {
		Btn_HoogteOption=Btn_HoogteOption.replace("<<HoogteChoice>>", HoogteOption);
		driver.findElement(By.xpath(Btn_HoogteOption)).click();
	}
	
	public void ScrollToCabine(String Cabine) {
		String scrollCommand = "new UiScrollable(new UiSelector().scrollable(true).instance(0))" +
                ".scrollIntoView(new UiSelector().textMatches(\"" + Cabine + "\").instance(0))";

        driver.findElement(new AppiumBy.ByAndroidUIAutomator(scrollCommand));
	}
	
	public void SelectCabineOption(String CabineOption) {
		Btn_CabineOption=Btn_CabineOption.replace("<<CabineChoice>>", CabineOption);
		driver.findElement(By.xpath(Btn_CabineOption)).click();
	}
	
	public void ScrollToCilinder(String Cilinder) {
		String scrollCommand = "new UiScrollable(new UiSelector().scrollable(true).instance(0))" +
                ".scrollIntoView(new UiSelector().textMatches(\"" + Cilinder + "\").instance(0))";

        driver.findElement(new AppiumBy.ByAndroidUIAutomator(scrollCommand));
	}
	
	public void SelectCilinderOption(String CilinderOption) {
		Btn_CilinderOption=Btn_CilinderOption.replace("<<CilinderChoice>>", CilinderOption);
		driver.findElement(By.xpath(Btn_CilinderOption)).click();
	}
	
	public void ScrollToTypeBekleding(String TypeBekleding) {
		String scrollCommand = "new UiScrollable(new UiSelector().scrollable(true).instance(0))" +
                ".scrollIntoView(new UiSelector().textMatches(\"" + TypeBekleding + "\").instance(0))";

        driver.findElement(new AppiumBy.ByAndroidUIAutomator(scrollCommand));
	}
	
	public void SelectTypeBekledingOption(String TypeBekledingOption) {
		Btn_TypeBekledingOption=Btn_TypeBekledingOption.replace("<<TypeBekledingChoice>>", TypeBekledingOption);
		driver.findElement(By.xpath(Btn_TypeBekledingOption)).click();
	}
	
	public void ScrollToKleurBekleding(String KleurBekleding) {
		String scrollCommand = "new UiScrollable(new UiSelector().scrollable(true).instance(0))" +
                ".scrollIntoView(new UiSelector().textMatches(\"" + KleurBekleding + "\").instance(0))";

        driver.findElement(new AppiumBy.ByAndroidUIAutomator(scrollCommand));
	}
	
	public void SelectBtwOfKleurBekledingOption(String KleurBekledingOption) {
		Btn_KleurBekledingOption=Btn_KleurBekledingOption.replace("<<KleurBekledingChoice>>", KleurBekledingOption);
		driver.findElement(By.xpath(Btn_KleurBekledingOption)).click();
	}
	
	public void ScrollToKleurExterieur(String KleurExterieur) {
		String scrollCommand = "new UiScrollable(new UiSelector().scrollable(true).instance(0))" +
                ".scrollIntoView(new UiSelector().textMatches(\"" + KleurExterieur + "\").instance(0))";

        driver.findElement(new AppiumBy.ByAndroidUIAutomator(scrollCommand));
	}
	
	public void SelectKleurExterieurOption(String KleurExterieurOption) {
		Btn_KleurExterieurOption=Btn_KleurExterieurOption.replace("<<KleurExterieurChoice>>", KleurExterieurOption);
		driver.findElement(By.xpath(Btn_KleurExterieurOption)).click();
	}
}