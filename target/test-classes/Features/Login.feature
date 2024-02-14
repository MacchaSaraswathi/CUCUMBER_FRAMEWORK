Feature: Login to DemoWebShop
  As a user
  I want to login to the DemoWebShop website
  So that I can access my account

  Scenario: Login with valid credentials
    Given I am on the DemoWebShop login page
    When I enter valid username "siri@gmail.com" and password "siri123"
    And I click on the login button
    Then I should be logged in successfully

  Scenario: Login with invalid credentials
    Given I am on the DemoWebShop login page
    When I enter invalid username "siri12@gmail.com" and password "siri123456"
    And I click on the login button
    Then I should see an error message