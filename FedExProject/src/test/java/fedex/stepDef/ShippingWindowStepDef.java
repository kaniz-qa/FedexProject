package fedex.stepDef;

import fedex.actions.ShippingWindowActions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ShippingWindowStepDef {

	
	ShippingWindowActions shippingWinAct = new ShippingWindowActions();
	
	
	@When("click on return pkg")
	public void click_on_return_pkg() throws InterruptedException {
		shippingWinAct.returnPkg();
	    
	}

	@When("scroll and click on create shipping label")
	public void scroll_and_click_on_create_shipping_label() throws InterruptedException {
		shippingWinAct.createLabel();
	    
	}

	@When("Input your name and receipent name")
	public void input_your_name_and_receipent_name() throws InterruptedException {
	    
		shippingWinAct.returnInfo();
	}

	@When("click on continue")
	public void click_on_continue() throws InterruptedException {
	    
		shippingWinAct.continueButton();
	}

	@Then("shows error msg")
	public void shows_error_msg() throws InterruptedException {
		shippingWinAct.errorMsg();
	}

	
	
}
