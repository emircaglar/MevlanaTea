package stepDefinitions;

import cucumber.api.java.en.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;
import pages.Blog;
import utils.Drivers;

public class BlogFunctionality {
    private Blog b;
    private String random_href;
    private int random_integer_value;
    private String like_number;
    private String search_value;
    private WebDriverWait wait;

    public BlogFunctionality(Blog b) {
        this.b = b;
        wait = new WebDriverWait(Drivers.getDriver(), 15);
    }

    @Then("^The user should be able to see the article$")
    public void theUserShouldBeAbleToSeeTheArticle() {
        b.assertUrl(random_href);
    }

    @And("^Click on one of the articles randomly$")
    public void clickOnOneOfTheArticlesRandomly() {
        random_integer_value = b.randomIndexForLists(b.getArticles_href());
        random_href = b.getArticles_href().get(random_integer_value).getAttribute("href");
        b.clickElement(b.getArticles_href().get(random_integer_value));
    }

    @And("^Hover over one of the images randomly$")
    public void hoverOverOneOfTheImagesRandomly() {
        random_integer_value = b.randomIndexForLists(b.getImage());
        b.hoverOverRandomlyOnAnElement(b.getImage().get(random_integer_value));
    }

    @And("^Click on the link button$")
    public void clickOnTheLinkButton() {
        random_href = b.getIconLink().get(random_integer_value).getText();
        b.clickElement(b.getIconLink().get(random_integer_value));
    }

    @And("^Click on one of the Mehr erfahren buttons randomly$")
    public void clickOnOneOfTheMehrErfahrenButtonsRandomly() {
        random_integer_value = b.randomIndexForLists(b.getArticles_href());
        random_href = b.getReadMore_2().get(random_integer_value).getAttribute("href");
        b.clickElement(b.getReadMore_2().get(random_integer_value));
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
        b.clickElement(b.getShare_facebook());
    }

    @And("^Click on the share on Twitter button$")
    public void clickOnTheShareOnTwitterButton() {
        b.clickElement(b.getIcon_twitter());
    }

    @And("^Click on the share on Pinterest button$")
    public void clickOnTheShareOnPinterestButton() {
        b.clickElement(b.getShare_pinteres());
    }

    @And("^Click on the share on Linked In button$")
    public void clickOnTheShareOnLinkedInButton() {
        b.clickElement(b.getIcon_linkedin());
    }

    @Then("^User should be able to see related articles$")
    public void userShouldBeAbleToSeeRelatedArticles() {
        for (WebElement e : b.getSearch_artikels()
        ) {
            if (e.getText().contains(search_value)) {
                break;
            }
        }
    }

    @And("^Send Tee to the Search input$")
    public void sendTeeToTheSearchInput() {
        if (Drivers.threadLanguage.get().equals("DE")) {
            search_value = "Tee";
            b.sendKeys(b.getSearch_blog_page(), search_value);
            b.options_actions(b.getSearch_blog_page(), Drivers.getDriver());
        } else if (Drivers.threadLanguage.get().equals("EN")) {
            search_value = "Tea";
            b.sendKeys(b.getSearch_blog_page(), search_value);
            b.options_actions(b.getSearch_blog_page(), Drivers.getDriver());
        } else {
            search_value = "Cay";
            b.sendKeys(b.getSearch_blog_page(), search_value);
            b.options_actions(b.getSearch_blog_page(), Drivers.getDriver());
        }
    }

    @And("^Click on the Zoom button$")
    public void clickOnTheZoomButton() {
        b.clickElement(b.getIconSearch().get(random_integer_value));
    }

    @Then("^The user should be able to see the same picture$")
    public void theUserShouldBeAbleToSeeTheSamePicture() {
        Assert.assertTrue(b.getImageZoom().getAttribute("src").trim().contains(".jpg"));
    }

    @And("^Click on one of the Like buttons randomly$")
    public void clickOnOneOfTheLikeButtonsRandomly() {
        random_integer_value = b.randomIndexForLists(b.getIconHeart());
        like_number = b.getIconHeart_actual_value().get(random_integer_value).getText();
        b.javaScriptClick(b.getIconHeart_actual_value().get(random_integer_value));
    }

    @Then("^The number of likes should be changed$")
    public void theNumberOfLikesShouldBeChanged() {
        for (int i = 0; i < b.getImage().size(); i++) {
            b.hoverOverRandomlyOnAnElement(b.getImage().get(i));
        }//I had to wait, that is why I have written the code

        Assert.assertNotEquals(b.getIconHeart_actual_value().get(random_integer_value).getText(), like_number);
    }

    @And("^Click on one of the Like buttons in the acticel page$")
    public void clickOnOneOfTheLikeButtonsInTheActicelPage() {
        like_number = b.getIconHeart_actual_value_inside().getText();
        b.javaScriptClick(b.getIconHeart_actual_value_inside());
    }

    @Then("^The number of likes should be changed in the artikel page$")
    public void theNumberOfLikesShouldBeChangedInTheArtikelPage() {
        wait.until(ExpectedConditions.not(ExpectedConditions.textToBe((By.xpath("//span[@class='label']")), b.getIconHeart_actual_value_inside().getText())));
        Assert.assertNotEquals(b.getIconHeart_actual_value_inside().getText(), like_number);
    }

    @And("^Click on the share on \"([^\"]*)\" button$")
    public void clickOnTheShareOnButton(String socialMedia) {
        switch (socialMedia) {
            case "Facebook":
                b.clickElement(b.getShare_facebook());
                break;
            case "Twitter":
                b.clickElement(b.getIcon_twitter());
                break;
            case "Linked":
                b.clickElement(b.getIcon_linkedin());
                break;
            case "Pinterest":
                b.clickElement(b.getShare_pinteres());
                break;
        }
    }

    @Then("^The user should be able to share the article on the \"([^\"]*)\"$")
    public void theUserShouldBeAbleToShareTheArticleOnThe(String newPage) {
        b.switchToNewTab();
        b.assertUrl(newPage);
    }
}

