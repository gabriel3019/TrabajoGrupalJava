import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;

        // Crear un cine con 10 salas
        Cine cine = new Cine("CineXYZ", 100,10);


        /**
         * Método para establecer las películas en cada sala del cine.
         *
         * @param cine El objeto Cine en el cual se establecerán las películas.
         */

        // Establecer las películas en las diferentes salas del cine
        cine.salas[0].setPelicula(new Pelicula("Spiderman", 120));
        cine.salas[1].setPelicula(new Pelicula("Los vengadores", 160));
        cine.salas[2].setPelicula(new Pelicula("Culpa Mia", 140));
        cine.salas[3].setPelicula(new Pelicula("After", 100));
        cine.salas[4].setPelicula(new Pelicula("Fast and Furious", 230));
        cine.salas[5].setPelicula(new Pelicula("Madagascar", 145));
        cine.salas[6].setPelicula(new Pelicula("Deathpool", 110));
        cine.salas[7].setPelicula(new Pelicula("La Monja", 140));
        cine.salas[8].setPelicula(new Pelicula("Campeones", 220));
        cine.salas[9].setPelicula(new Pelicula("Iron man", 250));

        // Menú principal
        /**
         * Método principal que ejecuta el menú principal del cine.
         *
         * @param cine El objeto Cine con el que se interactuará en el menú.
         */
        int opcion;
        while(!false){
            System.out.println("\n=== Menú Principal CINE XYZ ===");
            System.out.println("1. Mostrar salas disponibles");
            System.out.println("2. Ver información de películas");
            System.out.println("3. Reservar entrada");
            System.out.println("4. Ver estado de sala");
            System.out.println("0. Salir");
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();



            switch (opcion) {
                case 1:
                    cine.mostrarSalas();
                    break;
                case 2:
                    cine.verInfoPeliculas();
                    break;
                /**
                 * Método para realizar la reserva de una entrada en una sala específica.
                 *
                 * @param cine El objeto Cine en el que se realizará la reserva.
                 * @param scanner El objeto Scanner para la entrada de datos.
                 */
                case 3:
                    System.out.print("Ingrese el número de sala: ");
                    int numSalaReserva = scanner.nextInt();
                    System.out.print("Ingrese la fila de la butaca: ");
                    int filaReserva = scanner.nextInt();
                    System.out.print("Ingrese la columna de la butaca: ");
                    int columnaReserva = scanner.nextInt();
                    System.out.print("Ingrese su email: ");
                    String emailReserva = scanner.next();
                    cine.reservarEntrada(numSalaReserva, filaReserva, columnaReserva, emailReserva);
                    break;
                case 4:
                    /**
                     * Método para ver el estado de una sala específica.
                     *
                     * @param cine El objeto Cine del cual se mostrará el estado de la sala.
                     * @param scanner El objeto Scanner para la entrada de datos.
                     */
                    System.out.print("Ingrese el número de sala: ");
                    int numSalaEstado = scanner.nextInt();
                    cine.verEstadoSala(numSalaEstado);
                    break;
                case 0:
                    System.out.println("Gracias por visitar el cine. ¡Hasta luego!");
                    flag = false;
                    break;
            }
        }
    }
}