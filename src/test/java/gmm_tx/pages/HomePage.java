package gmm_tx.pages;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import net.serenitybdd.core.pages.WebElementFacade;
import java.util.stream.Collectors;

import net.serenitybdd.core.annotations.findby.FindBy;

import net.thucydides.core.pages.PageObject;

import java.util.List;

									//@DefaultUrl("http://ui-dev.ocp-apps.bahincubator.com/home")
@DefaultUrl("http://localhost:8080/home")
									//@DefaultUrl("http://en.wiktionary.org/wiki/Wiktionary")

public class HomePage extends PageObject {

	@FindBy(id="clickApplication")
	private WebElementFacade clickApplication;
		   
	private WebDriver driver;
    
		public void clickApplication() {
			clickApplication.click();
		}
}
