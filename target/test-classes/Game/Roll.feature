Feature: Roll ball
  Scenario: User should be able to roll a ball to knock down pins
    Given user inputs the number of pins knocked down
    When user inputs the number 2
    Then score should be updated by 2