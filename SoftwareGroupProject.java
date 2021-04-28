/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwaregroupproject;


import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author taniy
 */
public class SoftwareGroupProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Tables.createData();
       
       
       //DataTable.Insert(1001, 109879, 678671, 999991,199999,199999,199999,12028);
       
       DataTable.Insert(111111, "S", 1111, "18/09/1111", 22, 80, "a", 1, "aa", "aaa", "aaaa", "aaaaa", "aaaaa", 0, 0, "1.0", "1.0", "1.0", "1.0", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 );
       DataTable.Insert(111111, "S", 1111, "18/09/1111", 22, 80, "a", 1, "aa", "aaa", "aaaa", "aaaaa", "aaaaa", 0, 0, "1.0", "1.0", "1.0", "1.0", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);

       //ResultSet data =DataTable.Get(2000);
       
       ResultSet data = DataTable.Get(1111, 0, 0, 0, 0, 0, 0);
       //DataTable.Update(9000, 6, 500000, 400000, 300000, 100000, 200000, 12028);
       //DataTable.Delete(0, 0, 0, 0, 0, 0, 0, 0);
       
       ArrayList<String> fileContents = ExecelReader.readFile("C:/Users/taniy/OneDrive/Documents/dft_rawcount_local_authority_id_86.csv");
       DataTable.batchInsert(fileContents);
    
    }
    
}