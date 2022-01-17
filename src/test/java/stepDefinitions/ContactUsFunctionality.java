package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import pages.Kontakt;
import utils.Drivers;

public class ContactUsFunctionality {

    Kontakt kt;

    public ContactUsFunctionality(Kontakt kt) {
        this.kt = kt;
    }


    @When("Type in the Name input")
    public void typeInTheNameInput(String inputName) throws InterruptedException {

        kt.sendKeys(kt.getContactUsNameInput(), inputName);
        Thread.sleep(200);

    }

    @And("Type in the Email input")
    public void typeInTheEmailInput(String inputEmail) throws InterruptedException {

        kt.sendKeys(kt.getContactUsEmailInput(), inputEmail);
        Thread.sleep(200);

    }

    @And("Type in the Subject input")
    public void typeInTheSubjectInput(String inputSubject) throws InterruptedException {

        kt.sendKeys(kt.getContactUsSubjectInput(), inputSubject);
        Thread.sleep(200);

    }

    @And("Type in the Description input")
    public void typeInTheDescriptionInput(String inputDescription) throws InterruptedException {

        kt.sendKeys(kt.getKontaktMessageInput(), inputDescription);
        Thread.sleep(200);

    }

    @And("Click on the Senden Button")
    public void clickOnTheSendenButton() throws InterruptedException {

        kt.clickElement(kt.getKontaktSendButton());
        Thread.sleep(200);

    }


    @Then("should be verify")
    public void shouldBeVerify(String messageDE, String messageTR, String messageEN) {


        kt.waitUntilVisible(kt.getSentAndFailMessage());

        switch (Drivers.threadLanguage.get()) {
            case "DE":
                Assert.assertEquals(messageDE, kt.getSentAndFailMessage().getText());
                break;
            case "TR":
                Assert.assertEquals(messageTR, kt.getSentAndFailMessage().getText());
                break;
            case "EN":
                Assert.assertEquals(messageEN, kt.getSentAndFailMessage().getText());
                break;


        }
    }

}