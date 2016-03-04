Feature: E-commerce Page
  As a customer,
  I want to buy some electronic product
  So that, I go to Magento page

  Scenario: Valid Homepage
    Given the user is on homepage
    Then make sure the title of the page is "THIS IS DEMO SITE FOR"

  Scenario: Verify item in Mobile List page
    Given the user is on Mobile List page
    Then the title of the page is "MOBILE"
    And the user select Sort by dropdown list as "Name"
    Then make sure all products are sorted by "Name"

  Scenario: Verify cost product in list page and details page are equal
    Given the user is on Mobile List page
    Then the title of the page is "MOBILE"
    When the user click on "SONY XPERIA" mobile
    Then make sure the mobile title is "SONY XPERIA"
    And make sure the cost at mobile list and the detail page are the same
