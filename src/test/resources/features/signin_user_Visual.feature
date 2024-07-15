Feature: Register User Feature

  Scenario: Click on Sign In button to navigate to Sign In Screen
    When Click on Sign In button

  Scenario:  Provide Username and Password to Sign In

    When Click and enter the Username
    Then Click and enter the password
    Then Click on Sign In button to Sign In
    Then Verify you are on Home Page

  Scenario: Click on Profile Button to Logout

    When Click on Profile button
    Then Click on Logout button to Logout
    Then Verify you have landed on the Login Screen



