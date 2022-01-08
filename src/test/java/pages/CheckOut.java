package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Drivers;

import java.util.List;

public class CheckOut {

    public CheckOut() {
        PageFactory.initElements(Drivers.getDriver(),this);
    }

    @FindBy(id = "billing_first_name")
    private WebElement firtsName;

    @FindBy(id = "billing_last_name")
    private WebElement lastName;

    @FindBy(id = "billing_address_1")
    private WebElement address;

    @FindBy(id = "billing_postcode")
    private WebElement postCode;

    @FindBy(id = "billing_city")
    private WebElement city;

    @FindBy(id = "billing_phone")
    private WebElement phone;

    @FindBy(id = "billing_email")
    private WebElement email;

    @FindBy(id = "payment_method_bacs")
    private WebElement bankTransferRadio;

    @FindBy(id = "payment_method_paypal_plus")
    private WebElement creditCardRadio;

    @FindBy(className = "nameRow")
    private List<WebElement> paymentMethods;

    @FindBy(id = "nameRow")
    private WebElement termsAndConditions;

    @FindBy(id = "place_order")
    private WebElement placeOrder;

}
