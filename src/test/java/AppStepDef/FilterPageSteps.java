package AppStepDef;

import com.qa.DriverFactory.AppiumDriverFactory;

import AppPages.FiltersPage;
import io.cucumber.java.en.When;

public class FilterPageSteps {
	
	FiltersPage applyfilters=new FiltersPage(AppiumDriverFactory.getDriver());
	
	@When("the user clicks alle filters")
	public void the_user_clicks_alle_filters() {
		applyfilters.ClickAlleFilters();
	}
	
	@When("the user clicks Reset")
	public void the_user_clicks_Reset() {
		applyfilters.ClickReset();
	}
	
	@When("the user clicks Bekijk meer brandstof types")
	public void the_user_clicks_Bekijk_meer_brandstof_types() {
		applyfilters.ClickBekijkMeerOptions();
	}
	
	@When("the user selects first option as {string} in brandstof types")
	public void the_user_selects_first_option_as_in_brandstof_types(String options){
		applyfilters.ClickOption(options);
	}
	
	@When("the user selects second option as {string} in brandstof types")
	public void the_user_selects_second_option_as_in_brandstof_types(String secondoption) {
		applyfilters.ClickSecondOption(secondoption);
	}
	
@When("the user scroll to {string} as filter option one")
	public void the_user_scroll_to_as_filter_option_one(String trans){
		applyfilters.ScrollToTransmissie(trans);
	}
	
	@When("the user clicks option as {string} in transmissie")
	public void the_user_clicks_option_as_in_transmissie(String opt) {
		applyfilters.TransmissieOption(opt);
	}
	
	@When("the user scroll to {string} as filter option two")
	public void the_user_scroll_to_as_filter_option_two(String Voertuigsoort) {
		applyfilters.ScrollToVoertuigsoort(Voertuigsoort);
	}
	
	@When("the user clicks option as {string} in voertuigsoort")
	public void the_user_clicks_option_as_in_voertuigsoort(String opt) {
		applyfilters.VoertuigsoortOption(opt);
	}
	
	@When("the user scroll to {string} as filter option three")
	public void the_user_scroll_to_as_filter_option_three(String Carroserie) {
		applyfilters.ScrollToCarroserie(Carroserie);
	}
	
	@When("the user clicks option as {string} in carroserie")
	public void the_user_clicks_option_as_in_carroserie(String opt) {
		applyfilters.CarroserieFirstOption(opt);
	}
	
	@When("the user clicks Bekijk meer carrosserie")
	public void the_user_clicks_Bekijk_meer_carrosserie() {
		applyfilters.ClickMeerCarrosserieOption();
	}

	@When("the user selects second option as {string} in carrosserie types")
	public void the_user_selects_second_option_as_in_carrosserie_types(String CarrosserieOption) {
		applyfilters.SelectCarrosserieSecondOption(CarrosserieOption);
	}
	
	@When("the user scroll to {string} as range filter one")
	public void the_user_scroll_to_as_range_filter_one(String LeasePrijs) {
		applyfilters.ScrollToLeasePrijsFilter(LeasePrijs);
	}
	
	@When("the user scroll to {string} as toggle option")
	public void the_user_scroll_as_toggle_option(String BtwOfMarge) {
		applyfilters.ScrollToBtwOfMarge(BtwOfMarge);
	}
	
	@When("the user selects option as {string} in btw of marge")
	public void the_user_selects_option_as_in_btw_of_marge(String BtwOfMargeOption) {
		applyfilters.SelectBtwOfMargeOption(BtwOfMargeOption);
	}
	
	@When("the user set Vanaf value to {string}")
	public void the_user_set_Vanaf_value_to(String MinimaalValue) {
		applyfilters.SetMinimaalValue(MinimaalValue);
	}
	
	@When("the user click meer filter")
	public void the_user_click_meer_filter() {
		applyfilters.ClickMeerFilter();
	}
	
