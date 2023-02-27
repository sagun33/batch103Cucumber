@blueRentalCar
Feature:blueRentalCar

  Background: sayfaya_gider
    Given kullanici "https://www.bluerentalcars.com/" sayfasina gider

  Scenario Outline: kullanici_loginbilgileriyle_giris_yapar

  When kullanici login sayfasina gider
  And "<kullanici_adi>" email girer
  And "<sifre>" sifre girer
  And login buttonuna basar
  Then login islemi gerçekleşir
    Then close the application

    Examples:bluerentalcars

      | kullanici_adi                  | sifre     |  |
      | sam.walker@bluerentalcars.com  | c!fas_art |  |
      | kate.brown@bluerentalcars.com  | tad1$Fas  |  |
      | raj.khan@bluerentalcars.com    | v7Hg_va^  |  |
      | pam.raymond@bluerentalcars.com | Nga^g6!   |  |





