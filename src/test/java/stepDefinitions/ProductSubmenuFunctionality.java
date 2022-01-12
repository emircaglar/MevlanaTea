package stepDefinitions;

import cucumber.api.java.en.*;
import pages.Home;

public class ProductSubmenuFunctionality {

    Home hm;
    public ProductSubmenuFunctionality (Home hm) {
        this.hm = hm;
    }

    @Given("^Hover over the Product Button$")
    public void hover_over_the_Product_Button() {
        hm.hoverOverRandomlyOnAnElement(hm.getHome_page_Product());
    }

    @Then("^Click on the sub menus of the Product Button$")
    public void click_on_the_sub_menus_of_the_Product_Button() {

        // This place is half done because of the update.

    }

}
