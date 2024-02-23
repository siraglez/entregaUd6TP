package ejercicio4.codigo;

//Implementación de un movimiento específico
class MovimientoOveja implements Movimiento {
   private Posicion posicion;

   public MovimientoOveja(Posicion posicion) {
       this.posicion = posicion;
   }

    @Override
    public void realizarMovimiento(Tablero tablero, Posicion posicion) {
        //Lógica para mover la oveja a la posición deseada
        tablero.tablero[posicion.fila][posicion.columna] = 'O';
    }


   @Override
    public boolean esMovimientoValido(Tablero tablero, Posicion posicion) {
       //Verificar si la posición es válida para mover la oveja
       return posicion.fila >= 0 && posicion.fila < tablero.tablero.length &&
               posicion.columna >= 0 && posicion.columna < tablero.tablero[0].length &&
               tablero.tablero[posicion.fila][posicion.columna] == '.';
   }
}
