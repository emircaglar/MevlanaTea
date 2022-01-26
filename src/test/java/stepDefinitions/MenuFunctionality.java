package stepDefinitions;

import cucumber.api.java.en.*;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;
import pages.Home;
import utils.Drivers;

public class MenuFunctionality {

    private Home hm;
    private WebDriverWait wait;
    private Actions actions;

    public MenuFunctionality(Home hm) {
        this.hm = hm;
        actions = new Actions(Drivers.getDriver());
        wait = new WebDriverWait(Drivers.getDriver(), 15);
    }

    @Given("^Click on the Produkte button$")
    public void click_on_the_Produkte_button() {
        hm.clickElement(hm.getHome_page_Product());
    }

    @Then("^The user should be able to see the Produkte Page$")
    public void the_user_should_able_to_see_the_Produkte_Page() {
        if (Drivers.threadLanguage.get().equals("DE")) {
            hm.assertUrl("produkte");
        } else {
            hm.assertUrl("shop");
            hm.waitUntilVisible(hm.getHome_page_Product());
            hm.javaScriptClick(hm.getHome_cookise_accept());
        }
    }

    @Then("^Click on the Home button$")
    public void click_on_the_Home_button() {
        hm.clickElement(hm.getHome_page_Home());
    }

    @Then("^The user should able to see the Home Page$")
    public void the_user_should_able_to_see_the_Home_Page() {
        hm.assertUrl("mevlanacay.de");

        if (Drivers.threadLanguage.get().equals("TR")) {
            if (Drivers.getDriver().manage().window().getSize().getHeight() == 640) {
                hm.javaScriptClick(hm.getHamburger());
                hm.javaScriptClick(hm.getToggleFlags());
                hm.clickElement(hm.getTc_flage());
            } else {
                actions.moveToElement(hm.getAllFlags()).build().perform();
                hm.clickElement(hm.getTc_flage());
            }

        } else if (Drivers.threadLanguage.get().equals("EN")) {
            if (Drivers.getDriver().manage().window().getSize().getHeight() == 640) {
                hm.javaScriptClick(hm.getHamburger());
                hm.clickElement(hm.getToggleFlags());
                hm.clickElement(hm.getEn_flage());
            } else {
                actions.moveToElement(hm.getAllFlags()).build().perform();
                hm.clickElement(hm.getEn_flage());
            }
        }
    }

    @Then("^Click on the Uber Uns button$")
    public void click_on_the_Uber_Uns_button() {
        hm.clickElement(hm.getHome_page_About_Us());
    }

    @Then("^User should be able to see the Uber Uns Page$")
    public void user_should_be_able_to_see_the_Uber_Uns_Page() {
        hm.assertUrl("uber-uns", "hakkimizda", "aboutus");
    }

    @Then("^Click on the Blog button$")
    public void click_on_the_Blog_button() {
        hm.clickElement(hm.getHome_page_Blog());
    }

    @Then("^The user should be able to see the Blog Page$")
    public void the_user_should_be_able_to_see_the_Blog_Page() {
        hm.assertUrl("de/blog", "/tr/blog", "/en/blog");
    }

    @Then("^Click on the Kontakt button$")
    public void click_on_the_Kontakt_button() {
        hm.clickElement(hm.getHome_page_Contact());
    }

    @Then("^The user should be able to see the Kontakt Page$")
    public void the_user_should_be_able_to_see_the_Kontakt_Page() {
        hm.assertUrl(".de/kontakt", "/tr/iletisim", "/en/contact");
    }

    @Then("^Click on the Cart button$")
    public void click_on_the_Cart_button() {
        if (Drivers.threadLanguage.get().equals("DE") && Drivers.getDriver().manage().window().getSize().getHeight() == 640) {
            hm.clickElement(hm.getMobilCart());
        } else if (Drivers.threadLanguage.get().equals("DE")) {
            hm.clickElement(hm.getHome_top_Cart());
        }
    }

    @Then("^The user should be able to see the Cart Page$")
    public void the_user_should_be_able_to_see_the_Cart_Page() {
        if (Drivers.threadLanguage.get().equals("DE")) {
            hm.assertUrl("warenkorb");
        }
    }

    @Given("^Click on the hamburger menu icon$")
    public void clickOnTheHamburgerMenuIcon() {
        if (!Drivers.getDriver().getCurrentUrl().contains("de/en") && hm.geteMailMessage().isDisplayed()) {
            hm.javaScriptClick(hm.getCloseEMail());
            wait.until(ExpectedConditions.invisibilityOf(hm.geteMailMessage()));
        }
        if (Drivers.getDriver().manage().window().getSize().getHeight() != 640) {
            Drivers.getDriver().manage().window().setSize(new Dimension(360, 640));
        }
        hm.javaScriptClick(hm.getHamburger());
        hm.waitUntilVisible(hm.getHome_page_Product());
    }
}
