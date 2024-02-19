public class Sala {
    public int numero;
    public Pelicula pelicula;
    public boolean[][] butacas;

    /**
     * Estamos introduciendo para inicializar el numero de butacas con una matriz
     * y su numero asignado
     * @param numero el valor introducido para asignar la sala.
     */

    public Sala(int numero) {
        this.numero = numero;
        // Inicializa la matriz butacas como una nueva matriz de 10x10, representando
        // las filas y columnas de butacas en la sala. Puedes ajustar las dimensiones
        // seg�n sea necesario.
        this.butacas = new boolean[10][10];
    }
    /**
     * Aqui nos devuelve el valor del numero introducido desde el main
     * el cual el valor es introducido por el usuario
     *
     */

    public int getNumero() {
        // Retorna el valor del atributo numero, que representa el n�mero identificativo
        // de la sala.
        return numero;
    }
}
