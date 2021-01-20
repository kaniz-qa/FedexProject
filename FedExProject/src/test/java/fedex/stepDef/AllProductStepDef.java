package fedex.stepDef;

import fedex.actions.AllProductActions;
import io.cucumber.java.en.When;

public class AllProductStepDef {

	
	AllProductActions allProAct = new AllProductActions();
	
	@When("click on design and print menu and click on all product")
	public void click_on_design_and_print_menu_and_click_on_all_product() throws InterruptedException {
		allProAct.designPringMenu();
	   
	}

	@When("click two times on carosel right arrow icon")
	public void click_two_times_on_carosel_right_arrow_icon() throws InterruptedException {
		allProAct.caroselIcon();
	   
	}

	@When("click on take action button")
	public void click_on_take_action_button() throws InterruptedException {
		allProAct.actLink();
	   
	}

	@When("click on banner")
	public void click_on_banner() throws InterruptedException {
		allProAct.bannerLink();
	   
	}

	@When("click on save now")
	public void click_on_save_now() throws InterruptedException {
	    
		allProAct.saveNow();
	}

	@When("click on video")
	public void click_on_video() throws InterruptedException {
	    
		allProAct.video();
	}

	
	
}
