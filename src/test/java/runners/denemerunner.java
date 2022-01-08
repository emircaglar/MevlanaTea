package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import utils.Drivers;
import utils.Parent;

@CucumberOptions(
        features = {"src/test/resources/featureFiles"},
        glue = {"stepDefinitions", "utils"}
)
public class denemerunner extends AbstractTestNGCucumberTests {

    @BeforeClass
    @Parameters({"browser", "language"})
    public void baslangic(String browser, String language) {
        Drivers.threadBrowserName.set(browser);
        Parent.urlgit(language);
    }


    @AfterClass
    public void bitis() {


    }
}
