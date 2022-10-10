Feature: Check score
  Scenario: User should be able to check current score
    Given the current score is 23
    When user calls the function score()
    Then function score() should return 23