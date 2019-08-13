Feature: Ordering Italian Eats

  Scenario: Order Margherita Pizza
    Given Customer reads the menu
    When Orders one Margherita pizza
    Then Kitchen should receive the order