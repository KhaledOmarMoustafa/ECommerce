@regression
Feature: user can search for any product and swicth between currencies and select different categories


  #Scenario 1
  Scenario: user can search for any product
    Given user open the browser
    And   user click on the login button
    When user Enters the Email"ziad.dawood@gmail.com"
    And user Enters the Password"Ah2352352"
    And user click login button
    And  redirected to the home page
    And user click on search
    And user enter his search"HTC One M8 Android L 5.0 Lollipop"
    And user click on search Button
    Then user is redirected to what he searched for
    And User close the browser




