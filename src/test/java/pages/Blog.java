package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Drivers;

import java.util.List;

public class Blog {

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

    @FindBy(xpath= "//span//i[@class='icon-heart-fa']")
    private List<WebElement> iconHeart;

    @FindBy(xpath= "//div//i[@class='icon-doc-text']")
    private List<WebElement> readMore;

    @FindBy(xpath= "//a//div[@class='mask']")
    private List<WebElement> image;

    @FindBy(xpath= "//img[@class='mfp-img']")
    private WebElement imageZoom;

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
}
