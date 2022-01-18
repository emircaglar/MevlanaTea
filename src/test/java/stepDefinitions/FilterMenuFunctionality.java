package stepDefinitions;

import cucumber.api.DataTable;
import cucumber.api.java.en.*;
import org.openqa.selenium.support.ui.Select;
import pages.Home;
import pages.Products;
import java.util.List;

public class FilterMenuFunctionality {

    Products products;
    Home hm;

    public FilterMenuFunctionality(Products products){
        this.products = products;
    }

    @Then("^Click to the Teezubehör Button$")
    public void clickToTheTeezubehörButton() {
        products.getTeezubehörButton().click();
    }

    @And("^Click on the filter button$")
    public void clickOnTheFilterButton() {
        products.getFilterBtn().click();
    }

    @Then("^Click on the filtering type$")
    public void clickOnTheFilteringType(DataTable elements)  {

        List<String> listElement=elements.asList(String.class);
        
        for (int i = 0; i < listElement.size(); i++) {

            Select a= new Select(products.getFilterMenu());
            a.selectByValue(listElement.get(i));
            products.getFilterBtn().click();
            products.assertUrl(listElement.get(i));
        }

    }
}
