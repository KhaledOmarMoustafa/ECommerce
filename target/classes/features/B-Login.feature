@regression
Feature: User can login with valid email and password

  Scenario: User Enter A valid Email and Password and will be able to login
    Given user open the browser and go to the home page
    And   user click on login
    When Entering the Email"ziad.dawood@gmail.com"
    And Entering the Password"Ah2352352"
    And user click login
    Then User is Able to login and redirected to the home page
    And user quits the Browser
