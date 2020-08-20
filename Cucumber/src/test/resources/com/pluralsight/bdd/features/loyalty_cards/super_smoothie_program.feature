Feature: Super Smoothie Loyalty Card Program
  The more smoothies you buy, the more points you earn fam!

  Background:
    Given the following drink categories:
    | Drink | Categories | Points |
    | Banana | Regular | 15 |
    | Americano | Coffee | 12 |
    | Berry Blend | Fancy | 20 |

  Scenario Outline: Earning points when purchasing smoothies
    Given Michael is a Morning Freshness Member
    When Michael purchases <Quantity> <Drink> drinks
    Then he should earn <Points> points

    Examples:
    | Drink | Quanitity | Points |
    | Banana | 2 | 15 |
    | Coffee | 1 | 20 |