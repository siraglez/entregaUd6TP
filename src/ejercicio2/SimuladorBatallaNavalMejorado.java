package ejercicio2;

import java.util.Random;
import java.util.Scanner;

public class SimuladorBatallaNavalMejorado {

    public static void main(String[] args) {
        char[][] tablero = crearTablero();
        inicializarTablero(tablero);
        mostrarTablero(tablero);

        Scanner scanner = new Scanner(System.in);
        int fila = introducirEnteroEntreLimites(scanner, 1, 4);
        int columna = introducirEnteroEntreLimites(scanner, 1, 4);

        boolean resultado = disparar(tablero, fila, columna);

        if (resultado) {
            System.out.println("Tocado y hundido.");
        } else {
            System.out.println("Agua.");
        }
    }

    public static char[][] crearTablero() {
        return new char[4][4];
    }

    public static void inicializarTablero(char[][] tablero) {
        Random rand = new Random();

        //Colocar 2 barcos aleatorios en el tablero
        for (int barco = 0; barco < 2; barco++) {
            int fila = rand.nextInt(4);
            int columna = rand.nextInt(4);

            //Verificar si la celda ya está cupada por otro barco
            while (tablero[fila][columna] == 'B') {
                fila = rand.nextInt(4);
                columna = rand.nextInt(4);
            }

            //Colocar el barco en la posición generada
            tablero[fila][columna] = 'B';
        }
    }

    public static void mostrarTablero(char[][] tablero) {
        System.out.println("Tablero:");

        for (char[] fila : tablero) {
            for (char celda : fila) {
                if (celda == 0) {
                    System.out.println("_ ");
                } else {
                    System.out.println(celda + " ");
                }
            }
            System.out.println();
        }
    }

    public static int introducirEnteroEntreLimites(Scanner scanner, int minimo, int maximo) {
        int numero;
        do {
            System.out.println("Ingrese un número entre " + minimo + " y " + maximo + ": ");
            while (!scanner.hasNextInt()) {
                System.out.println("Por favor, ingrese un número válido.");
                scanner.next();
            }
            numero = scanner.nextInt();
        } while (numero < minimo || numero > maximo);

        return numero;
    }

    public static boolean disparar(char[][] tablero, int fila, int columna) {
        if (tablero[fila - 1][columna - 1] == 'B') {
            tablero[fila - 1][columna - 1] = 'X'; //Barco impactado
            return true;
        } else {
            tablero[fila - 1][columna - 1] = 'O'; //Agua
            return false;
        }
    }
}
