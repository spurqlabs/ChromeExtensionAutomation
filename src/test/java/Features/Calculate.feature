Feature: Calculator Extension
  Scenario: User want to add 2 number by using calculator extension
    Given User clicks on the extension icon
    And User clicks on the calculator extension
    When User clicks on number 9
    And User clicks on "+" operator
    And User clicks on number 2
    And User clicks on "=" operator
    Then User sees the result 11
