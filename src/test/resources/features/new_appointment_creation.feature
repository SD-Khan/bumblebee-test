Feature: New Appointment Creation Feature

  Scenario: Click on Sign In button to navigate to Sign In Screen
    When Click on Sign In button

  Scenario: Provide Username and Password to Sign In
    When Click and enter the Username
    Then Click and enter the password
    Then Click on Sign In button to Sign In
    Then Verify you are on Home Page

  Scenario: Click on Appointments Button to Create a New Appointment
    When Click on Appointments button
    Then Verify you are on Appointments Page

  Scenario: Click on ADD Button to Create a New Appointment
    When Click on ADD button
    Then Verify you are on Find Care Page
    Then Click on First available PCP Provider
    Then Click on SCHEDULE APPOINTMENT button
    Then Verify you are on Schedule Appointment Page with reasons to visit
    Then Click on Illness visit reason
    Then Verify you are on Schedule Appointment Page with appointment type
    Then Click on Office Visit appointment type
    Then Verify you are on Schedule Appointment Page with facility location option
    Then Click on Facility location option
    Then Click for Proper Appointment Time
    Then Click on Scheduling the Appointment Button
    Then Verify you are on Appointments Page
    Then Click on Done Button
    Then Verify you are on Home Page

  Scenario: Select and Cancel the Appointment
    When Scroll to the Appointment Created
    Then Click on the Appointment Created
    Then Click on Cancel Appointment Button
    Then Click on Cancel Appointment Button after Providing Reason
    Then Verify Cancelled Screen
    Then Click on OK Button to Navigate back to Home Screen
    Then Verify Appointment is Cancelled

  Scenario: Click on Profile Button to Logout
    Then Click on Profile button
    Then Click on Logout button to Logout
    Then Verify you have landed on the Login Screen
