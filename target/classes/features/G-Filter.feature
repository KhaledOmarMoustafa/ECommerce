@regression

Feature: Filter By the Color

  Scenario: user can filter his search by color
    Given open the browser
    And   click on the login button
    When  Email"ziad.dawood@gmail.com"
  And   Password"Ah2352352"
    And click login button
    And user choose category
    And user choose a sub category
    And user Choose a color
    Then page is filtered by color

    And user close the Browser