package gmm_tx;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
//@CucumberOptions(features="src/test/resources/features/consult_dictionary/LookupADefinition.feature")
@CucumberOptions(features="src/test/resources/features/navigate_gmm")
public class DefinitionTestSuite {}
