Feature: Transaction Report from the Mobile Application (iOS)

  #Escribe un escenario de prueba Gherkin para verificar la capacidad de la aplicación móvil en iOS para reportar
  #transacciones. Asegúrate de considerar la integración con el backend y el procesamiento en el back office.
  Scenario: Generate transaction report
    Given Endpoint consumption of transactions
    When Capture backoffice credentials
    Then The endPoint returns status 200