@authentification
Feature: Je me connect à l'application OrangeHRM
En tant que utlisateur je souhaite m'identifier à l'application OrangeHRM
  I want to use this template for my feature file

  @connexion_ok
  Scenario: Authentification à l'application OrangeHRM
    Given Je me connecte à l'application OrangeHRM
    When Je saisie le username "Admin"
    And Je saisie le mot de passe "admin123"
    And Je clique sur le bouton login
    Then Je me derige vers la page Home"Welcome"
     