package ejercicio1;

import java.util.Scanner;

public class ComparacionYClasificacionNumeros {

    //Función para obtener un número del usuario
    static double obtenerNumero(String mensaje) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(mensaje);
        return scanner.nextDouble();
    }

    //Función que devuelve el mayor de dos números
    static double mayorDeDos(double numero1, double numero2) {
        if (numero1 > numero2) {
            return numero1;
        }
        return numero2;
    }

    //Función que clasifica dos números y retorna 0 si son iguales, 1 si el primero es mayor y -1 si el segundo es mayor
    static int clasificarNumeros(double numero1, double numero2) {
        if (numero1 == numero2) {
            return 0;
        }
        if (numero1 > numero2) {
            return 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        //Obtener los dos números del usuario
        double numero1 = obtenerNumero("Ingrese el primer número: ");
        double numero2 = obtenerNumero("Ingrese el segundo número: ");

        //Calcular el mayor de los dos números y la clasificación
        double mayor = mayorDeDos(numero1, numero2);
        int clasificacion = clasificarNumeros(numero1, numero2);

        //Imprimir el resultado
        System.out.println("El mayor es: " + mayor + " y la clasificación es: " + clasificacion);
    }
}
