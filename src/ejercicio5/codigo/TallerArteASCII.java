package ejercicio5.codigo;

import java.util.Scanner;

public class TallerArteASCII {

    public static void main(String[] args) {
        char[][] lienzo = crearLienzo(10);
        int opcion;

        do {
            System.out.println(mostrarLienzo(lienzo));
            opcion = mostrarMenu();
            ejecutarAccion(lienzo, opcion);
        } while (opcion != 4);
    }

    //Procedimiento para dibujar un carácter en el lienzo
    public static void dibujarCaracter(char[][] lienzo, int fila, int columna, char caracter) {
        lienzo[fila][columna] = caracter;
    }

    //Procedimiento para dobujar un rectángulo en el lienzo
    public static void dibujarRectangulo(char[][] lienzo, int fila1, int columna1, int fila2, int columna2, char caracter) {
        for (int i = fila1; i <= fila2; i++) {
            for (int j = columna1; j <= columna2; j++) {
                lienzo[i][j] = caracter;
            }
        }
    }

    //Procedimiento para cambiar el color de un carácter en el lienzo
    public static void cambiarColor(char[][] lienzo, int fila, int columna, char nuevoCaracter) {
        lienzo[fila][columna] = nuevoCaracter;
    }

    //Función para crear un lienzo vacío
    public static char[][] crearLienzo(int lado) {
        return new char[lado][lado];
    }

    //Procedimiento para mostrar el lienzo en la consola
    public static String mostrarLienzo(char[][] lienzo) {
        StringBuilder aux = new StringBuilder();

        //Imprimir números de columna
        aux.append("   ");
        for (int i = 0; i < lienzo.length; i++) {
            aux.append(i).append(" ");
        }
        aux.append("\n");

        //Imprimir el lienzo con números de fila y contenido
        for (int fila = 0; fila < lienzo.length; fila++) {
            aux.append(fila).append(" ");
            for (int columna = 0; columna < lienzo[fila].length; columna++) {
                aux.append(" ").append(lienzo[fila][columna]).append("");
            }
            aux.append(" \n");
        }
        return aux.toString();
    }


    //Función para mostrar el menú y obtener la opción seleccionada
    public static int mostrarMenu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Dibujar carácter.");
        System.out.println("2. Dibujar Rectángulo.");
        System.out.println("3. Cambiar color.");
        System.out.println("4. Salir.");
        System.out.println("Seleccione una opción: ");

        return scanner.nextInt();
    }

    //Procedimiento para ejecutar la acción seleccionada
    public static void ejecutarAccion(char[][] lienzo, int opcion) {
        Scanner scanner = new Scanner(System.in);

        switch (opcion) {
            case 1:
                System.out.println("Ingrese fila: ");
                int filaCaracter = scanner.nextInt();
                System.out.println("Ingrese columna: ");
                int columnaCaracter = scanner.nextInt();
                System.out.println("Ingrese carácter: ");
                char caracter = scanner.next().charAt(0);
                dibujarCaracter(lienzo, filaCaracter, columnaCaracter, caracter);
                break;
            case 2:
                System.out.println("Ingrese fila esquina 1: ");
                int fila1 = scanner.nextInt();
                System.out.println("Ingrese columna esquina 1: ");
                int columna1 = scanner.nextInt();
                System.out.println("Ingrese fila esquina 2: ");
                int fila2 = scanner.nextInt();
                System.out.println("Ingrese columna esquina 2: ");
                int columna2 = scanner.nextInt();
                System.out.println("Ingrese carácter: ");
                char caracterRectangulo = scanner.next().charAt(0);
                dibujarRectangulo(lienzo, fila1, columna2, fila2, columna2, caracterRectangulo);
                break;
            case 3:
                System.out.println("Ingrese fila: ");
                int filaColor = scanner.nextInt();
                System.out.println("Ingrese columna: ");
                int columnaColor = scanner.nextInt();
                System.out.println("Ingrese carácter: ");
                char caracterColor = scanner.next().charAt(0);
                cambiarColor(lienzo, filaColor, columnaColor, caracterColor);
                break;
            case 4:
                System.out.println("Saliendo del programa.");
                break;
            default:
                System.out.println("Opción no válida. Intente nuevamente.");
        }
    }
}
