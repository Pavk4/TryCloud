Feature: manage folders
  User Story:
  As a user, I should be able to manage folders.

  Scenario: being able to create a folder in the Files module
    Given user is on the Files module
    When the user selects add icon
    And user clicks in New folder option
    And user creates New folder
    Then user can upload a file