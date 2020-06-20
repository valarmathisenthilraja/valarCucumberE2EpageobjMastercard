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
    When i should enter email 'moon@testing.com'
    And i enter password 'moon123'
    And i enter confirmpwd 'moon123'
    And i clik reister button
    And i see this message "Your registration completed"

@update
    Scenario: Update myaccount details
    Given I navigate into url "http://twentyconsulting-001-site1.dtempurl.com/"
      When click on login link
      And enter username "moon@tester.com"
      And enter password "moon123"
      Then see login page
      When i click my account link
      Then see my account page
      When change lastname "raja"
      And click save button

@bulkreg
  Scenario Outline: Bulk Registeration in Nopcommerce website
    Given I navigate into url "http://twentyconsulting-001-site1.dtempurl.com/"
    When i click register link
    Then i should register page
    When i click radiobtn "<gender>"
    And i enter firstname "<firstname>"
    And i enter lastname "<lastname>"
    When i should select day "<day>"
    When i should select month "<month>"
    When i should select year "<year>"
    When i should enter email "<email>"
    And i enter password "<password>"
    And i enter confirmpwd "<confirmpwd>"
    And i clik reister button
    And i see this message "Your registration completed"
    Examples:
    |gender|firstname|lastname|day|month|year|email|password|confirmpwd|
    |f|H         |h    |8  |8    |2017|h32@test.com|htest88|htest88   |
    |m|I         |i    |9  |9    |2018|i91@test.com |itest99|itest99   |












