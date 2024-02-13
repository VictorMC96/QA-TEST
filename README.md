# Prueba Técnica - Tester
La siguiente es una prueba para evaluar a los postulantes para un perfil de **Tester**.

## INTRODUCCIÓN
Este repositorio contiene una serie de requerimientos de un Caso Práctico, que busca evaluar las capacidades técnicas del candidato con respecto a las principales funciones y responsabilidades que se requieren dentro del área de Desarrollo de software de Neology.

#### ¿Qué se busca evaluar?
Principalmente los siguientes aspectos:
* Creatividad para resolver los requerimientos,
* Uso de experiencia y conocimiento en base a metodologías para creación de los casos de prueba,
* Eficiencia de los algoritmos entregados,
* Mostrar la experencía y la manera de poder salir de la caja para romper o identificar cualquier falla o mejora,
* Familiaridad con Frameworks y plataformas de pruebas.

## IMPORTANTE
1. Realizar los casos de prueba en jherkin.
2. Recomendamos emplear un máximo de **3 (tres) horas** y enviar todo lo que puedas, se podrá validar con lso registros de Github.
4. Se requiere de una **cuenta de GitHub** para realizar este ejercicio.
5. **Antes de comenzar a contestar:**
    * Realizar un `Fork` de este repositorio
    * Clonar el fork a su máquina local  `git clone git@github.com:USERNAME/FORKED-PROJECT.git`
    * Crear un `branch` en su cuenta de GitHub utilizando su nombre completo.
6. **Al finalizar**, existen 2 (dos) opciones para entregar su proyecto:
    * 1) Realizar un `Commit` de su proyecto, **enviar un `Pull Request` al branch con su NOMBRE**, y notificar a la siguiente dirección de correo electrónico  [vmiranda@neology.mx](mailto:vmiranda@neology.mx).
    * 2) Crear un archivo comprimido (_.zip_ o _.rar_) de su proyecto y enviar a la siguiente dirección de correo electrónico  [vmiranda@neology.mx](mailto:vmiranda@neology.mx).

  NOTA:Como tester buscamos a alguien minucioso por lo que siéntete libre de agregar los comentarios que veas oportunos :D .

## EJERCICIOS

###PARTE 1 - Creación de casos de uso #

Recuerda que en cada escenario de prueba Gherkin debes proporcionar pasos claros, condiciones y resultados esperados. Este examen evalúa tu capacidad para diseñar casos de uso exhaustivos para la aplicación de movilidad, considerando la integración entre el backend, back office y las aplicaciones móviles, agrega los casos de prueba que consideres importante por validar las funcionalidades primordiales.

**Examen de Tester - Casos de Uso con Gherkin para Compañía de Movilidad**

**Instrucciones:**
- Este examen se centra en la creación de casos de uso utilizando jherkin para probar un sitio web que gestiona transacciones reportadas por usuarios desde aplicaciones móviles en iOS y Android, integrando backend, back office y aplicaciones móviles.
- Cada pregunta requiere que escribas escenarios de prueba en formato Gherkin para el caso de uso indicado. Por favor, asegúrate de incluir pasos, condiciones y resultados esperados.
- Se espera que consideres la minuciosidad en las pruebas, especialmente en la integración entre el backend, back office y las aplicaciones móviles, dada la alta carga de transacciones esperadas.

**Pregunta 1: Registro de Usuario desde la Aplicación Móvil (iOS y Android)**

Escribe un escenario de prueba Gherkin para verificar el proceso de registro de un nuevo usuario desde ambas aplicaciones móviles (iOS y Android). Asegúrate de incluir condiciones y resultados esperados.

**Pregunta 2: Reporte de Transacciones desde la Aplicación Móvil (iOS)**

Escribe un escenario de prueba Gherkin para verificar la capacidad de la aplicación móvil en iOS para reportar transacciones. Asegúrate de considerar la integración con el backend y el procesamiento en el back office.

**Pregunta 3: Integración de Backend y Back Office para Procesar Transacciones**

Escribe un escenario de prueba Gherkin para asegurar que las transacciones reportadas desde las aplicaciones móviles (iOS y Android) se procesen correctamente en el backend y el back office.

**Pregunta 4: Visualización de Historial de Transacciones en el Sitio Web**

Escribe un escenario de prueba Gherkin para verificar la funcionalidad que permite a los usuarios ver su historial de transacciones en el sitio web. Asegúrate de considerar la integración entre el frontend del sitio web y el backend.

