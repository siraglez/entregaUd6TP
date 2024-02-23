package ejercicio4.codigo;

//Interfaz para definir el comportamiento de los movimientos
public interface Movimiento {
    void realizarMovimiento(Tablero tablero, Posicion posicion);

    boolean esMovimientoValido(Tablero tablero, Posicion posicion);
}
