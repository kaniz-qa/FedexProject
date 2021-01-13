package fedex.stepDef;

import fedex.actions.RateVerifyActions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RateVerifyStepDef {

	RateVerifyActions rateAct = new RateVerifyActions();
	
	@When("User clicks on Rate & Ship")
	public void user_clicks_on_Rate_Ship() {
	  
		rateAct.shipRate();
	}

	@When("Input from and to")
	public void input_from_and_to() throws InterruptedException {
		rateAct.from();
		rateAct.to();
	   
	}

	@When("click on checkbox")
	public void click_on_checkbox() {
		rateAct.check();
	   
	}

	@When("Selects packaging option from drop-down list.")
	public void selects_packaging_option_from_drop_down_list() {
		rateAct.selectPkg();
	   
	}

	@When("Selects number of pkg , lb")
	public void selects_number_of_pkg_lb() {
		rateAct.pkgNum();
		rateAct.pkgWeight();
	   
	}

	@When("Inserts length weight height per packagee")
	public void inserts_length_weight_height_per_packagee() {
		rateAct.length();
		rateAct.weight();
		rateAct.height();
	   
	}

	@When("Selects ship-date from drop-down list")
	public void selects_ship_date_from_drop_down_list() {
	  
		rateAct.shipDate();
	}

	@When("Click Show Rates")
	public void click_Show_Rates() {
	  
		rateAct.shipRate();
	}

	@Then("FedEx Retails rates shows")
	public void fedex_Retails_rates_shows() {
	  
	   
	}

	
	
}
