package fedex.stepDef;

import fedex.actions.AboutToHomeActions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AboutToHomeStepDef {

	
	AboutToHomeActions aboutHomeAct = new AboutToHomeActions();
	
	
	@When("scroll end of the page and click on aboutFedex link")
	public void scroll_end_of_the_page_and_click_on_aboutFedex_link() throws InterruptedException {
		aboutHomeAct.aboutFedex();
	    
	}

	@When("click on see full story button and go back")
	public void click_on_see_full_story_button_and_go_back() throws InterruptedException {
		aboutHomeAct.seeHisLink();
	    
	}

	@Then("user should be see home page")
	public void user_should_be_see_home_page() {
	    
		aboutHomeAct.aboutText();
	}

	
}
