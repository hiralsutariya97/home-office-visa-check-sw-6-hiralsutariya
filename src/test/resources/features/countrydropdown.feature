@regression @sanity @smoke
Feature: Country dropdown feature
  In Order to perform dropdown menu feature
  As a User
  I can see the country dropdown list

  Scenario: User should verify the following country available in country dropdown list
    Given I am on homepage
    When I click on start button
    Then I can see the following country into dropdown
      | albania                  |
      | bhutan                   |
      | british-protected-person |
      | haiti                    |
      | kazakhstan               |
      | mozambique               |
      | norway                   |
      | portugal                 |
      | russia                   |
      | zambia                   |