**Pregunta 5: Pruebas de Rendimiento para Manejar Alta Carga de Transacciones**

Escribe un escenario de prueba Gherkin para evaluar el rendimiento del sistema al manejar una carga alta de transacciones simultáneas. Asegúrate de considerar la integración entre todas las partes del sistema.

**Pregunta 6: Actualización de Estado de Transacción desde la Aplicación Móvil (Android)**

Escribe un escenario de prueba Gherkin para verificar la capacidad de la aplicación móvil en Android para actualizar el estado de una transacción. Asegúrate de incluir pasos, condiciones y resultados esperados.

----

### PARTE 2 Ejercicios técnicos #

**EJERCICIO 1 Escribe un programa en Java que verifique si una palabra es un palíndromo. Un palíndromo es una palabra que se lee igual de izquierda a derecha que de derecha a izquierda.**


**EJERCICIO 2 Genera los referentes identificadores (xpath) para un mismo elemento en selenium y appium**

---
### PARTE 3 Preguntas abiertas #

**Pregunta 1: ¿Cuál es la diferencia entre pruebas de carga y estrés?**
Tienen objetivos diferentes pero al mismo tiempo se encuentran relacionados. Lo que los hace difentes  es en el manejo los resultados esperados; las pruebas de carga miden el rendimiento de un sistema bajo condiciones típicas aplicando la carga prevista.Las pruebas de estrés someten al sistema a una gran presión para encontrar los puntos de fallo o insconsitencia que se llegue a prensetar dentro de la misma.

**Pregunta 2: ¿Qué probarías si tuvieras que probar una nueva versión que solventa un bug crítico en producción?**
Como primer paso realizaría un retest del cambio, validando en los ambientes de Qa y Preproductivo no se esté presentando el hallazgo anteriormente reportado. Cómo segundo paso ejecutaría un ciclo de pruebas de regresión para validar que el cambio efectuano no haya afectado flujos alternos de la aplicación.

**Pregunta 3: ¿Cómo reportarías los bugs encontrados hacía los desarrolladores?**
Lo reportaría en la herramienta oficial del proyecto agregando las siguientes espeficaciones:
Descripción: Se detalla de forma generar el hallazgo que se está presentando dentro de una aplicación
Precondiciones: Se agrega el requisito para poder ejecutar el flujo, un ejemplo es: "Contar un usuaro registrado en mongodb y que tenga un perfil N1".
Pasos del actor: Se detallan los pasos para llegar a la sección en dónde fue encontrado el bug.
Resultado esperado: Se coloca el dato de la pantalla esperada acorde al diseño acordado con el Produc Owner.
Datos de prueba: Se incorpora la verisón del navegador o dispositivo, el ambiente y el userId con el que se hizo la prueba.

**Pregunta 4: ¿Cómo le darías seguimiento a bugs reportados a Desarrollo?**
Manadaría un correo directamente al desarrollador que está atendiendo el bug anteriormente le reporte, solicitandolé el estatus en el que se encuentra la solición del hallazgo. También en la herramienta oficial del proyecto, le estaría dando seguimiento para validar que haya cambiado de estatus para así poder validarla en el ambiente de QA 

**Pregunta 5: ¿Cuál serían los niveles de severidad que manejarías para reportar bugs y con base en qué?**
Los niveles de severidad que manejo son:
* Alta:
* Media:
* Baja

**Pregunta 6: ¿Puedes explicar qué es la metodología de pruebas Ágil y cuáles son sus principios fundamentales?**

**Pregunta 7: ¿Cuál es la diferencia entre pruebas funcionales y pruebas no funcionales? Proporciona ejemplos de cada una.**

**Pregunta 8: ¿Qué es la automatización de pruebas y cuáles serían algunos casos donde sería más beneficioso automatizar pruebas en lugar de realizar pruebas manuales?
Herramientas y Técnicas de Pruebas:**

**Pregunta 9: ¿Puedes mencionar algunas herramientas populares de automatización de pruebas y describir en qué escenarios podrían ser más útiles?**

**Pregunta 10: ¿Qué casos no automatizarías?**

En Neology somos fieles creyentes de la transparencia, honestidad, crecimiento y aprendizaje  por lo que agradecemos se pueda llevar a cabo la prueba sin ayuda de terceros o herramientas adicionales. 




