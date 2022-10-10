Feature: Roll spare
  Scenario: User rolls a spare the spare bonus should be added
    Given a user rolls a spare
    When user rolls 5 twice and the third fame is 3
    Then score should be 16