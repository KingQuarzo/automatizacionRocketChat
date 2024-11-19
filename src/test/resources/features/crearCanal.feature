Feature: Crear canal

  Scenario Outline: Crear un nuevo canal para gestionar chats
    Given dado que se ingreso al aplicativo RocketChat
    And se ingrese los datos para autenticacion
      | user   | password   |
      | <user> | <password> |
    And se ingreso al modulo de creacion de canal como administrador
    When se ingreser todos los datos
      | nombre   | tema   |
      | <nombre> | <tema> |
    Then se podra visualizar el canal en lista de canales
      | nombre   | tema   |
      | <nombre> | <tema> |
    Examples:
      | nombre      | tema   | user     | password |
      | canalPrueba | varios | admin123 | admin123 |
