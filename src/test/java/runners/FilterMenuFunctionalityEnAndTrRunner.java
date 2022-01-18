package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import utils.Drivers;

@CucumberOptions(
        tags = {"@TurkeyAndEnglishShop"},
        features = {"src/test/resources/featureFiles/FilterMenuFunctionality.feature"},
        glue = {"stepDefinitions", "utils"}
)
public class FilterMenuFunctionalityEnAndTrRunner extends AbstractTestNGCucumberTests {

    @BeforeClass
    @Parameters({"browser", "language"})
    public void start(String browser, String language) {
        Drivers.threadBrowserName.set(browser);
        Drivers.threadLanguage.set(language);
    }


    @AfterClass
    public void finish() {

    }
}

