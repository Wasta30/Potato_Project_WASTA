@wip
Feature: Logout functionality

  @UPGNX10-283
  Scenario: AC1- User can log out and ends up in login page.
    When user goes to the Login page
    And  user enters valid email "salesmanager15@info.com" and valid password "salesmanager"
    And user clicks login button or presses enter
    And  user is on the Home page
    Then user clicks on the username button top right of the screen.
    Then user clicks on the log out button


  @UPGNX10-284
  Scenario:AC2- The user can not go to the home page again by clicking the step back button after successfully logged out.
    When user goes to the Login page
    And  user enters valid email "salesmanager15@info.com" and valid password "salesmanager"
    And user clicks login button or presses enter
    And  user is on the Home page
    Then user clicks on the username button top right of the screen.
    Then user clicks on the log out button
    Then user is on the login page
    Then user clicks on step back button



  @UPGNX10-307
  Scenario: AC3
    When user goes to the Login page
    And user enters valid email "salesmanager15@info.com" and valid password "salesmanager"
    And user clicks login button or presses enter
    And user is on the Home page
    Then user clicks on the username button top right of the screen.
    Then user clicks on the log out button
    Then user is on the login page
