package ejercicio4.codigo;

//Clase que representa el tablero
class Tablero {
    char[][] tablero;

    public Tablero(int filas, int columnas) {
        tablero = new char[filas][columnas];
        //Usando 'O' para ovejas y '.' para espacios
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                tablero[i][j] = '.';
            }
        }
    }

    public void mostrarTablero() {
        for (int i = 0; i < tablero.length; i++) {
            for ( int j = 0; i < tablero[i].length; j++) {
                System.out.println(tablero[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
