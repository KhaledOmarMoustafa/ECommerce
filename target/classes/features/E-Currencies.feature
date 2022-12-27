@regression
Feature: Switch Currency
      #scenario 2
  Scenario: Logged user could switch between any currencies US-euro
    Given user opens browser


    And user login
    When user Enter the Email"ziad.dawood@gmail.com"
    And user Enter the Password"Ah2352352"

    And user clicks login
    And click currencies
    Then choose the Euro currency
    And user Close the browser
