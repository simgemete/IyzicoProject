@UI

Feature: Iyzico

  @Iyzico
  Scenario: Iyzico Test
    And The user opens the URL
    And The user clicks on the second product
    And The user clicks on the Add to Basket button
    And The user clicks on the Show Basket button
    And The user clicks on the Go to Payment Page button
    And The user selects the Debit or Credit Card option
    And The user clicks on the Pay with Debit or Credit Card button
    And The user fills in the required fields with random values
    And The user clicks on the Pay button
    Then The user verifies the Siparis Alındı text


