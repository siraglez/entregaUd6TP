package ejercicio3.codigo;

import java.util.ArrayList;
import java.util.Random;

//Implementación de las interfaces en una clase
class ManipulacionTablas implements GeneradorTablaAleatoria, FinderMayor {

    @Override
    public ArrayList<Integer> crearTablaAleatoria(int tamanio, int minimo, int maximo) {
        ArrayList<Integer> tabla = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < tamanio; i++) {
            tabla.add(random.nextInt(maximo - minimo + 1) + minimo);
        }
        return tabla;
    }

    @Override
    public int encontrarMayor(ArrayList<Integer> tabla) {
        int mayor = tabla.get(0);

        for (int valor : tabla) {
            if (valor > mayor) {
                mayor = valor;
            }
        }
        return mayor;
    }
}

//Clase con el programa principal
public class ManipulacionTablasYBusquedaMaximos {

    public static void main(String[] args) {
        //Acceder a las interfaces desde el programa principal
        GeneradorTablaAleatoria generadorTablaAleatoria = new ManipulacionTablas();
        FinderMayor finderMayor = new ManipulacionTablas();

        //Crear una tabla aleatoria de 10 elementos con valores entre 1 y 100
        ArrayList<Integer> tabla = generadorTablaAleatoria.crearTablaAleatoria(10, 1, 100);

        //Encontrar el mayor valor de la tabla
        int mayor = finderMayor.encontrarMayor(tabla);

        //Imprimir la tabla y el mayor valor
        System.out.println("Tabla: ");
        for (int valor : tabla) {
            System.out.println(valor + " ");
        }
        System.out.println("\n Mayor valor: " + mayor);
    }
}
