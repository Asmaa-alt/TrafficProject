/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gtech;

/**
 *
 * @author asma.
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //    DB.getConnection();
      
    
    login l = new login(); 
    l.setVisible(true);
    
    
    
    
    
    Tables.CreateUser();
    }
    
}