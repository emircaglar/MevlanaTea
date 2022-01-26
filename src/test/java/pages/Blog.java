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
    private List<WebElement> articlesHref;

    @FindBy(className = "post-more")
    private List<WebElement> readMore2;

    @FindBy(css = "div[class='icons']")
    private WebElement shareFacebook;

    @FindBy(className = "icon-twitter")
    private WebElement iconTwitter;

    @FindBy(className = "icon-linkedin")
    private WebElement iconLinkedin;

    @FindBy(css = "a[class='pinterest']")
    private WebElement sharePinteres;

    @FindBy(xpath = "(//form[@id='searchform']//input[@name='s'])[2]")
    private WebElement searchBlogPage;

    @FindBy(css = "div[class='post-title']")
    private List<WebElement> searchArticle;

    @FindBy(xpath = "//span[@class='label']")
    private List<WebElement> iconHeartActualValue;

    @FindBy(xpath = "//span[@class='label']")
    private WebElement iconHeartActualValueInside;

    @FindBy(xpath = "//span//i[@class='icon-heart-fa']")
    private WebElement iconHeartInside;

    @FindBy(className = "entry-title")
    private WebElement nameSelectedArtikel;

    public WebElement getNameSelectedArtikel() {
        return nameSelectedArtikel;
    }

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

    public List<WebElement> getArticlesHref() { return articlesHref; }

    public List<WebElement> getReadMore2() { return readMore2; }

    public WebElement getShareFacebook() { return shareFacebook; }

    public WebElement getIconTwitter() { return iconTwitter; }

    public WebElement getIconLinkedin() { return iconLinkedin; }

    public WebElement getSharePinteres() { return sharePinteres; }

    public WebElement getSearchBlogPage() { return searchBlogPage; }

    public List<WebElement> getSearchArtikels() { return searchArticle; }

    public List<WebElement> getIconHeartActualValue() { return iconHeartActualValue; }

    public WebElement getIconHeartActualValueInside() { return iconHeartActualValueInside; }

    public WebElement getIconHeartInside() { return iconHeartInside; }
}
