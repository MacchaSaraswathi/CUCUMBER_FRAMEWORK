Feature: Search for products on DemoWebShop
  As a user
  I want to search for products on the DemoWebShop website
  So that I can find items I'm interested in

  Scenario: Search for a valid product
    Given I am on the DemoWebShop homepage
    When I search for product "Laptop"
    Then I should see search results for "Laptop"

  Scenario: Search for an invalid product
    Given I am on the DemoWebShop homepage
    When I search for product "InvalidProduct"
    Then I should see no search results
      
      
      
