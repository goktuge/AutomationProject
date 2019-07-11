Feature: Apk Test

  @appium
  Scenario: Product Testing

    #Uygulamanýn ayakta oldugunun kontrolu
    Given I check email id

    #Kullanici bilgileri girisi
    And Fill email element with "hello@getir.com" text
    And Fill password element with "hello" text
    And Tap email_sign_in_button id

    #Urun 1 eklenir
    And Tap kisisel_bakim element
    And Tap krem element

    And Tap geri element

    #Urun 2 eklenir
    And Tap ev_bakimi element
    And Tap camsil element

    #Sepete gider
    And Tap basket id

    #Urunler silinir
    And Tap camsil_sil element
    And Tap krem_sil element

    And I check empty_textview id
