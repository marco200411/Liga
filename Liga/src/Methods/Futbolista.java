package Methods;

/**
 * La clase Futbolista representa a un futbolista en el sistema.
 *
 * author Marco
 */
public class Futbolista extends Persona{
    
    String posicion;

    /**
     * Crea una instancia de la clase Futbolista con los atributos especificados.
     *
     * @param nombre   El nombre del futbolista.
     * @param posicion La posición del futbolista.
     * @param precio   El precio del futbolista.
     * @param ataque   El nivel de ataque del futbolista.
     * @param defensa  El nivel de defensa del futbolista.
     */
    public Futbolista(String nombre, String posicion, int precio, int ataque, int defensa) {
        super(nombre, precio, ataque, defensa);
        this.posicion = posicion;
    }

    /**
     * Obtiene la posición del futbolista.
     *
     * @return La posición del futbolista.
     */
    public String getPosicion() {
        return posicion;
    }

    /**
     * Establece la posición del futbolista.
     *
     * @param posicion La posición del futbolista.
     */
    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    /**
     * Obtiene el nombre del futbolista.
     *
     * @return El nombre del futbolista.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del futbolista.
     *
     * @param nombre El nombre del futbolista.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el precio del futbolista.
     *
     * @return El precio del futbolista.
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * Establece el precio del futbolista.
     *
     * @param precio El precio del futbolista.
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    /**
     * Obtiene el nivel de ataque del futbolista.
     *
     * @return El nivel de ataque del futbolista.
     */
    public int getAtaque() {
        return ataque;
    }

    /**
     * Establece el nivel de ataque del futbolista.
     *
     * @param ataque El nivel de ataque del futbolista.
     */
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    /**
     * Obtiene el nivel de defensa del futbolista.
     *
     * @return El nivel de defensa del futbolista.
     */
    public int getDefensa() {
        return defensa;
    }

    /**
     * Establece el nivel de defensa del futbolista.
     *
     * @param defensa El nivel de defensa del futbolista.
     */
    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }
}
