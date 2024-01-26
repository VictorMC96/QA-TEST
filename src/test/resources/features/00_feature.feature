@login @web
Feature: Login

    ##Pregunta 1: Registro de Usuario desde la Aplicación Móvil (iOS y Android)
    #Escribe un escenario de prueba Gherkin para verificar el proceso de registro
    #de un nuevo usuario desde ambas aplicaciones móviles (iOS y Android). Asegúrate
    #de incluir condiciones y resultados esperados.
  @hp @prioridad-alta @regression
  Scenario: Registro de Usuario desde la Aplicación Móvil (Android)
    Given que soy un nuevo usuario en la app "Andriod"
    When Me registro como un usuario nuevo
    And Se despliega la informacion para registro de nuevo usuario
    And Lleno los datos de registro
    Then Se crea mi cuenta en la app

  @hp @prioridad-alta @regression
  Scenario: Registro de Usuario desde la Aplicación Móvil (iOS)
    Given que soy un nuevo usuario en la app "iOS"
    When Me registro como un usuario nuevo
    And Se despliega la informacion para registro de nuevo usuario
    And Lleno los datos de registro
    Then Se crea mi cuenta en la app

    #Pregunta 2: Reporte de Transacciones desde la Aplicación Móvil (iOS)
    #Escribe un escenario de prueba Gherkin para verificar la capacidad de la
    #aplicación móvil en iOS para reportar transacciones. Asegúrate de considerar
    #la integración con el backend y el procesamiento en el back office.
  Scenario: Reporte de Transacciones desde la Aplicación Móvil (iOS)
    Given que me conecto al endpoint transacciones
    When Posteo transacciones
    Then La api responde con un codigo "200"
    And Ingreso como usuario registrado del back office
    Then Valido que la transaccion se muestre en los registros del back office

    #Pregunta 3: Integración de Backend y Back Office para Procesar Transacciones
    #Escribe un escenario de prueba Gherkin para asegurar que las transacciones
    #reportadas desde las aplicaciones móviles (iOS y Android) se procesen
    #correctamente en el backend y el back office.
  Scenario Outline: Integración de Backend y Back Office para Procesar Transacciones
    Given que me conecto al endpoint procesar transacciones
    When Proceso <transacciones>
    Then La api responde con un codigo "200"
    And Ingreso como usuario registrado del back office
    Then Valido que las <transacciones procesadas> se muestre en los registros del back office
    Examples:
      | transacciones  | transacciones procesadas |
      | Pago pendiente | Pago Pendiente           |
      | Pago procesado | Pago Procesado           |
      | Pago declinado | Pago declinado           |

    #Pregunta 4: Visualización de Historial de Transacciones en el Sitio Web
    #Escribe un escenario de prueba Gherkin para verificar la funcionalidad que
    #permite a los usuarios ver su historial de transacciones en el sitio web.
    #Asegúrate de considerar la integración entre el frontend del sitio web y el backend.
  Scenario: Visualización de Historial de Transacciones en el Sitio Web
    Given que soy un usuario con sesion iniciada en la app web
    When Ingreso a mi historial de transacciones
    And Recupero de la api historial de transacciones las transacciones
    Then Comparo el historial de transacciones recuperado por la api con lo que se muestra en el sitio web

    #Pregunta 5: Pruebas de Rendimiento para Manejar Alta Carga de Transacciones
    #Escribe un escenario de prueba Gherkin para evaluar el rendimiento del sistema
    #al manejar una carga alta de transacciones simultáneas. Asegúrate de considerar
    #la integración entre todas las partes del sistema.
  Scenario Outline: Pruebas de Rendimiento para Manejar Alta Carga de Transacciones
    Given que me conecto al endpoint transacciones
    When Posteo <cantidad> transaction
    Then La api responde con un codigo "200"
    And Valido que las transacciones aparezcan en el back office con un usuario registrado y con un tiempo menor a <tiempo back office>
    Then valido que el tiempo de respuesta en el back y front sea menor a <tiempo en back> y <tiempo front>
    Examples:
      | cantidad | tiempo back office| tiempo en back | tiempo front |
      |   1500   |        4s         |     300ms      |     5s       |

    #Pregunta 6: Actualización de Estado de Transacción desde la Aplicación Móvil (Android)
    #Escribe un escenario de prueba Gherkin para verificar la capacidad de la aplicación móvil
    #en Android para actualizar el estado de una transacción. Asegúrate de incluir pasos,
    #condiciones y resultados esperados.
  Scenario: Actualización de Estado de Transacción desde la Aplicación Móvil (Android)
    Given que soy un usuario con sesion iniciada en la app
    When actualizo una transaccion a procesada
    Then la transaccion se actualiza con el nuevo estatus