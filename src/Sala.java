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
    /**
     * Aqui nos devuelve el valor el cual es introducido desde la clase pelicula
     * y nos devuelve el nombre de la pelicula
     * el cual lo hemos introducidpo a traves de unos set en el main
     */
    public Pelicula getPelicula() {
        // Retorna el valor del atributo pelicula, que almacena el t�tulo de la pel�cula
        // proyectada en la sala.
        return pelicula;
    }

    /**
     *
     * @param pelicula es valor que recibe de la clase pelicula
     *                el cual al valor de elegir pelicula le hemos llamado también pelicula
     */
    public void setPelicula(Pelicula pelicula) {
        // Asigna el valor del par�metro pelicula al atributo pelicula de la instancia
        // de la clase Sala
        this.pelicula = pelicula;
    }

    /**
     *
     * @param fila para recoger la variable de fila
     *             otra clase que hemos introducido para asignar la fila que quiere el usuario
     * @param columna para recoger la variable de columna otra clase
     *               que hemos introducido para asignar la columna que quiera el usuario
     * @param email para recoger la variable de el email para identicar al usuario
     *              el cual hemos introducido en otra clase la cual arrastramos a esta
     */
    public void reservarButaca(int fila, int columna, String email) {
        // Verifica si la fila y columna proporcionadas est�n dentro del rango v�lido
        // (entre 1 y 10).
        if (fila >= 1 && fila <= 10 && columna >= 1 && columna <= 10) {
            // erifica si la butaca en la fila y columna especificadas est� disponible (no
            // ocupada).
            if (!butacas[fila - 1][columna - 1]) {
                // Marca la butaca como ocupada si est� disponible.
                butacas[fila - 1][columna - 1] = true;

                System.out.println("Entrada reservada con �xito para " + email);
            } else {
                System.out.println("La butaca ya est� ocupada.");
            }
        } else {
            System.out.println("Butaca no v�lida.");
        }

        public void mostrarEstado(){
            System.out.println("Estado de la sala " + numero + ":");
            // nicia un bucle que recorre cada fila de butacas en la sala.
            for (int i = 0; i < butacas.length; i++) {
                // Dentro del bucle anterior, inicia otro bucle que recorre cada columna de
                // butacas en la fila actual.
                for (int j = 0; j < butacas[i].length; j++) {
                    // Imprime 'X' si la butaca en la posici�n actual est� ocupada (valor true), y
                    // 'O' si est� libre (valor false).
                    System.out.print(butacas[i][j] ? "X " : "O ");
                }
                System.out.println();
            }
            public String toString() {
                // Construye y retorna una cadena que incluye el n�mero de la sala y el t�tulo
                // de la pel�cula. Esta cadena se utiliza para representar la instancia de la
                // clase como una cadena de texto.
                return "Sala " + numero + ": " + pelicula;
            }
        }
    }
}
