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

* El diagrama se encuentra en el paquete del ejercicio en (`diagramaUML.puml `).
* También se entregará una imagen del diagrama (algunos archivos `.puml` no funcionan correctamente).

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

* El diagrama se encuentra en el paquete del ejercicio en (`diagramaUML.puml `).
* También se entregará una imagen del diagrama (algunos archivos `.puml` no funcionan correctamente).

# Ejercicio 3: Manipulación de Tablas y Búsqueda de Máximos

* Este código Java define dos interfaces, `GeneradorTablaAleatoria` y `FinderMayor`, que proporcionan la capacidad de generar tablas aleatorias y encontrar el valor máximo en una tabla, respectivamente. Luego, estas interfaces se implementan en la clase `ManipulacionTablas`.

## 1. Interfaces

* `FinderMayor`: Define una interfaz con un método `encontrarMayor` que toma una lista de enteros como parámetro y devuelve el valor máximo en esa lista.
* `GeneradorTablaAleatoria`: Define una interfaz con un método `crearTablaAleatoria` que toma un tamaño, un valor mínimo y un valor máximo como parámetros, y devuelve una lista de enteros que representa una tabla aleatoria con elementos en el rango especificado.

## 2. Implementación de las interfaces

* `ManipulacionTablas`: Implementa ambas interfaces (`GeneradorTablaAleatoria` y `FinderMayor`). En el método `crearTablaAleatoria`, genera una tabla de números aleatorios con el tamaño especificado y dentro del rango dado. En el método `encontrarMayor`, busca y devuelve el valor máximo en la tabla dada.

## 3. Programa principal (`ManipulacionTablasYBusquedaMaximos`)

* En el método `main`, se accede a las interfaces desde el programa principal creando instancias de la clase `ManipulacionTablas` y asignándolas a las variables `generadorTablaAleatoria` y `finderMayor`.
* Se utiliza el método `crearTablaAleatoria` para generar una tabla aleatoria de 10 elementos con valores entre 1 y 100.
* Se utiliza el método `encontrarMayor` para determinar el valor máximo en la tabla generada.
* Finalmente, se imprime la tabla y el valor máximo utilizando `System.out.println`.

En resumen, este código ejemplifica el uso de interfaces para abstraer la funcionalidad relacionada con la manipulación de tablas y búsqueda de valores máximos, proporcionando una estructura modular y fácilmente intercambiable para estas operaciones. Además, el programa principal muestra cómo utilizar estas interfaces para realizar operaciones específicas en una instancia concreta de la clase `ManipulacionTablas`.

# Pseudocódigo:

```java
#Interfaz para encontrar el mayor valor en una tabla
Interfaz FinderMayor:
    función encontrarMayor/tabla: lista de enteros)

#Interfaz para la generación de tablas aleatorias
Interfaz GeneradorTablaAleatoria:
    función crearTablaAleatoria(tamanio: entero, minimo: entero, maximo: entero)

#Implementación de las interfaces en una clase
clase ManipulacionTablas implementa GeneradorTablaAleatoria, FinderMayor:
    función crearTablaAleatoria(tamanio, minimo, maximo)
        tabla = lista vacía de enteros
        para i de 1 hasta tamanio hacer:
            agregar (aleatorioEntre(minimo, maximo)) a tabla
        fin para
        devolver tabla
    fin función

    función encontrarMayor(tabla)
        mayor = obtenerElementoEnPosicion(tabla, 0)
        para cada valor en tabla hacer:
            si valor > mayor entonces:
                mayor = valor
            fin si
        fin para
        devolver mayor
    fin función

#Clase con el programa principal
clase ManipulacionTablasYBusquedaMaximos
    #Acceder a las interfaces desde el programa principal
    generadorTablaAleatoria = nueva instancia de ManipulacionTablas()
    finderMayor = nueva instancia de ManipulacionTablas()

    #Crear una tabla aleatoria de 10 elementos con valores entre 1 y 100
    tabla = generadorTablaAleatoria.crearTablaAleatoria(10, 1, 100)

    #Encontrar el mayor valor de la tabla
    mayor = finderMayor.encontrarMayor(tabla)

    #Imprimir la tabla y el valor mayor
    imprimir("Tabla: ")
    para cada valor en la tabla hacer:
        imprimir(valor + " ")
    fin para
    imprimir("n Mayor valor: " + mayor)
fin clase
```

