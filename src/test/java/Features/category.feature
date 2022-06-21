@test2
Feature: Category selection

  Scenario Outline: User should able to navigate to desire category page successfully form top header menu
    Given : I am on Homepage
    When : I click on "<category_name>" link form top header menu
    Then : i should able to  navigate successfully to related "<category_url>" category page
    Examples:
      | category_name     | category_url                                   |
      | Computers         | https://demo.nopcommerce.com/computers         |
      | Electronics       | https://demo.nopcommerce.com/electronics       |
      | Apparel           | https://demo.nopcommerce.com/apparel           |
      | Digital downloads | https://demo.nopcommerce.com/digital-downloads |
      | Books             | https://demo.nopcommerce.com/books             |
      | Jewelry           | https://demo.nopcommerce.com/jewelry           |
      | Gift Cards        | https://demo.nopcommerce.com/gift-cards        |


