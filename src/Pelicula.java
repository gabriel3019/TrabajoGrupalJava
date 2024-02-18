/**
 * Clase que representa una película con un título y una duración en minutos.
 */
public class Pelicula {
    /** Título de la película. */
    public String titulo;
    /** Duracion de la película. */
    public int duracion;

    /**
     * Constructor para crear un objeto Pelicula con un título y una duración.
     *
     * @param titulo    El título de la película.
     * @param duracion  La duración de la película en minutos.
     */
    public Pelicula(String titulo, int duracion) {
        this.titulo = titulo;
        this.duracion = duracion;
    }

    /**
     * Obtiene el título de la película.
     *
     * @return El título de la película.
     */

    public String getTitulo() {
        return titulo;
    }

    /**
     * Obtiene la duración de la película en minutos.
     *
     * @return La duración de la película.
     */

    public int getDuracion() {
        return duracion;
    }

    /**
     * Representación en formato de cadena de la película.
     * Devuelve el título de la película.
     *
     * @return El título de la película.
     */

    @Override
    public String toString() {
        return titulo;
    }

}
