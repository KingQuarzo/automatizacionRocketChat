Feature: Iniciar Sesion

  Scenario Outline: Iniciar sesion con un nuevo usuario
    Given dado que se ingreso al aplicativo RocketChat
    When se ingrese los datos para autenticacion
      | user   | password   |
      | <user> | <password> |
    Then se podra visualizar el mensaje de bienvenida
    Examples:
      | user       | password |
      | llopez2051 | admin123 |