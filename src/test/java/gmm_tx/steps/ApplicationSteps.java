package gmm_tx.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gmm_tx.pages.ApplicationsPage;
import gmm_tx.pages.HomePage;
import gmm_tx.pages.SearchGrantTypePage;

public class ApplicationSteps {

	ApplicationsPage applicationsPage;
	HomePage homePage;
	SearchGrantTypePage searchGrantTypePage;


	@Given("^the user has logged into GMM$")
	public void the_user_has_logged_into_GMM() throws Throwable {
		homePage.openHomePage();
		String title = homePage.getTitle();
		System.out.println("\t\t@GIVEN:	\t THIS PAGE TITLE IS: " + title);
		System.out.println("@GIVEN:	\t the_user_has_logged_into_GMM ..  IN FILE ApplicationSteps.java");
	}

			@When("^the user clicks on the sidebar link for application$")
			public void the_user_clicks_on_the_sidebar_link_for_application() throws Throwable {
				System.out.println(
						"\t@WHEN:	\t the_user_clicks_on_the_sidebar_link_for_application ..  IN FILE ApplicationSteps.java");
				System.out.println("CLICKS THE clickApplication LINK");
		
				homePage.userClicksOnSidebarLinkForAPPLICATION();
				System.out.println("FOUND THE clickAppLink HTML ATTR Id");
			}

					@Then("^they should see the page that lists their application$")
					public void they_should_see_the_page_that_lists_their_application() throws Throwable {
						System.out.println("\t\t@THEN:	\t they_should_see_the_page_that_lists_their_application ..  IN FILE ApplicationSteps.java");
					}

	@Given("^the user is on the page that shows applications$")
	public void the_user_is_on_the_page_that_shows_applications() throws Throwable {
		applicationsPage.createApplication();
		System.out.println("\t\t@GIVEN .. CALL METHOD .. applicationsPage.createApplication(); IN FILE ApplicationSteps.java");
	}

			@When("^the user clicks on the link to create application$")
			public void the_user_clicks_on_the_link_to_create_application() throws Throwable {
				System.out.println("\t@WHEN:	\t the_user_clicks_on_the_link_to_create_application ..  IN FILE ApplicationSteps.java");
				System.out.println("JUST CLICKED: ... createApplicationLink");
			}		
			
					@Then("^the user should see the page to select the grant type$")
					public void the_user_should_see_the_page_to_select_the_grant_type() throws Throwable{
						System.out.println("\t\t@THEN:	\t the_user_should_see_the_page_to_select_the_grant_type ..  IN FILE ApplicationSteps.java");
					}

			@When("^the user selects the grant type$")
			public void searchGrantType() throws Throwable {
				System.out.println("\t@WHEN:	\t searchGrantType ..  IN FILE ApplicationSteps.java");
			}		
			
					@Then("^the user sees the page to enter application data$")
					public void the_user_sees_the_page_to_enter_application_data() throws Throwable{
						System.out.println("\t\t@THEN:	\t the_user_should_see_the_page_to_select_the_grant_type ..  IN FILE ApplicationSteps.java");
					}					
			@When("^the user enters all application data and saves$")
			public void the_user_enters_all_application_data_and_saves() throws Throwable {
				System.out.println("\t@WHEN:	\t the_user_enters_all_application_data_and_saves ..  IN FILE ApplicationSteps.java");
			}		
					@Then("^the user should see the confirmation page $")
					public void the_user_should_see_the_confirmation_page () throws Throwable{
						System.out.println("\t\t@THEN:	\t the_user_should_see_the_confirmation_page ..  IN FILE ApplicationSteps.java");
					}								
}

