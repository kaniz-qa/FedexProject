package fedex.stepDef;

import fedex.actions.VerifyPdfActions;
import io.cucumber.java.en.*;

public class VerifyPdfStepDef {

	VerifyPdfActions pdfAct = new VerifyPdfActions();
	
	@Given("user navigate the url")
	public void user_navigate_the_url() {
		pdfAct.fedexHomePage();
	    
	}
	@When("click on design and print menu")
	public void click_on_design_and_print_menu() {
		pdfAct.designPrintMenu();
	}

	@When("select Get coupon and deals")
	public void select_Get_coupon_and_deals() {
		pdfAct.cuponSubmenu();
	}


	@When("scroll down and click on get coupon from  courier service options.")
	public void scroll_down_and_click_on_get_coupon_from_courier_service_options() {
		pdfAct.getCuponBtn();
	}
	
	
	
	@When("click on download")
	public void click_on_download() {
	    
	    
	}

	
}
