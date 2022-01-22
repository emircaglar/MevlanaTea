package stepDefinitions;

import cucumber.api.java.en.*;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;
import pages.UberUns;
import utils.Drivers;

public class WatchToTVAdsFunctionality {

    private UberUns uberUns;

    public WatchToTVAdsFunctionality(UberUns uberUns) {
        this.uberUns = uberUns;
    }

    @Then("^Click on one of the videos randomly$")
    public void clickOnOneOfTheVideosRandomly() {
        for (int i = 0; i < uberUns.getIframeList().size(); i++) {
            Drivers.getDriver().switchTo().frame(i);
            String beforePlayback = uberUns.getPlaybackTime().getAttribute("aria-valuenow");
            System.out.println("beforePlayback = " + beforePlayback);
            uberUns.clickElement(uberUns.getPlayerButton());
            WebDriverWait wait = new WebDriverWait(Drivers.getDriver(), 15);
            wait.until(ExpectedConditions.attributeContains(uberUns.getPlaybackTime(), "aria-valuenow", "5"));
            String afterPlayback = uberUns.getPlaybackTime().getAttribute("aria-valuenow");
            uberUns.clickElement(uberUns.getPlayerButton());
            System.out.println("afterPlayback = " + afterPlayback);

            Drivers.getDriver().switchTo().defaultContent();

            Assert.assertNotEquals(beforePlayback, afterPlayback);
        }
    }
}
