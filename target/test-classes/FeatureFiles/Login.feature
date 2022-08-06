Feature: Validating Atactin Hotel application Task

  @reg
  Scenario: Login with Correct Username and Password
    Given User login in the url on chrome browser
    When User Enters the username and password
    And User Click the Login Button
    Then User Verify that is him or not
