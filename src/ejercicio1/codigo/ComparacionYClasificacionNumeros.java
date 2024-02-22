package ejercicio1.codigo;

import java.util.Scanner;

public class ComparacionYClasificacionNumeros implements ObtenerNumero, CompararYClasificarNumeros {

    //Función para obtener un número del usuario (implementa la interfaz)
    @Override
    public double obtenerNumero(String mensaje) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(mensaje);
        return scanner.nextDouble();
    }

    //Función que devuelve el mayor de dos números (implementa la interfaz)
    @Override
    public double mayorDeDos(double numero1, double numero2) {
        if (numero1 > numero2) {
            return numero1;
        }
        return numero2;
    }

    //Función que clasifica dos números y retorna 0 si son iguales, 1 si el primero es mayor y -1 si el segundo es mayor (implementa la interfaz)
    @Override
    public int clasificarNumeros(double numero1, double numero2) {
        if (numero1 == numero2) {
            return 0;
        }
        if (numero1 > numero2) {
            return 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        //Crear instancia de la clase
        ComparacionYClasificacionNumeros programa = new ComparacionYClasificacionNumeros();

        //Obtener los dos números del usuario usando el método de la interfaz
        double numero1 = programa.obtenerNumero("Ingrese el primer número: ");
        double numero2 = programa.obtenerNumero("Ingrese el segundo número: ");

        //Calcular el mayor de los dos números y la clasificación usando los métodos de la interfaz
        double mayor = programa.mayorDeDos(numero1, numero2);
        int clasificacion = programa.clasificarNumeros(numero1, numero2);

        //Imprimir el resultado
        System.out.println("El mayor es: " + mayor + " y la clasificación es: " + clasificacion);
    }
}
