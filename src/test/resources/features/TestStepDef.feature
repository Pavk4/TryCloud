Feature: The application should be running

  @smoke @pass
    Scenario: Login
    Given I am on the home page
    When I enter my username
     When I enter my password
    Then I should be on the dashboard

  @smoke @fail
  Scenario: Login Fail
    Given I am on the home page again
    When I enter the wrong username
    When I enter the wrong password
    Then I should get a fail message