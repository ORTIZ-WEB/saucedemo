Feature: Add  Item

  Background: User log in successfully
    When the user opens the web site
    And enters standard_user and secret_sauce

  Scenario: User adds two item to cart
    When User selects backpack and bike-light
    And Opens cart
    Then User sees backpack and bike-light on cart

  Scenario: User logout successfully
    When user opens the menu and select logout option
    Then user sees login page


