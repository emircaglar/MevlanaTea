Feature:Product Functionality

  Scenario: TC_0802
    Given Click on the Produkte button
    And Click on one of the products randomly which is in the stocks
    When Click on the In den Warenkorb button
    Then The product should have been added to the cart


  Scenario:TC_0803
    Given Click on the Produkte button
    And Click on one of the products randomly which is in the stocks
    And Change the number of the product randomly less than the number in the stocks
    When Click on the In den Warenkorb button
    Then The correct number of the product should have been added to the cart

  Scenario:TC_080?
    Given Click on the Produkte button
    When Click on one of the products randomly which is in the out of stocks
    Then The out of stock message should be seen

  Scenario: TC_0804
    Given Click on the Produkte button
    And Click on one of the products randomly which is in the stocks
    And Change the number of the product randomly less than the number in the stocks
    And Click on the In den Warenkorb button
    When Click on the In den Warenkorb aktualisieren button
    Then The user should be able to update the cart

  Scenario: TC_0805

    Given Click on the Produkte button
    And Click on one of the products randomly which is in the stocks
    And Change the number of the product randomly less than the number in the stocks
    And Click on the In den Warenkorb button
    When  Click on the X button
    Then The user should be able to delete the product from the cart

  Scenario: TC_0806
    Given Click on the Produkte button
    And Hover over one of the products' image randomly which is in the stocks
    When Click on the link button
    Then The user should be able to see the product details

  Scenario: TC_0807

    Given Click on the Produkte button
    And Hover over one of the products' image randomly which is in the stocks
    When Click on the Cart icon
    Then The product should have been added to the cart

  Scenario: TC_0808
    Given Click on the Produkte button
    And Hover over one of the products' image randomly which is in the stocks
    And Click on the Cart icon
    And Click on the X button
    When Click on the Rückgängig button
    Then The user should be able to readd the product to the cart

  Scenario: TC_0809

    Given Click on the Produkte button
    And Hover over one of the products' image randomly which is in the stocks
    And Click on the Cart icon
    When Click on the Weiter einkaufen button
    Then The user should be able to see the Produkte Page