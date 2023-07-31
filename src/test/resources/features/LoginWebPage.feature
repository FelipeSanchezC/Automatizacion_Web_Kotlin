Feature: Login en la pagina Web

  @TestCaseLogin
  Scenario: Ingreso exitoso en la pagina Web
    Given Me encuentro en la pagina de Your Logo
    When Selecciona la opcion del Login
    And Ingreso las credenciales
    Then Valido que el Login se realice de forma correcta

  @TestCaseMultipleLogin
  Scenario Outline: Ingreso en la pagina Web con multiples usuarios
    Given Me encuentro en la pagina de Your Logo
    When Selecciona la opcion del Login
    And Ingreso el correo "<usuario>" y password "<password>"
    Then Valido que se presente el mensaje de control

    Examples:
      | usuario                 | password     |
      | pruebas123@hotmail.com  | Pruebas123   |
      | qwerty96@hotmail.com    | Pruebas1234  |



      #| pruebas1234@hotmail.com | Pruebas12345 |


