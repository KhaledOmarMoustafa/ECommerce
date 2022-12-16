
Feature: user create his first successful order

  Scenario: user create order
    Given User Open Browser
    And   user Click the login Button
    When  User Enters Email"ast.syss@gmail.com"
    And   User Enters Password"Ah2352352"
    And User Clicks on Login Button
    And User click on shopping cart
    And user Agrees on terms
    And user Click checkout
    And user select a country
    And user Enters a city"Disney"
    And user enters address"DisneyLand"
    And user enter a zip code"12345"
    And user enters a phone number"0123456789"
    And user click on continue
    And user choose the shipping method
    And user clicks on continue
    And Choose The payment Method
    And user click on continue again
    And Click on continue for last time
    And click on confirm
    Then user is redirected to the confirmation screen and get the order number
    And Close the Browser