Feature: Main scenario Austria

  @Sanity
    @Main_scenario
  Scenario Outline: Verify that the country Austria present and have correct taxes. Verify that the percentage diagram is shown correctly.
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
      | Austria      | 10  |
      | Austria      | 13  |
      | Austria      | 20  |


