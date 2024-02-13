Feature: Viewing Transaction History on the Website

  #Escribe un escenario de prueba Gherkin para verificar la funcionalidad que permite a los usuarios ver su historial
  #de transacciones en el sitio web. Asegúrate de considerar la integración entre el frontend del sitio web y el backend.
  Scenario:Viewing Transaction History
    Given Open the browser and enter the site
    When Log in with valid username and password
    And Click on the menu and select the transaction history option
    And A query is performed by date range
    Then Transaction history is presented
    And Transaction history endpoint is consumed
    Then Return a code 200 when consuming the endpoint
    And Filter transactions
    Then Compare data collected on the website vs. data returned within the endpoint