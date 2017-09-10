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
//@DefaultUrl("http://localhost:8080/home")

public class ApplicationsPage extends PageObject 
	{
		private WebDriver myDriver = null;
		private WebElement createApplication_bn;
		
									//		driver.findElement(By .xpath("/html/body/div/div/app-root/app-application/dynamic-component/div/div/div/div[2]/sf-form/form/sf-form-element/div/sf-widget-chooser/sf-form-object/fieldset[1]/div[1]/sf-form-element/div/")) public WebElement createApplication_bn; 
									//		@FindBy(xpath = "/html/body/div/div/app-root/app-application/dynamic-component/div/div/div/div[2]/sf-form/form/sf-form-element/div/sf-widget-chooser/sf-form-object/fieldset[1]/div[1]/sf-form-element/div")
									//		public WebElement Organization;
									//		@FindBy(xpath = "/html/body/div/div/app-root/app-application/dynamic-component/div/div/div/div[2]/sf-form/form/sf-form-element/div/sf-widget-chooser/sf-form-object/fieldset[1]/div[1]/sf-form-element/div/")		
									//		findElement(By .xpath("/html/body/div/div/app-root/app-application/dynamic-component/div/div/div/div[2]/sf-form/form/sf-form-element/div/sf-widget-chooser/sf-form-object/fieldset[1]/div[1]/sf-form-element/div/"));			   

									// CONSTRUCTOR
			public ApplicationsPage(WebDriver		driver	) 
					{
						     				super(	driver	);
						     			 myDriver = driver;
					}	
			
		    public void createApplication() {
				WebElement createButton = myDriver.findElement(By.id("create-application"));
				
				System.out.println("Have found the create button...");
				
				if (createButton.isEnabled()) {
					System.out.println("Create button is enabled...!!");
					createButton.click();
							
				} else {
					System.out.println("Button is not enabled -- BOO!");
				}	
				
		    	//createApplication_bn.click();
		    }
									//	    WebElementFacade grantTypeDropdown;
									//	    WebElementFacade submitButton;
									//		    public void selectGrantTypeAndSubmit(String grantType) {
									//				      grantTypeDropdown.selectByVisibleText(grantType);
									//				      submitButton.click();
									//		    }
									//	    
									//		    public void enterApplicationInformation (Map<String, String> map) {
									//				      for (Map.Entry<String, String> entry : map.entrySet())   { driver.findElement(By.id(entry.getKey())).sendKeys(entry.getValue()); }
									//				      driver.findElement(By.id("save-and-continue-button")).click();
									//				    }  
	}



