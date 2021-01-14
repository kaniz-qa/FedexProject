package fedex.stepDef;

import fedex.actions.TrackingActions;
import io.cucumber.java.en.When;

public class TrackingStepDef {
	
	
	TrackingActions trackingAct = new TrackingActions();
	
	@When("click on print and tracking menu")
	public void click_on_print_and_tracking_menu() {
		trackingAct.trackingLink();
	    
	}

	@When("Input the tracking number")
	public void input_the_tracking_number() {
	    
		trackingAct.trackingText();
	}

	@When("click on tracking button")
	public void click_on_tracking_button() {
	    
		trackingAct.trackingBtn();
	}


	

}
