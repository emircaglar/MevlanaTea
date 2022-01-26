Feature: Share on the Social Media


  Scenario Outline: Share the articles on social media
    When Click on the Blog button
    Then The user should be able to see the Blog Page
    And Click on one of the articles randomly
    Then The user should be able to see the article
    And Click on the share on "<Social Media>" button
    Then The user should be able to share the article on the "<New Page>"
    Examples:
      | Social Media | New Page  |
      | Facebook     | facebook  |
      | Twitter      | twitter   |
      | Pinterest    | pinterest |
      | Linked       | link      |
