package stepDefinitions;

import cucumber.api.java.en.Then;
import org.testng.Assert;
import pages.Home;
import pages.UberUns;
import utils.Drivers;

public class WatchToTVAdsFunctionality {

    Home hm;
    UberUns uberUns;
    public WatchToTVAdsFunctionality (Home hm,UberUns uberUns) {
        this.hm = hm;
        this.uberUns =uberUns;
    }

    @Then("^Click on one of the videos randomly$")
    public void clickOnOneOfTheVideosRandomly() throws InterruptedException {

        for (int i = 0; i < uberUns.getIframeList().size(); i++) {
            Drivers.getDriver().switchTo().frame(i);
            String beforePlayback=uberUns.getDf().getAttribute("aria-valuenow");
            hm.clickElement(uberUns.getPlayerButton());
            Thread.sleep(5000);
            String afterPlayback=uberUns.getDf().getAttribute("aria-valuenow");
            hm.clickElement(uberUns.getPlayerButton());
            Thread.sleep(5000);
            Drivers.getDriver().switchTo().defaultContent();

            Assert.assertNotEquals(beforePlayback,afterPlayback);
        }
    }
}
