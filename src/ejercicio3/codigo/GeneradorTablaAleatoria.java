package ejercicio3.codigo;

import java.util.ArrayList;

//Interfaz para la generación de tablas aleatorias
public interface GeneradorTablaAleatoria {
    ArrayList<Integer> crearTablaAleatoria(int tamanio, int minimo, int maximo);
}
