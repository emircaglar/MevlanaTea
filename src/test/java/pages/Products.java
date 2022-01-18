package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Drivers;
import utils.Parent;
import java.util.List;

public class Products extends Parent {

   public Products() {
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

    @FindBy(css = "select[name=\"orderby\"]")
    private WebElement filterMenu;

    @FindBy(css = "div[class=\"shop-filters\"]>form")
    private WebElement filterBtn;

    @FindBy(css = "#menu-item-22796>ul.sub-menu>li:last-child")
    private WebElement teezubehörButton;

    public WebElement getFilterBtn() {
        return filterBtn;
    }

    public WebElement getTeezubehörButton() {
        return teezubehörButton;
    }

    public WebElement getFilterMenu() {
        return filterMenu;
    }

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
