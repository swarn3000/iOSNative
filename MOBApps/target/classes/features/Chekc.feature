Feature: Test Login

  Test user login condition

  @Login
  Scenario Outline: Login to app with differnet username and passowrd using scenario outline
    Given I open application on device
    #When I enter credentials "<username>"
    Then I click on login button
    When I enter credentials "abcd"
    Examples:
      | username    |
      | bspot@Cerebralfix.com   |
      | bsoptt@Cerebralfix.com |
