@sOutline
Feature: Amazonda istenilen kelimeleri arama

  Scenario Outline: Amazonda aranilacak kelimeler
    Given kullanici amazon sayfasina gider
    * kullanici "<value>" icin arama yapar
    * kullanici arama sonuclarinin "<value>" icerdigini test eder
    * sayfayi kapatir

    Examples:
    | value |
    | mac |
    | windows |
    | linux   |
    |nokia    |