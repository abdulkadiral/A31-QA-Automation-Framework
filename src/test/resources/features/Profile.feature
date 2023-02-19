Feature: Profile Feature

  Scenario: Change Password
    Given I open Profile Page
    When I enter Current Password "Citm3030@@"
    And I enter New Password "Adeagle2021@"
    And I save
    Then Password should be changed