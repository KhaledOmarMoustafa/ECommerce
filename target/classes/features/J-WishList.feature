@regression

Feature: Add different products to the Wish list

  Scenario: user can different products to the wishlist
    Given user Open browser
    And   user Click the login button
    When  user Enters email"ziad.dawood@gmail.com"
    And   user Enters password"Ah2352352"
    And user Clicks on Login button
    And user Chooses Category
    And user go to The sub category
    And choose The first product
    And user Add item to the wish list
    And user choose Another category
    And choose the Second product
    And user Add another Item to the wish list
    Then user Click his wish list
    And user is redirected to the wish list page
    And browser is closed
