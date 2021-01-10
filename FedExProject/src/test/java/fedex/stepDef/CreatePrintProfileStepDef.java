package fedex.stepDef;

import fedex.actions.CreatePrintProfileActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CreatePrintProfileStepDef {

	CreatePrintProfileActions printProfileAction = new CreatePrintProfileActions();
	
	@Given("user navigate the url")
	public void user_navigate_the_url() {
		printProfileAction.pageOpen();
	}

	@When("click on print and design menu , select custom design template")
	public void click_on_print_and_design_menu_select_custom_design_template() {
		printProfileAction.printDesignMenu();
	}

	@When("click on sign up or log in , click on create a print profile link")
	public void click_on_sign_up_or_log_in_click_on_create_a_print_profile_link() {
		printProfileAction.signUpandPrintProfileLink();
	}

	@When("enter first name , last name , email , phone number , user id ,password , confirm password ,check on terms of use")
	public void enter_first_name_last_name_email_phone_number_user_id_password_confirm_password_check_on_terms_of_use() {
		printProfileAction.printProfileInfo();
	}

	@When("click on submit button")
	public void click_on_submit_button() {
		printProfileAction.submitButton();
	}

	
	
}
