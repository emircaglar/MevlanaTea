package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.interactions.Actions;
import pages.Home;
import utils.Drivers;

public class LanguageButtonFunctionality {
    Home hm;
    Actions actions;

    public LanguageButtonFunctionality(Home hm) {
        this.hm = hm;
        actions=new Actions(Drivers.getDriver());
    }

    @Given("^Hover over the Language Button$")
    public void hoverOverTheLanguageButton() {
        actions.moveToElement(hm.getAllFlags()).build().perform();
    }

    @And("^Select  \"([^\"]*)\" from the options$")
    public void selectFromTheOptions(String language) {
        if (language.equals("DE")) {
            hm.clickElement(hm.getDe_flage());
        }else if (language.equals("TR")){
            hm.clickElement(hm.getTc_flage());
        }else{
            hm.clickElement(hm.getEn_flage());
        }
    }

    @Then("^The user should be able to see the web Page in selected \"([^\"]*)\"$")
    public void theUserShouldBeAbleToSeeTheWebPageInSelected(String language) {
        if (language.equals("DE")) {
            hm.assertUrl("mevlanacay.de");
        }else if (language.equals("TR")){
            hm.assertUrl("de/tr");
        }else{
            hm.assertUrl("de/en/");
        }
    }
}
