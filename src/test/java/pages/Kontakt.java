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

    @FindBy(css = "span textarea")
    private WebElement kontaktMessageInput;

    @FindBy(xpath = "(//input[@type='submit'])[2]")
    private WebElement kontaktSendButton;

    @FindBy(className = "wpcf7-response-output")  // basarili ve basarisiz mesajlar ayni locatera sahip
    private WebElement sentAndFailMessage;

    public WebElement getContactUsHomeButton() { return contactUsHomeButton; }

    public void setContactUsHomeButton(WebElement contactUsHomeButton) { this.contactUsHomeButton = contactUsHomeButton; }

    public WebElement getContactUsNameInput() { return contactUsNameInput; }

    public void setContactUsNameInput(WebElement contactUsNameInput) { this.contactUsNameInput = contactUsNameInput; }

    public WebElement getContactUsEmailInput() {return contactUsEmailInput; }

    public void setContactUsEmailInput(WebElement contactUsEmailInput) { this.contactUsEmailInput = contactUsEmailInput; }

    public WebElement getContactUsSubjectInput() { return contactUsSubjectInput; }

    public void setContactUsSubjectInput(WebElement contactUsSubjectInput) { this.contactUsSubjectInput = contactUsSubjectInput; }

    public WebElement getKontaktMessageInput() { return kontaktMessageInput; }

    public void setKontaktMessageInput(WebElement kontaktMessageInput) { this.kontaktMessageInput = kontaktMessageInput; }

    public WebElement getKontaktSendButton() { return kontaktSendButton; }

    public void setKontaktSendButton(WebElement kontaktSendButton) { this.kontaktSendButton = kontaktSendButton; }

    public WebElement getSentAndFailMessage() { return sentAndFailMessage; }

    public void setSentAndFailMessage(WebElement sentAndFailMessage) { this.sentAndFailMessage = sentAndFailMessage; }
}
