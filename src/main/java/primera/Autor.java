package primera;
 
/**
* Representa un autor de libros.
* Un autor tiene un nombre y una nacionalidad.
*/
public class Autor {
    /**
     * El nombre del autor.
     */
    private String nombre;
    /**
     * La nacionalidad del autor.
     */
    private String nacionalidad;
 
    /**
     * Constructor de la clase Autor.
     *
     * @param nombre El nombre del autor.
     * @param nacionalidad La nacionalidad del autor.
     */
    public Autor(String nombre, String nacionalidad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }
 
    /**
     * Obtiene el nombre del autor.
     *
     * @return El nombre del autor.
     */
    public String getNombre() {
        return nombre;
    }
 
    /**
     * Obtiene la nacionalidad del autor.
     *
     * @return La nacionalidad del autor.
     */
    public String getNacionalidad() {
        return nacionalidad;
    }
}