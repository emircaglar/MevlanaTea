Feature: Blog page

 Background:
   When Click on the Blog button
   Then The user should be able to see the Blog Page

  Scenario: In Blog page read a artikel
    And Click on one of the articles randomly
    Then The user should be able to see the article
    And Click on the Blog button
    Then The user should be able to see the Blog Page
    And Click on one of the Mehr erfahren buttons randomly
    Then The user should be able to see the article
    And Click on the Blog button
    Then The user should be able to see the Blog Page
    And Hover over one of the images randomly
    And Click on the link button
    Then The user should be able to see the article



  Scenario: Zoom option
    And Hover over one of the images randomly
    And Click on the Zoom button
    Then The user should be able to see the same picture


  Scenario:Other page
    And Click on the Next Page button
    Then The user should be able to see the articles on the next page




