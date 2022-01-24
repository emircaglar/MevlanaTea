package stepDefinitions;

import cucumber.api.java.en.*;
import org.apache.commons.lang3.RandomStringUtils;
import pages.Product;

public class ProductReviewFunctionality {

    private Product product;

    public ProductReviewFunctionality(Product product) {
        this.product = product;
    }

    @Given("^Click on the Beschreibung button$")
    public void click_on_the_Beschreibung_button() {
        product.clickElement(product.getProductDescription());
    }

    @Given("^The user should be able to see the productDescriptionArticle$")
    public void the_user_should_be_able_to_see_the_productDescriptionArticle() {
        product.getProductDescriptionArticle().isDisplayed();
    }

    @Given("^Click on the Zusatzliche Informationen button$")
    public void click_on_the_Zusatzliche_Informationen_button() {
        product.clickElement(product.getProductAdditionalInformation());
    }

    @Given("^The user should be able to see the ZusatzlicheInformationen$")
    public void the_user_should_be_able_to_see_the_ZusatzlicheInformationen() {
        product.getZusatzlicheInformationen().isDisplayed();
    }

    @Given("^Click on the Bewertungen button$")
    public void click_on_the_Bewertungen_button() {
        product.clickElement(product.getProductReviews());
    }

    @Then("^The user should be able to see the Bewertungen$")
    public void the_user_should_be_able_to_see_the_Bewertungen() {
        product.getBewertungenMessage().isDisplayed();
    }

    @Given("^Click on one of the Deine Bewentung randomly$")
    public void click_on_one_of_the_Deine_Bewentung_randomly() {
        product.clickRandomlyFromAList(product.getProductReviewsStars());
    }

    @Given("^Fill the Deine Rezension field with \"([^\"]*)\"$")
    public void fill_the_Deine_Rezension_field_with(String deineRezension) {
        product.sendKeys(product.getProductReviewsCommentText(), deineRezension);
    }

    @Given("^Fill the name field with \"([^\"]*)\"$")
    public void fill_the_name_field_with(String name) {
        product.sendKeys(product.getProductReviewsName(), name);
    }

    @Given("^Fill the e-mail field")
    public void fill_the_e_mail_field_with() {
        String eMail = RandomStringUtils.randomAlphabetic(5) + "@eurotech.com";
        product.sendKeys(product.getProductReviewsemail(), eMail);
    }

    @Given("^Click on the Sendenn Button$")
    public void click_on_the_Sendenn_Button() {
        product.clickElement(product.getSenden());
        product.waitUntilVisible(product.getProductDescription());
    }

    @Then("^User should be able to see the \"([^\"]*)\" message$")
    public void user_should_be_able_to_see_the_message(String message) {
        product.assertMessage(product.getSuccessMsg(), message);
    }
}
