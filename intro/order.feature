Feature: Ordering Italian Eats

  Scenario: Order Margherita Pizza
    Given Customer receives the menu
    When Orders one Margherita pizza
    Then Kitchen should receive the order