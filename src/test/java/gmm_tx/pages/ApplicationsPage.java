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

public class ApplicationsPage extends PageObject 
	{
		private WebDriver webDriver = null;
		private WebElement createApplication_bn;

		
									// START CONSTRUCTOR
			public ApplicationsPage(WebDriver		driver	) 
					{
						     super(	driver	);
						     webDriver = driver;
						   System.out.println("WE GOT TO THE CXR FOR ApplicationsPage");
						   if (webDriver == null) {
							   System.out.println("Web driver is NULL here!!");
						   }
						   
					}	
									// END CONSTRUCTOR
			
			
		    public void createApplication() {
		    	
		    	System.out.println("IN createApplication");
		    	if (webDriver == null) {
		    		System.out.println("Web driver is null");
		    	}
		    	if (webDriver != null) {
					WebElement createButton = webDriver.findElement(By.id("create-application"));
					
														System.out.println("Have found the create button...");
					
				    if (createButton != null) {
						if (createButton.isEnabled()) {
															System.out.println("Create button is enabled...!!");
							createButton.click();
									
						} else {
															System.out.println("Button is not enabled -- BOO!");
						}
				    } else {
				    	System.out.println("Create button is null");
				    }
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



