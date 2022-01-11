package utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.Home;

import java.time.Duration;
import java.util.List;


public class Parent {

    WebDriverWait wait;
    JavascriptExecutor js;
    Actions actions;
    static WebDriver driver;

    public void clickElement(WebElement element) { // scrolls to element and click on it
        scrollToElement(element);
        waitUntilClickable(element);
        element.click();
    }

    public void scrollToElement(WebElement element) { // scrolls to element
        js = (JavascriptExecutor) Drivers.getDriver();
        js.executeScript("arguments[0].scrollIntoView(false);", element);
    }

    public void waitUntilClickable(WebElement element) { // waits until the element to be able to be clicked
        wait = new WebDriverWait(Drivers.getDriver(), 15);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void waitUntilVisible(WebElement element) { // waits until the element to be able to be seen
        wait = new WebDriverWait(Drivers.getDriver(), 15);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void sendKeys(WebElement element, String input) { // scrolls to element, clears the previous input and sends the new input
        scrollToElement(element);
        waitUntilVisible(element);
        element.clear();
        element.sendKeys(input);
    }

    public void assertMessage(WebElement element, String message) { // asserts a webelement's text contains message
        waitUntilVisible(element);
        Assert.assertTrue(element.getText().trim().contains(message));
    }

    public void assertUrl(String urlPart) { // asserts if the url contains a String
        Assert.assertTrue(Drivers.getDriver().getCurrentUrl().contains(urlPart));
    }

    public int randomIndexForLists(List<WebElement> list) { // generates random index
        return (int) (Math.random() * list.size());
    }

    public void clickRandomlyFromAList(List<WebElement> list) { // clicks an element from a list randomly
        list.get(randomIndexForLists(list)).click();
    }

    public void hoverOverRandomlyOnAnElement(List<WebElement> list) { // hovers over an element of a list randomly
        actions = new Actions(Drivers.getDriver());
        actions.moveToElement(list.get(randomIndexForLists(list))).build().perform();
    }

    public void hoverOverRandomlyOnAnElement(WebElement element) { // hovers over an element
        actions = new Actions(Drivers.getDriver());
        actions.moveToElement(element).build().perform();
    }

    public void javaScriptClick(WebElement element){
        scrollToElement(element);
        waitUntilClickable(element);
        JavascriptExecutor executor = (JavascriptExecutor) Drivers.getDriver();
        executor.executeScript("arguments[0].click();", element);
    }

    public static void urlgit(String language){
        driver = Drivers.getDriver();
        switch (language) {
            case "TR":
                driver.get("https://www.mevlanacay.de/tr");
                break;
            case "EN":
                driver.get("https://www.mevlanacay.de/en");
                break;
            case "DE":
                driver.get("https://www.mevlanacay.de/");
                break;
        }
        Home hm=new Home();
        hm.waitUntilVisible(hm.getHome_cookise_accept());
        hm.clickElement(hm.getHome_cookise_accept());
    }
}
