Feature: This feature is about the user loging into AutopationTesting website and perform the required operationa

  @assignment
  Scenario Outline: practicing the use opeations in automation Testing website about
  Home-Arrivals, Add to Basket, Items-Check-out, Payment Gateway, Place order

    When user opens the browser
    Then user Enter the URL in search bar
    Then user Click on Shop Menu
    And  Now user click on Home menu button
    Then user click on the image in the Arrivals
    Then uesr Click on the Add To Basket button which adds that book to user basket
    And click on viewDetails to verify the Item details and Prices
    Then user click on Proceed to Check out button which navigates to payment gateway page.
    Then user can fill the details in billing page
    Then user selects the payment option as "<PaymentOption>"
#    And  user click on Place Order button to complete process
    Examples:
      | PaymentOption |
      | cash          |

