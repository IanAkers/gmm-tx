package gmm_tx.steps;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.PageObject;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gmm_tx.pages.ApplicationsPage;
import gmm_tx.pages.HomePage;
import gmm_tx.steps.serenity.EndUserSteps;

public class ApplicationSteps {
	
	WebDriver webDriver = null;
	
	public ApplicationSteps() {	
								// THIS IS AN EMPTY CXR ... 
								// this is also an inelegant solution for now
									// WE DONT NEED THIS BC COMPILER WILL USE IMPLICIT CXR 
									//
									// WE SWITCHED FROM CREATING THE WEBDRIVER INSIDE THIS CXR
									//  BECAUSE IT GENERATED A NEW ONE EA TIME THIS CLASS WAS INSTANTIATED
									//
									// NOW OUR QUESTION:
									//	1.  WHAT IS CALLING THIS CLASS n-TIMES?
									//	2. HOW DOES THE FWK KNOW WH CLASS TO CALL TO START EXE THE STEPS
									//	3.  DOES IT GO THRU AND LOOK FOR INSTANCES OF
									//			@Given
									//					?
									//
	}
	
	   @Given("^the user has logged into GMM$")
	public void the_user_has_logged_into_GMM() 										throws Throwable {
														System.out.println("the_user_has_logged_into_GMM ... NOT IN THE CXR...");
			   File 	drvFile = new File("/Applications/gg/chromedriver");
			   if (		drvFile.exists()) {
				   if (	drvFile.canExecute()) {
					   									System.out.println("Found chrome driver and can execute it");
				   }
			   } else {
				   										System.out.println("Can't find chrome driver");
			   }
														System.out.println("\t about to call webDriver.get ..  IN FILE ApplicationSteps.java");
												        System.setProperty("webdriver.chrome.driver", "/Applications/gg/chromedriver");
		                                    webDriver = new ChromeDriver();
		   HomePage homePage = new HomePage(webDriver);
		            homePage.openHomePage();
		   												System.out.println("@GIVEN:	\t the_user_has_logged_into_GMM ..  IN FILE ApplicationSteps.java");
	}

		    @When("^the user clicks on the sidebar link for application$")
		public void the_user_clicks_on_the_sidebar_link_for_application() 			throws Throwable {
		    											System.out.println("\t@WHEN:	\t the_user_clicks_on_the_sidebar_link_for_application ..  IN FILE ApplicationSteps.java");
		    											System.out.println("Will create the clickApplication link");
		    	
		    	WebElement	clickAppLink = webDriver.findElement(By.id("clickApplication"));
		    											System.out.println("Have created clickAppLink");
		    											
		    	if (		clickAppLink.isEnabled()) {
		    											System.out.println("----clickAppLink LINK IS ENABLED ...");
		    				clickAppLink.click();
		    	} else {
		    											System.out.println("----clickAppLink LINK IS not ENABLED -- BOO!!!");
		    	}   	
			}
	
			    @Then("^they should see the page that lists their application$")
			public void they_should_see_the_page_that_lists_their_application() 	throws Throwable {
                    
                    				//201709111029L  EL LUNES   GIRO START
                                             webDriver = new ChromeDriver();
			HomePage homePage = new HomePage(webDriver);
			homePage.openHomePage();String title = homePage.getTitle();
														System.out.println("\t\t@THEN:	\t THE PAGE TITLE IS: " + title);
									//201709111029L  EL LUNES   GIRO END
														
														System.out.println("\t\t@THEN:	\t they_should_see_the_page_that_lists_their_application ..  IN FILE ApplicationSteps.java");
			}

			
	   @Given("^the user is on the page that shows applications$")
	public void the_user_is_on_the_page_that_shows_applications() 					throws Throwable {
		   												System.out.println("@GIVEN:	\t the_user_is_on_the_page_that_shows_applications ..  IN FILE ApplicationSteps.java");
		   												System.setProperty("webdriver.chrome.driver", "/Applications/gg/chromedriver");
            webDriver = new ChromeDriver();
		if (webDriver == null) {
														System.out.println("IN ApplicationSteps.the_user_is_on_the_page_that_shows...;  webDriver is NULL");
		}
		ApplicationsPage applicationsPage = new  ApplicationsPage(webDriver); 
		                 applicationsPage.createApplication();
	}
		    @When("^the user clicks on the link to create application$")
		public void the_user_clicks_on_the_link_to_create_application() 			throws Throwable {
		    											System.out.println("\t@WHEN:	\t the_user_clicks_on_the_link_to_create_application ..  IN FILE ApplicationSteps.java");
	    	
			WebElement	create_application_link = webDriver.findElement(By.id("create-application"));
														System.out.println("Have created create_application_link" + 
						create_application_link);
			
//	    	if ( 		create_application.isEnabled()) {
//														System.out.println("----create_application LINK IS ENABLED ...");
				 		create_application_link.click();
//			} else {
//							System.out.println("----create_application LINK IS not ENABLED -- BOO!!!");
//			} 			
														//			if (webDriver == null) {
														//				System.out.println("IN ApplicationSteps.the_user_clicks_on;  webDriver is NULL");
														//			}
														//			ApplicationsPage applicationsPage = new  ApplicationsPage(webDriver); 
														//			applicationsPage.createApplication();
		}
	
			    @Then("^they should see the page to enter application data$")
			public void they_should_see_the_page_to_enter_application_data() 		throws Throwable {
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