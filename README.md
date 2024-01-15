# Prueba Técnica - Programador (Back-end)
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

###PARTE 1 - Creación de casos de uso 
## Path de los ejercicios Gherkin: src/test/resources/features/00_feature.feature

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
## Path de los ejercicios técnicos: src/test/java/parte02/
**EJERCICIO 1 Escribe un programa en Java que verifique si una palabra es un palíndromo. Un palíndromo es una palabra que se lee igual de izquierda a derecha que de derecha a izquierda.**


**EJERCICIO 2 Crea una clase en Java que represente una cuenta bancaria. La clase debe tener métodos para depositar, retirar y obtener el saldo actual. También, implementa un programa que utilice esta clase para realizar algunas operaciones bancarias básicas.**


**EJERCICIO 3 Genera los referentes identificadores para un mismo elemento en selenium y appium**

---
### PARTE 3 Prreguntas abiertas #

**Pregunta 1: ¡Cuál es la diferencia entre pruebas de carga y estrés?**
Caga. valida el rendimiento del sistema cuando se somete a una carga normal o esperada.
Estrés. Valida la estabilidad y el comportamiento del sistema bajo condiciones extremas o más allá de sus capacidad normal.

**Pregunta 2: ¿Qué probarías si tuvieras que probar una nueva versión que solventa un bug crítico en producción?**
Probaría primeramente que el bug encontrado haya quedado solucionado, sin embargo, es necesario correr las pruebas 
de regresión en un ambiente de QA o Staging, ya que esa nueva versión que se genera es una nueva versión de código, 
en otras palabras la versión anterior suponiendo un número cualquiera, la versión 1.5 fue probada antes pero la nueva
versión liberada es la versión 1.6 (la versión que contiene la corrección del bug crítico) se deberían de ejecutar 
nuevamente las pruebas (regresión) ya que este software generado es uno completamente nuevo donde las pruebas de la versión 1.5 son
invalidas para la versión 1.6.

**Pregunta 3: ¿Cómo reportarías los bugs encontrados hacía los desarrolladores?**
Usualmente mediante herramientas de defect management (ALM, Un ticket de jira del tipo bug, un defecto en otras herramientas)

**Pregunta 4: ¿Cómo le darías seguimiento a bugs reportados a Desarrollo?**
Usualmente con herramientas de defect management, donde estos bugs tienen estatus por ejemplo:
asignado, resuelto, liberado a un ambiente, lista para hacer prueba de confirmación (re-test), cerrado,
re-abierto. Estos estatus normalmente van acompañados de la asignación entre quien levanta el defecto (QA), 
quien lo corrige (DEV back o front), y quien reafirma que los defectos estén corregidos para después cerrarlos o 
darles algún otro tratamiento (QA).

**Pregunta 5: ¿Cuál serían los niveles de severidad que manejarías para reportar bugs y con base en qué?**
Crito, alto, medio, bajo. Depende mucho del contexto de negocio que tengamos pero en general giran entorno a 
que tan mal pueden hacer ver al negocio que representamos, por ejemplo, un defecto donde el logo de la empresa
aparezca cambiado podría dañar la reputación de la empresa para la cual trabajamos, eso sería un defecto bajo pero
de una criticidad alta dado lo que podría pasar si eso llegara a producción.

**Pregunta 6: ¿Puedes explicar qué es la metodología de pruebas Ágil y cuáles son sus principios fundamentales?**
Las metodologías ágiles se basan mucho en conceptos como aplicar shift left testing (comenzar las pruebas lo antes posible,
o tan pronto como sea posible) esto se centra en comenzar mas hacia la izquierda, con ayuda de actores como el Scrum Master y 
el Agile Coach tener estrategias para poder determinar historias de usuario pequeñas o atómicas, de tal forma que entre todo el
equipo de trabajo ágil (PO, SM, y DEV Team, siendo el dev team, Devs back, front, QA, UI/UX) puedan crear un incremento potencial
para el sprint (usualmente con periodo 2 semanas), pueden aplicar métodos como entregar un MVP, aplicar el método INVEST (Independient,
Negociable, Valuable, Estimable, Pequeña y Testeable) a los reqs/HU, mayormente el equipo ágil prefiere la automatización para sus 
entregas, automatización de infraestructura, datos de prueba, pruebas unitarias, de componente, de integración, de back, de front,
esto ayuda a gradualmente ser más eficientes para despues introducir la entrega y despliegue continuo, metodologías como aplicar
TDD - Test Driven Development (pensar primero en la prueba que tiene que pasar mi método clase o función antes de ser implementado,
para posterior a eso crear el código para que la prueba pase y al final refactorizar), BDD - Behaviour Driven Development para pensar
los reqs/HU en un formato de como creemos que se va a comportar la funcionalidad (usualmente siendo este el criterio de aceptación en formato Dado, Cuando, y Entonces), sin embargo estos equipos ágiles son muy abiertos a
la discusión para poder comprender mejor los requerimientos y poder hacer el trabajo más eficiente evitando los silos que existen 
entre áreas, la calidad es responsabilidad de todo el equipo y no solo de un silo como habitualmente suele serlo, responsabilidad de
la calidad y las pruebas, el área de QA.

