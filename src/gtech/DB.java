/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gtech;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author asma.
 */
public class DB {
    
    /**
     * @param args the command line arguments
     */
    public static Connection getConnection()
    {
           String urlSQlite =  "jdbc:sqlite:GtechUser.db";
           Driver driverSQLite = new org.sqlite.JDBC();
           System.out.println("SqLite Driver loaded up!!");
        
           try {
            DriverManager.registerDriver(driverSQLite);
        
           } catch (SQLException ex) {
            System.out.println("There is a problem with the SQlite driver" + ex.getMessage());
        }
           
           Connection connection = null;
        try {
          connection =  DriverManager.getConnection(urlSQlite);
          System.out.println("Connected to database");
          
        } catch (SQLException ex) {
           System.out.println("Error connection to database" + ex.getMessage());
        }
        
        return connection;
    }
}

    