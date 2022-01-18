Feature: Blog Like Functionality



  Scenario: The User like the articel
    When Click on the Blog button
    Then The user should be able to see the Blog Page
    And Click on one of the Like buttons randomly
    Then The number of likes should be changed


  Scenario: The User like the articel in the articel page
    When Click on the Blog button
    Then The user should be able to see the Blog Page
    And Click on one of the articles randomly
    Then The user should be able to see the article
    And Click on one of the Like buttons in the acticel page
    Then The number of likes should be changed in the artikel page