# Diagrama UML

* El diagrama se encuentra en el paquete del ejercicio en (`diagramaUML.puml `).
* También se entregará una imagen del diagrama (algunos archivos `.puml` no funcionan correctamente).


# Ejercicio 4: Juego del Rebaño de Ovejas

Este código Java representa un juego simple llamado "JuegoRebanioOvejas". Aquí hay una explicación detallada:

## 1. Clase Posicion:

- Define una posición en el tablero con las coordenadas fila y columna.
- Tiene un constructor que inicializa la posición con las coordenadas proporcionadas.

## 2. Clase Tablero:

- Representa el tablero del juego.
- El tamaño del tablero está fijo en 8x8 (TAMANIO = 8).
- Tiene una matriz de caracteres (tablero) para almacenar el estado del juego.
- La inicialización del tablero se realiza en el método `inicializarTablero`, donde se llena con puntos (.) y se colocan algunas ovejas (O) en posiciones aleatorias.
- El método `toString` genera una representación visual del tablero con números de fila y columna.
- `obtenerValor` devuelve el valor en una posición específica del tablero.
- `realizarMovimiento` coloca una oveja en una nueva posición.

## 3. Clase JuegoRebanioOvejas:

- Contiene el método principal `main` donde se inicia el juego.
- Crea un objeto `Tablero` y un `Scanner` para entrada de usuario.
- En un bucle infinito, muestra el estado actual del tablero, solicita al usuario una posición para mover una oveja y realiza la acción si es válida.
- El juego continúa hasta que se alcanza un estado final (todas las celdas ocupadas) y muestra un mensaje de "¡Objetivo alcanzado!".

Es importante destacar que hay un problema en la implementación de `esConfiguracionFinal` donde intenta verificar si el tablero está completo revisando la representación de la cadena del tablero. La corrección sugerida es revisar directamente la matriz del tablero en lugar de depender de la cadena.

# Pseudocódigo

