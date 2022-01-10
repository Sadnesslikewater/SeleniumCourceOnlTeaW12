Feature: Shopping time ;-)

  Scenario: log into https://mystore-testlab.coderslab.pl and do some shopping
    Given Web page https://mystore-testlab.coderslab.pl opened in browser
    And First key sign in pressed vol 2
    And Email address entered in input box vol 2
    And Password entered in input box vol 2
    And Second key sign in pressed vol 2
    Then Press clothes button
    And Select Hummingbird Printed Sweater
    And 20% discount checked
    And May choose the size
    Then Choose M size
    And Select quantity of 5
    And Add to cart pressed
    When Proceed to checkout pressed
    And Second proceed to checkout pressed
    And Address confirmed
    And Continue button pressed
   Then PrestaShop pick up in store option chosen
    And Second continue button pressed
    And Pay by check payment option chosen
    And Order with an obligation to pay pressed
    And Screenshot taken
    And Order history checked
    And Payment status and amount checked


