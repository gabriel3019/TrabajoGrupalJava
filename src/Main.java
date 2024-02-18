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
    }
}