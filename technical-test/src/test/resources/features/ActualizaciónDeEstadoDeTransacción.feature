Feature: Transaction Status Update from Mobile Application (Android)

  #Escribe un escenario de prueba Gherkin para verificar la capacidad de la aplicación móvil en Android para
  # actualizar el estado de una transacción. Asegúrate de incluir pasos, condiciones y resultados esperados.
  Scenario:Transaction Status Update from Mobile
    Given Open the mobile application
    When Sign in with a valid username and password
    And Click on the menu and select the transaction status option
    And Validate transactions with pending status and finalized status
    And Make the status change manually
    Then The state change is successfully carried out