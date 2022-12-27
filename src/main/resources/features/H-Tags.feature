@regression

Feature: Filter By the Tags

  Scenario: user can filter his search by Tags
    Given opens the browser
    And   clicks on the login button
    When  user Email"ziad.dawood@gmail.com"
    And   user Password"Ah2352352"
    And user clicks on login button
    And user chooses category
    And user chooses a sub category
    And user Chooses a tag
    Then page is filtered by Tag
    And User Close the browser
