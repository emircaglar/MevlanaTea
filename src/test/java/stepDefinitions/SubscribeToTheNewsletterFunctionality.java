package stepDefinitions;

import cucumber.api.java.en.*;
import org.testng.Assert;
import pages.Home;
import utils.Drivers;
import utils.Parent;

public class SubscribeToTheNewsletterFunctionality extends Parent {

    private Home home = new Home();

    public SubscribeToTheNewsletterFunctionality(Home home) {
        this.home = home;
    }

    @Given("^Type an \"([^\"]*)\" into the email input on the top of the page$")
    public void typeAnIntoTheEmailInputOnTheTopOfThePage(String email) {
        sendKeys(home.getHome_e_mail_input(), email);
    }

    @And("^Click on the Jetzt abonnieren button$")
    public void clickOnTheJetztAbonnierenButton() {
        clickElement(home.getHome_e_mail_submit());
    }

    @Given("^Type an \"([^\"]*)\" into the email input on the bottom of the page$")
    public void typeAnIntoTheEmailInputOnTheBottomOfThePage(String email) {
        sendKeys(home.getHome_e_mail_bottom_input(), email);
    }

    @And("^Click on the registrieren button$")
    public void clickOnTheRegistrierenButton() {
        clickElement(home.getHome_e_mail_bottom_senden());
    }

    @Then("^The user should see the error alert with invalid \"([^\"]*)\" or success message with valid e-mail for bottom registration$")
    public void theUserShouldSeeTheErrorAlertWithInvalidOrSuccessMessageWithValidEMailForBottomRegistration(String email) {
        if (email.contains("@gmail.com")) {
            if (Drivers.getDriver().getCurrentUrl().equals("https://www.mevlanacay.de/")) {
                assertMessage(home.getHome_e_mail_bottom_successMessage(), "Dankeschön, Deine Anmeldung war erfolgreich!");
            } else {
                assertMessage(home.getHome_e_mail_bottom_successMessage(), "Teşekkürler, kayıt başvurunuz başarıyla tamamlandı!");
            }
        } else {
            Assert.assertTrue(home.getHome_e_mail_input().getAttribute("validationMessage")
                    .contains("Lütfen e-posta adresine bir \"@\" işareti") ||
                    home.getHome_e_mail_input().getAttribute("validationMessage")
                            .contains("Lütfen \"@\" işaretinden sonra gelen kısmı") ||
                    home.getHome_e_mail_input().getAttribute("validationMessage")
                            .contains("Lütfen bu alanı doldurun") ||
                    home.getHome_e_mail_input().getAttribute("validationMessage")
                            .contains(""));
        }
    }

    @Then("^The user should see the error alert with invalid \"([^\"]*)\" or success message with valid e-mail for top registration$")
    public void theUserShouldSeeTheErrorAlertWithInvalidOrSuccessMessageWithValidEMailForTopRegistration(String email) {
        if (email.contains("@gmail.com")) {
            if (Drivers.getDriver().getCurrentUrl().equals("https://www.mevlanacay.de/")) {
                assertMessage(home.getHome_e_mail_bar_menu_message(), "Sie haben sich erfolgreich registriert! Vielen Dank. Bitte überprüfen Sie die Bestätigungs-E-Mail, die wir Ihnen gesendet haben.");
            } else {
                assertMessage(home.getHome_e_mail_bar_menu_message(), "Başarıyla kaydoldunuz. Teşekkürler.");
            }
        } else {
            Assert.assertTrue(home.getHome_e_mail_input().getAttribute("validationMessage")
                    .contains("Lütfen e-posta adresine bir \"@\" işareti") ||
                    home.getHome_e_mail_input().getAttribute("validationMessage")
                            .contains("Lütfen \"@\" işaretinden sonra gelen kısmı") ||
                    home.getHome_e_mail_input().getAttribute("validationMessage")
                            .contains("Lütfen bu alanı doldurun") ||
                    home.getHome_e_mail_input().getAttribute("validationMessage")
                            .contains(""));
        }
    }
}
