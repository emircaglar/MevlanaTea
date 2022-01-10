package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Drivers;

public class Kontakt {

    public Kontakt() {
        PageFactory.initElements(Drivers.getDriver(), this);
    }

    //@FindBy(xpath = "//span[contains(text(),'CONTACT US')]")
    @FindBy(xpath = "//a[@href='https://www.mevlanacay.de/kontakt/']/span")
    private WebElement contactUsHomeButton;

    @FindBy(xpath = "(//input[@type='text'])[2]")
    private WebElement contactUsNameInput;

    @FindBy(xpath = "//input[@type='email'")
    private WebElement contactUsEmailInput;

    @FindBy(xpath = "(//input[@type='text'])[3]")
    private WebElement contactUsSubjectInput;

    @FindBy(css = "span>textarea")
    private WebElement contactMessageInput;

    @FindBy(xpath = "(//input[@type='submit'])[2]")
    private WebElement contactSendButton;

    @FindBy(className = "wpcf7-response-output")  // basarili ve basarisiz mesajlar ayni locatera sahip
    private WebElement sentAndFailMessage;


    public WebElement getContactUsHomeButton() {
        return contactUsHomeButton;
    }

    public WebElement getContactUsNameInput() {
        return contactUsNameInput;
    }

    public WebElement getContactUsEmailInput() {
        return contactUsEmailInput;
    }

    public WebElement getContactUsSubjectInput() {
        return contactUsSubjectInput;
    }

    public WebElement getKontaktMessageInput() {
        return contactMessageInput;
    }

    public WebElement getKontaktSendButton() {
        return contactSendButton;
    }

    public WebElement getSentAndFailMessage() {
        return sentAndFailMessage;
    }

}
