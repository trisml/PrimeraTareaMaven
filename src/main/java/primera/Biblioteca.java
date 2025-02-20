import java.util.ArrayList;
import java.util.List;
 
/**
* Representa una biblioteca que gestiona libros.
* Contiene una lista de libros y permite agregar y obtener libros.
*/
public class Biblioteca {
    /**
     * Lista de libros disponibles en la biblioteca.
     */
    private List<Libro> libros;
 
    /**
     * Constructor de la clase Biblioteca.
     * Inicializa la lista de libros.
     */
    public Biblioteca() {
        this.libros = new ArrayList<>();
    }
 
    /**
     * Agrega un libro a la biblioteca.
     *
     * @param libro El libro que se va a agregar.
     */
    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }
 
    /**
     * Obtiene la lista de libros en la biblioteca.
     *
     * @return Una lista de libros en la biblioteca.
     */
    public List<Libro> obtenerLibros() {
        return libros;
    }
}