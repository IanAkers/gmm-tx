    package gmm_tx.pages;

    import net.thucydides.core.annotations.DefaultUrl;
    import org.openqa.selenium.By;
    import org.openqa.selenium.WebElement;
    import org.openqa.selenium.WebDriver;
    import net.serenitybdd.core.pages.WebElementFacade;
    import java.util.stream.Collectors;
    import net.serenitybdd.core.annotations.findby.FindBy;
    import net.thucydides.core.pages.PageObject;
    
    @DefaultUrl("http://ui-dev.ocp-apps.bahincubator.com/Application/createApplication")

    public class EnterApplicationDataPage extends PageObject {
    	@FindBy(xpath = "/html/body/div/div/app-root/app-application/dynamic-component/div/div/div/div[2]/sf-form/form/sf-form-element/div/sf-widget-chooser/sf-form-object/fieldset[1]/div[1]/sf-form-element/div/sf-widget-chooser/sf-string-widget/div/input")
    	WebElementFacade orgNameInput;
    	
    	@FindBy(xpath = "/html/body/div/div/app-root/app-application/dynamic-component/div/div/div/div[2]/sf-form/form/sf-form-element/div/sf-widget-chooser/sf-form-object/fieldset[1]/div[2]/sf-form-element/div/sf-widget-chooser/sf-string-widget/div/input")
    	WebElementFacade typeOfApplicationInput;
    	
    	@FindBy(xpath = "/html/body/div/div/app-root/app-application/dynamic-component/div/div/div/div[2]/sf-form/form/sf-form-element/div/sf-widget-chooser/sf-form-object/fieldset[1]/div[3]/sf-form-element/div/sf-widget-chooser/sf-string-widget/div/input")
    	WebElementFacade congressionalDistrictInput;
    	
    	@FindBy(xpath = "/html/body/div/div/app-root/app-application/dynamic-component/div/div/div/div[2]/sf-form/form/sf-form-element/div/sf-widget-chooser/sf-form-object/fieldset[1]/div[4]/sf-form-element/div/sf-widget-chooser/sf-string-widget/div/input")
    	WebElementFacade projectTitleInput;
    	
    	@FindBy(xpath = "/html/body/div/div/app-root/app-application/dynamic-component/div/div/div/div[2]/sf-form/form/sf-form-element/div/sf-widget-chooser/sf-form-object/fieldset[1]/div[5]/sf-form-element/div/sf-widget-chooser/sf-string-widget/div/input")
    	WebElementFacade projectNumberInput;
    	
    	@FindBy( xpath = "/html/body/div/div/app-root/app-application/dynamic-component/div/div/div/div[2]/sf-form/form/sf-form-element/div/sf-widget-chooser/sf-form-object/fieldset[1]/div[6]/sf-form-element/div/sf-widget-chooser/sf-integer-widget/div/div/input")
    	WebElementFacade projectYearInput;
    	
    	@FindBy(xpath = "/html/body/div/div/app-root/app-application/dynamic-component/div/div/div/div[2]/sf-form/form/sf-form-element/div/sf-widget-chooser/sf-form-object/fieldset[1]/div[7]/sf-form-element/div/sf-widget-chooser/sf-string-widget/div/input")
    	WebElementFacade submissionDateInput;
    	
    	@FindBy(xpath = "/html/body/div/div/app-root/app-application/dynamic-component/div/div/div/div[2]/sf-form/form/sf-form-element/div/sf-widget-chooser/sf-form-object/fieldset[2]/div[1]/sf-form-element/div/sf-widget-chooser/sf-string-widget/div/input")
    	WebElementFacade grantTypeInput;
    	
    	@FindBy(xpath = "/html/body/div/div/app-root/app-application/dynamic-component/div/div/div/div[2]/sf-form/form/sf-form-element/div/sf-widget-chooser/sf-form-object/fieldset[2]/div[2]/sf-form-element/div/sf-widget-chooser/sf-integer-widget/div/div/input")
    	WebElementFacade grantValueInput;
    	
    	@FindBy(xpath = "/html/body/div/div/app-root/app-application/dynamic-component/div/div/div/div[2]/sf-form/form/sf-form-element/div/sf-widget-chooser/sf-form-object/fieldset[2]/div[3]/sf-form-element/div/sf-widget-chooser/sf-select-widget/div/select")
    	WebElementFacade dispersementScheduleSelect;
    	
    	@FindBy(xpath = "/html/body/div/div/app-root/app-application/dynamic-component/div/div/div/div[2]/sf-form/form/sf-form-element/div/sf-widget-chooser/sf-form-object/fieldset[3]/div[1]/sf-form-element/div/sf-widget-chooser/sf-string-widget/div/input")
    	WebElementFacade addressLine1Input;
    	
    	@FindBy(xpath = "/html/body/div/div/app-root/app-application/dynamic-component/div/div/div/div[2]/sf-form/form/sf-form-element/div/sf-widget-chooser/sf-form-object/fieldset[3]/div[2]/sf-form-element/div/sf-widget-chooser/sf-string-widget/div/input")
    	WebElementFacade addressLine2Input;
    	
    	@FindBy(xpath = "/html/body/div/div/app-root/app-application/dynamic-component/div/div/div/div[2]/sf-form/form/sf-form-element/div/sf-widget-chooser/sf-form-object/fieldset[3]/div[3]/sf-form-element/div/sf-widget-chooser/sf-string-widget/div/input")
    	WebElementFacade cityInput;
    	
    	@FindBy(xpath = "/html/body/div/div/app-root/app-application/dynamic-component/div/div/div/div[2]/sf-form/form/sf-form-element/div/sf-widget-chooser/sf-form-object/fieldset[3]/div[4]/sf-form-element/div/sf-widget-chooser/sf-string-widget/div/select")
    	WebElementFacade stateInput;
    	
    	@FindBy(xpath = "/html/body/div/div/app-root/app-application/dynamic-component/div/div/div/div[2]/sf-form/form/sf-form-element/div/sf-widget-chooser/sf-form-object/fieldset[3]/div[5]/sf-form-element/div/sf-widget-chooser/sf-string-widget/div/input")
    	WebElementFacade zipCodeInput;
    	
    	@FindBy(xpath = "/html/body/div/div/app-root/app-application/dynamic-component/div/div/div/div[2]/sf-form/form/sf-form-element/div/button[1]")
    	WebElementFacade saveAndContinueButton;
    		
    	@FindBy(xpath = "/html/body/div/div/app-root/app-application/dynamic-component/div/div/div/div[2]/sf-form/form/sf-form-element/div/button[2]")
    	WebElementFacade saveAsDraftButton;
    	
    	@FindBy(xpath = "/html/body/div/div/app-root/app-application/dynamic-component/div/div/div/div[2]/sf-form/form/sf-form-element/div/button[3]")
    	WebElementFacade cancelButton;
    	
    	public void enterGeneralInformation (String orgName, String typeOfApplication, String congressionalDistrict, String projectTitle, String projectNumber, String projectYear, String submissionDate) {
    		orgNameInput.sendKeys(orgName);
    		typeOfApplicationInput.sendKeys(typeOfApplication);
    		congressionalDistrictInput.sendKeys(congressionalDistrict);
    		projectTitleInput.sendKeys(projectTitle);
    		projectNumberInput.sendKeys(projectNumber);
    		projectYearInput.sendKeys(projectYear);
    		submissionDateInput.sendKeys(submissionDate);
    		
    	}
    	
    	public void enterGrantInformation(String grantValue, String dispersementSchedule) {
    		grantValueInput.sendKeys(grantValue);
//    		dispersementScheduleSelect.selectByVisibleText(dispersementSchedule);
    	}
    	
    	public void enterAddressInformation(String addressLine1, String addressLine2, String city, String state, String zipCode	) {
    		addressLine1Input.sendKeys(addressLine1);
    		addressLine2Input.sendKeys(addressLine2);
    		cityInput.sendKeys(city);
//    		stateInput.sendKeys(state);
//    		zipCodeInput.sendKeys(zipCode);
    	}
    	
    	public void saveAndContinueButton() {
    		saveAndContinueButton.click();
    	}    	
    }