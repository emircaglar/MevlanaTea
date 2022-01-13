package stepDefinitions;

import cucumber.api.java.en.*;
import net.bytebuddy.utility.RandomString;
import pages.Home;


public class SubscribeToTheNewsletterFunctionality {

    private Home home = new Home();

    public SubscribeToTheNewsletterFunctionality(Home home) {
        this.home = home;
    }

    @Given("^Type an \"([^\"]*)\" into the email input on the top of the page$")
    public void typeAnIntoTheEmailInputOnTheTopOfThePage(String email) {
        home.getHome_e_mail_input().sendKeys(email+randomEmailGenerator());
    }

    @And("^Click on the Jetzt abonnieren button$")
    public void clickOnTheJetztAbonnierenButton() {
    }

    @Then("^The user should see the error alert with invalid e-mail or success message with valid e-mail$")
    public void theUserShouldSeeTheErrorAlertWithInvalidEMailOrSuccessMessageWithValidEMail() {
    }

    @Given("^Type an \"([^\"]*)\" into the email input on the bottom of the page$")
    public void typeAnIntoTheEmailInputOnTheBottomOfThePage(String email) {

    }

    @And("^Click on the  Abone Ol button$")
    public void clickOnTheAboneOlButton() {
    }

    @Given("^Type an \"([^\"]*)\" into the email input on the botoom of the page$")
    public void typeAnIntoTheEmailInputOnTheBotoomOfThePage(String email) {

    }

    private String randomEmailGenerator(){
        return RandomString.make(5);
    }
}
