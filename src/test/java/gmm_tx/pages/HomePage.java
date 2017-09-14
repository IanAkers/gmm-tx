package gmm_tx.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

import org.openqa.selenium.WebDriver;

@DefaultUrl("http://ui-dev.ocp-apps.bahincubator.com/home")
//@DefaultUrl("http://localhost:8080/home")

public class HomePage extends PageObject {
	
//	@FindBy(id="clickApplication")
//	@FindBy(linkText = "Application")
	@FindBy(xpath = "//*[@id=\"sidebar-menu\"]/div/ul/li[2]/a")
	WebElementFacade clickApplicationLinkOnSidebar;

//	public HomePage(WebDriver driver) {
//		super(driver);
//		System.out.println("WE GOT TO THE CXR FOR HomePage");
//	}

	public void openHomePage() {
		System.out.println("IN FILE:  HomePage.java");
		this.open();
	}

	public void userClicksOnSidebarLinkForAPPLICATION() {
		clickApplicationLinkOnSidebar.click();
		System.out.println("WE FOUND ..  clickApplication");
	}
}
