package OperacionesBBDD;

import Methods.Entrenador;
import Methods.Equipo;
import Methods.Futbolista;
import Methods.Liga;
import Methods.Partido;
import Methods.Sobre;
import Methods.Usuario;
import OperacionesBBDD.OperacionesBBDD;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Esta clase contiene métodos para obtener datos de una base de datos relacionados con un juego de fútbol.
 * Proporciona métodos para realizar consultas y obtener información sobre usuarios, entrenadores, equipos, jugadores, ligas y partidos.
 * Los métodos de esta clase interactúan con la base de datos utilizando la clase `OperacionesBBDD`.
 *
 * @author Marco
 * @version 1.0
 * @since 2023-05-28
 */
public class ObtenerDatosBBDD {

    /**
     * Comprueba si un usuario y contraseña son válidos.
     *
     * @param usuario     El nombre de usuario o correo electrónico del usuario.
     * @param contraseña  La contraseña del usuario.
     * @return true si el usuario y la contraseña son válidos, false de lo contrario.
     */
    public boolean comprobarUsuario(String usuario, String contraseña) {

        return false;

    }

    /**
     * Obtiene los sobres disponibles para un usuario y los agrega a su liga.
     *
     * @param us El objeto Usuario al que se agregarán los sobres disponibles.
     */
    public void getSobres(Usuario us) {
        String consulta = ("SELECT NOMBRE_SOBRE, CANTIDAD_JUGADORES, PRECIO\n"
                + "FROM TBL_SOBRE_TIENDA;");

        OperacionesBBDD escritura = new OperacionesBBDD();
        ResultSet mysqlResult = escritura.getSQL(consulta);
        Sobre sobre = null;
        us.getLiga().getSobreDisponible().clear();
        try {

            while (mysqlResult.next()) {
                sobre = new Sobre(mysqlResult.getString(1), mysqlResult.getInt(2), mysqlResult.getInt(3));
                us.getLiga().getSobreDisponible().add(sobre);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ObtenerDatosBBDD.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

     /**
     * Obtiene el historial de sobres abiertos por un usuario y los agrega a su equipo.
     *
     * @param us El objeto Usuario al que se agregarán los sobres abiertos.
     */
    public void gethistorialSobre(Usuario us) {
        String consulta = ("SELECT ST.NOMBRE_SOBRE, ST.CANTIDAD_JUGADORES, ST.PRECIO\n"
                + "FROM TBL_SOBRE_EQUIPO AS SE\n"
                + "INNER JOIN TBL_SOBRE_TIENDA AS ST\n"
                + "ON SE.ID_SOBRE=ST.ID_SOBRE\n"
                + "WHERE SE.ID_EQUIPO=(SELECT ID_EQUIPO FROM TBL_EQUIPO WHERE NOMBRE_PLANTILLA = '" + us.getEquipo().getNombre() + "');");
        us.getEquipo().getSobresAbiertos().clear();
        OperacionesBBDD escritura = new OperacionesBBDD();
        ResultSet mysqlResult = escritura.getSQL(consulta);
        Sobre sobre = null;
        try {

            while (mysqlResult.next()) {
              
                sobre = new Sobre(mysqlResult.getString(1), mysqlResult.getInt(2), mysqlResult.getInt(3));
                us.getEquipo().getSobresAbiertos().add(sobre);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ObtenerDatosBBDD.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * Obtiene un entrenador de la base de datos basado en el nombre de usuario.
     *
     * @param nombreUsuario El nombre de usuario del entrenador.
     * @return El objeto Entrenador obtenido de la base de datos, o null si no se encontró ningún entrenador.
     */
    public Entrenador getEntrenadorBBDD(String nombreUsuario) {
        String consulta = ("SELECT E.NOMBRE,E.VALOR,E.ATAQUE,E.DEFENSA\n"
                + "FROM TBL_ENTRENADOR AS E \n"
                + "INNER JOIN TBL_EQUIPO AS EQ \n"
                + "ON E.ID_ENTRENADOR=EQ.ENTRENADOR\n"
                + "INNER JOIN TBL_LIGA AS L \n"
                + "ON EQ.LIGA=L.ID_LIGA\n"
                + "WHERE EQ.ID_USUARIO=(SELECT ID_USUARIO\n"
                + "FROM TBL_USUARIO WHERE \n"
                + "USUARIO = '" + nombreUsuario + "') ;");

        OperacionesBBDD escritura = new OperacionesBBDD();
        ResultSet mysqlResult = escritura.getSQL(consulta);
        Entrenador entrenador = null;
        try {

            if (mysqlResult.next()) {
                entrenador = new Entrenador(mysqlResult.getString(1), mysqlResult.getInt(2), mysqlResult.getInt(3), mysqlResult.getInt(4));

            }
        } catch (SQLException ex) {
            Logger.getLogger(ObtenerDatosBBDD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return entrenador;

    }

     /**
     * Obtiene un equipo de la base de datos basado en el nombre de usuario y el entrenador asociado.
     *
     * @param usuario    El nombre de usuario del equipo.
     * @param entrenador El objeto Entrenador asociado al equipo.
     * @return El objeto Equipo obtenido de la base de datos, o null si no se encontró ningún equipo.
     */
    public Equipo getEquipoBBDD(String usuario, Entrenador entrenador) {
        String consulta = ("SELECT e.NOMBRE_PLANTILLA,e.DINERO,e.PUNTOS, (\n"
                + "SELECT COUNT(*) \n"
                + "FROM TBL_PARTIDO AS P INNER JOIN TBL_EQUIPO AS E1\n"
                + "ON P.EQUIPO_LOCAL=E1.ID_EQUIPO INNER JOIN TBL_EQUIPO AS E2\n"
                + "ON P.EQUIPO_VISITANTE=E2.ID_EQUIPO \n"
                + "WHERE E1.NOMBRE_PLANTILLA = e.NOMBRE_PLANTILLA AND puntos_local < puntos_visitante\n"
                + "OR E2.NOMBRE_PLANTILLA = e.NOMBRE_PLANTILLA  AND puntos_local > puntos_visitante) AS GANADOS,\n"
                + "(\n"
                + "SELECT COUNT(*) \n"
                + "FROM TBL_PARTIDO AS P INNER JOIN TBL_EQUIPO AS E1\n"
                + "ON P.EQUIPO_LOCAL=E1.ID_EQUIPO INNER JOIN TBL_EQUIPO AS E2\n"
                + "ON P.EQUIPO_VISITANTE=E2.ID_EQUIPO \n"
                + "WHERE E1.NOMBRE_PLANTILLA = e.NOMBRE_PLANTILLA AND puntos_local > puntos_visitante\n"
                + "OR E2.NOMBRE_PLANTILLA = e.NOMBRE_PLANTILLA AND puntos_local < puntos_visitante) AS PERDIDOS\n"
                + "FROM TBL_EQUIPO as e\n"
                + "WHERE ID_USUARIO=\n"
                + "(SELECT ID_USUARIO\n"
                + "FROM TBL_USUARIO\n"
                + "WHERE USUARIO='" + usuario + "');");

        OperacionesBBDD escritura = new OperacionesBBDD();
        ResultSet mysqlResult = escritura.getSQL(consulta);
        Equipo equipo = null;

        try {

            if (mysqlResult.next()) {
                equipo = new Equipo(null, entrenador, mysqlResult.getString(1), mysqlResult.getInt(2), mysqlResult.getInt(3), mysqlResult.getInt(4), mysqlResult.getInt(5));

            }
        } catch (SQLException ex) {
            Logger.getLogger(ObtenerDatosBBDD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return equipo;

    }

     /**
     * Obtiene todos los jugadores de la base de datos.
     *
     * @return Una lista de objetos Futbolista que representa a todos los jugadores.
     */
    public ArrayList<Futbolista> getAllJugadores() {
        String consulta = ("SELECT NOMBRE, POSICION, PRECIO, ATAQUE, DEFENSA FROM bbdd_fantasy.tbl_jugadores;");
        OperacionesBBDD escritura = new OperacionesBBDD();
        Futbolista futbolista = null;
        ArrayList<Futbolista> allJugadores = new ArrayList();
        ResultSet mysqlResult = escritura.getSQL(consulta);
        try {
            while (mysqlResult.next()) {

                futbolista = new Futbolista(mysqlResult.getString(1), mysqlResult.getString(2), mysqlResult.getInt(3), mysqlResult.getInt(4), mysqlResult.getInt(5));
                allJugadores.add(futbolista);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ObtenerDatosBBDD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return allJugadores;

    }

   /**
     * Obtiene los jugadores de la plantilla de un usuario y los agrega a su lista de jugadores y plantilla.
     *
     * @param usuario El objeto Usuario al que se agregarán los jugadores de la plantilla.
     */
    public void getJugadoresPlantilla(Usuario usuario) {
        String consulta = ("SELECT J.NOMBRE, J.POSICION, J.PRECIO, J.ATAQUE, J.DEFENSA,  JE.ALINEADO\n"
                + "FROM TBL_JUGADOR_EQUIPO AS JE \n"
                + "INNER JOIN TBL_JUGADORES AS J\n"
                + "ON JE.ID_JUGADOR=J.ID_JUGADOR\n"
                + "WHERE JE.ID_EQUIPO=\n"
                + "(SELECT ID_EQUIPO \n"
                + "FROM TBL_EQUIPO\n"
                + "WHERE ID_USUARIO=(\n"
                + "SELECT ID_USUARIO\n"
                + "FROM TBL_USUARIO\n"
                + "WHERE USUARIO='" + usuario.getNombre() + "'\n"
                + "));");
        OperacionesBBDD escritura = new OperacionesBBDD();
        ResultSet mysqlResult = escritura.getSQL(consulta);
        Futbolista futbolista = null;
        usuario.getPlantilla().clear();
        usuario.getJugadores().clear();
        try {

            while (mysqlResult.next()) {

                futbolista = new Futbolista(mysqlResult.getString(1), mysqlResult.getString(2), mysqlResult.getInt(3), mysqlResult.getInt(4), mysqlResult.getInt(5));

                if ("SI".equals(mysqlResult.getString(6))) {

                    usuario.getPlantilla().add(futbolista);

                }
                usuario.getJugadores().add(futbolista);
                usuario.getLiga().getJugadoresJugando().add(futbolista);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ObtenerDatosBBDD.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * Obtiene una liga de la base de datos basada en el nombre de usuario.
     *
     * @param usuario El nombre de usuario.
     * @return 
     */
    public Liga getLigaBBDD(String usuario) {
        String consulta = ("SELECT L.NOMBRE, U.USUARIO\n"
                + "FROM TBL_EQUIPO AS E INNER JOIN \n"
                + "TBL_LIGA AS L ON E.LIGA=L.ID_LIGA\n"
                + "INNER JOIN TBL_USUARIO AS U\n"
                + "ON U.ID_USUARIO=L.ADMINISTRADOR\n"
                + "INNER JOIN TBL_USUARIO U2\n"
                + "ON E.ID_USUARIO=U2.ID_USUARIO\n"
                + "WHERE U2.USUARIO='" + usuario + "';");

        OperacionesBBDD escritura = new OperacionesBBDD();
        ResultSet mysqlResult = escritura.getSQL(consulta);
        Liga liga = null;
        try {

            if (mysqlResult.next()) {
                liga = new Liga(mysqlResult.getString(1), mysqlResult.getString(2));

            }
        } catch (SQLException ex) {
            Logger.getLogger(ObtenerDatosBBDD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return liga;

    }

    /**
     * Comprueba si el usuario esxiste en la base de datos
     * @param usuario
     * @param contraseña
     * @return
     */
    public boolean ComprobarUsuarioBBDD(String usuario, String contraseña) {
        boolean correcto = false;
        String consulta = null;
        if (usuario.contains("@")) {

            consulta = ("SELECT U.NOMBRE, U.APELLIDOS, U.USUARIO, U.CORREO\n"
                    + "FROM TBL_USUARIO AS U\n"
                    + "WHERE U.CORREO='" + usuario + "'AND U.CONTRASENA=MD5('" + contraseña + "');");

        } else {
            consulta = ("SELECT U.NOMBRE, U.APELLIDOS, U.USUARIO, U.CORREO\n"
                    + "FROM TBL_USUARIO AS U\n"
                    + "WHERE U.USUARIO='" + usuario + "'AND U.CONTRASENA=MD5('" + contraseña + "');");

        }
        OperacionesBBDD escritura = new OperacionesBBDD();
        ResultSet mysqlResult = escritura.getSQL(consulta);
        Usuario us1 = null;
        try {
            if (mysqlResult.next()) {
                us1 = new Usuario(mysqlResult.getString(1), mysqlResult.getString(2), mysqlResult.getString(3), null, mysqlResult.getString(4), null, null);
                correcto = true;
            } else {
                correcto = false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ObtenerDatosBBDD.class.getName()).log(Level.SEVERE, null, ex);
        }

        return correcto;

    }

    /**
     *  Obtiene el usuario que se esta buscando
     * @param usuario
     * @return
     */
    public Usuario getUsuarioBBDD(String usuario) {

        String consulta = null;

        if (usuario.contains("@")) {
            consulta = ("SELECT U.NOMBRE, U.APELLIDOS, U.USUARIO, U.CORREO\n"
                    + "FROM TBL_USUARIO AS U\n"
                    + "WHERE U.CORREO='" + usuario + "';");

        } else {
            consulta = ("SELECT U.NOMBRE, U.APELLIDOS, U.USUARIO, U.CORREO\n"
                    + "FROM TBL_USUARIO AS U\n"
                    + "WHERE U.USUARIO='" + usuario + "';");

        }
        OperacionesBBDD escritura = new OperacionesBBDD();
        ResultSet mysqlResult = escritura.getSQL(consulta);
        Usuario us1 = null;
        try {
            if (mysqlResult.next()) {
                us1 = new Usuario(mysqlResult.getString(1), mysqlResult.getString(2), mysqlResult.getString(3), "", mysqlResult.getString(4), null, null);

            }

        } catch (SQLException ex) {
            Logger.getLogger(ObtenerDatosBBDD.class.getName()).log(Level.SEVERE, null, ex);
        }

        return us1;

    }

    /**
     *  Obtiene los partidos de una determinada liga
     * @param liga
     */
    public void getPartidosBBDD(Liga liga) {
       
        String consulta = null;

        consulta = ("SELECT E.NOMBRE_PLANTILLA, E2.NOMBRE_PLANTILLA,P.FECHA_INICIO, \n"
                + "P.HORA_INICIO, P.RESULTADO, P.PUNTOS_VISITANTE, P.PUNTOS_LOCAL\n"
                + "FROM TBL_PARTIDO AS P \n"
                + "INNER JOIN TBL_EQUIPO AS E\n"
                + "ON P.EQUIPO_LOCAL=E.ID_EQUIPO\n"
                + "INNER JOIN TBL_EQUIPO AS E2\n"
                + "ON P.EQUIPO_VISITANTE=E2.ID_EQUIPO\n"
                + "WHERE P.LIGA=(SELECT ID_LIGA \n"
                + "FROM TBL_LIGA\n"
                + "WHERE NOMBRE='" + liga.getNombre() + "')\n"
                + "order by Resultado asc, fecha_inicio asc , hora_inicio asc;");

        OperacionesBBDD escritura = new OperacionesBBDD();
        ResultSet mysqlResult = escritura.getSQL(consulta);

        try {
            while (mysqlResult.next()) {
                Usuario usLocal = null;
                Usuario usVisitante = null;
                Iterator it = liga.getIntegrantes().iterator();
                while (it.hasNext()) {
                    Usuario us = (Usuario) it.next();
                    if (us.getEquipo().getNombre().equals(mysqlResult.getString(1))) {
                        usLocal = us;
                    }
                    if (us.getEquipo().getNombre().equals(mysqlResult.getString(2))) {
                        usVisitante = us;
                    }

                }
                Partido p1 = new Partido(usLocal, usVisitante, mysqlResult.getDate(3), mysqlResult.getDate(4), mysqlResult.getString(5), mysqlResult.getInt(6), mysqlResult.getInt(7));
                liga.getPartidos().add(p1);
                
            }

        } catch (SQLException ex) {
            Logger.getLogger(ObtenerDatosBBDD.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
