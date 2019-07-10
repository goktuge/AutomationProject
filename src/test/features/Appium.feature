Feature: Validate Different Options

  @appium
  Scenario: Validate Custom View
    Given I open the application

    And Fill email element with "hello@getir.com" text
    And Fill password element with "hello" text
    And Click email_sign_in_button id

    And Click kisisel_bakim element
    And Click krem element

    And Click geri element

    And Click ev_bakimi element
    And Click camsil element

    And Click basket id
    And Click camsil_sil element
    And Click krem_sil element

    And I See empty_textview id
