# Herkesin temelde giriş yapabilmek için kullanacağı senaryo.
  Feature: Login Functionality
    Scenario: Login with valid username and password

      Given Navigate to basqar
      When Enter username and password and click login button
      Then User should login successfuly