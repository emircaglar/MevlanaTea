package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home {
    @FindBy(id = "mailchimp-top-bar__email")
    private WebElement Home_e_mail_input;

    @FindBy(className= "mctb-button")
    private WebElement Home_e_mail_submit;

    @FindBy(css= "div[class='cf1YU1 cfNq4w']")
    private WebElement Home_cookise_accept;

    @FindBy(css= "ul[id='menu-ana-menu']>:nth-child(1)")
    private WebElement Home_page_Home;

    @FindBy(css= "ul[id='menu-ana-menu']>:nth-child(2)")
    private WebElement Home_page_Product;

    @FindBy(css= "ul[id='menu-ana-menu']>:nth-child(3)")
    private WebElement Home_page_About_Us;

    @FindBy(css= "ul[id='menu-ana-menu']>:nth-child(4)")
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

    @FindBy(id = "menu-item-22453")
    private WebElement tc_flage;

    @FindBy(id = "menu-item-22455")
    private  WebElement en_flage;

    @FindBy(id = "menu-item-22454")
    private WebElement de_flage;

    public WebElement getTc_flage() {
        return tc_flage;
    }

    public void setTc_flage(WebElement tc_flage) {
        this.tc_flage = tc_flage;
    }

    public WebElement getEn_flage() {
        return en_flage;
    }

    public void setEn_flage(WebElement en_flage) {
        this.en_flage = en_flage;
    }

    public WebElement getDe_flage() {
        return de_flage;
    }

    public void setDe_flage(WebElement de_flage) {
        this.de_flage = de_flage;
    }

    public WebElement getHome_top_Cart() {
        return Home_top_Cart;
    }

    public void setHome_top_Cart(WebElement home_top_Cart) {
        Home_top_Cart = home_top_Cart;
    }

    public WebElement getHome_Facebook() {
        return Home_Facebook;
    }

    public void setHome_Facebook(WebElement home_Facebook) {
        Home_Facebook = home_Facebook;
    }

    public WebElement getHome_Instagram() {
        return Home_Instagram;
    }

    public void setHome_Instagram(WebElement home_Instagram) {
        Home_Instagram = home_Instagram;
    }

    public WebElement getHome_Twitter() {
        return Home_Twitter;
    }

    public void setHome_Twitter(WebElement home_Twitter) {
        Home_Twitter = home_Twitter;
    }

    public WebElement getHome_Instagram_Bottom_Button() {
        return Home_Instagram_Bottom_Button;
    }

    public void setHome_Instagram_Bottom_Button(WebElement home_Instagram_Bottom_Button) {
        Home_Instagram_Bottom_Button = home_Instagram_Bottom_Button;
    }

    public WebElement getHome_mail_submit_answer() {
        return Home_mail_submit_answer;
    }

    public void setHome_mail_submit_answer(WebElement home_mail_submit_answer) {
        Home_mail_submit_answer = home_mail_submit_answer;
    }

    public WebElement getHome_e_mail_input() {
        return Home_e_mail_input;
    }

    public void setHome_e_mail_input(WebElement home_e_mail_input) {
        Home_e_mail_input = home_e_mail_input;
    }

    public WebElement getHome_cookise_accept() {
        return Home_cookise_accept;
    }

    public void setHome_cookise_accept(WebElement home_cookise_accept) {
        Home_cookise_accept = home_cookise_accept;
    }

    public WebElement getHome_page_Home() {
        return Home_page_Home;
    }

    public void setHome_page_Home(WebElement home_page_Home) {
        Home_page_Home = home_page_Home;
    }

    public WebElement getHome_page_Product() {
        return Home_page_Product;
    }

    public void setHome_page_Product(WebElement home_page_Product) {
        Home_page_Product = home_page_Product;
    }

    public WebElement getHome_page_About_Us() {
        return Home_page_About_Us;
    }

    public void setHome_page_About_Us(WebElement home_page_About_Us) {
        Home_page_About_Us = home_page_About_Us;
    }

    public WebElement getHome_page_Blog() {
        return Home_page_Blog;
    }

    public void setHome_page_Blog(WebElement home_page_Blog) {
        Home_page_Blog = home_page_Blog;
    }

    public WebElement getHome_page_Contact() {
        return Home_page_Contact;
    }

    public void setHome_page_Contact(WebElement home_page_Contact) {
        Home_page_Contact = home_page_Contact;
    }


    public WebElement getHome_e_mail_submit() {
        return Home_e_mail_submit;
    }

    public void setHome_e_mail_submit(WebElement home_e_mail_submit) {
        Home_e_mail_submit = home_e_mail_submit;
    }

}
