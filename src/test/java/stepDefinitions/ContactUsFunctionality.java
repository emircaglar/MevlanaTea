package stepDefinitions;

import cucumber.api.java.en.*;
import pages.Kontakt;


public class ContactUsFunctionality {

    Kontakt kt;

    public ContactUsFunctionality(Kontakt kt) {
        this.kt = kt;
    }


    @When("^Type in the Name input \"([^\"]*)\"$")
    public void typeInTheNameInput(String inputName)  {

        kt.sendKeys(kt.getContactUsNameInput(), inputName);

    }

    @And("^Type in the Email input \"([^\"]*)\"$")
    public void typeInTheEmailInput(String inputEmail) {

        kt.sendKeys(kt.getContactUsEmailInput(), inputEmail);

    }

    @And("^Type in the Subject input \"([^\"]*)\"$")
    public void typeInTheSubjectInput(String inputSubject) {

        kt.sendKeys(kt.getContactUsSubjectInput(), inputSubject);

    }

    @And("^Type in the Description input \"([^\"]*)\"$")
    public void typeInTheDescriptionInput(String inputDescription) {

        kt.sendKeys(kt.getKontaktMessageInput(), inputDescription);
    }

    @And("Click on the Senden Button")
    public void clickOnTheSendenButton(){

        kt.clickElement(kt.getKontaktSendButton());
    }

    @Then("^\"([^\"]*)\" ,\"([^\"]*)\",\"([^\"]*)\"should be verify$")
    public void shouldBeVerify(String messageDE, String messageTR, String messageEN) {

        kt.waitUntilVisible(kt.getSentAndFailMessage());
        kt.assertMessage(kt.getSentAndFailMessage(),messageDE,messageTR,messageEN);

    }
}