```java
clase Posición:
    Entero fila, columna

    Posicion(fila, columna):
        Esto.fila = fila
        Esto.columna = columna

clase Tablero:
    Constante entera TMANIO = 8
    Caracter tablero[TAMANIO][TAMANIO]

    Función inicializarTablero():
        Para fila de 0 hasta TAMANIO - 1
            Para columna de 0 hasta TAMANIO - 1
                tablero[fila][columna] = '.'
            fin para
        fin para

        #Agregar algunas ovejas al tablero
        Lista ovejas = generarPosicionesAleatorias(6)
        Para cada Posición en ovejas
            tablero[Posicion.fila][Posicion.columna] = 'O'
        fin para

    Lista generarPosicionesAleatorias(Entero cantidad)
        Lista posiciones
        Para i de 0 hasta cantidad - 1
            Entero fila = AleatorioEntre(0, TAMANIO - 1)
            Entero columna = AleatorioEntre(0, TAMANIO - 1)
            Agregar al final de posiciones una nueva Posicion(fila, columna)
        fin para
        Devolver posiciones
    fin lista

    Caracter obtenerValor(Posicion posicion)
        Devolver tableroposicion.fila][posicion.columna]
    fin caracter

    Función realizarMovimiento(Posicion nuevaPosicion)
        tablero[nuevaPosicion.fila][nuevaPosicion.columna] = 'O'
    fin función

    Cadena toString()
        Cadena auxiliar = " "

        #Imprimir números de columna
        auxiliar += "      "
        Para i de 0 hasta TAMANIO - 1
            auxiliar += i + "   "
        fin para
        auxiliar += "\n"

        #Imprimir el tablero con números de fila y contenido
        Para fila de 0 hasta TAMANIO - 1
            auxiliar += fila + " "
            Para columna de 0 hasta TAMANIO - 1
                auxiliar += " | " + tablero[fila][columna]
            fin para
            auxiliar += " \n"
        fin para
        Devolver auxiliar
    fin cadena

Clase JuegoRebanioOvejas
    Tablero tablero = nuevo Tablero()
    Mientras verdadero:
        Imprimir(tablero.toString())
        Posicion movimiento = obtenerMovimiento()

        Si no esMovimientoValido(tablero, movimiento) Entonces:
            Imprimir("El movimiento no es válido. La celda ya contiene una oveja.")
            Continuar
        fin si

        realizarMovimiento(tablero, movimiento)

        Si esConfiguracionFinal(tablero) Entonces:
            Imprimir("¡Objetivo alcanzado!")
            descanso
        fin si
    fin mientras

    Función booleana esMovimientoValido(Tablero tablero, Posicion posicion):
        Devolver tablero.obtenerValor(posicion) = '.'

    Función realizarMovimiento(Tablero tablero, Posicion nuevaPosicion):
        tablero.realizarMovimiento(nuevaPosicion)

    Función booleana esConfiguracionFinal(Tablero tablero):
        Para fila de 0 hasta tablero.TAMANIO - 1
            Para columna de 0 hasta tablero.TAMANIO - 1
                Si tablero.obtenerValor(Posicion(fila, columna)) = '.' Entonces:
                    Devolver falso
                fin si
            fin para
        fin para
        Devolver verdadero

    Función Posicion obtenerMovimiento():
        Imprimir("Ingrese las coordenadas de la celda a la que desea mover una oveja (fila columna): ")
        Entero fila = LeerEntero()
        Entero columna = LeeroEntero()
        Devolver nueva Posicion(fila, columna)

```

# Diagrama UML

* El diagrama se encuentra en el paquete del ejercicio en (`diagramaUML.puml `).
* También se entregará una imagen del diagrama (algunos archivos `.puml` no funcionan correctamente).


# Ejercicio 5: Taller de Arte ASCII

Este código Java implementa un taller de arte ASCII, permitiendo al usuario realizar acciones como dibujar caracteres en un lienzo, crear rectángulos y cambiar el color de ciertos caracteres en un espacio bidimensional.

## 1. Método Principal (`main`)

El programa comienza declarando una matriz bidimensional (`char[][] lienzo`) que actúa como el lienzo para el arte ASCII, inicializándolo con un tamaño de 10x10. Utiliza un bucle `do-while` que muestra continuamente el lienzo, solicita al usuario una opción del menú y ejecuta la acción correspondiente hasta que el usuario selecciona la opción "4" para salir.

## 2. Procedimientos (`dibujarCaracter`, `dibujarRectangulo`, `cambiarColor`)

- `dibujarCaracter`: Asigna un carácter a una posición específica en el lienzo.
- `dibujarRectangulo`: Rellena un rectángulo en el lienzo dadas dos esquinas especificadas por las coordenadas de fila y columna.
- `cambiarColor`: Cambia el carácter en una posición específica del lienzo.

## 3. Funciones (`crearLienzo`, `mostrarLienzo`, `mostrarMenu`)

- `crearLienzo`: Devuelve un nuevo lienzo bidimensional vacío con el tamaño especificado.
- `mostrarLienzo`: Genera una representación en forma de cadena del lienzo para su visualización en la consola, incluyendo números de fila y columna.
- `mostrarMenu`: Muestra el menú de opciones y espera que el usuario ingrese una opción.

## 4. Procedimiento (`ejecutarAccion`)

Según la opción seleccionada por el usuario, ejecuta la acción correspondiente:

