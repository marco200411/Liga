
package OperacionesBBDD;

import Methods.Futbolista;
import Methods.Sobre;
import Methods.Usuario;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * La clase EnviarDatosBBDD se utiliza para enviar y actualizar datos en una base de datos.
 */
public class EnviarDatosBBDD {

    /**
     * Actualiza los jugadores de la plantilla en la base de datos para un usuario específico.
     *
     * @param plantilla la lista de jugadores de la plantilla
     * @param actual el usuario actual
     */
    public void actualizarJugadoresPlantilla(ArrayList<Futbolista> plantilla, Usuario actual) {
        eliminarTODOSJugadoresEquipo(actual.getEquipo().getNombre());

        Iterator<Futbolista> it = actual.getJugadores().iterator();
        String alineado = "NO";
        while (it.hasNext()) {
            Futbolista jugador = it.next();
            if (actual.getPlantilla().contains(jugador)) {
                alineado = "SI";
            } else {
                alineado = "NO";
            }

            String consulta = "INSERT INTO tbl_jugador_equipo\n"
                    + "SELECT \n"
                    + "(SELECT ID_JUGADOR FROM TBL_JUGADORES WHERE NOMBRE='" + jugador.getNombre() + "'),\n"
                    + "(SELECT ID_EQUIPO FROM TBL_EQUIPO WHERE NOMBRE_PLANTILLA='" + actual.getEquipo().getNombre() + "'),\n"
                    + "('" + alineado + "');";
            OperacionesBBDD escritura = new OperacionesBBDD();
            escritura.escrituraSql(consulta);
        }
    }

    /**
     * Elimina un jugador de la plantilla del usuario actual en la base de datos.
     *
     * @param actual el usuario actual
     * @param jugador el nombre del jugador a eliminar
     */
    public void eliminarJugador(Usuario actual, String jugador) {
        String consulta = "DELETE FROM TBL_JUGADOR_EQUIPO\n"
                + "WHERE ID_EQUIPO=(SELECT ID_EQUIPO\n"
                + "FROM TBL_EQUIPO \n"
                + "WHERE NOMBRE_PLANTILLA='" + actual.getEquipo().getNombre() + "') and \n"
                + "id_jugador=(SELECT ID_JUGADOR FROM TBL_JUGADORES WHERE NOMBRE='" + jugador + "');";
        OperacionesBBDD escritura = new OperacionesBBDD();
        escritura.escrituraSql(consulta);
    }

    /**
     * Elimina todos los jugadores de la plantilla de un equipo en la base de datos.
     *
     * @param nombreEquipo el nombre del equipo
     */
    public void eliminarTODOSJugadoresEquipo(String nombreEquipo) {
        String consulta = "DELETE FROM TBL_JUGADOR_EQUIPO\n"
                + "WHERE ID_EQUIPO=(SELECT ID_EQUIPO\n"
                + "FROM TBL_EQUIPO \n"
                + "WHERE NOMBRE_PLANTILLA='" + nombreEquipo + "');";

        OperacionesBBDD escritura = new OperacionesBBDD();
        escritura.escrituraSql(consulta);
    }

    /**
     * Actualiza el saldo del equipo del usuario actual en la base de datos.
     *
     * @param actual el usuario actual
     */
    public void actualizarSaldo(Usuario actual) {
        String consulta = "UPDATE `bbdd_fantasy`.`tbl_equipo` SET `DINERO` = '" + actual.getEquipo().getDinero() + "'"
                + " WHERE  (`ID_USUARIO` = "
                + "(SELECT ID_USUARIO FROM TBL_USUARIO WHERE USUARIO='" + actual.getNombreUsuario() + "'));";
        OperacionesBBDD escritura = new OperacionesBBDD();
        escritura.escrituraSql(consulta);
    }

    /**
     * Añade un jugador a la plantilla del usuario actual en la base de datos.
     *
     * @param actual el usuario actual
     * @param jugador el nombre del jugador a añadir
     */
    public void añadirJugador(Usuario actual, String jugador) {
        String consulta = "INSERT INTO TBL_JUGADOR_EQUIPO\n"
                + "SELECT \n"
                + "(SELECT ID_JUGADOR\n"
                + "FROM TBL_JUGADORES \n"
                + "WHERE NOMBRE='" + jugador + "'),\n"
                + "(SELECT ID_EQUIPO\n"
                + "FROM TBL_EQUIPO \n"
                + "WHERE NOMBRE_PLANTILLA='" + actual.getEquipo().getNombre() + "'),\n"
                + "('NO'); ";

        OperacionesBBDD escritura = new OperacionesBBDD();

        escritura.escrituraSql(consulta);
    }

    /**
     * Añade un sobre al equipo del usuario actual en la base de datos.
     *
     * @param actual el usuario actual
     * @param sobre el sobre a añadir
     */
    public void añadirSobre(Usuario actual, Sobre sobre) {
        String consulta = "INSERT INTO TBL_SOBRE_EQUIPO \n"
                + "SELECT (SELECT ID_EQUIPO FROM TBL_EQUIPO \n"
                + "WHERE NOMBRE_PLANTILLA='"+actual.getEquipo().getNombre()+"'),\n"
                + "(SELECT ID_SOBRE FROM TBL_SOBRE_TIENDA\n"
                + "WHERE NOMBRE_SOBRE='"+sobre.getNombre()+"');";

        OperacionesBBDD escritura = new OperacionesBBDD();

        escritura.escrituraSql(consulta);
    }
}
