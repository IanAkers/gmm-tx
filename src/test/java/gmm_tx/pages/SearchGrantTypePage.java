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
@DefaultUrl("http://localhost:8080/Application/searchGrantTypes")

public class SearchGrantTypePage extends PageObject {
	private WebDriver webDriver = null;
	private WebElement searchGrantType_bn;

	// START CONSTRUCTOR
	public SearchGrantTypePage(WebDriver driver) {
		super(driver);
		webDriver = driver;
		System.out.println("WE GOT TO THE CXR FOR searchGrantType");
		if (webDriver == null) {
			System.out.println("WEBDRIVER HERE IS NULL!!");
		}

	}
	// END CONSTRUCTOR

	public void searchGrantType() {

		System.out.println("IN selectGrantType");
		if (webDriver == null) {
			System.out.println("WEBDRIVER HERE IS NULL!!");
		}
		if (webDriver != null) {
			WebElement selectGrantType_chevron = webDriver.findElement(By.className("toggle"));
			System.out.println("HAVE FOUND THE ARROW-DOWN TOGGLE CHEVRON...");

			if (selectGrantType_chevron != null) {
				if (selectGrantType_chevron.isEnabled()) {
					System.out.println("selectGrantType_chevron IS ENABLED...!!");
					selectGrantType_chevron.click();

				} else {
					System.out.println("selectGrantType_chevron IS NOT ENABLED -- BOO!");
				}
			} else {
				System.out.println("selectGrantType_chevron IS NULL");
			}
		}
	}
	// WebElementFacade grantTypeDropdown;
	// WebElementFacade submitButton;
	// public void selectGrantType_chevronAndSubmit(String grantType) {
	// grantTypeDropdown.selectByVisibleText(grantType);
	// submitButton.click();
	// }
	//
	// public void enterApplicationInformation (Map<String, String> map) {
	// for (Map.Entry<String, String> entry : map.entrySet()) {
	// driver.findElement(By.id(entry.getKey())).sendKeys(entry.getValue()); }
	// driver.findElement(By.id("save-and-continue-button")).click();
	// }
}
