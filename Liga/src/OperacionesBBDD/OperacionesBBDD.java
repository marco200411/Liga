/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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

    public void escrituraSql(String insertString) {
        Statement insertFilm = null;
        Connection mysqlCon = null;
        String mysqlUrl = "jdbc:mysql://localhost/bbdd_fantasy";
        try {

            mysqlCon = DriverManager.getConnection(mysqlUrl, MYSQLUSER, MYSQLPASS);

            insertFilm = mysqlCon.createStatement();

            int inseridos = insertFilm.executeUpdate(insertString);

            System.out.println("Resultado: " + inseridos + " inserido");
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
    }

    public ResultSet getSQL(String consultaSql) {
        ResultSet mysqlResult = null;
        try {
            String mysqlUrl = "jdbc:mysql://localhost/bbdd_fantasy";

            Connection mysqlCon = DriverManager.getConnection(mysqlUrl, MYSQLUSER, MYSQLPASS);

            Statement mysqlSelect = mysqlCon.createStatement();
            System.out.println(consultaSql);
            mysqlResult = mysqlSelect.executeQuery(consultaSql);

        } catch (SQLException ex) {
            Logger.getLogger(OperacionesBBDD.class.getName()).log(Level.SEVERE, null, ex);
        }

        return mysqlResult;

    }
    
     public ResultSet updateSQL(String consultaSql) {
        ResultSet mysqlResult = null;
        try {
            String mysqlUrl = "jdbc:mysql://localhost/bbdd_fantasy";

            Connection mysqlCon = DriverManager.getConnection(mysqlUrl, MYSQLUSER, MYSQLPASS);

            Statement mysqlSelect = mysqlCon.createStatement();
            System.out.println(consultaSql);
            mysqlResult = mysqlSelect.executeQuery(consultaSql);

        } catch (SQLException ex) {
            Logger.getLogger(OperacionesBBDD.class.getName()).log(Level.SEVERE, null, ex);
        }

        return mysqlResult;

    }

}
