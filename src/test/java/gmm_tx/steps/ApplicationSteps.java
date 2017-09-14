package gmm_tx.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gmm_tx.pages.ApplicationsPage;
import gmm_tx.pages.HomePage;
import gmm_tx.pages.SearchGrantTypePage;
import gmm_tx.pages.EnterApplicationDataPage;

public class ApplicationSteps {

	ApplicationsPage applicationsPage;
	HomePage homePage;
	SearchGrantTypePage searchGrantTypePage;
	EnterApplicationDataPage enterApplicationDataPage;


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
		System.out.println("\t\t@GIVEN .. CALL METHOD .. applicationsPage.createApplication(); IN FILE ApplicationSteps.java");
	}

			@When("^the user clicks on the link to create application$")
			public void the_user_clicks_on_the_link_to_create_application() throws Throwable {
				applicationsPage.createApplication();
				System.out.println("\t@WHEN:	\t the_user_clicks_on_the_link_to_create_application ..  IN FILE ApplicationSteps.java");
				System.out.println("JUST CLICKED: ... createApplicationLink");
			}		
			
					@Then("^the user should see the page to select the grant type$")
					public void the_user_should_see_the_page_to_select_the_grant_type() throws Throwable{
						System.out.println("\t\t@THEN:	\t the_user_should_see_the_page_to_select_the_grant_type ..  IN FILE ApplicationSteps.java");
					}

			@When("^the user selects the grant type$")
			public void selectGrantType() throws Throwable {
				searchGrantTypePage.selectGrantType("Flood Recovery Grant");
				System.out.println("\t@WHEN:	\t selectGrantType ..  IN FILE ApplicationSteps.java");
				System.out.println(searchGrantTypePage);
			}		
			
			@When("^the user hits the submit button$")
			public void selectGrantType_bn_submit() throws Throwable {
				searchGrantTypePage.clickGrantTypeSubmitButton();				
				System.out.println("\t@WHEN:	\t selectGrantType_bn_submit ..  IN FILE ApplicationSteps.java");
			}			
			
				@Then("^the user should see the page to enter application data$")
				public void the_user_should_see_the_page_to_enter_application_data() throws Throwable {
							System.out.println("\t\t@THEN:	\t the_user_should_see_the_page_to_select_the_grant_type ..  IN FILE ApplicationSteps.java");
						}					

//				@When("^the user enters the general information as \'(.*)\'$")
//			public void enterGeneralInformation (String orgName, String typeOfApplication, String congressionalDistrict, String projectTitle, String projectNumber, String projectYear, String submissionDate) 
//			{
////				enterApplicationDataPage.enterGeneralInformation(orgName, typeOfApplication, congressionalDistrict, projectTitle, projectNumber, projectYear, submissionDate);
//				enterApplicationDataPage.enterGeneralInformation("orgName", "typeOfApplication", "congressionalDistrict", "projectTitle", "projectNumber", "projectYear", "submissionDate");
//				System.out.println("\t@WHEN:	\t enterGeneralInformation ..  IN FILE ApplicationSteps.java");
//			}	
				
				@When("^the user enters the general information")
			public void enterGeneralInformation () 
				{
//					enterApplicationDataPage.enterGeneralInformation(orgName, typeOfApplication, congressionalDistrict, projectTitle, projectNumber, projectYear, submissionDate);
					enterApplicationDataPage.enterGeneralInformation("orgName", "typeOfApplication", "congressionalDistrict", "projectTitle", "projectNumber", "projectYear", "submissionDate");
					System.out.println("\t@WHEN:	\t enterGeneralInformation ..  IN FILE ApplicationSteps.java");
				}	

//			@When("^the user enters the grant information as \"(.*)\"$")
//			public void enterGrantInformation(String grantValue, String dispersementSchedule) 
//			{	
////				enterApplicationDataPage.enterGrantInformation( grantValue,  dispersementSchedule);
//				enterApplicationDataPage.enterGrantInformation( "5",  "dispersementSchedule");
//
//				System.out.println("\t@WHEN:	\t enterGrantInformation ..  IN FILE ApplicationSteps.java");
//			}
			
			@When("^the user enters the grant information")
			public void enterGrantInformation() 
			{	
//				enterApplicationDataPage.enterGrantInformation( grantValue,  dispersementSchedule);
				enterApplicationDataPage.enterGrantInformation( "5",  "dispersementSchedule");

				System.out.println("\t@WHEN:	\t enterGrantInformation ..  IN FILE ApplicationSteps.java");
			}
			
//			@When("^the user enters the address information as \"(.*)\"$")
//			public void enterAddressInformation(String addressLine1, String addressLine2, String city, String state, String zipCode) 
//			{	
////				enterApplicationDataPage.enterAddressInformation(addressLine1, addressLine2, city, state, zipCode 	);
//				enterApplicationDataPage.enterAddressInformation("addressLine1", "addressLine2", "city", "state", "22046" 	);
//
//				System.out.println("\t@WHEN:	\t enterAddressInformation ..  IN FILE ApplicationSteps.java");
//			}	
			
			@When("^the user enters the address information")
			public void enterAddressInformation() 
			{	
//				enterApplicationDataPage.enterAddressInformation(addressLine1, addressLine2, city, state, zipCode 	);
				enterApplicationDataPage.enterAddressInformation("addressLine1", "addressLine2", "city", "state", "22046" 	);

				System.out.println("\t@WHEN:	\t enterAddressInformation ..  IN FILE ApplicationSteps.java");
			}

			@When("^the user hits the button")
			public void saveAndContinueButton(	) 
			{	
				enterApplicationDataPage.saveAndContinueButton();
				System.out.println("\t@WHEN:	\t saveAndContinueButton ..  IN FILE ApplicationSteps.java");
			}				
			
				@Then("^the user should see the confirmation page$")
				public void the_user_should_see_the_confirmation_page() throws Throwable {
							System.out.println("\t\t@THEN:	\t the_user_should_see_the_confirmation_page ..  IN FILE ApplicationSteps.java");
						}								
}
