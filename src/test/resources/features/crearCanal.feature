Feature: Crear canal

  Scenario Outline: Crear un nuevo canal para gestionar chats
    Given dado que se ingreso al aplicativo RocketChat
    And se ingreso al modulo de creacion de canal como administrador
    When se ingreser todos los datos
      | Nombre   | Tema   | Accesbilidad   |
      | <Nombre> | <Tema> | <Accesbilidad> |
    Then se podra añadir al directorio de canales
    Examples:
      | Nombre      | Tema   | Accesbilidad |
      | canalPrueba | varios | Publico      |
