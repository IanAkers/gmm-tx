package gmm_tx.steps;

import net.thucydides.core.annotations.Steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import gmm_tx.steps.serenity.EndUserSteps;

public class ApplicationSteps {
	
	@Given("^the user has logged into GMM$")
	public void the_user_has_logged_into_GMM() throws Throwable {
		System.out.println("^the user has logged into GMM$");
	}

	@When("^the user clicks on the link for application$")
	public void the_user_clicks_on_the_link_for_application() throws Throwable {
		System.out.println("^the user clicks on the link for application$");
		}

	@Then("^they should go to the page that lists their application$")
	public void they_should_go_to_the_page_that_lists_their_application() throws Throwable {
		System.out.println("^the user clicks on the link for application$");
	}

	@Given("^the user is on the page to create application$")
	public void the_user_is_on_the_page_to_create_application() throws Throwable {
		System.out.println("^the user is on the page to create application$");
	}

	@When("^the user clicks on the link to create application$")
	public void the_user_clicks_on_the_link_to_create_application() throws Throwable {
		System.out.println("^the user clicks on the link to create application$");
	}

	@Then("^they should go to the page to create application$")
	public void they_should_go_to_the_page_to_create_application() throws Throwable {
		System.out.println("^they should go to the page to create application$");
	}	
}