
#
#
Feature: Validating the Live TV page

  Background: To Launch the browser
    Given Launch the browser
    Given User is on the landing page

  @RegressionTest
  Scenario Outline: Live TV Categories
    When User enters a valid email "<email>" and password "<password>" combination
    And Selects their profile
    And Navigate to Live TV Page
    Then All Live TV categories should be displayed
    And be able to log out of dstv now web

    Examples: 
      | email         | password |
      | gsa@gmail.com | Test12345  |

  