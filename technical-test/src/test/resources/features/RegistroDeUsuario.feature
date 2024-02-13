Feature: User Registration from the Mobile Application (iOS and Android)

  #Escribe un escenario de prueba Gherkin para verificar el proceso de registro de un nuevo usuario desde ambas
  #aplicaciones móviles (iOS y Android). Asegúrate de incluir condiciones y resultados esperados.

  @createAccount
  Scenario Outline: Register a new user in the mobile application
    Given Open the mobile application
    When Click on the Register button
    And Enter a username <User>
    And Capture a name <Name>
    And Capture paternal surname <PaternalName>
    And Capture mother's last name <MothersLastName>
    And Enter a date of birth <Birth>
    And Capture an email <Email>
    And Capture a password <pass>
    And Select the create account button
    Then Your account was created successfully

    Examples:
      |User |Name   |PaternalName|MothersLastName| Birth     |Email                  |pass      |
      |test1|Rafael |Rivera      |Cornejo        | 09/01/1980|rcornejo@mail.com      |password12|
      |test2|Roberto|Figueroa    |Diaz           | 07/03/1980|rfigueroa@mail.com     |password07|
      |test3|Rebeca |Cornejo     |Cornejo        | 14/07/1988|rebeca_cornejo@mail.com|password08|
      |test4|Diana  |Salas       |Medéz          | 11/01/1987|dsalas@mail.com        |password05|
      |test5|Luis   |Medéz       |Rivera         | 07/09/1903|lmendez@mail.com       |password04|
      |test6|Lorena |Diaz        |Salas          | 19/01/1990|ldiaz@mail.com         |password03|
      |test7|Ricardo|Pacheco     |Cornejo        | 20/01/1979|rpacheco@mail.com      |password02|