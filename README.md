# Documentación

## 1. ¿Qué has empezado implementando y por qué?

Lo primero que hice fue crear nuevas clases y variables además de extraer métodos para hacer el código más legible.

## 2. ¿Qué problemas te has encontrado al implementar los tests y cómo los has solventado?

Al ser un tema totalmente nuevo para mí, al principio he tardado un poco al comprender
su funcionamiento para ello he hecho consultas a la API de java y a diversos foros de internet.

## 3. ¿Qué componentes has creado y por qué?

He creado una clase Ciudad ya en el código original se pasa el nombre de la ciudad
como un String y eso limitaría mucho el código en el caso de que a una ciudad quisiéramos añadirle
más atributos. También he declarado los enlaces como "final" ya que no cambian a lo largo de la ejecución del programa. Cierto es 
que también se podría haber hecho uso de la clase URL y tratar a los difrentes enlaces como objetos. Otro componente que he creado
ha sido la clase Httprequest ya que es mejor que cada clase se encargue de hacer una sola cosa (principio de Single Responsibility)

## 4. Si has utilizado dependencias externas, ¿por qué has escogido esas dependencias?

Solo se ha usado las dependencias que ya estaban incluidas en el código.

## 5. ¿Has utilizado  streams, lambdas y optionals de Java 8? ¿Qué te parece la programación funcional?

No he usado streams ni lambdas ya que he diseñando la solución basándome en el paradigma de programación orientada a objetos.
La programación funcional me parece muy interesante ya que se centra más en las funciones necesarias para producir un resultado
y no en los cálculos para llegar a ese resultado. Es decir pone más atención al "¿Qué?" que al "¿Cómo?". Resulta muy útil a la hora
de producir un código limpio ya que reduce de manera significativa el número de líneas de código.

## 6. ¿Qué piensas del rendimiento de la aplicación? 

Hay muchos factores a tener en cuenta para contestar a esta pregunta
Los dos factores más importantes son la velocidad del procesador y el ancho de banda de la red
En mi caso la aplicación se ejecuta relativamente rápido ya que tarda unos escasos segundos.

## 7. ¿Qué harías para mejorar el rendimiento si esta aplicación fuera a recibir al menos 100 peticiones por segundo?

La primera pregunta que nos deberíamos hacer es :¿Que está causando el cuello de botella? Para ello podríamos usar
un perfilador para ver que parte del código es la que genera el principal cuello de botella. A continuación se pueden
realizar varias optimizaciones para que el código se ejecute más rápido. Algunas que se me ocurren son:

    1. Limpiar el código
    2. Usar StringBuilder en lugar de "+" para strings largos
    3. En el caso de los "for" si iteramos un array es mejor declarar la longitud del array como una variable a parte, fuera del bucle
    4. Hacer uso de la cache
    
Otro enfoque distinto que no he mencionado es la opción del procesado multihilo, es decir ejecutar la aplicación en 
distintos hilos del procesador para que se ejecute a una mayor velocidad.

## 8. ¿Cuánto tiempo has invertido para implementar la solución?

El tiempo invertido lo he divido en diversas categorias

    1. Identificación del problema y pensar la solución: 45 min - 1 hora.
    2. Comprobar el funcionamiento del programa: 15 min.
    3. Programar la solución: 4 horas 
    4. Documentación: 1 hora
    
    Unas 6 horas aproximadamente

## 9. ¿Crees que en un escenario real valdría la pena dedicar tiempo a realizar esta refactorización?

Personalmente pienso que lo ideal sería siempre refactorizar el código para que sea más legible y mantenible, pero la realidad es que no siempre es posible ya que tenenos que tener en cuenta facotres como el presupuesto del proyecto, la importancia de la funcionalidad, el tiempo disponible además de las incidencias imprevistas que pueden surgir durante el proyecto.


