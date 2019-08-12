Feature: Ordering Italian eats

  Scenario: Order Margherita Pizza
    Given Customer receives the menu
    When Orders one Margherita pizza
    Then Kitchen should get order