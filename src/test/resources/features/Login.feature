Feature: Profile Feature

  Scenario: Change Password
    Given I'm on Profile Page
    When I enter Current Password "te$t$tudent"
    And I enter New Pasword "goob123"
    And I click save
    Then Password should be changed