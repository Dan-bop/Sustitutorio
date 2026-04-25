Feature: Product catalog on SauceDemo

  Background:
    Given Alice is on the SauceDemo login page

  @products
  Scenario: Verify total number of products in inventory
    When she logs in with username "standard_user" and password "secret_sauce"
    Then she should see exactly 6 products on the inventory page