Feature: Main scenario Belgium

  @Sanity
    @Main_scenario
  Scenario Outline: Verify that the country Belgium present and have correct taxes. Verify that the percentage diagram is shown correctly.
    Given I open calc page
    Then I choose the country "<country_name>"
    Then I choose the VAT "<VAT>"
    And I verify that percentage coefficient is present for Price without vat
    And I verify that percentage coefficient is present for Price include vat
    Then I enter the test value into the Price without VAT field
    Then I enter the test value into the Value-Added Tax field
    Then I enter the test value into the Price incl. VAT field
    And I verify that the percentage diagram is shown correctly Price for the "<VAT>"

    Examples:
      | country_name | VAT |
      | Belgium      | 6  |
      | Belgium      | 12  |
      | Belgium      | 21  |

