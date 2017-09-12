package gmm_tx.steps.serenity;

import gmm_tx.pages.ApplicationsPage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//201709091640L   EL SABADO GIRO
//				ADDED THIS W EVS SAT AM @ FOO
import org.openqa.selenium.chrome.ChromeDriver;

//public class EndUserSteps {
//
//	ApplicationsPage applicationPage;
//
//	private WebElement createApplication_bn;
//
//	@Step
//
//	public void createApplication() {
//		WebDriver webDriver = new ChromeDriver();
////		applicationPage = new ApplicationsPage(webDriver);
//		createApplication_bn.click();
//		System.out.println("RIGHT AFTER CLICKED BUTTON:  createApplication_bn 	WE ARE IN FILE EndUserSteps.java ... ");
//	}
//
//}
// @Step
// public void starts_search() {
// dictionaryPage.lookup_terms();
// }
//
// @Step
// public void should_see_definition(String definition) {
// assertThat(dictionaryPage.getDefinitions(),
// hasItem(containsString(definition)));
// }
//
// @Step
// public void is_the_home_page() {
// dictionaryPage.open();
// }
//
// @Step
// public void looks_for(String term) {
// enters(term);
// starts_search();
// }

// public void selectGrantTypeAndSubmit(String grantType) {
// grantTypeDropdown.selectByVisibleText(grantType);
// submitButton.click();
// }
//
// public void enterApplicationInformation (Map<String, String> map) {
// for (Map.Entry<String, String> entry : map.entrySet()) {
// driver.findElement(By.id(entry.getKey())).sendKeys(entry.getValue()); }
// driver.findElement(By.id("save-and-continue-button")).click();
