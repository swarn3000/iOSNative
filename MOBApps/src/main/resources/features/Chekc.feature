Feature: Test Login

  Test user login condition

  @Login
  Scenario Outline: Login to app with differnet username and passowrd using scenario outline
    Given I open application on device
    Then I click on login button
    When I enter credentials "bspot@ce" as username
    When I enter the credentials "rebralfix.com" as username
    Examples:
      | username    |
      | bspot@Cerebralfix.com   |
      | bsoptt@Cerebralfix.com |
