Feature: Belly

  Scenario: eat cukes -> wait until digested -> belly is empty
    Given I have 24 cukes in my belly
    When I wait 12 hour
    Then my belly should growl true

  Scenario: eat cukes -> wait not long enough -> belly is not empty
    Given I have 20 cukes in my belly
    When I wait 9 hour
    Then my belly should growl false
