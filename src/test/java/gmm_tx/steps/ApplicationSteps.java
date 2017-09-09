package gmm_tx.steps;

import net.thucydides.core.annotations.Steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import gmm_tx.steps.serenity.EndUserSteps;

public class ApplicationSteps {
	
	   @Given("^the user has logged into GMM$")
	public void the_user_has_logged_into_GMM() 										throws Throwable {
		System.out.println("@GIVEN:	\t the_user_has_logged_into_GMM ..  IN FILE ApplicationSteps.java");
	}

		    @When("^the user clicks on the sidebar link for application$")
		public void the_user_clicks_on_the_sidebar_link_for_application() 					throws Throwable {
		System.out.println("\t@WHEN:	\t the_user_clicks_on_the_sidebar_link_for_application ..  IN FILE ApplicationSteps.java");
			}
	
			    @Then("^they should see the page that lists their application$")
			public void they_should_see_the_page_that_lists_their_application() 	throws Throwable {
				System.out.println("\t\t@THEN:	\t they_should_see_the_page_that_lists_their_application ..  IN FILE ApplicationSteps.java");
			}

			
	   @Given("^the user is on the page that shows applications$")
	public void the_user_is_on_the_page_that_shows_applications() 					throws Throwable {
		System.out.println("@GIVEN:	\t the_user_is_on_the_page_that_shows_applications ..  IN FILE ApplicationSteps.java");
	}

		    @When("^the user clicks on the link to create application$")
		public void the_user_clicks_on_the_link_to_create_application() 			throws Throwable {
			System.out.println("\t@WHEN:	\t the_user_clicks_on_the_link_to_create_application ..  IN FILE ApplicationSteps.java");
		}
	
			    @Then("^they should see the page to enter application data$")
			public void they_should_see_the_page_to_enter_application_data() 			throws Throwable {
				System.out.println("\t\t@THEN:	\t they_should_see_the_page_to_enter_application_data ..  IN FILE ApplicationSteps.java");
			}


	   @Given("^the user has entered all application data$")
	public void the_user_has_entered_all_application_data()							throws Throwable{
		System.out.println("@GIVEN:	\t user_has_entered_all_application_data ..  IN FILE ApplicationSteps.java");
	}

		    @When("^the user hits the button to save$")
		public void the_user_hits_the_button_to_save() 								throws Throwable {
			System.out.println("\t@WHEN:	\t the_user_hits_the_button_to_save ..  IN FILE ApplicationSteps.java");
		}
		    @Then("^they should see the confirmation page$")
		    public void they_should_see_the_confirmation_page() throws Throwable {
				System.out.println("\t\t@THEN:	\t they_should_see_the_confirmation_page ..  IN FILE ApplicationSteps.java");
		    }			
}