Feature: Product Review Functionality

  Scenario: TC_0901
    Given Click on the Produkte button
    And  Click on one of the products randomly which is in the stocks
    And  Click on the Beschreibung button
    And  The user should be able to see the productDescriptionArticle
    And  Click on the Zusatzliche Informationen button
    And  The user should be able to see the ZusatzlicheInformationen
    And  Click on the Bewertungen button
    Then The user should be able to see the Bewertungen

  Scenario: TC_0902
    Given Click on the Produkte button
    And  Click on one of the products randomly which is in the stocks
    And  Click on the Bewertungen button
    And  Click on one of the Deine Bewentung randomly
    And  Fill the Deine Rezension field with "Bu urun mukemmel"
    And Fill the name field with "recep"
    And Fill the e-mail field
    And Click on the Sendenn Button
    And  Click on the Bewertungen button
    Then User should be able to see the "Dein Kommentar wartet auf Freischaltung" message
