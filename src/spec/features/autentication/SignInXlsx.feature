@signInXlsx
Feature: Je me connect à l'application OrangeHRM avec un fichier Excel
  En tant que utlisateur je souhaite m'identifier à l'application OrangeHRM
  I want to use this template for my feature file

  @signIn
  Scenario: Authentification à l'application OrangeHRM
    Given Je me connecte à l'application OrangeHRM
    When Je m'authentifier avec un fichier Excel

