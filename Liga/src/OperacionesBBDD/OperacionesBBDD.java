
package OperacionesBBDD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Marco
 */
public class OperacionesBBDD {

    private static String MYSQLUSER = "root";

    private static String MYSQLPASS = "root";

    /**
     *
     * @param insertString
     * @return
     */
    public boolean escrituraSql(String insertString) {
        boolean resultado = false;
        Statement insertFilm = null;
        Connection mysqlCon = null;
        String mysqlUrl = "jdbc:mysql://localhost/bbdd_fantasy";
        try {

            mysqlCon = DriverManager.getConnection(mysqlUrl, MYSQLUSER, MYSQLPASS);

            insertFilm = mysqlCon.createStatement();

            int inseridos = insertFilm.executeUpdate(insertString);
            if (inseridos > 0) {
                resultado = true;
            } else {
                resultado = false;
            }
            
        } catch (SQLException e) {

            while (e != null) { //bucle que trata a cadea de excepcións

                System.err.println("SQLState: " + e.getSQLState());

                System.err.println(" Code: " + e.getErrorCode());

                System.err.println(" Message:");

                System.err.println(e.getMessage());

                e = e.getNextException();

            }

        } finally {

            if (mysqlCon != null) {

                try {
                    mysqlCon.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }

        }
        return resultado;
    }

    /**
     *
     * @param consultaSql
     * @return
     */
    public ResultSet getSQL(String consultaSql) {
        ResultSet mysqlResult = null;
        try {

            String mysqlUrl = "jdbc:mysql://localhost/bbdd_fantasy";
           
            Connection mysqlCon = DriverManager.getConnection(mysqlUrl, MYSQLUSER, MYSQLPASS);

            Statement mysqlSelect = mysqlCon.createStatement();
            mysqlResult = mysqlSelect.executeQuery(consultaSql);

        } catch (SQLException ex) {
            Logger.getLogger(OperacionesBBDD.class.getName()).log(Level.SEVERE, null, ex);
        }

        return mysqlResult;

    }

    /**
     *  
     * @param consultaSql
     * @return
     */
    public ResultSet updateSQL(String consultaSql) {
        ResultSet mysqlResult = null;
        try {
            String mysqlUrl = "jdbc:mysql://localhost/bbdd_fantasy";

            Connection mysqlCon = DriverManager.getConnection(mysqlUrl, MYSQLUSER, MYSQLPASS);

            Statement mysqlSelect = mysqlCon.createStatement();
            mysqlResult = mysqlSelect.executeQuery(consultaSql);

        } catch (SQLException ex) {
            Logger.getLogger(OperacionesBBDD.class.getName()).log(Level.SEVERE, null, ex);
        }

        return mysqlResult;

    }

}
