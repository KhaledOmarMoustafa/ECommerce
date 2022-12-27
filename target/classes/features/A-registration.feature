
@regression
Feature: User could register with valid data

  Background: User Open the Browser And Go To The Home Page And Then Click On Registration
    Given user open browser and go to home page
    When user click on Register

  #test scenario 1


  Scenario: User Could register with valid email and password
    And choose the gender
    And enter his first name"ziad"
    And enter his last name"dawood"
    And enter his date of birth
    And enter his email"ziad.dawood@gmail.com"
    And enter his company name"bestSeller1"
    And enter his password"Ah2352352"
    And confirm his password"Ah2352352"
 Then user registered successfuly
    And user go to home page
   