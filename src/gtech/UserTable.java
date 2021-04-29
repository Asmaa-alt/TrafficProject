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
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 *
 * @author asma.
 */
public class UserTable {
    
    
    public static void insert(String UserName, String UserEmail,String UserType,String UserPassword) 
    {
        
        Connection connection = DB.getConnection();
        
        String sql = "INSERT INTO  User( UserName, UserEmail, UserType,UserPassword ) VALUES"
                + "("
                    + "'" + UserName   + "',"
                    + "'"+ UserEmail  + "',"  
                    + "'"+ UserType  + "',"  
                    + "'"+ UserPassword  + "'"  
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
    
      
    public static void insertSalt(String UserName, String UserEmail,String UserType,String UserMemorable,String UserPassword,String salt) 
    {
        
        Connection connection = DB.getConnection();
        
        String sql = "INSERT INTO  User( UserName, UserEmail, UserType, UserMemorable, UserPassword, salt ) VALUES"
                + "("
                    + "'" + UserName   + "',"
                    + "'"+ UserEmail  + "',"  
                    + "'"+ UserType  + "',"  
                    + "'"+ UserMemorable  + "',"  
                    + "'"+ UserPassword  + "',"  
                    + "'"+ salt  + "'"  
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
    
    
   
       
           public static void insertULogin(String Email,String loginTime) {
          
          Connection connection = DB.getConnection();
        
        String sql = "update UserActivity set loginTime = ? where UserEmail = '" + Email + "'";
        
        try 
        {
            Statement  statement =  connection.createStatement();
            statement.executeUpdate(sql);
             System.out.println(" User" +  "Joined IN AT " + loginTime  + " " + "" );
             connection.close();
         } 
        
        catch (SQLException ex) 
        {
        System.out.println("Error while inserting UserTable" + ex.getMessage());
            
        } 
        }
    
       
        public static void insertUserSignUppActivity(String UserName,String UserEmail, LocalDate DateJoined,int ID) {
          
          Connection connection = DB.getConnection();
        
        String sql = "INSERT INTO  UserActivity( UserName,UserEmail, DateJoined,ID ) VALUES"
                + "("
                    + "'" + UserName  + "',"
                    + "'" + UserEmail  + "',"
                    + "'" + DateJoined  + "',"
                     + "'"+  ID  + "'" 
                + ")" ;
        
        try 
        {
            Statement  statement =  connection.createStatement();
            statement.executeUpdate(sql);
             System.out.println(" User" +  "Joined IN AT " + DateJoined  + " " + "" );
             connection.close();
         } 
        
        catch (SQLException ex) 
        {
        System.out.println("Error while inserting UserTable" + ex.getMessage());
            
        } 
          
          
          
      }
       
        
        
        public static void insertUserLoginActivity(String UserEmail, LocalDate DateJoined,int ID, LocalTime loginTime) {
          
          Connection connection = DB.getConnection();
        
        String sql = "INSERT INTO  UserActivity( UserEmail, DateJoined,ID,loginTime ) VALUES"
                + "("
                    + "'" + UserEmail  + "',"
                    + "'" + DateJoined  + "',"
                     + "'"+  ID  + "'," 
                     + "'"+  loginTime  + "'" 
                + ")" ;
        
        try 
        {
            Statement  statement =  connection.createStatement();
            statement.executeUpdate(sql);
             System.out.println(" User" +  "Joined IN AT " + loginTime  + " " + "" );
             connection.close();
         } 
        
        catch (SQLException ex) 
        {
        System.out.println("Error while inserting UserTable" + ex.getMessage());
            
        } 
          
          
          
      }
       
       
     
         
           public static void insertUserLogoutActivity(String UserEmail, LocalDate DateJoined,int ID, LocalTime loginTime,LocalTime  logoutTime) {
          
          Connection connection = DB.getConnection();
        
        String sql = "INSERT INTO  UserActivity( UserEmail, DateJoined,ID,loginTime,logoutTime ) VALUES"
                + "("
                    + "'" + UserEmail  + "',"
                    + "'" + DateJoined  + "',"
                     + "'"+  ID  + "'," 
                     + "'"+  loginTime  + "'," 
                     + "'"+  logoutTime  + "'" 
                + ")" ;
        
        try 
        {
            Statement  statement =  connection.createStatement();
            statement.executeUpdate(sql);
             System.out.println(" User" +  "Joined IN AT " + logoutTime   + " " + "" );
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
        
        String sql = "SELECT  * FROM User WHERE UserEmail = '" + UserEmail + "'";
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
    
    
        public static ResultSet getloginemail(String UserEmail) { 
        
        Connection connection = DB.getConnection();
        
        String sql = "SELECT  * FROM UserActivity WHERE UserEmail = '" + UserEmail + "'";
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
    
    

    
    
    
    public static ResultSet GetUserEEmailPassword(String UserEmail, String UserPassword) { 
        
        
        Connection connection = DB.getConnection();
        
        String sql = "SELECT   UserEmail,UserPassword  from User where UserEmail = '" + UserEmail + "' and UserPassword ='" + UserPassword + "'";
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
    
    
    public static ResultSet GetUserNameEmailPasswordSalt(String UserEmail, String UserPassword,String salt) { 
        Connection connection = DB.getConnection();
    
    // Connection connection = DB.getConnection();
    
        String sql = "SELECT   UserEmail,UserPassword  from User where  UserEmail =  '" + UserEmail + "' and UserPassword = '" + UserPassword +"' and salt = '" + salt + "'";
        ResultSet result = null; 
       
        try 
        {
            
            Statement  statement;
            statement = connection.createStatement();
            result=statement.executeQuery(sql);
            connection.close();
      
        
    }   catch (SQLException ex) {
        System.out.println("Error while getting from User Table" + ex.getMessage());
        }
        
        finally {
        return result;
        }
    }
    
    
        
        public static ResultSet GetSalt(String salt) { 
        
        Connection connection = DB.getConnection();
        
        String sql = "SELECT  * FROM User WHERE salt = '" + salt + "'";
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
