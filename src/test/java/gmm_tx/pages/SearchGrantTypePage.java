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
	
	@FindBy(id="selectGrantType")   WebElementFacade searchGrantType_dropdown;
	@FindBy(id="setGrantTypeSubmit")   WebElementFacade selectGrantType_bn_submit;

	public void selectGrantType(String grantType) {
        searchGrantType_dropdown.selectByVisibleText(grantType);
		    		}	
	public void clickGrantTypeSubmitButton() {
        selectGrantType_bn_submit.click();
		    			    		}
	}