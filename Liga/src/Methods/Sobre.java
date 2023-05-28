package Methods;

import java.util.ArrayList;

/**
 * La clase Sobre representa un sobre de jugadores en el sistema.
 *
 * author Marco
 */
public class Sobre {
    String nombre;
    int cantidad_jugadores;
    int precio;
    ArrayList<Futbolista> contenidoSobre = new ArrayList();

    /**
     * Crea una instancia de la clase Sobre con los atributos especificados.
     *
     * @param nombre            El nombre del sobre.
     * @param cantidad_jugadores La cantidad de jugadores en el sobre.
     * @param precio            El precio del sobre.
     */
    public Sobre(String nombre, int cantidad_jugadores, int precio) {
        this.nombre = nombre;
        this.cantidad_jugadores = cantidad_jugadores;
        this.precio = precio;
    }

    /**
     * Obtiene el nombre del sobre.
     *
     * @return El nombre del sobre.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del sobre.
     *
     * @param nombre El nombre del sobre.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la cantidad de jugadores en el sobre.
     *
     * @return La cantidad de jugadores en el sobre.
     */
    public int getCantidad_jugadores() {
        return cantidad_jugadores;
    }

    /**
     * Establece la cantidad de jugadores en el sobre.
     *
     * @param cantidad_jugadores La cantidad de jugadores en el sobre.
     */
    public void setCantidad_jugadores(int cantidad_jugadores) {
        this.cantidad_jugadores = cantidad_jugadores;
    }

    /**
     * Obtiene el contenido del sobre, que es una lista de futbolistas.
     *
     * @return El contenido del sobre.
     */
    public ArrayList<Futbolista> getContenidoSobre() {
        return contenidoSobre;
    }

    /**
     * Establece el contenido del sobre, que es una lista de futbolistas.
     *
     * @param contenidoSobre El contenido del sobre.
     */
    public void setContenidoSobre(ArrayList<Futbolista> contenidoSobre) {
        this.contenidoSobre = contenidoSobre;
    }

    /**
     * Obtiene el precio del sobre.
     *
     * @return El precio del sobre.
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * Establece el precio del sobre.
     *
     * @param precio El precio del sobre.
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
