package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Drivers;

import java.util.List;

public class Cart {
    public Cart() {
        PageFactory.initElements(Drivers.getDriver(),this);
    }
	@FindBy(xpath="//td[@class=\"product-name\"]/a/font")
	private WebElement itemText;
	@FindBy(xpath="(//span[@class=\"woocommerce-Price-amount amount\"])[1]")
	private WebElement priceOfItem;
	@FindBy(id="quantity_61dbdab20bfc1")
	private WebElement quantity;
	@FindBy(xpath="(//span[@class=\"woocommerce-Price-amount amount\"])[2]")
	private WebElement total;
	@FindBy(xpath="//table[@class=\"shop_table shop_table_responsive cart woocommerce-cart-form__contents\"]/tbody/tr/td[6]")
	private List<WebElement> deleteItemlist;
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


	public WebElement getItemText() {
		return itemText;
	}

	public WebElement getPriceOfItem() {
		return priceOfItem;
	}

	public WebElement getQuantity() {
		return quantity;
	}

	public WebElement getTotal() {
		return total;
	}

	public List<WebElement> getDeleteItemlist() {
		return deleteItemlist;
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
}
