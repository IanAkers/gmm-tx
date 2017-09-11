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

public 			class 	ApplicationsPage extends PageObject 
	{
		private WebDriver 	webDriver = null;
//		private WebElement 	createApplication_bn;

		
										// START CONSTRUCTOR
		public 			ApplicationsPage(WebDriver		driver	) 
							{
												super(	driver	);
										webDriver = 	driver;
								     							System.out.println("WE GOT TO THE CXR FOR ApplicationsPage");
								   if (	webDriver == null) {
									   							System.out.println("webDriver IS NULL!!");
								   }
								   
							}	
										// END CONSTRUCTOR
			
		
			    public void 		createApplication() {
			    	
			    												System.out.println("IN createApplication");
			    	if (webDriver == null) {
			    												System.out.println("webDriver IS NULL");
			    	}
//			    	if (webDriver != null) {
						WebElement	createApplication_bn = webDriver.findElement(By.id(	"create-application"));
//						WebElement	createApplication_bn = webDriver.findElement(By.className("class=fa-plus-circle"));	
																System.out.println("WE FOUND THE HTML ATTR ID: .. create-application...");
//						
//					    if (		createApplication_bn != null) {
//							if (	createApplication_bn.isEnabled()) {
																System.out.println("createApplication_bn .. IS     ENABLED...!!");
									createApplication_bn.click();
//										
//							} else {
//																System.out.println("createApplication_bn .. IS NOT ENABLED -- BOO!");
//							}
//					    } else {
//					    										System.out.println("createApplication_bn .. IS NULL");
//					    }
//			    	}
//		    }
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
}



