package fedex.stepDef;

import fedex.actions.CuponPdfActions;
import io.cucumber.java.en.When;

public class CuponPdfStepDef {

	CuponPdfActions cuponAct = new CuponPdfActions();
	
	@When("click on print and design menu , select get cupon and deals")
	public void click_on_print_and_design_menu_select_get_cupon_and_deals() {
		cuponAct.menuSubmenu();
	    
	}

	@When("click on get cupon button")
	public void click_on_get_cupon_button() {
		cuponAct.getCupon();
	    
	}

	
	
}
