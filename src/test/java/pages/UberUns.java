package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Drivers;

import java.util.List;

public class UberUns {

    public UberUns() {
        PageFactory.initElements(Drivers.getDriver(), this);
    }

    @FindBy(xpath = "//iframe[contains(@title,'Mevlana')]")
    private List<WebElement> iframeList;

    @FindBy(css = "button[class='play rounded-box state-paused']")
    private List<WebElement> buttonPlayVideoList;

    @FindBy(css = "div[class='focus-target']")
    private WebElement progressBar;

    @FindBy(css = "div[class='loaded']") //video açmasak da bu elementten 1 tane var ama nerede olduğu belli değil!
    private WebElement loadedBar;

    @FindBy(css = "div[class='played']") // 18 tane element çıkıyor
    private List<WebElement> playedBarList;



    /*
    ------------------------GETTERS-------------------------------------
     */

    public List<WebElement> getIframeList() {
        return iframeList;
    }

    public List<WebElement> getButtonPlayVideoList() {
        return buttonPlayVideoList;
    }

    public WebElement getProgressBar() {
        return progressBar;
    }

    public WebElement getLoadedBar() {
        return loadedBar;
    }

    public List<WebElement> getPlayedBarList() {
        return playedBarList;
    }
}
