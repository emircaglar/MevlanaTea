package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Drivers;

import java.util.List;

public class Product {

    public Product() {
        PageFactory.initElements(Drivers.getDriver(),this);
    }

    @FindBy(css ="[name='add-to-cart']")
    private WebElement addToCart;
    @FindBy(css ="[name='quantity']")
    private WebElement quantityOfProduct;
   @FindBy(css ="div.paypal-button-label-container")
    private WebElement payPall;
    @FindBy(xpath ="//p[@class='price']/span[@class='woocommerce-Price-amount amount']/bdi")
    private WebElement productPrice;
    @FindBy(css =".product_title")
    private WebElement productTitle;
    @FindBy(xpath ="//div[@class='icons']/a[1]")
    private WebElement upperFacebook;
    @FindBy(xpath ="//div[@class='icons']/a[2]")
    private WebElement upperTwitter;
    @FindBy(xpath ="//div[@class='icons']/a[3]")
    private WebElement upperLinkedIN;
    @FindBy(xpath ="//div[@class='icons']/a[4]")
    private WebElement upperPinterest;
    @FindBy(css ="[href='#tab-description']")
    private WebElement productDescription;
    @FindBy(css ="[href='#tab-additional_information']")
    private WebElement productAdditionalInformation;
    @FindBy(css ="[href='#tab-reviews']")
    private WebElement productReviews;
    @FindBy(xpath ="//ul[@class='social']/li [1]")
    private WebElement footerFacebook;
    @FindBy(xpath ="//ul[@class='social']/li [2]")
    private WebElement footerYoutube;
   @FindBy(xpath ="//ul[@class='social']/li [3]")
    private WebElement footerPinterest;
   @FindBy(xpath ="//ul[@class='social']/li [4]")
    private WebElement footerInstagram;













}
