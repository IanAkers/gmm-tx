package gmm_tx.pages;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import net.serenitybdd.core.pages.WebElementFacade;
import java.util.stream.Collectors;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// there's a better way to do this that leaves out http://ui-dev.ocp-apps.bahincubator.com

//@DefaultUrl("http://ui-dev.ocp-apps.bahincubator.com/Application/applicationsLanding")
@DefaultUrl("http://localhost:8080/Application/applicationsLanding")

								//	@FindBy(id = "create-application")
public class ApplicationsPage extends PageObject {
	private WebDriver webDriver;
	@FindBy(xpath = "//a[@id=‘create-application’]")
	WebElementFacade createApplicationLink;

	public ApplicationsPage(WebDriver webDriver) {
		super(webDriver);
		webDriver = webDriver;
		System.out.println("WE GOT TO THE CXR FOR ApplicationsPage");
		if (webDriver == null) {
			System.out.println("webDriver IS NULL!!");
		}

	}

	public void createApplication() {
		System.out.println("IN METHOD .. createApplication");
		System.out.println("ABOUT TO CLICK createApplicationLink...!!");
		createApplicationLink.click();
	}
}
