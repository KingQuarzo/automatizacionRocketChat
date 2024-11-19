Feature: Crear usuario - Yo como usuario administrador de Rocket.chat quiero crear nuevos perfiles para asignarlos a los nuevos usuarios que requieran acceder a módulos o canales.

  Scenario Outline: Crear un nuevo canal para gestionar chats
    Given dado que se ingreso al aplicativo RocketChat
    And se ingrese los datos para autenticacion
      | user     | password |
      | admin123 | admin123 |
    And se ingreso al modulo de creacion de usuario como administrador
    When se añada un nuevo usuario
      | Correo   | Nombre   | NombreUsuario   | Contrasenia   | Estado   | Apodo   |
      | <Correo> | <Nombre> | <NombreUsuario> | <Contrasenia> | <Estado> | <Apodo> |
    Then se visualizara el usario en las lista de usuarios
    Examples:
      | Correo                   | Nombre     | NombreUsuario | Contrasenia | Estado       | Apodo     |
      | luisfelipe2051@gmail.com | Luis Lopez | Luis123       | 1234567890  | Nuevo estado | Lucho1234 |