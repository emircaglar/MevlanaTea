package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.*;
import utils.Drivers;

@CucumberOptions(
        tags = {"@GermanyShop"},
        features = {"src/test/resources/featureFiles/FilterMenuFunctionality.feature"},
        glue = {"stepDefinitions", "utils"}
)
public class FilterMenuFunctionalityGermanyRunner extends AbstractTestNGCucumberTests {

    @BeforeClass
    @Parameters({"browser", "language"})
    public void initiate(String browser, String language) {
        Drivers.threadBrowserName.set(browser);
        Drivers.threadLanguage.set(language);
    }
}


