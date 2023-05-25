/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OperacionesBBDD;

import Methods.Entrenador;
import Methods.Equipo;
import Methods.Futbolista;
import Methods.Liga;
import Methods.Sobre;
import Methods.Usuario;
import OperacionesBBDD.OperacionesBBDD;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EnviarDatosBBDD {

    public void actualizarJugadoresPlantilla(ArrayList<Futbolista> plantilla, Usuario Actual) {
        eliminarTODOSJugadoresEquipo(Actual.getEquipo().getNombre());

        Iterator<Futbolista> it = Actual.getJugadores().iterator();
        String Alineado = "NO";
        while (it.hasNext()) {
            Futbolista jugador = it.next();
            if (Actual.getPlantilla().contains(jugador)) {
                Alineado = "SI";
            } else {
                Alineado = "NO";
            }

            String consulta = "INSERT INTO tbl_jugador_equipo\n"
                    + "SELECT \n"
                    + "(SELECT ID_JUGADOR FROM TBL_JUGADORES WHERE NOMBRE='" + jugador.getNombre() + "'),\n"
                    + "(SELECT ID_EQUIPO FROM TBL_EQUIPO WHERE NOMBRE_PLANTILLA='" + Actual.getEquipo().getNombre() + "'),\n"
                    + "('" + Alineado + "');";
            System.out.println(consulta);
            OperacionesBBDD escritura = new OperacionesBBDD();
            escritura.escrituraSql(consulta);
        }

    }

    public void eliminarJugador(Usuario Actual, String jugador) {
        String consulta = "DELETE FROM TBL_JUGADOR_EQUIPO\n"
                + "WHERE ID_EQUIPO=(SELECT ID_EQUIPO\n"
                + "FROM TBL_EQUIPO \n"
                + "WHERE NOMBRE_PLANTILLA='" + Actual.getEquipo().getNombre() + "') and \n"
                + "id_jugador=(SELECT ID_JUGADOR FROM TBL_JUGADORES WHERE NOMBRE='" + jugador + "');";
        System.out.println(consulta);
        OperacionesBBDD escritura = new OperacionesBBDD();
        escritura.escrituraSql(consulta);
    }

    public void eliminarTODOSJugadoresEquipo(String nombreEquipo) {
        String consulta = "DELETE FROM TBL_JUGADOR_EQUIPO\n"
                + "WHERE ID_EQUIPO=(SELECT ID_EQUIPO\n"
                + "FROM TBL_EQUIPO \n"
                + "WHERE NOMBRE_PLANTILLA='" + nombreEquipo + "');";

        OperacionesBBDD escritura = new OperacionesBBDD();
        escritura.escrituraSql(consulta);
    }

    public void actualizarSaldo(Usuario Actual) {
        String consulta = "UPDATE `bbdd_fantasy`.`tbl_equipo` SET `DINERO` = '" + Actual.getEquipo().getDinero() + "'"
                + " WHERE  (`ID_USUARIO` = "
                + "(SELECT ID_USUARIO FROM TBL_USUARIO WHERE USUARIO='" + Actual.getNombreUsuario() + "'));";
        OperacionesBBDD escritura = new OperacionesBBDD();
        escritura.escrituraSql(consulta);
    }

    public void añadirJugador(Usuario Actual, String jugador) {
        String consulta = "INSERT INTO TBL_JUGADOR_EQUIPO\n"
                + "SELECT \n"
                + "(SELECT ID_JUGADOR\n"
                + "FROM TBL_JUGADORES \n"
                + "WHERE NOMBRE='" + jugador + "'),\n"
                + "(SELECT ID_EQUIPO\n"
                + "FROM TBL_EQUIPO \n"
                + "WHERE NOMBRE_PLANTILLA='" + Actual.getEquipo().getNombre() + "'),\n"
                + "('NO'); ";

        System.out.println(consulta);
        OperacionesBBDD escritura = new OperacionesBBDD();

        escritura.escrituraSql(consulta);
    }

    public void añadirSobre(Usuario Actual, Sobre sobre) {
        String consulta = "INSERT INTO TBL_SOBRE_EQUIPO \n"
                + "SELECT (SELECT ID_EQUIPO FROM TBL_EQUIPO \n"
                + "WHERE NOMBRE_PLANTILLA='"+Actual.getEquipo().getNombre()+"'),\n"
                + "(SELECT ID_SOBRE FROM TBL_SOBRE_TIENDA\n"
                + "WHERE NOMBRE_SOBRE='"+sobre.getNombre()+"');";

        System.out.println(consulta);
        OperacionesBBDD escritura = new OperacionesBBDD();

        escritura.escrituraSql(consulta);
    }
}
