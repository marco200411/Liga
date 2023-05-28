package Methods;

/**
 * La clase Entrenador representa a un entrenador en el sistema.
 * Extiende la clase Persona.
 *
 * author a22marcorr
 */
public class Entrenador extends Persona {

    /**
     * Crea una instancia de la clase Entrenador con los atributos especificados.
     *
     * @param nombre   El nombre del entrenador.
     * @param precio   El precio del entrenador.
     * @param ataque   El nivel de ataque del entrenador.
     * @param defensa  El nivel de defensa del entrenador.
     */
    public Entrenador(String nombre, int precio, int ataque, int defensa) {
        super(nombre, precio, ataque, defensa);
    }

    /**
     * Obtiene el nombre del entrenador.
     *
     * @return El nombre del entrenador.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del entrenador.
     *
     * @param nombre El nombre del entrenador.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el precio del entrenador.
     *
     * @return El precio del entrenador.
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * Establece el precio del entrenador.
     *
     * @param precio El precio del entrenador.
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    /**
     * Obtiene el nivel de ataque del entrenador.
     *
     * @return El nivel de ataque del entrenador.
     */
    public int getAtaque() {
        return ataque;
    }

    /**
     * Establece el nivel de ataque del entrenador.
     *
     * @param ataque El nivel de ataque del entrenador.
     */
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    /**
     * Obtiene el nivel de defensa del entrenador.
     *
     * @return El nivel de defensa del entrenador.
     */
    public int getDefensa() {
        return defensa;
    }

    /**
     * Establece el nivel de defensa del entrenador.
     *
     * @param defensa El nivel de defensa del entrenador.
     */
    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

}
