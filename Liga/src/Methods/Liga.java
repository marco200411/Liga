
package Methods;

import Interface.juego.PantallaLiga;
import OperacionesBBDD.ObtenerDatosBBDD;
import OperacionesBBDD.OperacionesBBDD;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase que representa una Liga de fútbol.
 * Contiene métodos para administrar los jugadores, partidos y usuarios de la Liga.
 * @author Marco
 */
public class Liga {

    String Nombre;
    String Administrador;
    ArrayList<Sobre> sobreDisponible = new ArrayList();
    ArrayList<Usuario> integrantes = new ArrayList();
    ArrayList<Futbolista> jugadoresJugando = new ArrayList();
    private ArrayList<Futbolista> jugadoresLibres = new ArrayList();
    private ArrayList<Futbolista> jugadoresLibresPortero = new ArrayList();
    private ArrayList<Futbolista> jugadoresLibresDefensa = new ArrayList();
    private ArrayList<Futbolista> jugadoresLibresMedio = new ArrayList();
    private ArrayList<Futbolista> jugadoresLibresDelantero = new ArrayList();
    private ArrayList<Partido> partidos = new ArrayList();

    /**
     *
     * @param Nombre
     * @param Administrador
     */
    public Liga(String Nombre, String Administrador) {
        this.Nombre = Nombre;
        this.Administrador = Administrador;

    }

   /**
 * Almacena los partidos de la Liga para el equipo dado.
 *
 * @param Actual el usuario actual
 */
    public void almacenarPartidosEquipo(Usuario Actual) {
            
        Iterator it = Actual.getLiga().getPartidos().iterator();
        while (it.hasNext()) {
            Partido partido = (Partido) it.next();
            
            for (Usuario integrante : this.getIntegrantes()) {
                
                integrante.getEquipo().getPartidosEquipo().add(partido);
                
                if (!integrante.equals(Actual) && partido.getUsuarioLocal().getNombreUsuario().equalsIgnoreCase(integrante.getNombreUsuario()) || partido.getUsuarioVisitante().getNombreUsuario().equalsIgnoreCase(integrante.getNombreUsuario())) {

                }
            }
        }

    }

