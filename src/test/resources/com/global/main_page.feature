Feature: Main scenario

  @Sanity
    @Main_scenario
  Scenario Outline: Verify that all countries present and have correct taxes. Verify that the percentage diagram is shown correctly.
    Given I open calc page
    Then I choose the country "<country_name>"
    Then I choose the VAT "<VAT>"
    And I verify that percentage coefficient is present for Price without vat
    And I verify that percentage coefficient is present for Price include vat
    Then I enter the test value into the Price without VAT field
    And I see that Value-Added Tax and Price incl. VAT filed as expected

    Then I enter the test value into the Value-Added Tax field
    And I see that Price incl. VAT and Price without VAT filed as expected
    Then I enter the test value into the Price incl. VAT field
    And I see that Value-Added Tax and Price without VAT filed as expected

    And I verify that the percentage diagram is shown correctly for the "<VAT>"
    And I verify that the percentage diagram is shown correctly for the Price when the "<VAT>"

    Examples:
      | country_name | VAT |
      | Austria      | 10  |
      | Austria      | 13  |
      | Austria      | 20  |

    Examples:
      | country_name | VAT |
      | Belgium      | 6  |
      | Belgium      | 12  |
      | Belgium      | 21  |

