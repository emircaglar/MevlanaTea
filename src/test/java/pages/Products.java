package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Drivers;
import utils.Parent;

import java.util.List;

public class Products extends Parent {

    Products() {
        PageFactory.initElements(Drivers.getDriver(),this);
    }

    @FindBy(xpath= "//div[@class=\"image_wrapper\"]/div/a[2]")
    private List<WebElement> productList;

    @FindBy(xpath = "//div[@class=\"image_links \"]/a")
    private List<WebElement> productListOutofStoc;
    @FindBy(xpath = "//p[@class=\"stock out-of-stock\"]")
    private  WebElement utOfStocGetText;

    @FindBy(css = "i[class=\"icon-basket\"]")
    private List<WebElement> productListBasket;

    @FindBy(css = "a[class='link']")
    private List<WebElement> productListLink;

    public List<WebElement> getProductList() {
        return productList;
    }

    public List<WebElement> getProductListBasket() {
        return productListBasket;
    }
    public List<WebElement> getProductListLink() {
        return productListLink;
    }

    public List<WebElement> getProductListOutofStoc() {
        return productListOutofStoc;
    }

    public WebElement getUtOfStocGetText() {
        return utOfStocGetText;
    }
}
