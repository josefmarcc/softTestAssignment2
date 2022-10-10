Feature: Roll strike
  Scenario: User rolls a strike the strike bonus should be added
    Given a user rolls a strike
    When user rolls a 10, 3 and 4
    Then getScore() should return 24