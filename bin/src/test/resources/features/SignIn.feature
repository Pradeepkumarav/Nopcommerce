Feature: DStv Web Authentication Tests

  Background: To Launch the browser
    Given Launch the browser

  @RegressionTest
  Scenario Outline: Successful Login
    Given User is on the landing page
    When User enters a valid email "<email>" and password "<password>" combination
    And Selects their profile
    Then User should land on home page

    Examples:
      | email                 | password |
      | premza@automation.com | 123456   |
      | easyza@automation.com | 123456   |
