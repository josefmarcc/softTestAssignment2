Feature: Capitalize input string
  Scenario: User should be able to capitalize input string
    Given user wants to capitalize the input "hAllo"
    When user inputs the string "hAllo"
    Then "hAllo" is capitalized to "HALLO"