package Methods;

import java.util.ArrayList;

/**
 * La clase Equipo representa a un equipo en el sistema.
 *
 * author Marco
 */
public class Equipo {

    Liga liga;
    Entrenador entrenador;
    String nombre;
    int dinero;
    int puntos;
    int victorias;
    int derrotas;
    ArrayList<Partido> partidosEquipo = new ArrayList();
    ArrayList<Sobre> sobresAbiertos = new ArrayList();

    /**
     * Crea una instancia de la clase Equipo con los atributos especificados.
     *
     * @param liga       La liga a la que pertenece el equipo.
     * @param entrenador El entrenador del equipo.
     * @param nombre     El nombre del equipo.
     * @param dinero     La cantidad de dinero del equipo.
     * @param puntos     Los puntos del equipo.
     * @param victorias  El número de victorias del equipo.
     * @param derrotas   El número de derrotas del equipo.
     */
    public Equipo(Liga liga, Entrenador entrenador, String nombre, int dinero, int puntos, int victorias, int derrotas) {
        this.liga = liga;
        this.entrenador = entrenador;
        this.nombre = nombre;
        this.dinero = dinero;
        this.puntos = puntos;
        this.victorias = victorias;
        this.derrotas = derrotas;
    }

    /**
     * Obtiene la lista de sobres abiertos del equipo.
     *
     * @return La lista de sobres abiertos del equipo.
     */
    public ArrayList<Sobre> getSobresAbiertos() {
        return sobresAbiertos;
    }

    /**
     * Establece la lista de sobres abiertos del equipo.
     *
     * @param sobresAbiertos La lista de sobres abiertos del equipo.
     */
    public void setSobresAbiertos(ArrayList<Sobre> sobresAbiertos) {
        this.sobresAbiertos = sobresAbiertos;
    }

    /**
     * Obtiene el número de victorias del equipo.
     *
     * @return El número de victorias del equipo.
     */
    public int getVictorias() {
        return victorias;
    }

    /**
     * Establece el número de victorias del equipo.
     *
     * @param victorias El número de victorias del equipo.
     */
    public void setVictorias(int victorias) {
        this.victorias = victorias;
    }

    /**
     * Obtiene el número de derrotas del equipo.
     *
     * @return El número de derrotas del equipo.
     */
    public int getDerrotas() {
        return derrotas;
    }

    /**
     * Establece el número de derrotas del equipo.
     *
     * @param derrotas El número de derrotas del equipo.
     */
    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    /**
     * Obtiene la lista de partidos del equipo.
     *
     * @return La lista de partidos del equipo.
     */
    public ArrayList<Partido> getPartidosEquipo() {
        return partidosEquipo;
    }

    /**
     * Establece la lista de partidos del equipo.
     *
     * @param partidosEquipo La lista de partidos del equipo.
     */
    public void setPartidosEquipo(ArrayList<Partido> partidosEquipo) {
        this.partidosEquipo = partidosEquipo;
    }

    /**
     * Obtiene la liga a la que pertenece el equipo.
     *
     * @return La liga a la que pertenece el equipo.
     */
    public Liga getLiga() {
        return liga;
    }

    /**
     * Establece la liga a la que pertenece el equipo.
     *
     * @param liga La liga a la que pertenece el equipo.
     */
    public void setLiga(Liga liga) {
        this.liga = liga;
    }

    /**
     * Obtiene el entrenador del equipo.
     *
     * @return El entrenador del equipo.
     */
    public Entrenador getEntrenador() {
        return entrenador;
    }

    /**
     * Establece el entrenador del equipo.
     *
     * @param entrenador El entrenador del equipo.
     */
    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

    /**
     * Obtiene el nombre del equipo.
     *
     * @return El nombre del equipo.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del equipo.
     *
     * @param nombre El nombre del equipo.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la cantidad de dinero del equipo.
     *
     * @return La cantidad de dinero del equipo.
     */
    public int getDinero() {
        return dinero;
    }

    /**
     * Establece la cantidad de dinero del equipo.
     *
     * @param dinero La cantidad de dinero del equipo.
     */
    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    /**
     * Obtiene los puntos del equipo.
     *
     * @return Los puntos del equipo.
     */
    public int getPuntos() {
        return puntos;
    }

    /**
     * Establece los puntos del equipo.
     *
     * @param puntos Los puntos del equipo.
     */
    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

}

