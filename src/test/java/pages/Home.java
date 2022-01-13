package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Drivers;
import utils.Parent;

import java.util.List;

public class Home extends Parent {

    public Home(){
        PageFactory.initElements(Drivers.getDriver(),this);
    }

    @FindBy(id = "mailchimp-top-bar__email")
    private WebElement Home_e_mail_input;

    @FindBy(className= "mctb-button")
    private WebElement Home_e_mail_submit;

    @FindBy(css= "div[class='cf1YU1 cfNq4w']>button")
    private WebElement Home_cookise_accept;

    @FindBy(css= "ul[id='menu-ana-menu']>:nth-child(1)")
    private WebElement Home_page_Home;

    @FindBy(xpath= "(//ul[@id='menu-ana-menu']//li)[2]")
    private WebElement Home_page_Product;

    @FindBy(css= "ul[id='menu-ana-menu']>:nth-child(3)")
    private WebElement Home_page_About_Us;

    @FindBy(xpath= "//span[text()='BLOG']")
    private WebElement Home_page_Blog;

    @FindBy(css= "ul[id='menu-ana-menu']>:nth-child(5)")
    private WebElement Home_page_Contact;

    @FindBy(className= "mctb-response-label")
    private WebElement Home_mail_submit_answer;

    @FindBy(xpath= "//a[text()='Facebook']")
    private WebElement Home_Facebook;

    @FindBy(xpath= "//a[text()=' Instagram']")
    private WebElement Home_Instagram;

    @FindBy(xpath= "//a[text()=' Twitter']")
    private WebElement Home_Twitter;

    @FindBy(css= "div#sbi_load>span>a")
    private WebElement Home_Instagram_Bottom_Button;

    @FindBy(className= "icon-bag-fine")
    private WebElement Home_top_Cart;

    @FindBy(css= "ul[id='menu-ana-menu']>:nth-child(6)")
    private WebElement allFlags;

    @FindBy(id = "menu-item-22453")
    private WebElement tc_flage;

    @FindBy(id = "menu-item-22455")
    private  WebElement en_flage;

    @FindBy(id = "menu-item-22454")
    private WebElement de_flage;

    @FindBy(className = "mctb-close")
    private WebElement closeEMail;

    @FindBy(className = "icon-menu-fine")
    private WebElement hamburger;

    @FindBy(id = "slide-cart")
    private WebElement mobilCart;

    @FindBy(xpath = "(//li//span[@class='menu-toggle'])[3]")
    private WebElement toggleFlags;

    @FindBy(className = "mctb-label")
    private WebElement eMailMessage;

    @FindBy(css = "li[id='menu-item-21588']>ul.sub-menu[style='display: block;']")
    private WebElement about_Us_Submenu;

    @FindBy(css = "li[id='menu-item-22796']>ul.sub-menu[style='display: block;']")
    private WebElement productSubMenu;

    @FindBy(css = "#menu-item-22796>ul a")
    private List<WebElement> productSubMenuList;

    @FindBy(css = "input[name='EMAIL']")
    private WebElement Home_e_mail_bottom_input;

    @FindBy(css = "input[value='Registrieren']")
    private WebElement Home_e_mail_bottom_senden;

    @FindBy(className = "mc4wp-response")
    private WebElement Home_e_mail_bottom_senden_answer;

    public List<WebElement> getProductSubMenuList() {
        return productSubMenuList;
    }

    public WebElement getProductSubMenu() {
        return productSubMenu;
    }

    public WebElement getAbout_Us_Submenu() {
        return about_Us_Submenu;
    }

    public WebElement getTc_flage() {
        return tc_flage;
    }

    public WebElement getEn_flage() {
        return en_flage;
    }

    public WebElement getDe_flage() {
        return de_flage;
    }

    public WebElement getHome_top_Cart() {
        return Home_top_Cart;
    }

    public WebElement getHome_Facebook() {
        return Home_Facebook;
    }

    public WebElement getHome_Instagram() {
        return Home_Instagram;
    }

    public WebElement getHome_Twitter() {
        return Home_Twitter;
    }

    public WebElement getHome_Instagram_Bottom_Button() {
        return Home_Instagram_Bottom_Button;
    }

    public WebElement getHome_mail_submit_answer() {
        return Home_mail_submit_answer;
    }

    public WebElement getHome_e_mail_input() {
        return Home_e_mail_input;
    }

    public WebElement getHome_cookise_accept() {
        return Home_cookise_accept;
    }

    public WebElement getHome_page_Home() {
        return Home_page_Home;
    }

    public WebElement getHome_page_Product() {
        return Home_page_Product;
    }

    public WebElement getHome_page_About_Us() {
        return Home_page_About_Us;
    }

    public WebElement getHome_page_Blog() {
        return Home_page_Blog;
    }

    public WebElement getHome_page_Contact() {
        return Home_page_Contact;
    }

    public WebElement getHome_e_mail_submit() {
        return Home_e_mail_submit;
    }

    public WebElement getCloseEMail() {
        return closeEMail;
    }

    public WebElement getHamburger() {
        return hamburger;
    }

    public WebElement getMobilCart() {
        return mobilCart;
    }

    public WebElement getAllFlags() {
        return allFlags;
    }

    public WebElement getToggleFlags() {
        return toggleFlags;
    }

    public WebElement geteMailMessage() {
        return eMailMessage;
    }

    public WebElement getHome_e_mail_bottom_input() {
        return Home_e_mail_bottom_input;
    }

    public WebElement getHome_e_mail_bottom_senden() {
        return Home_e_mail_bottom_senden;
    }

    public WebElement getHome_e_mail_bottom_senden_answer() {
        return Home_e_mail_bottom_senden_answer;
    }
}
