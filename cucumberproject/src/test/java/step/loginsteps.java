package step;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginsteps {
	@Given("user is on login page")
	public void user_is_on_login_page() {
	   System.out.println("from given");
	}

	@When("user enter valid username and password")
	public void user_enter_valid_username_and_password() {
		 System.out.println("from when"); 
	}

	@And("clicked on login button")
	public void clicked_on_login_button() {
		 System.out.println("from whven");
	}

	@Then("Home page should display")
	public void home_page_should_display() {
		 System.out.println("from then");
	}


}
