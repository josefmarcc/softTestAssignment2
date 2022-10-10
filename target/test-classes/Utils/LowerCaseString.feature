Feature: Lowercase input string
  Scenario: User should be able to lowercase input string
    Given user wants to lowercase the input "hEy"
    When user inputs string "hEy"
    Then "hEy" is lowercased to "hey"