    /**
     *  Obtiene los jugadores jugando a la liga
     */
    public void jugadoresJugandoLiga() {

        String sentenciaSelect = "SELECT J.NOMBRE, J.POSICION, J.PRECIO, J.ATAQUE, J.DEFENSA\n"
                + "                FROM TBL_JUGADORES AS J RIGHT JOIN tbl_jugador_equipo AS JE \n"
                + "                ON JE.ID_JUGADOR=J.ID_JUGADOR INNER JOIN TBL_EQUIPO AS E\n"
                + "                ON JE.ID_EQUIPO=E.ID_EQUIPO INNER JOIN TBL_USUARIO AS U\n"
                + "               ON E.ID_USUARIO=U.ID_USUARIO\n"
                + "               where E.LIGA=(SELECT ID_LIGA FROM TBL_LIGA WHERE NOMBRE = '" + this.getNombre() + "');";

        OperacionesBBDD get = new OperacionesBBDD();
        ResultSet results = get.getSQL(sentenciaSelect);

        try {
            while (results.next()) {
                Futbolista f1 = new Futbolista(results.getString(2), results.getString(1), results.getInt(3), results.getInt(4), results.getInt(5));
                this.getJugadoresJugando().add(f1);

            }

        } catch (SQLException ex) {
            Logger.getLogger(PantallaLiga.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     *  Almacena los partidos de el equipo actual
     * @param Actual
     */
    public void almacenarPartidosEquipoActual(Usuario Actual) {
       Actual.getEquipo().getPartidosEquipo().clear();
        Iterator it = this.getPartidos().iterator();
        while (it.hasNext()) {
            Partido partido = (Partido) it.next();
            if (partido.getUsuarioLocal().getNombreUsuario().equalsIgnoreCase(Actual.getNombreUsuario()) || partido.getUsuarioVisitante().getNombreUsuario().equalsIgnoreCase(Actual.getNombreUsuario())) {
                Actual.getEquipo().getPartidosEquipo().add(partido);
            }
        }
    }

    /**
     *  Almacena los partidos de la liga
     * @param Actual
     */
    public void almacenarPartidosLiga(Usuario Actual) {
       
        Actual.getLiga().getPartidos().clear();
        ObtenerDatosBBDD getDatos = new ObtenerDatosBBDD();
        getDatos.getPartidosBBDD(Actual.getLiga());

    }

    /**
     *Almacena los integrantes de la liga
     */
    public void almacenarIntegrantesLiga() {
        this.getIntegrantes().clear();
        ObtenerDatosBBDD getDatos = new ObtenerDatosBBDD();
        String sentenciaSelect = " SELECT U.USUARIO \n"
                + "                    FROM TBL_USUARIO AS U INNER JOIN TBL_EQUIPO AS E\n"
                + "                    ON U.ID_USUARIO=E.ID_USUARIO INNER JOIN TBL_LIGA AS L\n"
                + "                    ON L.ID_LIGA=E.LIGA\n"
                + "                    WHERE L.NOMBRE='" + this.getNombre() + "';";

        OperacionesBBDD get = new OperacionesBBDD();
        ResultSet results = get.getSQL(sentenciaSelect);
        try {
            while (results.next()) {
                String nombreUsuario = results.getString(1);

                Entrenador entrenador = getDatos.getEntrenadorBBDD(nombreUsuario);
                Equipo equipo = getDatos.getEquipoBBDD(nombreUsuario, entrenador);

                Usuario usuario = getDatos.getUsuarioBBDD(nombreUsuario);

                Liga liga = getDatos.getLigaBBDD(usuario.getNombre());
                usuario.setLiga(liga);
                usuario.setEquipo(equipo);
               
                this.getIntegrantes().add(usuario);

            }

        } catch (SQLException ex) {
            Logger.getLogger(PantallaLiga.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     *  Almacena los jugadores que no tienen equipo
     * @param Actual
     */
    public void agentesLibres(Usuario Actual) {
        this.getJugadoresLibres().clear();
        String sentenciaSelect = "SELECT J.NOMBRE, J.POSICION, J.PRECIO, J.ATAQUE, J.DEFENSA\n"
                + "FROM TBL_JUGADORES AS J WHERE \n"
                + "J.ID_JUGADOR NOT IN\n"
                + "(SELECT ID_JUGADOR \n"
                + "FROM TBL_JUGADOR_EQUIPO\n"
                + "WHERE J.ID_JUGADOR=ID_JUGADOR AND \n"
                + "ID_EQUIPO IN (SELECT E.ID_EQUIPO\n"
                + "FROM TBL_EQUIPO AS E INNER JOIN TBL_LIGA AS L \n"
                + "ON E.LIGA=L.ID_LIGA\n"
                + "WHERE L.NOMBRE='" + this.getNombre() + "')) \n"
                + ";";

        OperacionesBBDD get = new OperacionesBBDD();
        ResultSet results = get.getSQL(sentenciaSelect);
        try {
            while (results.next()) {

                Futbolista f1 = new Futbolista(results.getString(1), results.getString(2), results.getInt(3), results.getInt(4), results.getInt(5));
                if (!Actual.getJugadores().contains(f1)) {
                    this.getJugadoresLibres().add(f1);
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(PantallaLiga.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     *
     * @return
     */
    public ArrayList<Sobre> getSobreDisponible() {
        return sobreDisponible;
    }

    /**
     *
     * @param sobreDisponible
     */
    public void setSobreDisponible(ArrayList<Sobre> sobreDisponible) {
        this.sobreDisponible = sobreDisponible;
    }

    /**
     *
     * @return
     */
    public ArrayList<Futbolista> getJugadoresLibresPortero() {
        return jugadoresLibresPortero;
    }

    /**
     *
     * @param jugadoresLibresPortero
     */
    public void setJugadoresLibresPortero(ArrayList<Futbolista> jugadoresLibresPortero) {
        this.jugadoresLibresPortero = jugadoresLibresPortero;
    }

    /**
     *
     * @return
     */
    public ArrayList<Futbolista> getJugadoresLibresDefensa() {
        return jugadoresLibresDefensa;
    }

    /**
     *
     * @param jugadoresLibresDefensa
     */
    public void setJugadoresLibresDefensa(ArrayList<Futbolista> jugadoresLibresDefensa) {
        this.jugadoresLibresDefensa = jugadoresLibresDefensa;
    }

    /**
     *
     * @return
     */
    public ArrayList<Futbolista> getJugadoresLibresMedio() {
        return jugadoresLibresMedio;
    }

    /**
     *
     * @param jugadoresLibresMedio
     */
    public void setJugadoresLibresMedio(ArrayList<Futbolista> jugadoresLibresMedio) {
        this.jugadoresLibresMedio = jugadoresLibresMedio;
    }

    /**
     *
     * @return
     */
    public ArrayList<Futbolista> getJugadoresLibresDelantero() {
        return jugadoresLibresDelantero;
    }

    /**
     *
     * @param jugadoresLibresDelantero
     */
    public void setJugadoresLibresDelantero(ArrayList<Futbolista> jugadoresLibresDelantero) {
        this.jugadoresLibresDelantero = jugadoresLibresDelantero;
    }

    /**
     *
     * @return
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     *
     * @param Nombre
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     *
     * @return
     */
    public String getAdministrador() {
        return Administrador;
    }

    /**
     *
     * @param Administrador
     */
    public void setAdministrador(String Administrador) {
        this.Administrador = Administrador;
    }

    /**
     *
     * @return
     */
    public ArrayList<Usuario> getIntegrantes() {
        return integrantes;
    }

    /**
     *
     * @param integrantes
     */
    public void setIntegrantes(ArrayList<Usuario> integrantes) {
        this.integrantes = integrantes;
    }

    /**
     *
     * @return
     */
    public ArrayList<Futbolista> getJugadoresJugando() {
        return jugadoresJugando;
    }

    /**
     *
     * @param jugadoresJugando
     */
    public void setJugadoresJugando(ArrayList<Futbolista> jugadoresJugando) {
        this.jugadoresJugando = jugadoresJugando;
    }

    /**
     *
     * @return
     */
    public ArrayList<Futbolista> getJugadoresLibres() {
        return jugadoresLibres;
    }

    /**
     *
     * @param jugadoresLibres
     */
    public void setJugadoresLibres(ArrayList<Futbolista> jugadoresLibres) {
        this.jugadoresLibres = jugadoresLibres;
    }

    /**
     *
     * @return
     */
    public ArrayList<Partido> getPartidos() {
        return partidos;
    }

    /**
     *
     * @param partidos
     */
    public void setPartidos(ArrayList<Partido> partidos) {
        this.partidos = partidos;
    }

}