**Pregunta 7: ¿Cuál es la diferencia entre pruebas funcionales y pruebas no funcionales? Proporciona ejemplos de cada una.**
Las pruebas funcionales van mas sentradas en lo que debería de hacer la aplicaión, usualmente son sacados de los reqs/HU para
proponer posibles casos de prueba.
Las pruebas no funcionales estan enfocadas a aspectos no funcionales del software como son: Pruebas de rendimiento, usabilidad,
seguridad, fiabilidad, mantenibilidad, interoperabilidad.

**Pregunta 8: ¿Qué es la automatización de pruebas y cuáles serían algunos casos donde sería más beneficioso automatizar pruebas en lugar de realizar pruebas manuales?
Herramientas y Técnicas de Pruebas:**
La automatización de pruebas es la facultad de poder convertir casoso de prueba en scripts de prueba automatizados, es decir que puedan ejecutarse automáticamente bajo demanda.
Algunos de los casos más beneficiosos serían:
La automatización puede ejecutar más pruebas en menos tiempo, lo que su vez ayuda a aumentar la cobertura de las pruebas (es decir, ahora tengo más tiempo para probar nuevas funcionalidades ya que se delegó una parte a la automatización).
Las pruebas automatizadas siempre ejecutarán los mismo pasos en el mismo orden, lo que proporciona una mayor fiabilidad, repetibilidad y mejora en la consistencia.
Al probar antes con el uso de pruebas automatizadas, la detección y corrección de defectos es menos costosa.
Es posible acelerar los ciclos de pase a producción con un menor riesgo de regresión.
Al automatizar las pruebas complejas y difíciles de ejecutar manualmente, se reduce la carga de trabajo de las pruebas manuales.
El uso de técnicas basadas en datos o palabras clave permite generar más pruebas añadiendo más acciones/datos sin necesidad de modificar los scripts.
Las mismas pruebas pueden ejecutarse con distitntas configuraciones de hardware y software, lo que permite automatizar las pruebas de compatibilidad.
Los tester disponen de más tiempo para explorar nuevas áreas del software que antes no se habían probado, lo que se traduce en un software de mayor calidad.
Al mejorar la frecuencia de las pruebas (en particular, las pruebas de regresión), es posible realizar las pruebas continuas que requieren las iniciativas DevOps.

Herramientas: Selenium con cualquier lenguaje soportado, Java, Python, Ruby, C#, JS, Appium, usualmente haciendo una envolvente con Cucumber/Behave/Specflow. Cypress, CodeceptJS, Robot Framework, Katalon Studio, Tosca, UFT One, Ascential Test.
Técnicas: TDD - Test Driven Development, BDD - Behaviour Driven Development, DDT - Data Driven Test, KD - Key Word Driven, POM - Page Object Model, Screen Play, Page Factory.

**Pregunta 9: ¿Puedes mencionar algunas herramientas populares de automatización de pruebas y describir en qué escenarios podrían ser más útiles?**
Herramientas: Selenium con cualquier lenguaje soportado, Java, Python, Ruby, C#, JS, Appium, usualmente haaciendo una envolvente con Cucumber/Behave/Specflow. Cypress, CodeceptJS, Robot Framework, Katalon Studio, Tosca, UFT One, Ascential Test.
Son útilies en el contexto del negocio, si toda la empresa utiliza Java, entonces deberiamos crear frameworks de automatización de prueba en el mismo lenguaje en el que esta contruida la aplicación, ya que esto ayuda a que todos podamos comprender de una mejor manera el lenguaje utilizado e inclusive podría ser pauta para que todo el equipo pueda comenzar a utilizarlos, de manera local y aplicando conceptos como shift left testing.

**Pregunta 10: ¿Qué casos no automatizarías?**
Aquellos que van a ser cambiados en los siguientes 2 o 3 releases (es decir, es poco probable que el caso de prueba cambie con frecuencia).
Aquellos que contengan un proceso batch o requieran una pausa para volver a retomar el flujo.
Aquellos donde se requiera un captcha.
Aquellos donde se necesite una validación de un tercero (por ejemplo una aplicación bancaría que requiera un token físico, donde una person tendría que encender ese token físico e introducirlos en la app).
Aquellos en donde la aplicación aún no es estable.
Aquellos en donde la herramienta de automatización está limitada tecnológicamente (imaginemos un escenario web donde despues tendría que validar algo descargado en el filesystem, suponiendo que solo hemos utilizado selenium este escenario no podría quedar totalmente automatizado hasta tener una investigación más profunda de como podríamos llegar al filesystem utilizando el lenguaje que se utilizo para crear el framework de selenium)

En Neology somos fieles creyentes de la transparencia, honestidad, crecimiento y aprendizaje por lo que agradecemos se pueda llevar a cabo la prueba sin ayuda de terceros o herramientas adicionales. 




