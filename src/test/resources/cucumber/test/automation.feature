Feature: E-commerce Page
  As a customer,
  I want to buy some electronic product
  So that, I go to Magento page

  Scenario: Valid Homepage
    Given the user is on homepage
    Then make sure the title of the page is "THIS IS DEMO SITE FOR"

  Scenario: Verify item in Mobile List page
    Given the user is on Mobile List page
    When the title of the page is "MOBILE"
    And the user select Sort by dropdown list as "name"
    Then ensure all products are sorted by "name"