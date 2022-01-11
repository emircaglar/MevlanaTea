Feature: Language Button Functionality
  Scenario Outline: Language Button Test
    Given Hover over the Language Button
    And Select  "<language>" from the options
    Then The user should be able to see the web Page in selected "<language>"
    Examples:
      | language |