package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Drivers;

import java.util.List;

public class Products {

    Products() {
        PageFactory.initElements(Drivers.getDriver(),this);
    }

    @FindBy(css = "li>div[class=\"desc\"]")
    private List<WebElement> productList;

    @FindBy(css = "i[class=\"icon-basket\"]")
    private WebElement productListBasket;

    @FindBy(css = "a[class='link']")
    private WebElement productListLink;

    public List<WebElement> getProductList() {
        return productList;
    }

    public WebElement getProductListBasket() {
        return productListBasket;
    }

    public WebElement getProductListLink() {
        return productListLink;
    }

}
