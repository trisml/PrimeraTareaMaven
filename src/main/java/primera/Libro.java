package primera;
 
/**
* Representa un libro en la biblioteca.
* Un libro tiene un título, un autor y un año de publicación.
*/
public class Libro {
    /**
     * El título del libro.
     */
    private String titulo;
    /**
     * El autor del libro.
     */
    private Autor autor;
    /**
     * El año de publicación del libro.
     */
    private int anioPublicacion;
 
    /**
     * Constructor de la clase Libro.
     *
     * @param titulo El título del libro.
     * @param autor El autor del libro.
     * @param anioPublicacion El año en que fue publicado el libro.
     */
    public Libro(String titulo, Autor autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }
 
    /**
     * Obtiene el título del libro.
     *
     * @return El título del libro.
     */
    public String getTitulo() {
        return titulo;
    }
 
    /**
     * Obtiene el autor del libro.
     *
     * @return El autor del libro.
     */
    public Autor getAutor() {
        return autor;
    }
 
    /**
     * Obtiene el año de publicación del libro.
     *
     * @return El año de publicación del libro.
     */
    public int getAnioPublicacion() {
        return anioPublicacion;
    }
}