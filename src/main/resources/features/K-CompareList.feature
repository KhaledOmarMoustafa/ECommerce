@regression

Feature: Add different products to the compare list

  Scenario: user can different products to the Compare list
    Given  User Open browser
    And   User Click the login button
    When  User Enters email"ziad.dawood@gmail.com"
    And   User Enters password"Ah2352352"
    And User Clicks on Login button
    And User Chooses Category
    And User choose the sub category
    And Choose The first product
    And user Add item to the Compare list
    And User choose Another category
    And User go to The sub category
    And Choose the Second product
    And user Add another Item to the compare list
    Then user Click his compare list
    And user is redirected to the compare list page
    And Close the browser
