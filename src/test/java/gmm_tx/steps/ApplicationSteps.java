package gmm_tx.steps;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Steps;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gmm_tx.pages.ApplicationsPage;
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
			   File drvFile = new File("/Applications/gg/chromedriver");
			   if (drvFile.exists()) {
				   if (drvFile.canExecute()) {
					   System.out.println("Found chrome driver and can execute it");
				   }
			   } else {
				   System.out.println("Can't find chrome driver");
			   }
				System.out.println("\t about to call webDriver.get ..  IN FILE ApplicationSteps.java");
		        System.setProperty("webdriver.chrome.driver", "/Applications/gg/chromedriver");
		        webDriver = new ChromeDriver();
		   webDriver.get("http://localhost:8080/home");
		System.out.println("@GIVEN:	\t the_user_has_logged_into_GMM ..  IN FILE ApplicationSteps.java");
	}

		    @When("^the user clicks on the sidebar link for application$")
		public void the_user_clicks_on_the_sidebar_link_for_application() 			throws Throwable {
		    	System.out.println("\t@WHEN:	\t the_user_clicks_on_the_sidebar_link_for_application ..  IN FILE ApplicationSteps.java");
		    	System.out.println("Will create the clickApplication link");
		    	WebElement clickAppLink = webDriver.findElement(By.id("clickApplication"));
		    	System.out.println("Have created clickAppLink");
		    	if (clickAppLink.isEnabled()) {
		    		System.out.println("Link is enabled...");
		    		clickAppLink.click();
		    	} else {
		    		System.out.println("Link is NOT enabled -- BOO!!!");
		    	}
		    	ApplicationsPage appPage = new ApplicationsPage(webDriver);
		    	String title = appPage.getTitle();
		    	System.out.println("Page title: " + title);
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