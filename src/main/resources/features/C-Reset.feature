@regression
Feature: User Try to reset his password

  Scenario: user enter a valid email but he forgets his password and try to reset it
    Given open the browser and go to the home page
    And   click on login
    When Entering his Email"ziad.dawood@gmail.com"
    And click on ForgotPassword
    And user Enter His email"ziad.dawood@gmail.com"
    And User click recover
    Then a message appears to the user to reset his Password

    And user exit the browser