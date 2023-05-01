@US05
Feature:US05_Admin_Deanleri_Gorebilmeli_Ve_Silebilmeli_Ve_Guncelleyebilmeli






  Scenario: TC1_Admin Dean olusturabilmeli
    Given Kullanici admin olarak login olur.
    And   Admin Menuye tiklar
    And   Admin Dean Management linkine tiklar
    And   Admin name girer
    And   Admin surname girer
    And   Admin birthplace
    And   Admin gender girer
    And   Admin dOfbirth girer
    And   Admin phone girer
    And   Admin ssn girer
    And   Admin username
    And   Admin password
    And   Admin submit butonuna tiklar
    And   Admin sayfanin en altindaki son sayfa okuna tiklar
    Then  Admin Dean Listteki bilgisini gordugunu dogrular
    And   Admin Sayfayi kapatir










#     @US05_TC02
#  Scenario:TC02_Admin Dean leri günceleyebilmeli
#    Given  Kullanici admin olarak login olur.
#    And    Admin Menuye tiklar
#    And    Admin Dean Management linkine tiklar
#    Then   Acilan sayfada kaydetmis oldugu dean kisminin Edite tiklar
#    And    Admin Acilan sayfada name kismini degistirir
#    And    Admin Acilan sayfada surName kismini degistirir
#    And    Admin Acilan sayfada birthPlace kismini degistirir
#    And    Admin Acilan sayfada gender kismini degistirir
#    And    Admin Acilan sayfada dateOfBirth kismini degistirir
#    And    Admin Acilan sayfada phone kismini degistirir
#    And    Admin Acilan sayfada ssn kismini degistirir
#    And    Admin Acilan sayfada userNAme kismini degistirir
#    And    Admin Acilan sayfada password kismini degistirir
#    And    Admin submit butonuna tiklar
#    Then   Admin Yapilan degisiklikleri dogrular
#    And    Admin Sayfayi kapatir