- Dibujar un carácter en una posición específica.
- Dibujar un rectángulo en el lienzo.
- Cambiar el color de un carácter en una posición específica.
- Salir del programa.

El código utiliza la clase `Scanner` para obtener la entrada del usuario desde la consola y ofrece una interfaz interactiva para manipular y visualizar el arte ASCII en el lienzo.

# Pseudocódigo

```java
Clase TallerArteASCII:
    Dimensión lienzo[10][10]
    Entero opción

    Hacer
        Imprimir(mostrarLienzo(lienzo))
        opcion = mostrarMenu()
        ejecutarAccion(lienzo, opcion)
    Mientras opcion != 4

    Procedimiento dibujarCaracter(lienzo, fila, columna, caracter):
        lienzo[fila][columna] = caracter

    Procedimiento dibujarRectangulo(lienzo, fila1, fila2, columna1, columna2, caracter):
        para i de fila1 hasta fila2:
            para j de columna1 hasta columna2:
                lienzo[i][j] = caracter
            fin para
        fin para

    Procedimiento cambiarColor(lienzo, fila, columna, nuevoCaracter):
        lienzo[fila][columna] = nuevoCaracter

    Función crearLienzo(lado):
        Devolver nueva matriz de caracter de dimensiones lado * lado

    Función mostrarLienzo(lienzo):
        Cadena aux = ""

        aux = "    "
        para i de 0 hasta longitud del lienzo - 1:
            aux = aux + i + " "
        fin para
        aux = aux + "\n"

        para fila de 0 hasta longitud del lienzo - 1:
            aux = aux + fila + " "
            para columna de 0 hasta longitud del lienzo en fila - 1:
                aux = aux + " " + lienzo[fila][columna] + ""
            fin para
            aux = aux + "\n"
        fin para
        devolver aux

    Función mostrarMenu():
        Entero opcion

        Imprimir("1. Dibujar carácter.")
        Imprimir("2. Dibujar rectángulo.")
        Imprimir("3. Cambiar color.")
        Imprimir("4. Salir")
        Imprimir("Seleccione una opción: ")

        Leer opcion
        devolver opción

    Procedimiento ejecutarAccion(lienzo, opcion):
        Entero filaCaracter, columnaCaracter, fila1, columna1, fila2, columna2, filaColor, columnaColor,
        Caracter caracter, caracterRectangulo, caracterColor

        Según opcion hacer:
            Caso 1:
                Imprimir("Ingrese fila: ")
                Leer filaCaracter
                Imprimir("Ingrese columna: ")
                Leer columnaCaracter
                Imprimir("Ingrese caracter: ")
                Leer caracter
                dibujarCaracter(lienzo, filaCaracter, columnaCaracter, caracter)

            fin caso
            Caso 2:
               Imprimir("Ingrese fila esquina 1: ")
               Leer fila1
               Imprimir("Ingrese columna esquina 1: ")
               Leer columna1
               Imprimir("Ingrese fila esquina 2: ")
               Leer fila2
               Imprimir("Ingrese columna esquina 2: ")
               Leer columna2
               Imprimir("Ingrese carácter: ")
               Leer caracterRectangulo
               dibujarRectangulo(lienzo, fila1, columna1, fila2, columna2, caracterRectangulo)
            fin caso
            Caso 3:
               Imprimir("Ingrese fila: ")
               Leer filaColor
               Imprimr("Ingrese columna: ")
               Leer columnaColor
               Imprimir("Ingrese carácter: ")
               Leer caracterColor
               cambiarColor(lienzo, filaColor, columnaColor, caracterColor)
            fin caso
            Caso 4:
                Imprimir("Saliendo del programa.")
            fin caso
            Por defecto:
                Imprimir("Opción no válida. Intente nuevamente")
        fin según
```

# Diagrama UML

* El diagrama se encuentra en el paquete del ejercicio en (`diagramaUML.puml `).
* También se entregará una imagen del diagrama (algunos archivos `.puml` no funcionan correctamente).
