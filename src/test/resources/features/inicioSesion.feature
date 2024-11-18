Feature: Iniciar Sesion

  Scenario Outline: Iniciar sesion con un nuevo usuario
    Given dado que se ingreso al aplicativo RocketChat
    When se ingrese los datos para autenticacion
      | NombreUsuario   | Contrasenia   |
      | <NombreUsuario> | <Contrasenia> |
    Then se podra visualizar el mensaje de bienvenida
    Examples:
      | NombreUsuario | Contrasenia |
      | Luis123       | 1234567890  |