Feature: Performance Testing to Handle High Transaction Load

  #Escribe un escenario de prueba Gherkin para evaluar el rendimiento del sistema al manejar una carga alta de
  #transacciones simultáneas. Asegúrate de considerar la integración entre todas las partes del sistema.

  Scenario Outline:
    Given Transaction endpoint is consumed
    When Capture backoffice credentials <user> and <pass>
    And The <amount> is captured
    And Transaction concept <nameTransaction>
    Then The endPoint returns status 200

    Examples:
      | user | pass   |amount | nameTransaction          |
      |test01|Qawsed1$|100    | Transacción interbancaria|
      |test02|Qawsed1$|100    | Transacción interbancaria|
      |test03|Qawsed1$|100    | Transacción interbancaria|
      |test04|Qawsed1$|100    | Transacción interbancaria|
      |test05|Qawsed1$|100    | Transacción interbancaria|
      |test06|Qawsed1$|100    | Transacción interbancaria|
      |test07|Qawsed1$|100    | Transacción interbancaria|
      |test08|Qawsed1$|100    | Transacción interbancaria|
      |test09|Qawsed1$|100    | Transacción interbancaria|
      |test10|Qawsed1$|100    | Transacción interbancaria|
      |test11|Qawsed1$|2000   | Transacción interbancaria|
      |test12|Qawsed1$|2000   | Transacción interbancaria|
      |test13|Qawsed1$|2000   | Transacción interbancaria|
      |test14|Qawsed1$|2000   | Transacción interbancaria|
      |test15|Qawsed1$|2000   | Transacción interbancaria|
      |test16|Qawsed1$|2000   | Transacción interbancaria|
      |test17|Qawsed1$|2000   | Transacción interbancaria|
      |test18|Qawsed1$|2000   | Transacción interbancaria|
      |test19|Qawsed1$|2000   | Transacción interbancaria|
      |test20|Qawsed1$|30000  | Transacción interbancaria|
      |test21|Qawsed1$|30000  | Transacción interbancaria|
      |test22|Qawsed1$|30000  | Transacción interbancaria|
      |test23|Qawsed1$|30000  | Transacción interbancaria|
      |test24|Qawsed1$|30000  | Transacción interbancaria|
      |test25|Qawsed1$|30000  | Transacción interbancaria|
      |test26|Qawsed1$|30000  | Transacción interbancaria|
      |test27|Qawsed1$|30000  | Transacción interbancaria|
      |test28|Qawsed1$|30000  | Transacción interbancaria|
      |test29|Qawsed1$|30000  | Transacción interbancaria|
      |test31|Qawsed1$|30000  | Transacción interbancaria|
      |test32|Qawsed1$|400000 | Transacción interbancaria|
      |test33|Qawsed1$|400000 | Transacción interbancaria|
      |test34|Qawsed1$|400000 | Transacción interbancaria|
      |test35|Qawsed1$|400000 | Transacción interbancaria|
      |test36|Qawsed1$|400000 | Transacción interbancaria|
      |test37|Qawsed1$|400000 | Transacción interbancaria|
      |test38|Qawsed1$|400000 | Transacción interbancaria|
      |test39|Qawsed1$|400000 | Transacción interbancaria|
      |test40|Qawsed1$|400000 | Transacción interbancaria|
      |test41|Qawsed1$|5000000| Transacción interbancaria|
      |test42|Qawsed1$|5000000| Transacción interbancaria|
      |test43|Qawsed1$|5000000| Transacción interbancaria|
      |test44|Qawsed1$|5000000| Transacción interbancaria|
      |test45|Qawsed1$|5000000| Transacción interbancaria|
      |test46|Qawsed1$|5000000| Transacción interbancaria|
      |test47|Qawsed1$|5000000| Transacción interbancaria|
      |test48|Qawsed1$|5000000| Transacción interbancaria|
      |test49|Qawsed1$|5000000| Transacción interbancaria|
      |test50|Qawsed1$|300    | Transacción interbancaria|
      |test51|Qawsed1$|300    | Transacción interbancaria|
      |test52|Qawsed1$|300    | Transacción interbancaria|
      |test53|Qawsed1$|300    | Transacción interbancaria|
      |test54|Qawsed1$|300    | Transacción interbancaria|
      |test55|Qawsed1$|300    | Transacción interbancaria|
      |test56|Qawsed1$|300    | Transacción interbancaria|
      |test57|Qawsed1$|300    | Transacción interbancaria|
      |test58|Qawsed1$|300    | Transacción interbancaria|
      |test59|Qawsed1$|300    | Transacción interbancaria|
      |test60|Qawsed1$|4000   | Transacción interbancaria|
      |test61|Qawsed1$|4000   | Transacción interbancaria|
      |test62|Qawsed1$|4000   | Transacción interbancaria|
      |test63|Qawsed1$|4000   | Transacción interbancaria|
      |test64|Qawsed1$|4000   | Transacción interbancaria|
      |test65|Qawsed1$|4000   | Transacción interbancaria|
      |test66|Qawsed1$|4000   | Transacción interbancaria|
      |test67|Qawsed1$|4000   | Transacción interbancaria|
      |test68|Qawsed1$|4000   | Transacción interbancaria|
      |test69|Qawsed1$|4000   | Transacción interbancaria|
      |test70|Qawsed1$|4000   | Transacción interbancaria|
      |test71|Qawsed1$|50000  | Transacción interbancaria|
      |test72|Qawsed1$|50000  | Transacción interbancaria|
      |test73|Qawsed1$|50000  | Transacción interbancaria|
      |test74|Qawsed1$|50000  | Transacción interbancaria|
      |test75|Qawsed1$|50000  | Transacción interbancaria|
      |test76|Qawsed1$|50000  | Transacción interbancaria|
      |test77|Qawsed1$|50000  | Transacción interbancaria|
      |test78|Qawsed1$|50000  | Transacción interbancaria|
      |test79|Qawsed1$|50000  | Transacción interbancaria|
      |test80|Qawsed1$|50000  | Transacción interbancaria|
      |test81|Qawsed1$|20     | Transacción interbancaria|
      |test82|Qawsed1$|20     | Transacción interbancaria|
      |test83|Qawsed1$|20     | Transacción interbancaria|
      |test84|Qawsed1$|20     | Transacción interbancaria|
      |test85|Qawsed1$|20     | Transacción interbancaria|