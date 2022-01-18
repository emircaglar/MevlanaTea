package stepDefinitions;
import cucumber.api.java.en.*;
import pages.Home;

public class SocialMediaButtonFunctionality {

    Home hm;
    public SocialMediaButtonFunctionality (Home hm) {
        this.hm = hm;
    }

    @Given("^Click on the \"([^\"]*)\" button$")
    public void clickOnTheButton(String name) {
        switch (name) {
            case "Facebook":
                hm.getHome_Facebook().click();
                break;
            case "Twitter":
                hm.getHome_Twitter().click();
                break;
            case "Instagram":
                hm.getHome_Instagram().click();
                break;
            case "InstagramBottom":
                hm.getHome_Instagram_Bottom_Button().click();
                break;
        }
    }

    @Then("^The user should be able to see the \"([^\"]*)\" page of the company$")
    public void theUserShouldBeAbleToSeeThePageOfTheCompany(String socialMediaPageUrl)  {
        hm.switchToNewTab();
        hm.assertUrl(socialMediaPageUrl);

    }
}





