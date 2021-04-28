/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwaregroupproject;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author taniy
 */
public class Database {

    public static Connection getConnection() {

        String urlSQLite = "jdbc:sqlite:Database.db";

        try {
            Driver driverSQLite = new org.sqlite.JDBC();
            DriverManager.registerDriver(driverSQLite);
            System.out.println("SQLite Driver is loaded up");
        } catch (SQLException e) {
            System.out.println("There is a issue with the SQLite Driver: " + e.getMessage());
        }

        Connection connection = null;
        try {
            connection = DriverManager.getConnection(urlSQLite);
            System.out.println("Connected to the database");
        } catch (SQLException e) {
            System.out.println("Error connection to the database: " + e.getMessage());
        }
        return connection;

    }
    

}
