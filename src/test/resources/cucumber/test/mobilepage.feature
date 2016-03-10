Feature: Mobile page
  In order to verify some function in Mobile Page

  Background: User is on Mobile Page
    Given the user is on Mobile List page
    Then the title of the page is "MOBILE"

  Scenario: Verify item in Mobile List page
    And the user select Sort by dropdown list as "Name"
    Then make sure all products are sorted by "Name"

  Scenario: Verify cost product in list page and details page are equal
    When the user click on "SONY XPERIA" mobile
    Then make sure the mobile title is "SONY XPERIA"
    And make sure the cost at mobile list and the detail page are the same

  Scenario: Verify that you can't add more product in cart than the product available in store
    When the user click on ADD TO CART for Sony Xperia mobile
    Then the user change QTY value to "1000" and click Update button
    And make sure the error is shown "The requested quantity for "Sony Xperia" is not available."
    Then the user click on EMPTY CART link in the footer of list of all mobiles
    Then make sure the cart is empty
