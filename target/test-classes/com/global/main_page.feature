Feature: Main scenario

  @Sanity
    @Main_scenario
  Scenario Outline: Verify that all countries present and have correct taxes.
    Given I open calc page
    Then I choose the country "<country_name>"
    Then I choose the VAT "<VAT>"



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

