package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class StepGuide {

	@Given("User Opens {string}")
	public void user_opens(String string) {
	    
	    System.out.println("User Entered URL"+string);
	}
	@Given("user opens url {string}")
	public void user_opens_url(String string) {
	    
	    System.out.println("User Entered URL"+string);
	}

	@Given("User Enters UserName {string}")
	public void user_enters_user_name(String string) {
	    
	    System.out.println("User Entered ID: "+string);
	}

	@Given("User Enters Passoword {string}")
	public void user_enters_passoword(String string) {
	    
	   System.out.println("User Enters Password: "+string);
	}

	@Then("User Clicked Login Button")
	public void user_clicked_login_button() {
	    
	    System.out.println("User clicked login ");
	}

	

	@Then("user search {string}")
	public void user_search(String string) {
	    System.out.println("User searched "+string);
	}

	@Then("User clicks search button")
	public void user_clicks_search_button() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("User clicked search button");
	}
}
