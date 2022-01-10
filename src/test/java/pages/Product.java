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

    @FindBy(css =".stars>span>a")
    private List<WebElement> productReviewsStars;
    @FindBy(id ="comment")
    private WebElement productReviewsCommentText;
    @FindBy(id ="author")
    private WebElement productReviewsName;
    @FindBy(id ="email")
    private WebElement productReviewsemail;

    public WebElement getAddToCart() {
        return addToCart;
    }

    public WebElement getQuantityOfProduct() {
        return quantityOfProduct;
    }

    public WebElement getPayPall() {
        return payPall;
    }

    public WebElement getProductPrice() {
        return productPrice;
    }

    public WebElement getProductTitle() {
        return productTitle;
    }

    public WebElement getUpperFacebook() {
        return upperFacebook;
    }

    public WebElement getUpperTwitter() {
        return upperTwitter;
    }

    public WebElement getUpperLinkedIN() {
        return upperLinkedIN;
    }

    public WebElement getUpperPinterest() {
        return upperPinterest;
    }

    public WebElement getProductDescription() {
        return productDescription;
    }

    public WebElement getProductAdditionalInformation() {
        return productAdditionalInformation;
    }

    public WebElement getProductReviews() {
        return productReviews;
    }

    public List<WebElement> getProductReviewsStars() {
        return productReviewsStars;
    }

    public WebElement getProductReviewsCommentText() {
        return productReviewsCommentText;
    }

    public WebElement getProductReviewsName() {
        return productReviewsName;
    }

    public WebElement getProductReviewsemail() {
        return productReviewsemail;
    }

    public WebElement getProductReviewsSubmit() {
        return productReviewsSubmit;
    }

    @FindBy(xpath ="//input[@id='submit']")
    private WebElement productReviewsSubmit;
















}
