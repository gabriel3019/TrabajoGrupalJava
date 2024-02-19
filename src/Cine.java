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
    }
}
