Feature: Subscribe To The Company's Newsletter

  Scenario Outline: The user should be able to subscribe to the company's newsletter
    Given Type an "<e-mail>" into the email input on the top of the page
    And Click on the Jetzt abonnieren button
    Then The user should see the error alert with invalid "<e-mail>" or success message with valid e-mail for top registration
    Examples:
      | e-mail                |
      | test@email            |
      | test@                 |
      | test                  |
      |                       |
      | randomtest3@gmail.com |

  Scenario Outline: The user should be able to subscribe to the company's newsletter
    Given Type an "<e-mail>" into the email input on the bottom of the page
    And Click on the registrieren button
    Then The user should see the error alert with invalid "<e-mail>" or success message with valid e-mail for bottom registration
    Examples:
      | e-mail                |
      | test@email            |
      | test@                 |
      | test                  |
      |                       |
      | randomtest1@gmail.com |