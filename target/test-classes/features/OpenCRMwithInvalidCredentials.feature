Feature: Open CRM-project with valid credentials

  Background:
    Given Открываем стартовую страницу

  Scenario: 01 - Login with valid credentials
    Given Ввести логин plotnikova_a
    Given Ввести пароль 2
    Given Нажать на кнопку Login
    Then Главная страница должна быть загружена