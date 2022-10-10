Feature: Reverse input string
  Scenario: User should be able to reverse input string
    Given user wants to reverse the input "aBc"
    When user inputs "aBc"
    Then "aBc" is reversed to "cBa"