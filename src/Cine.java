public class Cine {

    public String nombre;
    public int aforo;
    public Sala[] salas;

    /**
     *
     * @param nombre es un vinculo entre cine y main para el nombre de la pelicula dentro de la propia clase cine
     * @param aforo es un entero para introducir el aforo de cada sala el cual esta vinculado a la clase sala creada ya
     * @param numSalas es un entero también el cual sirve para recibir la variable numSalas que es para saber cuantas y
     *                 que sala elegir dentro del cine creando asi un vinculo con la clase Sala
     */
    public Cine(String nombre, int aforo, int numSalas) {
        // Asigna el valor del par�metro nombre al atributo nombre de la instancia
        // actual de la clase Cine.
        this.nombre = nombre;
        // Asigna el valor del par�metro aforo al atributo aforo de la instancia actual
        // de la clase Cine.
        this.aforo = aforo;
        this.salas = new Sala[10];
        for (int i = 0; i < salas.length; i++) {
            salas[i] = new Sala(i + 1);
        }
        /**
         * Recibe el valor de salas desde la clase salas el cual , es una varibale la cual inicializaremos en el propio main
         */
        public Sala[] getSalas() {
            return salas;
        }
        public void mostrarSalas() {
            // mprime un mensaje que indica el nombre del cine y que se utilizar� para
            // identificar la secci�n de salas.
            Sala[] lista = getSalas();
            for (int i = 0; i < lista.length; i++) {
                System.out.println("Salas disponibles en " + lista[i]);
                // Inicia un bucle for-each, que itera sobre cada elemento (sala) en el arreglo
                // salas.
            }
        }
        public void verInfoPeliculas() {
            // Inicia un bucle for-each, que itera sobre cada elemento (sala) en el arreglo
            // salas
            for (int i = 0; i < salas.length; i++) {
                // Imprime informaci�n sobre cada sala, incluyendo su n�mero y la pel�cula que
                // proyecta. Utiliza los m�todos getNumero y getPelicula de la clase Sala para
                // obtener esta informaci�n.
                System.out.println("Sala Numero: " + i );
                System.out.println("Pelicula: " + getSalas()[i].getPelicula().getTitulo());
                System.out.println("Duraci�n: " + getSalas()[i].getPelicula().getDuracion() + " minutos");
            }
        }
        /**
         *
         * @param numSala parametro recibido desde la clase sala
         *               para dar el valor de numero de salas como el propio nombre indica
         * @param fila parametro desde la clase sala el cual sirve para asignar la fila desde el main con la variable ejecutada desde la clase sala
         * @param columna parametro desde la clase sala el cual sirve para asignar un valor desde el main con la variable creada desde la clase sala
         * @param email paramatro que nos servira como identificador y recibe
         */
        public void reservarEntrada(int numSala, int fila, int columna, String email) {
            // Verifica si el n�mero de sala proporcionado est� dentro del rango v�lido, es
            // decir, entre 1 y la longitud del arreglo salas.
            if (numSala >= 1 && numSala <= salas.length) {
                // Obtiene la sala correspondiente al n�mero proporcionado. Debido a que los
                // �ndices de los arreglos comienzan desde 0, se resta 1 al n�mero de sala.
                Sala sala = salas[numSala - 1];
                // Llama al m�todo reservarButaca de la clase Sala para realizar la reserva de
                // la butaca en la sala espec�fica.
                sala.reservarButaca(fila, columna, email);
            } else {
                System.out.println("Sala no valida");
            }
        }
    }
}
