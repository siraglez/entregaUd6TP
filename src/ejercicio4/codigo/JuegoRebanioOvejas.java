package ejercicio4.codigo;

import java.util.Scanner;

//Clase principal que ejecuta el juego
public class JuegoRebanioOvejas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el número de filas del tablero: ");
        int filas = scanner.nextInt();

        System.out.println("Ingrese el número de columnas del tablero: ");
        int columnas = scanner.nextInt();

        Tablero tablero = new Tablero(filas, columnas);

        while (!esConfiguracionFinal(tablero)) {
            tablero.mostrarTablero();
            Movimiento movimiento = obtenerMovimiento();

            if (movimiento.esMovimientoValido(tablero, obtenerPosicion())) {
                movimiento.realizarMovimiento(tablero, obtenerPosicion());
            } else {
                System.out.println("Movimiento no válido. Inténtelo de nuevo.");
            }
        }
        System.out.println("¡Objetivo alcanzado!");
        scanner.close();
    }

    private static boolean esConfiguracionFinal(Tablero tablero) {
        //Condiciones de finalización: todas las celdas están ocupadas por ovejas
        for (int i = 0; i < tablero.tablero.length; i++) {
            for (int j = 0; j < tablero.tablero[0].length; j++) {
                if (tablero.tablero[i][j] != 'O') {
                    return false; //Todavía hay celdas vacías
                }
            }
        }
        return true; //Todas las celdas están ocupadas por ovejas, se ha terminado el juegp
    }

    private static Movimiento obtenerMovimiento() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la fila donde desea mover la oveja: ");
        int fila = scanner.nextInt();

        System.out.println("Ingrese la columna donde desea mover la oveja: ");
        int columna = scanner.nextInt();

        Posicion posicion = new Posicion(fila, columna);

        return new MovimientoOveja(posicion);
    }

    private static Posicion obtenerPosicion() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la fila del movimiento: ");
        int fila = scanner.nextInt();

        System.out.println("Ingrese la columna del movimiento: ");
        int columna = scanner.nextInt();

        return new Posicion(fila, columna);
    }
}
