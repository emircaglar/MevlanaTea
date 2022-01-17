Feature: In Blog Different Language

  Scenario: search on the sub menu of Blog page
    When Click on the Blog button
    Then The user should be able to see the Blog Page
    And Click on one of the articles randomly
    Then The user should be able to see the article
    And Send Tee to the Search input
    Then User should be able to see related articles