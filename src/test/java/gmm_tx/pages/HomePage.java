package gmm_tx.pages;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
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
	
									//    @FindBy(name="search")
									//    private WebElementFacade searchTerms;
									//
									    public void click_application(String keyword) {
									        clickApplication.type(keyword);
									    }
									//
									//    public void lookup_terms() {
									//        lookupButton.click();
									//    }
									//
									//    public List<String> getDefinitions() {
									//        WebElementFacade definitionList = find(By.tagName("ol"));
									//        return definitionList.findElements(By.tagName("li")).stream()
									//                             .map( element -> element.getText() )
									//                             .collect(Collectors.toList());
									//    }
}