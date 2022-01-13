
Feature: Subscribe To The Company's Newsletter

  Scenario Outline: The user should be able to subscribe to the company's newsletter from "DE" page
    Given Type an "<e-mail>" into the email input on the top of the page
    And Click on the Jetzt abonnieren button
    Then The user should see the error alert with invalid e-mail or success message with valid e-mail
    Examples:
      | e-mail               |
      | test@email           |
      | test@                |
      | test                 |
      |                      |
      | randomtest@gmail.com |

  Scenario Outline: The user should be able to subscribe to the company's newsletter from "DE" page
    Given Type an "<e-mail>" into the email input on the bottom of the page
    And Click on the Jetzt abonnieren button
    Then The user should see the error alert with invalid e-mail or success message with valid e-mail
    Examples:
      | e-mail               |
      | test@email           |
      | test@                |
      | test                 |
      |                      |
      | randomtest@gmail.com |

  Scenario Outline: The user should be able to subscribe to the company's newsletter from "TR" page
    Given Type an "<e-mail>" into the email input on the top of the page
    And Click on the  Abone Ol button
    Then The user should see the error alert with invalid e-mail or success message with valid e-mail
    Examples:
      | e-mail               |
      | test@email           |
      | test@                |
      | test                 |
      |                      |
      | randomtest@gmail.com |

  Scenario Outline: The user should be able to subscribe to the company's newsletter from "TR" page
    Given Type an "<e-mail>" into the email input on the botoom of the page
    And Click on the  Abone Ol button
    Then The user should see the error alert with invalid e-mail or success message with valid e-mail
    Examples:
      | e-mail               |
      | test@email           |
      | test@                |
      | test                 |
      |                      |
      | randomtest@gmail.com |