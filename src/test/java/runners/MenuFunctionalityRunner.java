package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.SuiteRunner;
import org.testng.annotations.*;
import utils.Drivers;

@CucumberOptions(
        features = {"src/test/resources/featureFiles/MenuFunctionality.feature"},
        glue = {"stepDefinitions", "utils"}
)
public class MenuFunctionalityRunner extends AbstractTestNGCucumberTests{

        @BeforeClass
        @Parameters({"browser", "language"})
        public void baslangic(String browser, String language) {
            Drivers.threadBrowserName.set(browser);
            Drivers.threadLanguage.set(language);
        }


        @AfterClass
        public void bitis() {
            Drivers.quitDriver();
        }
}
