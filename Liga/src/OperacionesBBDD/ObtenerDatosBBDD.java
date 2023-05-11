package OperacionesBBDD;

import Methods.Entrenador;
import Methods.Equipo;
import Methods.Liga;
import Methods.Usuario;
import OperacionesBBDD.OperacionesBBDD;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ObtenerDatosBBDD {

    public boolean comprobarUsuario(String usuario, String contraseña) {

        return false;

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
                entrenador = new Entrenador(mysqlResult.getString(1), mysqlResult.getString(2), mysqlResult.getInt(3), mysqlResult.getInt(4), mysqlResult.getString(5));

            }
        } catch (SQLException ex) {
            Logger.getLogger(ObtenerDatosBBDD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return entrenador;

    }

    public Equipo getEquipoBBDD(String usuario, Entrenador entrenador) {
        String consulta = ("SELECT NOMBRE_PLANTILLA,DINERO,PUNTOS\n"
                + "FROM TBL_EQUIPO\n"
                + "WHERE ID_USUARIO=\n"
                + "(SELECT ID_USUARIO\n"
                + "FROM TBL_USUARIO\n"
                + "WHERE USUARIO='" + usuario + "');");

        OperacionesBBDD escritura = new OperacionesBBDD();
        ResultSet mysqlResult = escritura.getSQL(consulta);
        Equipo equipo = null;
        try {

            if (mysqlResult.next()) {
                equipo = new Equipo(null, entrenador, mysqlResult.getString(1), mysqlResult.getInt(2), mysqlResult.getInt(3));

            }
        } catch (SQLException ex) {
            Logger.getLogger(ObtenerDatosBBDD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return equipo;

    }

    public Liga getLigaBBDD( String usuario) {
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
                us1 = new Usuario(mysqlResult.getString(1), mysqlResult.getString(2), mysqlResult.getString(3), null, mysqlResult.getString(4), null, null);

            }

        } catch (SQLException ex) {
            Logger.getLogger(ObtenerDatosBBDD.class.getName()).log(Level.SEVERE, null, ex);
        }

        return us1;

    }

}
