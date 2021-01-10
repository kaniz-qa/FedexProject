package fedex.stepDef;

import fedex.actions.VerifyPdfActions;
import fedex.utilities.SetupDrivers;
import io.cucumber.java.en.*;

public class VerifyPdfStepDef {

	VerifyPdfActions pdfAct = new VerifyPdfActions();
	
	@Given("Fedex Homepage is launched.")
	public void fedex_Homepage_is_launched() {
		pdfAct.fedexHomePage();
		System.out.println("driver------------"+ SetupDrivers.chromeDriver);
	    
	}

	@When("click on search icon")
	public void click_on_search_icon() {
		pdfAct.searchIcon();
	    
	}

	@When("input tracking number")
	public void input_tracking_number() {
		pdfAct.searchText();
	    
	}

	@When("press enter")
	public void press_enter() {
		pdfAct.pressEnter();
	    
	}

	@Then("user can see error msg")
	public void user_can_see_error_msg() {
	   
	    
	}


	
}
