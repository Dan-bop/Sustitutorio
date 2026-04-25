Feature: Shopping cart on SauceDemo

  Background:
    Given Alice is on the SauceDemo login page

  @cart
  Scenario: Add product to cart and verify it appears in cart
    When she logs in with username "standard_user" and password "secret_sauce"
    And she adds the product "Sauce Labs Backpack" to the cart
    And she navigates to the cart page
    Then she should see the product "Sauce Labs Backpack" in the cart