	@When("the user scroll to {string} as filter option four")
	public void the_user_scroll_to_as_filter_option_four(String NieuweFilter) {
		applyfilters.ScrollToNieuweFilter(NieuweFilter);
	}
	
	@When("the user selects option as {string} in nieuwe auto")
	public void the_user_selects_option_as_in_nieuwe_auto(String NieuweAutoValue) {
		applyfilters.SelectNieuweAutoOption(NieuweAutoValue);
	}
	
	@When("the user scroll to {string} as filter option five")
	public void the_user_to_as_filter_option_five(String AantalDeuren) {
		applyfilters.ScrollToAantalDeuren(AantalDeuren);
	}
	
	@When("the user selects option as {string} in aantal deuren")
	public void the_user_selects_option_as_in_aantal_deuren(String AantalDeurenOption) {
		applyfilters.SelectAantalDeuren(AantalDeurenOption);
	}

	@When("the user scroll to {string} as filter option six")
	public void the_user_scroll_to_as_filter_option_six(String Lengte) {
		applyfilters.ScrollToLengte(Lengte);
	}
	
	@When("the user selects option as {string} in lengte")
	public void the_user_selects_option_as_in_lengte(String LengteOption) {
		applyfilters.SelectLengtheOption(LengteOption);
	}

	@When("the user scroll to {string} as filter option seven")
	public void the_user_scroll_to_as_filter_option_seven(String Hoogte) {
		applyfilters.ScrollToHoogte(Hoogte);
	}
	
	@When("the user selects option as {string} in hoogte")
	public void the_user_selects_option_as_in_hoogte(String HoogteOption) {
		applyfilters.SelectHoogteOption(HoogteOption);
	}
	
	@When("the user scroll to {string} as filter option eight")
	public void the_user_scroll_to_as_filter_option_eight(String Cabine) {
		applyfilters.ScrollToCabine(Cabine);
	}
	
	@When("the user selects option as {string} in cabine")
	public void the_user_selects_option_as_in_cabine(String CabineOption) {
		applyfilters.SelectCabineOption(CabineOption);
	}
	
	@When("the user scroll to {string} as filter option nine")
	public void the_user_scroll_to_as_filter_option_nine(String Cilinder) {
		applyfilters.ScrollToCilinder(Cilinder);
	}
	
	@When("the user selects option as {string} in cilinders")
	public void the_user_selects_option_as_in_cilinders(String CilinderOption) {
		applyfilters.SelectCilinderOption(CilinderOption);
	}
	
	@When("the user scroll to {string} as filter option ten")
	public void the_user_scroll_to_as_filter_option_ten(String TypeBekleding) {
		applyfilters.ScrollToTypeBekleding(TypeBekleding);
	}
	
	@When("the user selects option as {string} in type bekleding")
	public void the_user_selects_option_as_in_type_bekleding(String TypeBekledingOption) {
		applyfilters.SelectTypeBekledingOption(TypeBekledingOption);
	}
	

	@When("the user scroll to {string} as filter option elf")
	public void the_user_scroll_to_as_filter_option_elf(String KleurBekleding) {
		applyfilters.ScrollToKleurBekleding(KleurBekleding);
	}
	
	@When("the user selects option as {string} in kleur bekleding")
	public void the_user_Selects_option_as_in_kleur_bekleding(String KleurBekledingOption) {
		applyfilters.SelectBtwOfKleurBekledingOption(KleurBekledingOption);
	}
	
	@When("the user scroll to {string} as filter option twaalf")
	public void the_user_scroll_to_as_filter_option_twaalf(String KleurExterieur) {
		applyfilters.ScrollToKleurExterieur(KleurExterieur);
	}
	
	@When("the user selects option as {string} in kleur exterieur")
	public void the_user_selects_option_as_in_kleur_exterieur(String KleurExterieurOption) {
		applyfilters.SelectKleurExterieurOption(KleurExterieurOption);
	}
}


