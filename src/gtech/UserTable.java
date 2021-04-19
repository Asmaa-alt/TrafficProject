/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gtech;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author asma.
 */
public class UserTable {
    
    
    public static void insert(String UserName, String UserEmail) 
    {
        
        Connection connection = DB.getConnection();
        
        String sql = "INSERT INTO  User( UserName, UserEmail ) VALUES"
                + "("
                    + "'" + UserName   + "',"
                    + "'"+ UserEmail  + "'"   
                + ")" ;
        
        try 
        {
            Statement  statement =  connection.createStatement();
            statement.executeUpdate(sql);
             System.out.println(" User" +  " " + UserName + " " + "inserted" );
             connection.close();
         } 
        
        catch (SQLException ex) 
        {
        System.out.println("Error while inserting UserTable" + ex.getMessage());
            
        }
      
    }
    
    
    

    
    
    /**
     *
     * @param UserEmail
     * @return
     */
    public static ResultSet get(String UserEmail) { 
        
        Connection connection = DB.getConnection();
        
        String sql = "SELECT  * FROM User WHERE UserEmail = '" + UserEmail + " '";
        ResultSet result = null; 
       
        try 
        {
            Statement  statement =  connection.createStatement();
            result=statement.executeQuery(sql);
            connection.close();
           
          
        
        
    }   catch (SQLException ex) {
        System.out.println("Error while getting from User Table" + ex.getMessage());
        }
        
        finally {
        return result;
        }
   
}
    
    

}
