package fedex.stepDef;

import fedex.actions.LanguageActions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LanguageStepDef {

	
	LanguageActions langAct = new LanguageActions();
	
	@When("scroll end of the page and click on language")
	public void scroll_end_of_the_page_and_click_on_language() throws InterruptedException {
		langAct.languageBtn();
	  
	}

	@When("select espaniol")
	public void select_espaniol() throws InterruptedException {
	    
		langAct.selectLang();
	}

	@Then("displayed spanish language")
	public void displayed_spanish_language() {
	    
		langAct.espaniolText();
	}

	
}
