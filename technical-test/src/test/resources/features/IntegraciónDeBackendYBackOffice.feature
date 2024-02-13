Feature: Backend and Back Office Integration to Process Transactions

  #Escribe un escenario de prueba Gherkin para asegurar que las transacciones reportadas desde las aplicaciones
  #móviles (iOS y Android) se procesen correctamente en el backend y el back office.
  Scenario Outline: Integration to Process Transactions
    Given Endpoint consumption of transactions <id>
    When Backoffice credentials
    Then Returns a status of 200
    And  Filter transactions <status>
    Then The backoffice consults the transactions <id> in the different statuses <status>

    Examples:
      |id  | status                               |
      |5987| Transaccion pendiente por procesar   |
      |9901| Transacción exitosa                  |
      |4432| Transacción declinada por institución|