Feature: Crear usuario

  Scenario Outline: Crear un nuevo canal para gestionar chats
    Given dado que se ingreso al aplicativo RocketChat
    And se ingreso al modulo de creacion de usuario como administrador
    When se añada un nuevo usuario
      | Correo   | Nombre   | NombreUsuario   | Contrasenia   | Estado   | Apodo   |
      | <Correo> | <Nombre> | <NombreUsuario> | <Contrasenia> | <Estado> | <Apodo> |
    Then se podra iniciar sesion con el usuario
    Examples:
      | Correo                   | Nombre     | NombreUsuario | Contrasenia | Estado       | Apodo     |
      | luisfelipe2051@gmail.com | Luis Lopez | Luis123       | 1234567890  | Nuevo estado | Lucho1234 |