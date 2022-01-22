package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Drivers;
import utils.Parent;


public class Cart extends Parent {
    public Cart() {
        PageFactory.initElements(Drivers.getDriver(),this);
    }

    @FindBy(xpath="//td[@data-title=\"Produkt\"]/a")
	private WebElement itemText;

    @FindBy(xpath="(//span[@class=\"woocommerce-Price-amount amount\"])[1]")
	private WebElement priceOfItem;

    @FindBy(xpath="(//div[@class=\"woocommerce\"]/div)[2]")
	private WebElement deletedMessage;

    @FindBy(xpath="(//span[@class=\"woocommerce-Price-amount amount\"])[2]")
	private WebElement total;

    @FindBy(css="td.product-remove")
	private WebElement xbtn;

    @FindBy(css="a.restore-item")
	private WebElement ruckgangigBtn;

    @FindBy(css="div.alert_wrapper>a")
	private WebElement weiterEinkaufenBtn;

    @FindBy(xpath="//button[@name=\"update_cart\"]")
	private WebElement updateShoppingCartBtn;

    @FindBy(xpath="//td[@data-title=\"Zwischensumme\"]")
	private WebElement subTotal;

    @FindBy(xpath="(//span[@class=\"woocommerce-Price-amount amount\"])[4]")
	private WebElement shippingAmount;

    @FindBy(xpath="(//span[@class=\"woocommerce-Price-amount amount\"])[5]")
	private WebElement totalAmount;

    @FindBy(xpath="//a[@class=\"checkout-button button alt wc-forward\"]")
	private WebElement checkOutBtn;

    @FindBy(xpath="//div[@class=\"paypal-button-label-container\"]")
	private WebElement paypalBtn;

    @FindBy(xpath="(//a[@class=\"close\"])[1]")
	private WebElement iconCancelBtn;

	public WebElement getItemText() {
		return itemText;
	}

	public WebElement getPriceOfItem() {
		return priceOfItem;
	}

	public WebElement getTotal() {
		return total;
	}

	public WebElement getDeletedMessage() {
		return deletedMessage;
	}

	public WebElement getXbtn() {
		return xbtn;
	}

	public WebElement getRuckgangigBtn() {
		return ruckgangigBtn;
	}

	public WebElement getWeiterEinkaufenBtn() {
		return weiterEinkaufenBtn;
	}

	public WebElement getUpdateShoppingCartBtn() {
		return updateShoppingCartBtn;
	}

	public WebElement getSubTotal() {
		return subTotal;
	}

	public WebElement getShippingAmount() {
		return shippingAmount;
	}

	public WebElement getTotalAmount() {
		return totalAmount;
	}

	public WebElement getCheckOutBtn() {
		return checkOutBtn;
	}

	public WebElement getPaypalBtn() {
		return paypalBtn;
	}

	public WebElement getIconCancelBtn() {
		return iconCancelBtn;
	}
}
