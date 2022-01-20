package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Drivers;
import utils.Parent;

import java.util.List;

public class Blog extends Parent {

    public Blog() {
        PageFactory.initElements(Drivers.getDriver(),this);
    }

    @FindBy(xpath ="//div//h2[@class='entry-title']")
    private List<WebElement> articles;

    @FindBy(xpath= "//a//i[@class='icon-search']")
    private List<WebElement> iconSearch;

    @FindBy(xpath= "//a//i[@class='icon-link']")
    private List<WebElement> iconLink;

    @FindBy(xpath= "//div//a[@class='next_page']")
    private WebElement nextPage;

    @FindBy(className = "icon-heart-fa")
    private List<WebElement> iconHeart;

    @FindBy(xpath= "//div//i[@class='icon-doc-text']")
    private List<WebElement> readMore;

    @FindBy(xpath= "//a//div[@class='mask']")
    private List<WebElement> image;

    @FindBy(xpath= "//img[@class='mfp-img']")
    private WebElement imageZoom;

    @FindBy(xpath = "//div//h2[@class='entry-title']//a")
    private List<WebElement> articles_href;

    @FindBy(className = "post-more")
    private List<WebElement> readMore_2;

    @FindBy(css = "div[class='icons']")
    private WebElement share_facebook;

    @FindBy(className = "icon-twitter")
    private WebElement icon_twitter;

    @FindBy(className = "icon-linkedin")
    private WebElement icon_linkedin;

    @FindBy(css = "a[class='pinterest']")
    private WebElement share_pinteres;

    @FindBy(xpath = "(//form[@id='searchform']//input[@name='s'])[2]")
    private WebElement search_blog_page;

    @FindBy(css = "div[class='post-title']")
    private List<WebElement> search_artikels;

    @FindBy(xpath = "//span[@class='label']")
    private List<WebElement> iconHeart_actual_value;

    @FindBy(xpath = "//span[@class='label']")
    private WebElement iconHeart_actual_value_inside;

    @FindBy(xpath = "//span//i[@class='icon-heart-fa']")
    private WebElement iconHeart_inside;

    public WebElement getName_selected_artikel() {
        return name_selected_artikel;
    }

    @FindBy(className = "entry-title")
    private WebElement name_selected_artikel;

    public List<WebElement> getArticles() {
        return articles;
    }

    public List<WebElement> getIconSearch() {
        return iconSearch;
    }

    public List<WebElement> getIconLink() {
        return iconLink;
    }

    public WebElement getNextPage() {
        return nextPage;
    }

    public List<WebElement> getIconHeart() {
        return iconHeart;
    }

    public List<WebElement> getReadMore() {
        return readMore;
    }

    public List<WebElement> getImage() {
        return image;
    }

    public WebElement getImageZoom() {
        return imageZoom;
    }

    public List<WebElement> getArticles_href() { return articles_href; }

    public List<WebElement> getReadMore_2() { return readMore_2; }

    public WebElement getShare_facebook() { return share_facebook; }

    public WebElement getIcon_twitter() { return icon_twitter; }

    public WebElement getIcon_linkedin() { return icon_linkedin; }

    public WebElement getShare_pinteres() { return share_pinteres; }

    public WebElement getSearch_blog_page() { return search_blog_page; }

    public List<WebElement> getSearch_artikels() { return search_artikels; }

    public List<WebElement> getIconHeart_actual_value() { return iconHeart_actual_value; }

    public WebElement getIconHeart_actual_value_inside() { return iconHeart_actual_value_inside; }

    public WebElement getIconHeart_inside() { return iconHeart_inside; }
}
