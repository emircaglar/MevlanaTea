package stepDefinitions;

import cucumber.api.java.en.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;
import pages.Blog;
import utils.Drivers;

public class BlogFunctionality {
    private Blog b;
    private String randomHref;
    private int randomIntegerValue;
    private String likeNumber;
    private String searchValue;
    private WebDriverWait wait;

    public BlogFunctionality(Blog b) {
        this.b = b;
        wait = new WebDriverWait(Drivers.getDriver(), 15);
    }

    @Then("^The user should be able to see the article$")
    public void theUserShouldBeAbleToSeeTheArticle() {
        b.assertUrl(randomHref);
    }

    @And("^Click on one of the articles randomly$")
    public void clickOnOneOfTheArticlesRandomly() {
        randomIntegerValue = b.randomIndexForLists(b.getArticlesHref());
        randomHref = b.getArticlesHref().get(randomIntegerValue).getAttribute("href");
        b.clickElement(b.getArticlesHref().get(randomIntegerValue));
    }

    @And("^Hover over one of the images randomly$")
    public void hoverOverOneOfTheImagesRandomly() {
        randomIntegerValue = b.randomIndexForLists(b.getImage());
        b.hoverOverRandomlyOnAnElement(b.getImage().get(randomIntegerValue));
    }

    @And("^Click on the link button$")
    public void clickOnTheLinkButton() {
        randomHref = b.getIconLink().get(randomIntegerValue).getText();
        b.clickElement(b.getIconLink().get(randomIntegerValue));
    }

    @And("^Click on one of the Mehr erfahren buttons randomly$")
    public void clickOnOneOfTheMehrErfahrenButtonsRandomly() {
        randomIntegerValue = b.randomIndexForLists(b.getArticlesHref());
        randomHref = b.getReadMore2().get(randomIntegerValue).getAttribute("href");
        b.clickElement(b.getReadMore2().get(randomIntegerValue));
    }

    @And("^Click on the Next Page button$")
    public void clickOnTheNextPageButton() {
        b.clickElement(b.getNextPage());
    }

    @Then("^The user should be able to see the articles on the next page$")
    public void theUserShouldBeAbleToSeeTheArticlesOnTheNextPage() {
        b.assertUrl("page");
    }

    @And("^Click on the share on Facebook button$")
    public void clickOnTheShareOnFacebookButton() {
        b.clickElement(b.getShareFacebook());
    }

    @And("^Click on the share on Twitter button$")
    public void clickOnTheShareOnTwitterButton() {
        b.clickElement(b.getIconTwitter());
    }

    @And("^Click on the share on Pinterest button$")
    public void clickOnTheShareOnPinterestButton() {
        b.clickElement(b.getSharePinteres());
    }

    @And("^Click on the share on Linked In button$")
    public void clickOnTheShareOnLinkedInButton() {
        b.clickElement(b.getIconLinkedin());
    }

    @Then("^User should be able to see related articles$")
    public void userShouldBeAbleToSeeRelatedArticles() {
        for (WebElement e : b.getSearchArtikels()
        ) {
            if (e.getText().contains(searchValue)) {
                break;
            }
        }
    }

    @And("^Send Tee to the Search input$")
    public void sendTeeToTheSearchInput() {
        if (Drivers.threadLanguage.get().equals("DE")) {
            searchValue = "Tee";
            b.sendKeys(b.getSearchBlogPage(), searchValue);
            b.optionsActions(b.getSearchBlogPage(), Drivers.getDriver());
        } else if (Drivers.threadLanguage.get().equals("EN")) {
            searchValue = "Tea";
            b.sendKeys(b.getSearchBlogPage(), searchValue);
            b.optionsActions(b.getSearchBlogPage(), Drivers.getDriver());
        } else {
            searchValue = "Cay";
            b.sendKeys(b.getSearchBlogPage(), searchValue);
            b.optionsActions(b.getSearchBlogPage(), Drivers.getDriver());
        }
    }

    @And("^Click on the Zoom button$")
    public void clickOnTheZoomButton() {
        b.clickElement(b.getIconSearch().get(randomIntegerValue));
    }

    @Then("^The user should be able to see the same picture$")
    public void theUserShouldBeAbleToSeeTheSamePicture() {
        Assert.assertTrue(b.getImageZoom().getAttribute("src").trim().contains(".jpg"));
    }

    @And("^Click on one of the Like buttons randomly$")
    public void clickOnOneOfTheLikeButtonsRandomly() {
        randomIntegerValue = b.randomIndexForLists(b.getIconHeart());
        likeNumber = b.getIconHeartActualValue().get(randomIntegerValue).getText();
        b.javaScriptClick(b.getIconHeartActualValue().get(randomIntegerValue));
    }

    @Then("^The number of likes should be changed$")
    public void theNumberOfLikesShouldBeChanged() {
        wait.until(ExpectedConditions.not(ExpectedConditions.textToBePresentInElement(b.getIconHeartActualValue().get(randomIntegerValue), likeNumber)));
        Assert.assertNotEquals(b.getIconHeartActualValue().get(randomIntegerValue).getText(), likeNumber);
    }

    @And("^Click on one of the Like buttons in the acticel page$")
    public void clickOnOneOfTheLikeButtonsInTheActicelPage() {
        likeNumber = b.getIconHeartActualValueInside().getText();
        b.javaScriptClick(b.getIconHeartActualValueInside());
    }

    @Then("^The number of likes should be changed in the artikel page$")
    public void theNumberOfLikesShouldBeChangedInTheArtikelPage() {
        wait.until(ExpectedConditions.not(ExpectedConditions.textToBe((By.xpath("//span[@class='label']")), b.getIconHeartActualValueInside().getText())));
        Assert.assertNotEquals(b.getIconHeartActualValueInside().getText(), likeNumber);
    }

    @And("^Click on the share on \"([^\"]*)\" button$")
    public void clickOnTheShareOnButton(String socialMedia) {
        switch (socialMedia) {
            case "Facebook":
                b.clickElement(b.getShareFacebook());
                break;
            case "Twitter":
                b.clickElement(b.getIconTwitter());
                break;
            case "Linked":
                b.clickElement(b.getIconLinkedin());
                break;
            case "Pinterest":
                b.clickElement(b.getSharePinteres());
                break;
        }
    }

    @Then("^The user should be able to share the article on the \"([^\"]*)\"$")
    public void theUserShouldBeAbleToShareTheArticleOnThe(String newPage) {
        b.switchToNewTab();
        b.assertUrl(newPage);
    }
}

