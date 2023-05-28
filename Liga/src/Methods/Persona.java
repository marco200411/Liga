package Methods;

/**
 * La clase Persona representa a una persona en el sistema.
 *
 * author Marco
 */
public class Persona {

    String nombre;
    int precio;
    int ataque;
    int defensa;

    /**
     * Crea una instancia de la clase Persona con los atributos especificados.
     *
     * @param nombre  El nombre de la persona.
     * @param precio  El precio de la persona.
     * @param ataque  El nivel de ataque de la persona.
     * @param defensa El nivel de defensa de la persona.
     */
    public Persona(String nombre, int precio, int ataque, int defensa) {
        this.nombre = nombre;
        this.precio = precio;
        this.ataque = ataque;
        this.defensa = defensa;
    }
}

