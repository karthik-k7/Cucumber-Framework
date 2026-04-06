@smoke @login
Feature: Login Functionality

  Scenario Outline: Valid Login
    Given user is on login page
    When user enters username "<username>" and password "<password>"
    Then user should be logged in successfully
    Examples:
      | username | password |
    |Admin     |admin123  |
