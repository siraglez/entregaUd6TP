package ejercicio4.codigo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class Tablero {
    public static final int TAMANIO = 8;
    private final char[][] tablero;

    public Tablero() {
        this.tablero = new char[this.TAMANIO][this.TAMANIO];
        inicializarTablero();
    }

    private void inicializarTablero() {
        for (int fila = 0; fila < this.TAMANIO; fila++) {
            for (int columna = 0; columna < this.TAMANIO; columna++) {
                this.tablero[fila][columna] = '.';
            }
        }

        //Agregar algunas ovejas al tablero
        List<Posicion> ovejas = generarPosicionesAleatorias(6);
        for (Posicion posicion : ovejas) {
            this.tablero[posicion.fila][posicion.columna] = 'O';
        }
    }

    private List<Posicion> generarPosicionesAleatorias(int cantidad) {
        List<Posicion> posiciones = new ArrayList<>();
        for (int i = 0; i < cantidad; i++) {
            int fila = (int) (Math.random() * this.TAMANIO);
            int columna = (int) (Math.random() * this.TAMANIO);
            posiciones.add(new Posicion(fila, columna));
        }
        return posiciones;
    }

    @Override
    public String toString() {
        StringBuilder aux = new StringBuilder();

        //Imprimir números de columna
        aux.append("     ");
        for (int i = 0; i < this.TAMANIO; i++) {
            aux.append(i).append("   ");
        }
        aux.append("\n");

        //Imprimir el tablero con números de fila y contenido
        for (int fila = 0; fila < this.TAMANIO; fila++) {
            aux.append(fila).append(" ");
            for (int columna = 0; columna < this.TAMANIO; columna++) {
                aux.append(" | ").append(this.tablero[fila][columna]).append("");
            }
            aux.append(" |\n");
        }
        return aux.toString();
    }

    public char obtenerValor(Posicion posicion) {
        return this.tablero[posicion.fila][posicion.columna];
    }

    public void realizarMovimiento(Posicion nuevaPosicion) {
        this.tablero[nuevaPosicion.fila][nuevaPosicion.columna] = 'O';
    }
}

public class JuegoRebanioOvejas {
   public static void main(String[] args) {
       Tablero tablero = new Tablero();
       Scanner scanner = new Scanner(System.in);

       while (true) {
           System.out.println(tablero);
           Posicion movimiento = obtenerMovimiento(scanner);

           if (!esMovimientoValido(tablero, movimiento)) {
               System.out.println("El movimiento no es válido. La celda ya contiene una oveja.");
               continue;
           }
           realizarMovimiento(tablero, movimiento);

           if (esConfiguracionFinal(tablero)) {
               System.out.println("¡Objetivo alcanzado!");
               break;
           }
       }
   }

   private static boolean esMovimientoValido(Tablero tablero, Posicion posicion) {
       return tablero.obtenerValor(posicion) == '.';
   }

   private static void realizarMovimiento(Tablero tablero, Posicion nuevaPosicion) {
       tablero.realizarMovimiento(nuevaPosicion);
   }

   private static boolean esConfiguracionFinal(Tablero tablero) {
       for (int fila = 0; fila < tablero.TAMANIO; fila++) {
           for (int columna = 0; columna < tablero.TAMANIO; columna++) {
               if (tablero.toString().charAt(fila * (tablero.TAMANIO * 4) + (columna * 4) + 3) == '.') {
                   return false;
               }
           }
       }
       return true;
   }

   private static Posicion obtenerMovimiento(Scanner scanner) {
       System.out.println("Ingrese las coordenadas de la celda a la que desea mover una oveja (fila columna): ");
       int fila = scanner.nextInt();
       int columna = scanner.nextInt();
       return new Posicion(fila, columna);
   }
}
