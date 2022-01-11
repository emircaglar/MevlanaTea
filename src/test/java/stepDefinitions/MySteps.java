package stepDefinitions;

import org.openqa.selenium.Dimension;
import utils.Drivers;

public class MySteps {
    public static void main(String[] args) {
        Drivers.getDriver().manage().window().setSize(new Dimension(360, 640));
      Drivers.getDriver().get("https://mevlanacay.de/tr/");
    }
}
