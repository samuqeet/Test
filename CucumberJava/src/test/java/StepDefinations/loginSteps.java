package StepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginSteps {
	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("user is on login page");
	}

	@When("the user enters username and password")
	public void the_user_enters_username_and_password() {
		System.out.println("the user enters username and password");
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("clicks on login button");
	}

	@Then("user must be logged in")
	public void user_must_be_logged_in() {
		System.out.println("user must be logged in");
	}

}
