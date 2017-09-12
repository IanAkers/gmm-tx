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
//	private WebDriver webDriver = null;
//	private WebElement searchGrantType_bn;
	
	@FindBy(id="selectGrantType")   WebElementFacade searchGrantType_dropdown;

//	// START CONSTRUCTOR
//	public SearchGrantTypePage(WebDriver driver) {
//		super(driver);
//		webDriver = driver;
//		System.out.println("WE GOT TO THE CXR FOR searchGrantType");
//		if (webDriver == null) {
//			System.out.println("WEBDRIVER HERE IS NULL!!");
//		}
//
//	}
//	// END CONSTRUCTOR

	public void searchGrantType(String grantType) {
		        searchGrantType_dropdown.selectByVisibleText(grantType);
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
