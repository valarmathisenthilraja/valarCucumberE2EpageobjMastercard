Feature: Registration

  @reg
  Scenario: Registeration in Nopcommerce website
    Given I navigate into url "http://twentyconsulting-001-site1.dtempurl.com/"
    When i click register link
    Then i should register page
    When i click radiobtn "f"
    And i enter firstname 'fntest'
    And i enter lastname 'lntest'
    When i should select day "7"
    When i should select month "5"
    When i should select year "2019"
    When i should enter email 'moon@tester.com'
    And i enter password 'moon123'
    And i enter confirmpwd 'moon123'
    And i clik reister button
    And i see this message Your registration completed

@update
    Scenario: Update myaccount details
    Given I navigate into url "http://twentyconsulting-001-site1.dtempurl.com/"
      When click on login link
      And enter username "moon@tester.com"
      And enter password "moon123"
      Then see login page
      When i click my account link
      Then see my account page
      When change lastname "senthilraja"
      And click save button








