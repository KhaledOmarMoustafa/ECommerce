@regression

Feature: Select category then hover and open sub category if found

Scenario: user can access any category and sub category
Given user opens the browser
And   user clicks on the login button
When  Enter the Email"ziad.dawood@gmail.com"
And   Enters the Password"Ah2352352"
And user clicks login button
Then user click on any sub-category
And user redirected to the sub category page
And user close The browser