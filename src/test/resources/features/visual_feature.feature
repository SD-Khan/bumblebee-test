Feature: Visual Test Feature

  Scenario: Click Start User Register Button to open Registration Form
    When Click on start register button
    """
    visual
    """

  Scenario:  Enter the user information in Register form
    When Click and enter the Username
    Then Click and enter the email
    """
    visual
    """
    Then Click and enter the password
    Then Click and enter the full name

  Scenario:  Click submit button to Register User
    When click on submit user button