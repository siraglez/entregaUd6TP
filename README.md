link al repositorio: https://github.com/siraglez/entregaUd6TP.git

# Ejercicio 1: Comparación y Clasificación de Números

El código es un programa en Java que realiza la comparación y clasificación de dos números ingresados por el usuario. A continuación, se presenta una explicación del código en texto:

## 1. Función para Obtener un Número del Usuario:

- La función `obtenerNumero` solicita al usuario que ingrese un número mostrando un mensaje.
- Utiliza la clase `Scanner` para leer la entrada del usuario desde la consola.

## 2. Función que Devuelve el Mayor de Dos Números:

- La función `mayorDeDos` toma dos números como parámetros y devuelve el mayor de los dos.
- Utiliza una estructura condicional (`if`) para comparar los números y retorna el mayor.

## 3. Función que Clasifica Dos Números:

- La función `clasificarNumeros` toma dos números como parámetros y retorna:
  - 0 si son iguales,
  - 1 si el primero es mayor,
  - -1 si el segundo es mayor.
- Utiliza estructuras condicionales para realizar las comparaciones.

## 4. Función Principal (`main`):

- En la función principal, se obtienen dos números del usuario utilizando la función `obtenerNumero`.
- Se calcula el mayor de los dos números y la clasificación utilizando las funciones previamente definidas.
- Se imprime el resultado, mostrando el mayor y la clasificación.

El programa utiliza la entrada y salida estándar (`System.in` y `System.out`) para interactuar con el usuario y realizar las operaciones de comparación.

# Pseudocódigo

```java
función obtenerNúmero(mensaje):
    imprimir(mensaje)
    return leerNúmeroDesdeConsola()

función mayorDeDos(número1, número2):
    si número1 > número 2:
        return número1
    return número2

función clasificarNúmeros(número1, número2):
    si número1 == número2:
        return 0
    si número1 > número2:
        return 1
    return -1

número1 = obtenerNúmero("Ingrese el primer número: ")
número2 = obtenerNúmero("Ingrese el segundo número: ")

mayor = mayorDeDos(número1, número2)
clasificación = clasificarNúmeros(número1, número2)

imprimir("El mayor es:", mayor, "y la clasificación es:", clasificación)
```

# Diagrama UML

El diagrama se encuentra en el paquete del ejercicio en (`diagramaUML.puml `).
