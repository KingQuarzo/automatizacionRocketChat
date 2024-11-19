Feature: Crear usuario

  Scenario Outline: Crear un nuevo usuario
    Given dado que se ingreso al aplicativo RocketChat
    And se ingrese los datos para autenticacion
      | user   | password   |
      | <user> | <password> |
    And se ingreso al modulo de creacion de usuario como administrador
    When se añada un nuevo usuario
      | Correo   | Nombre   | NombreUsuario   | Contrasenia   | Estado   | Apodo   |
      | <Correo> | <Nombre> | <NombreUsuario> | <Contrasenia> | <Estado> | <Apodo> |
    Then se visualizara el usario en las lista de usuarios
    Examples:
      | Correo                   | Nombre     | NombreUsuario | Contrasenia | Estado       | Apodo     | user     | password |
      | luisfelipe2051@gmail.com | Luis Lopez | Luis123       | 1234567890  | Nuevo estado | Lucho1234 | admin123 | admin123 |