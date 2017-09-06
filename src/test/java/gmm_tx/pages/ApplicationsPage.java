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
  
@DefaultUrl("http://ui-dev.ocp-apps.bahincubator.com/Application/applicationsLanding")
  public class ApplicationsPage extends PageObject {
    private final WebDriver driver;
    
    WebElementFacade createApplicationButton;
    
    public ApplicationsPage(WebDriver driver) {
      super(driver);
    }
    
    public void enterApplicatoinData() {
      createApplicationButton.click();
    }
    
    WebElementFacade grantTypeDropdown;
    WebElementFacade submitButton;
    public void selectGrantTypeAndSubmit(String grantType) {
      grantTypeDropdown.selectByVisibleText(grantType);
      submitButton.click();
    }
    
    public void enterApplicationInformaiton (Map<String, String> map) {
      for (Map.Entry<String, String> entry : map.entrySet()) {
        driver.findElement(By.id(entry.getKey())).sendKeys(entry.getValue());
      }
      driver.findElement(By.id("save-and-continue-button")).click();
    }
  
    
    
}