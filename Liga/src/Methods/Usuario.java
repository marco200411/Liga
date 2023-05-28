package Methods;

import java.util.ArrayList;

/**
 * La clase Usuario representa un usuario en el sistema.
 *
 * author a22marcorr
 */
public class Usuario {
    String nombre;
    String apellidos;
    String nombreUsuario;
    String contraseña;
    String correo;
    Equipo equipo;
    Liga liga;
    private ArrayList<Futbolista> jugadores = new ArrayList();
    ArrayList<Futbolista> entrenadores = new ArrayList();
    ArrayList<Futbolista> plantilla = new ArrayList(11);
    Futbolista plantillaPortero;
    ArrayList<Futbolista> plantillaDefensas = new ArrayList(4);
    ArrayList<Futbolista> plantillaMedios = new ArrayList(3);
    ArrayList<Futbolista> plantillaDelanteros = new ArrayList(3);
    Entrenador entrenadorPlantilla;

    /**
     * Crea una instancia de la clase Usuario con los atributos especificados.
     *
     * @param nombre         El nombre del usuario.
     * @param apellidos      Los apellidos del usuario.
     * @param nombreUsuario  El nombre de usuario.
     * @param contraseña     La contraseña del usuario.
     * @param correo         El correo electrónico del usuario.
     * @param equipo         El equipo del usuario.
     * @param liga           La liga en la que participa el usuario.
     */
    public Usuario(String nombre, String apellidos, String nombreUsuario, String contraseña, String correo, Equipo equipo, Liga liga) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
        this.correo = correo;
        this.equipo = equipo;
        this.liga = liga;
    }

    /**
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     *
     * @param apellidos
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     *
     * @return
     */
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    /**
     *
     * @param nombreUsuario
     */
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    /**
     *
     * @return
     */
    public String getContraseña() {
        return contraseña;
    }

    /**
     *
     * @param contraseña
     */
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    /**
     *
     * @return
     */
    public String getCorreo() {
        return correo;
    }

    /**
     *
     * @param correo
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     *
     * @return
     */
    public Equipo getEquipo() {
        return equipo;
    }

    /**
     *
     * @param equipo
     */
    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    /**
     *
     * @return
     */
    public Liga getLiga() {
        return liga;
    }

    /**
     *
     * @param liga
     */
    public void setLiga(Liga liga) {
        this.liga = liga;
    }

    /**
     *
     * @return
     */
    public ArrayList<Futbolista> getJugadores() {
        return jugadores;
    }

    /**
     *
     * @param jugadores
     */
    public void setJugadores(ArrayList<Futbolista> jugadores) {
        this.jugadores = jugadores;
    }

    /**
     *
     * @return
     */
    public ArrayList<Futbolista> getEntrenadores() {
        return entrenadores;
    }

    /**
     *
     * @param entrenadores
     */
    public void setEntrenadores(ArrayList<Futbolista> entrenadores) {
        this.entrenadores = entrenadores;
    }

    /**
     *
     * @return
     */
    public ArrayList<Futbolista> getPlantilla() {
        return plantilla;
    }

    /**
     *
     * @param plantilla
     */
    public void setPlantilla(ArrayList<Futbolista> plantilla) {
        this.plantilla = plantilla;
    }

    /**
     *
     * @return
     */
    public Entrenador getEntrenadorPlantilla() {
        return entrenadorPlantilla;
    }

    /**
     *
     * @param entrenadorPlantilla
     */
    public void setEntrenadorPlantilla(Entrenador entrenadorPlantilla) {
        this.entrenadorPlantilla = entrenadorPlantilla;
    }

    /**
     *
     * @return
     */
    public Futbolista getPlantillaPortero() {
        return plantillaPortero;
    }

    /**
     *
     * @param plantillaPortero
     */
    public void setPlantillaPortero(Futbolista plantillaPortero) {
        this.plantillaPortero = plantillaPortero;
    }

    /**
     *
     * @return
     */
    public ArrayList<Futbolista> getPlantillaDefensas() {
        return plantillaDefensas;
    }

    /**
     *
     * @param plantillaDefensas
     */
    public void setPlantillaDefensas(ArrayList<Futbolista> plantillaDefensas) {
        this.plantillaDefensas = plantillaDefensas;
    }

    /**
     *
     * @return
     */
    public ArrayList<Futbolista> getPlantillaMedios() {
        return plantillaMedios;
    }

    /**
     *
     * @param plantillaMedios
     */
    public void setPlantillaMedios(ArrayList<Futbolista> plantillaMedios) {
        this.plantillaMedios = plantillaMedios;
    }

    /**
     *
     * @return
     */
    public ArrayList<Futbolista> getPlantillaDelanteros() {
        return plantillaDelanteros;
    }

    /**
     *
     * @param plantillaDelanteros
     */
    public void setPlantillaDelanteros(ArrayList<Futbolista> plantillaDelanteros) {
        this.plantillaDelanteros = plantillaDelanteros;
    }

   
    
    
    
    
    
    
}
