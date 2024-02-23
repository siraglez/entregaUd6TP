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


# Ejercicio 2: Simulador de Batalla Naval Mejorado

Este código en Java representa un simulador simple del juego de Batalla Naval. El programa utiliza interfaces para definir operaciones relacionadas con el tablero, la entrada de datos y las acciones de la Batalla Naval. La clase `SimuladorBatallaNavalMejorado` implementa estas interfaces y proporciona las implementaciones específicas de los métodos.

## 1. Interfaces:

- **TableroOperaciones:** Define métodos para crear un tablero, inicializarlo y mostrarlo.
- **EntradaDatos:** Define un método para introducir un entero entre límites, utilizando un objeto `Scanner`.
- **BatallaNaval:** Define un método para disparar al tablero en unas coordenadas dadas.

## 2. Clase `SimuladorBatallaNavalMejorado`:

- **Método `main`:** Es el punto de entrada principal del programa. Aquí se instancia la clase `SimuladorBatallaNavalMejorado`, se crea un tablero, se inicializa y se muestra. Luego, se solicitan datos al usuario para determinar las coordenadas del disparo, se realiza el disparo y se imprime el resultado.
- **Método `crearTablero`:** Implementación de la interfaz `TableroOperaciones`. Devuelve una nueva matriz de caracteres 4x4 que representa el tablero.
- **Método `inicializarTablero`:** Implementación de la interfaz `TableroOperaciones`. Utiliza un generador de números aleatorios (`Random`) para colocar dos barcos aleatorios en el tablero, asegurándose de que las celdas no estén ocupadas por otros barcos.
- **Método `mostrarTablero`:** Implementación de la interfaz `TableroOperaciones`. Imprime el contenido del tablero en la consola, mostrando '_' para celdas vacías y el contenido de la celda para barcos o disparos.
- **Método `introducirEnteroEntreLimites`:** Implementación de la interfaz `EntradaDatos`. Solicita al usuario un número entre un rango específico y verifica que la entrada sea válida (un entero).
- **Método `disparar`:** Implementación de la interfaz `BatallaNaval`. Verifica si la celda en las coordenadas indicadas contiene un barco. Si es así, marca la celda como 'X' (barco impactado) y devuelve `true`; de lo contrario, marca la celda como 'O' (agua) y devuelve `false`.

En resumen, este programa simula una partida de Batalla Naval, permitiendo al usuario disparar a un tablero con dos barcos aleatorios y mostrando el resultado de cada disparo. Utiliza interfaces para organizar las operaciones y facilitar la expansión o modificación del programa en el futuro.

# Pseudocódigo

```java
#Definición de la interfaz TableroOperaciones
Interfaz TableroOperaciones:
    Método crearTablero()
    Método inicializarTablero(tablero: Matriz de Caracteres)

#Definición de la interfaz EntradaDatos
Interfaz EntradaDatos:
    Método introducirEnteroEntreLimites(scanner: Objeto Scanner, mínimo: Entero, máximo: Entero)

#Definición de la interfaz BatallaNaval
Interfaz BatallaNaval:
    Método disparar(tablero: Matriz de Caracteres, fila: Entero, columna: Entero)

#Implementación de la clase SimuladorBatallaNavalMejorado que implementa las interfaces
Clase SimuladorBatallaNavalMejorado implementa TableroOperaciones, EntradaDatos, BatallaNaval:
    #Método principal (main)
    Método principal()
        #Crear instancia de la clase
        simulador = new SimuladorBatallaNavalMejorado()

        #Crear tablero, inicializarlo y mostrarlo usando los métodos de la interfaz TableroOperaciones
        tablero = simulador.crearTablero()
        simulador.inicializarTablero(tablero)
        simulador.mostrarTablero(tablero)

        #Recibir datos del usuario usando el método de la interfaz
        scanner = new Scanner(System.in)
        fila = simulador.introducirEnteroEntreLimites(scanner, 1, 4)
        columna = simulador.introducirEnteroEntreLimites(scanner, 1, 4)

        #Imprimir resultado
        resultado = simulador.disparar(tablero, fila, columna)

        Si resultado es Verdadero
            Imprimir("Tocado y hundido")
        Sino
            Imprimir("Agua")

    #Implementación del método crearTablero de la interfaz TableroOperaciones
    Método crearTablero()
        Devolver Nueva Matriz de Caracteres de tamaño 4x4

    #Implementación del método inicializarTablero de la interfaz TableroOperaciones
    Método inicializarTablero(tablero: Matriz de Caracteres)
        rand = new Random()

        #Colocar 2 barcos aleatorios en el tablero
        Para cada barco en rango de 0 a 2
            fila = rand.nextInt(4)
            columna = rand.nextInt(4)

            #Verificar si la celda ya está ocupada por otro barco
            Mientras tablero[fila][columna] es igual a 'B'
                fila = rand.nextInt(4)
                columna = rand.nextInt(4)

            #Colocar el barco en la posición generada
            tablero[fila][columna] = 'B'

    #Implementación del método mostrarTablero de la interfaz TableroOperaciones
    Mçetodo mostrarTablero(tablero: Matriz de Caracteres)
        Imprimir("Tablero:")

        Para cada fila en tablero:
            Para cada celda en fila:
                Si celda es igual a 0
                    Imprimir("_ ")
                Sino
                    Imprimir(celda + " ")
            Imprimir Nueva Linea

    #Implementación del método introducirEnteroEntreLimites de la interfaz EntradaDatos
    Método introducirEnteroEntreLimites(scanner: Objeto Scanner, mínimo: Entero, máximo: Entero)
        numero = 0
        Hacer
            Imprimir("Ingrese un número entre " + minimo + " y " + maximo + ": ")
            Mientras no scanner.hasNextInt()
                Imprimir("Por favor, ingrese un número válido")
                scanner.next()
            numero = scanner.nextInt()
        Mientras numero < minimo o numero > maximo
            Devovler numero

    #Implementación del método disparar de la interfaz BatallaNaval
    Método disparar(tablero: Matriz de Caracteres, fila: Entero, columna: Entero)
        Si tablero[fila - 1][columna - 1] es igual a 'B'
            tablero[fila - 1][columna - 1] = 'X' #Barco impactado
            Devolver Verdadero
        Sino
            tablero[fila - 1][columna - 1] = 'O' #Agua
            Devolver Falso

```

# Diagrama UML

El diagrama se encuentra en el paquete del ejercicio en (`diagramaUML.puml `).
