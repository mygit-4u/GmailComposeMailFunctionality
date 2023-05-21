

Feature: Test Gmail Functionality
 

  Scenario: Logging into user Account
    Given user at login page
    When user enter valid username and password
    Then user enter submitt button
 

 Scenario: test composeMail button
    Given user successfully login to account
    When user enter compose mail button
    Then compose new mail frame pop-ups