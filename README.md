link al repositorio: https://github.com/siraglez/entregaUd6TP.git

# Ejercicio 1: Comparación y Clasificación de Números

Este código Java implementa una aplicación simple que solicita al usuario dos números, calcula el mayor de los dos y clasifica la relación entre ellos. La implementación utiliza interfaces para organizar las funciones relacionadas y proporciona métodos específicos para obtener un número, encontrar el mayor de dos números y clasificar dos números:

## 1. Interfaz `ObtenerNumero`:

- La interfaz define un único método `obtenerNumero` que toma un mensaje como parámetro y devuelve un número ingresado por el usuario. Esta interfaz permite la entrada de datos.

## 2. Interfaz `CompararYClasificarNumeros`:

- La interfaz define dos métodos: `mayorDeDos` y `clasificarNumeros`. `mayorDeDos` devuelve el mayor de dos números, y `clasificarNumeros` clasifica la relación entre los dos números.

## 3. Clase `ComparacionYClasificacionNumeros`:

- La clase implementa ambas interfaces (`ObtenerNumero` y `CompararYClasificarNumeros`).
- El método `obtenerNumero` solicita al usuario un número mediante la entrada estándar y lo devuelve.
- El método `mayorDeDos` determina y devuelve el mayor de dos números.
- El método `clasificarNumeros` devuelve 0 si los números son iguales, 1 si el primero es mayor y -1 si el segundo es mayor.

## 4. Función Principal (`main`):

- En el método `main`, se crea una instancia de la clase `ComparacionYClasificacionNumeros`.
- Se utilizan los métodos de la interfaz para obtener dos números del usuario, calcular el mayor de dos y clasificar la relación entre ellos.
- Finalmente, se imprime el resultado en la consola.

En resumen, este código demuestra el uso de interfaces para organizar funciones relacionadas, permitiendo una mayor modularidad y facilitando la implementación de nuevas funcionalidades en el futuro. La aplicación en sí misma es simple y se centra en la entrada de datos, la comparación y la clasificación de números.

# Pseudocódigo

```java
#Definición de la interfac ObtenerNumero
Interfaz ObtenerNumero:
    Función obtenerNumero(mensaje: Cadena)

#Definición de la interfaz CompararYClasificarNumeros
Interfaz CompararYClasificarNumeros:
    Función mayorDeDos(numero, numero2)
    Función clasificarNumeros(numero1, numero2)

#Definición de la clase ComparacionYClasificacionNumeros que implementa las interfaces
Clase ComparacionYClasificacionNumeros implementa ObtenerNumero, CompararYClasificacionNumeros:
    #Implementación de la función obtenerNumero de la interfaz ObtenerNumero
    Función obtenerNumero(mensaje: Cadena)
        scanner = CrearInstancia(Scanner, System.in)
        Imprimir(mensaje)
        Devolver scanner.SiguienteEntero()

    #Implementación de la función mayorDeDos de la interfaz CompararYClasificarNumeros
    Función mayorDeDos(numero1, numero2):
        Si numero1 > numero2 Entonces:
            Devolver numero1
        Sino
            Devolver numero2

    #Implementación de la función clasificarNumeros de la interfaz CompararYClasificarNumeros
    Función clasificarNumeros(numero1, numero2):
        Si numero1 == numero2 Entonces:
            Devolver 0
        Sino Si numero1 > numero2 Entonces:
            Devolver 1
        Sino:
            Devolver -1

#Función principal (main)
Función Principal
    #Crear instancia de la clase
    programa = CrearInstancia(ComparacionYClasificacionNumeros)

    #Obtener los dos números del usuario usando el método de la interfaz ObtenerNumero
    numero1 = programa.obtenerNumero("Ingrese el primer número: ")
    numero2 = programa.obtenerNumero("Ingrese el segundo número: ")

    #Calcular el mayor de los dos números y la clasificación usando los métodos de la interfaz CompararYClasificarNumeros
    mayor = programa.mayorDeDos(numero1, numero2)
    clasificacion = programa.clasificarNumeros(numero1, numero2)

    #Imprimir el resultado
    Imprimir("El mayor es: " + mayor + " y la clasificación es: " + clasificacion)
```

# Diagrama UML

El diagrama se encuentra en el paquete del ejercicio en (`diagramaUML.puml `).
