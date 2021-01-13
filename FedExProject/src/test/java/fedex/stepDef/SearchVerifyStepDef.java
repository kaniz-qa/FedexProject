package fedex.stepDef;

import fedex.actions.SearchVerifyActions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchVerifyStepDef {

	
	SearchVerifyActions searchAct = new SearchVerifyActions();
	
	
	@When("I click on search icon")
	public void i_click_on_search_icon() {
	   
		searchAct.searchIcon();
	}

	@When("Input tracking number")
	public void input_tracking_number() {
		searchAct.searchText();
	    
	}

	@When("press enter")
	public void press_enter() {
		searchAct.enterText();
	    
	}

	@Then("displayed error msg")
	public void displayed_error_msg() {
	   
		searchAct.errorMsg();
	}

	
	
}
