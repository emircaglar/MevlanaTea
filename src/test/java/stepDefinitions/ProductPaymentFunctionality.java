package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Cart;
import pages.CheckOut;
import pages.Product;
import utils.Drivers;

public class ProductPaymentFunctionality {
    Product product;
    CheckOut checkOut;
    Cart cart;

    public ProductPaymentFunctionality(Product product, CheckOut checkOut, Cart cart) {
        this.checkOut = checkOut;
        this.product = product;
        this.cart = cart;
    }

    @When("^Click on the PayPal button$")
    public void clickOnThePayPalButton() {
        Drivers.getDriver().switchTo().frame(1);
        product.clickElement(product.getPayPall());
    }

    @Then("^The user should be able to see PayPal login page$")
    public void theUserShouldBeAbleToSeePayPalLoginPage() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        product.switchToNewTab();
        product.assertUrl("paypal.com");
    }

    @Then("^Click on the Weiter zur Kasse button$")
    public void clickOnTheWeiterZurKasseButton() {
        cart.clickElement(cart.getCheckOutBtn());
    }

    @And("^Fill the name \"([^\"]*)\"$")
    public void fillTheName(String name) {
        checkOut.sendKeys(checkOut.getFirstName(), name);
    }

    @When("^Select \"([^\"]*)\" as payment \"([^\"]*)\"$")
    public void selectAsPayment(Boolean payment, String option) {
        if (payment) {
            if (!checkOut.getCreditCardRadio().isSelected()) checkOut.clickElement(checkOut.getCreditCardRadio());
            Drivers.getDriver().switchTo().frame(0);
            switch (option) {
                case "Paypal":
                    if (!checkOut.getPaymentMethods().get(0).isSelected())
                        checkOut.javaScriptClick(checkOut.getPaymentMethods().get(0));
                    break;
                case "Lastschrift":
                    checkOut.javaScriptClick(checkOut.getPaymentMethods().get(1));
                    break;
                case "Kreditkarte":
                    checkOut.javaScriptClick(checkOut.getPaymentMethods().get(2));
                    break;
            }
            Drivers.getDriver().switchTo().defaultContent();
        }
    }

    @And("^Fill the nachname \"([^\"]*)\"$")
    public void fillTheNachname(String nachname) {
        checkOut.sendKeys(checkOut.getLastName(), nachname);
    }

    @And("^Fill the straße \"([^\"]*)\"$")
    public void fillTheStraße(String street) {
        checkOut.sendKeys(checkOut.getAddress(), street);
    }

    @And("^Fill the postleitzahl \"([^\"]*)\"$")
    public void fillThePostleitzahl(String postcode) {
        checkOut.sendKeys(checkOut.getPostCode(), postcode);
    }

    @And("^Fill the Ort \"([^\"]*)\"$")
    public void fillTheOrt(String city) {
        checkOut.sendKeys(checkOut.getCity(), city);
    }

    @And("^Fill the telefon  \"([^\"]*)\"$")
    public void fillTheTelefon(String number) {
        checkOut.sendKeys(checkOut.getPhone(), number);
    }

    @And("^Fill the email \"([^\"]*)\"$")
    public void fillTheEmail(String email) {
        checkOut.sendKeys(checkOut.getEmail(), email);
    }

    @When("^Select \"([^\"]*)\" as payment option$")
    public void selectAsPaymentOption(Boolean msj) {
        if (msj) {
            checkOut.clickElement(checkOut.getBankTransferRadio());
        }
    }

    @And("^Select the \"([^\"]*)\"$")
    public void selectThe(Boolean term) {
        if (term) checkOut.clickElement(checkOut.getTermsAndConditions());
    }


    @Then("^The user shoul be able to see the appropriate \"([^\"]*)\"$")
    public void theUserShoulBeAbleToSeeTheAppropriate(String message) {
        if (!(message.equals(""))) {
            checkOut.assertMessage(checkOut.getErrorMessage(), message);
        }
    }

    @When("^Click on the \"([^\"]*)\"$")
    public void clickOnThe(Boolean bessellen) {
        if (bessellen) checkOut.clickElement(checkOut.getPlaceOrder());
    }

    @Then("^Click on the Gutschein message$")
    public void click_on_the_Gutschein_message()  {
        checkOut.clickElement(checkOut.getShowCoupon());
    }

    @Then("^Fill the Gutschein code field randomly \"([^\"]*)\"$")
    public void fill_the_Gutschein_code_field_randomly(String couponNo)  {
        checkOut.sendKeys(checkOut.getCouponCodeInput(),couponNo);
    }

    @When("^click on the Gutschein anwenden button$")
    public void click_on_the_Gutschein_anwenden_button()  {
        checkOut.clickElement(checkOut.getApplyCoupon());
    }
    @Then("^The user should be able to see Der Gutschein  message$")
    public void the_user_should_be_able_to_see_Der_Gutschein_message()  {
        checkOut.assertMessage(checkOut.getCouponErrorMessage(),"existiert nicht");
    }
}