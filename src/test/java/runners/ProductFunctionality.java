package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.*;
import utils.Drivers;


@CucumberOptions(
        features = {"src/test/resources/featureFiles/ProductFunctionality.feature"},
        glue = {"stepDefinitions", "utils"}
)
public class ProductFunctionality extends AbstractTestNGCucumberTests {

    @BeforeClass
    @Parameters({"browser", "language"})
    public void start(String browser, String language) {
        Drivers.threadBrowserName.set(browser);
        Drivers.threadLanguage.set(language);
    }
}

