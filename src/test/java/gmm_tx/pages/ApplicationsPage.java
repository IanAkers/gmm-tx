package gmm_tx.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

									// there's a better way to do this that leaves out http://ui-dev.ocp-apps.bahincubator.com

									@DefaultUrl("http://ui-dev.ocp-apps.bahincubator.com/Application/applicationsLanding")
//@DefaultUrl("http://localhost:8080/Application/applicationsLanding")

public class ApplicationsPage extends PageObject {

	@FindBy(xpath = "//a[@id='create-application']") 
	WebElementFacade createApplicationLink;
	
	public void createApplication() {
									System.out.println("IN METHOD .. createApplication");
									System.out.println("ABOUT TO CLICK createApplicationLink...!!");
		createApplicationLink.click();
	}
}
