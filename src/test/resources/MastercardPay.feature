Feature: End to End
  Scenario: Create on order with MastercardPayment
   Given I navigate into url "http://twentyconsulting-001-site1.dtempurl.com/"
    When click on login link
    Then i should see homepage
    And enter username "abc@tester.com"
    And enter password "abc123"
    Then see login page
    When click on mobile link
    And add item1 into cart
    And add item2 into cart
    When see the products
    And go to cart page
    And go to checkout page
    And order success page msg "Your order has been successfully processed!"







