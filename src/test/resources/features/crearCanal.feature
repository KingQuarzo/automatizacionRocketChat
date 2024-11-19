Feature: Crear canal - Yo como usuario administrador de Rocket.chat quiero crear canales de chat para permitir a los usuarios ingresar a chat privados grupales en los cuales manejar temas particulares

  Scenario Outline: Crear un nuevo canal para gestionar chats
    Given dado que se ingreso al aplicativo RocketChat
    And se ingrese los datos para autenticacion
      | NombreUsuario   | Contrasenia   |
      | <NombreUsuario> | <Contrasenia> |
    And se ingreso al modulo de creacion de canal como administrador
    When se ingreser todos los datos
      | Nombre   | Tema   | Accesbilidad   |
      | <Nombre> | <Tema> | <Accesbilidad> |
    Then se podra visualizar el canal en lista de canales
    Examples:
      | Nombre      | Tema   | Accesbilidad |
      | canalPrueba | varios | Publico      |
