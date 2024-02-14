Feature: Testing Ergast Developer API

  Scenario: Verify response for 2018 racers data
    Given I make a GET request to "http://ergast.com/api/f1/2018/circuits.json"
    Then the response status code should be 200
    And the response body should not be empty

