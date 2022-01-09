package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Drivers;

public class Kontakt {

    public Kontakt() {
        PageFactory.initElements(Drivers.getDriver(), this);
    }

    //*****  EN icin  ****

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
    private WebElement sentMessage;

    @FindBy(className = "wpcf7-response-output")   // basarili ve basarisiz mesajlar ayni locatera sahip
    private WebElement failWarningMessage;


    //*****  DE icin  ****

    // @FindBy(xpath = "//span[contains(text(),'KONTAKT')]")
    @FindBy(xpath = "//a[@href='https://www.mevlanacay.de/kontakt/']/span")
    private WebElement kontaktHomeButton;

    @FindBy(xpath = "(//input[@type='text'])[2]")
    private WebElement kontaktNameInput;

    @FindBy(xpath = "//input[@type='email'")
    private WebElement kontaktEmailInput;

    @FindBy(xpath = "(//input[@type='text'])[3]")
    private WebElement kontaktBetreffInput;

    @FindBy(css = "span textarea")
    private WebElement kontaktNachrichtInput;

    @FindBy(xpath = "(//input[@type='submit'])[2]")
    private WebElement kontaktSendenButton;

    @FindBy(className = "wpcf7-response-output")  // basarili ve basarisiz mesajlar ayni locatera sahip
    private WebElement versandtMessage;

    @FindBy(className = "wpcf7-response-output")   // basarili ve basarisiz mesajlar ayni locatera sahip
    private WebElement fehlWarnungMessage;


    //*****  TR icin  ****

    //@FindBy(xpath = "//span[contains(text(),'İLETİŞİM')]")
    @FindBy(xpath = "//a[@href='https://www.mevlanacay.de/kontakt/']/span")
    private WebElement iletisimHomeButton;

    @FindBy(xpath = "(//input[@type='text'])[2]")
    private WebElement iletisimAdInput;

    @FindBy(xpath = "//input[@type='email'")
    private WebElement iletisimEpostaInput;

    @FindBy(xpath = "(//input[@type='text'])[3]")
    private WebElement iletisimKonuInput;

    @FindBy(css = "span textarea")
    private WebElement iletisimIletiInput;

    @FindBy(xpath = "(//input[@type='submit'])[2]")
    private WebElement iletisimGönderButton;

    @FindBy(className = "wpcf7-response-output")  // basarili ve basarisiz mesajlar ayni locatera sahip
    private WebElement gonderildiMesaji;

    @FindBy(className = "wpcf7-response-output")   // basarili ve basarisiz mesajlar ayni locatera sahip
    private WebElement basarisizUyariMesaji;









}
