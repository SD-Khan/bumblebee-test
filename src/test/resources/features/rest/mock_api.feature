Feature: Mock testing Feature

  Scenario: Create an employee data
    When Create a new user

  Scenario: Update existing employee data
    When Update the user information

  Scenario: Deleting the user
    When Delete the user
    Then Get all users
    And Validate the user is deleted

