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

public class ObtenerDatosBBDD {

    public boolean comprobarUsuario(String usuario, String contraseña) {

        return false;

    }

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
                  System.out.println(sobre.getNombre());
            }
        } catch (SQLException ex) {
            Logger.getLogger(ObtenerDatosBBDD.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public Entrenador getEntrenadorBBDD(String nombreUsuario) {
        String consulta = ("SELECT E.NOMBRE,E.VALOR,E.ATAQUE,E.DEFENSA,E.IMAGEN\n"
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
                entrenador = new Entrenador(mysqlResult.getString(1), mysqlResult.getInt(2), mysqlResult.getInt(3), mysqlResult.getInt(4), mysqlResult.getString(5));

            }
        } catch (SQLException ex) {
            Logger.getLogger(ObtenerDatosBBDD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return entrenador;

    }

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

    public ArrayList<Futbolista> getAllJugadores() {
        String consulta = ("SELECT NOMBRE, POSICION, PRECIO, ATAQUE, DEFENSA FROM bbdd_fantasy.tbl_jugadores;");
        OperacionesBBDD escritura = new OperacionesBBDD();
        Futbolista futbolista = null;
        ArrayList<Futbolista> allJugadores = new ArrayList();
        ResultSet mysqlResult = escritura.getSQL(consulta);
        try {
            while (mysqlResult.next()) {

                futbolista = new Futbolista(mysqlResult.getString(1), mysqlResult.getString(2), mysqlResult.getInt(3), mysqlResult.getInt(4), mysqlResult.getInt(5), null);
                allJugadores.add(futbolista);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ObtenerDatosBBDD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return allJugadores;

    }

    public void getJugadoresPlantilla(Usuario usuario) {
        String consulta = ("SELECT J.NOMBRE, J.POSICION, J.PRECIO, J.ATAQUE, J.DEFENSA, J.IMAGEN, JE.ALINEADO\n"
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
        System.out.println(consulta);
        OperacionesBBDD escritura = new OperacionesBBDD();
        ResultSet mysqlResult = escritura.getSQL(consulta);
        Futbolista futbolista = null;
        usuario.getPlantilla().clear();
        usuario.getJugadores().clear();
        try {

            while (mysqlResult.next()) {

                futbolista = new Futbolista(mysqlResult.getString(1), mysqlResult.getString(2), mysqlResult.getInt(3), mysqlResult.getInt(4), mysqlResult.getInt(5), mysqlResult.getString(6));

                if ("SI".equals(mysqlResult.getString(7))) {

                    usuario.getPlantilla().add(futbolista);

                }
                usuario.getJugadores().add(futbolista);
                usuario.getLiga().getJugadoresJugando().add(futbolista);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ObtenerDatosBBDD.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

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
                System.out.println(liga.getPartidos().size());
            }

        } catch (SQLException ex) {
            Logger.getLogger(ObtenerDatosBBDD.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
