package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Drivers;

public class Products {

    Products() {
        PageFactory.initElements(Drivers.getDriver(),this);
    }

    @FindBy(css = "li>div[class=\"desc\"]")
    private WebElement productList;

    public WebElement getProductList() {
        return productList;
    }
}
