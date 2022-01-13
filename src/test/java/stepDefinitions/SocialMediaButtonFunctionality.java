package stepDefinitions;
import cucumber.api.java.en.*;
import pages.Home;

public class SocialMediaButtonFunctionality {

    Home hm;
    public SocialMediaButtonFunctionality (Home hm) {
        this.hm = hm;
    }
    @Given("^Click on the Facebook button$")
    public void click_on_the_Facebook_button()  {
        hm.getHome_Facebook().click();
    }

    @Then("^The user should be able to see the Facebook page of the company$")
    public void the_user_should_be_able_to_see_the_Facebook_page_of_the_company() {
        hm.switchToNewTab();
        hm.assertUrl("facebook");
    }

    @Given("^Click on the Instagram button$")
    public void click_on_the_Instagram_button() {
        hm.getHome_Instagram().click();
    }

    @Then("^The user should be able to see the Instagram page of the company$")
    public void the_user_should_be_able_to_see_the_Instagram_page_of_the_company() {
        hm.switchToNewTab();
        hm.assertUrl("instagram");
    }

    @Given("^Click on the Twitter button$")
    public void click_on_the_Twitter_button() {
        hm.getHome_Twitter().click();
    }

    @Then("^The user should be able to see the Twitter page of the company$")
    public void the_user_should_be_able_to_see_the_Twitter_page_of_the_company() {
        hm.switchToNewTab();
        hm.assertUrl("twitter");
    }

    @Given("^Click on the Instagram Bottom button$")
    public void click_on_the_Instagram_Bottom_button() {
        hm.getHome_Instagram_Bottom_Button().click();
    }

}
