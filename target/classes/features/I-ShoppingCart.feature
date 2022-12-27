@regression

Feature: Add different products to the shopping cart

  Scenario: user can different products to the shopping cart
    Given user open browser
    And   user click the login button
    When  user Enters Email"ziad.dawood@gmail.com"
    And   user Enters Password"Ah2352352"
    And user Clicks on login button
    And user Chooses category
    And choose the first product
    And user Add item
    And user choose another category
    And user go to the sub category
    And choose the second product
    And user Add another Item
    Then user click his shopping cart
    And user is redirected to the shopping cart
    And close the browser
