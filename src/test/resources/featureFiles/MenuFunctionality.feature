Feature: Menu Functionality

  Scenario: Menu in desktop mode
    Given Click on the Produkte button
    Then The user should be able to see the Produkte Page
    And Click on the Home button
    Then The user should able to see the Home Page
    And Click on the Uber Uns button
    Then User should be able to see the Uber Uns Page
    And Click on the Blog button
    Then The user should be able to see the Blog Page
    And Click on the Kontakt button
    Then The user should be able to see the Kontakt Page
    Then Click on the Cart button
    Then The user should be able to see the Cart Page

  Scenario: Menu in mobil mode
    Given Click on the hamburger menu icon
    And Click on the Produkte button
    Then The user should be able to see the Produkte Page
    And Click on the hamburger menu icon
    And Click on the Home button
    Then The user should able to see the Home Page
    And Click on the hamburger menu icon
    And Click on the Uber Uns button
    Then User should be able to see the Uber Uns Page
    And Click on the hamburger menu icon
    And Click on the Blog button
    Then The user should be able to see the Blog Page
    And Click on the hamburger menu icon
    And Click on the Kontakt button
    Then The user should be able to see the Kontakt Page
    And Click on the hamburger menu icon
    And Click on the Cart button
    Then The user should be able to see the Cart Page