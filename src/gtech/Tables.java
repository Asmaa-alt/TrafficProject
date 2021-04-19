/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gtech;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author asma.
 */
public class Tables {
    public static void CreateUser() {
     
     Connection connection = DB.getConnection();
        
        String sql = "CREATE TABLE  if not exists UserInfo "
                + "("
                    + "id INTEGER PRIMARY KEY,"
                    + "First Name VARCHAR (15),"
                    + "Last Name  VARCHAR (15),"
                    + "Email      VARCHAR (50),"
                    + "Date Joined  Date"
                + ")" ;
        
        try 
        {
            Statement  sqlStatement =  connection.createStatement();
            sqlStatement.executeUpdate(sql);
             System.out.println(" User Table created");
         } 
        catch (SQLException ex) 
        {
            System.out.println("Error creating UserTable" + ex.getMessage());
            
        }
    }
}
