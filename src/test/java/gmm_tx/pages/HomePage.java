package gmm_tx.pages;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.When;
import net.serenitybdd.core.pages.WebElementFacade;
import java.util.stream.Collectors;

import net.serenitybdd.core.annotations.findby.FindBy;

import net.thucydides.core.pages.PageObject;

import java.util.List;

//@DefaultUrl("http://ui-dev.ocp-apps.bahincubator.com/home")
@DefaultUrl("http://localhost:8080/home")

public class HomePage extends PageObject {

	private WebDriver webDriver;
	private WebElementFacade clickApplicationLinkOnSidebar;

	public HomePage(WebDriver driver) {
		super(driver);
		webDriver = driver;
		System.out.println("WE GOT TO THE CXR FOR HomePage");
	}

	public void openHomePage() {
		System.out.println("IN FILE:  HomePage.java");
		if (webDriver == null) {
			System.out.println("webDriver IS NULL");
		}
		webDriver.get("http://localhost:8080/home");
	}

	public void userClicksOnSidebarLinkForAPPLICATION() {

		WebElement clickApplicationLinkOnSidebar = webDriver.findElement(By.id("clickApplication"));
		System.out.println("WE FOUND ..  clickApplication");
		if (clickApplicationLinkOnSidebar.isEnabled()) {
			System.out.println("LINK clickApplicationLinkOnSidebar IS ENABLED...");
			System.out.println("\t:	\t the_user_clicks_on_the_sidebar_link_for_application ..  IN FILE HomePage.java");
			System.out.println("ABOUT TO .. the_user_clicks_on_the_sidebar_link_for_application");
			System.out.println(
					"JUST DID THIS: .. the_user_clicks_on_the_sidebar_link_for_application .. IN FILE HomePage.java");

		} else {
			System.out.println("Link clickApplicationLinkOnSidebar is NOT enabled -- BOO!!!");
		}
	}
}