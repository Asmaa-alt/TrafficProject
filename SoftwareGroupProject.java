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


        ResultSet data = DataTable.Get(2005, 2, 1, 390, 8, 63, 18);

        //DataTable.Insert(111111, "S", 1111, "18/09/1111", 22, 80, "a", 1, "aa", "aaa", "aaaa", "aaaaa", "aaaaa", 0, 0.0, 0.0, 0.0, 0., 0, 0, 0, 0, 0, 0, 0, 0, 0, 
        // DataTable.Insert(111111, "S", 1111, "18/09/1111", 22, 80, "a", 1, "aa", "aaa", "aaaa", "aaaaa", "aaaaa", 0, 0, 1.0, 1.0, 1.0, 1.0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 );
        //DataTable.Insert(111111, "S", 1111, "18/09/1111", 22, 80, "a", 1, "aa", "aaa", "aaaa", "aaaaa", "aaaaa", 0, 0, "1.0", "1.0", "1.0", "1.0", 0, 0, 0, 0, 0, 0, 
        //DataTable.Insert(1111, 1, 10, 2, 7, 9, 10);
        //DataTable.Insert(0, "n", 0, "count_date", 0, 0, "region_name", 0," local_authority_name"," road_name", "road_type"," start_junction_road_name", "end_junction_road_name", 0, 0, 0, "longitude", "link_length_km"," link_length_miles", 0, 0, 0, 0, 0, 0, 
        // ResultSet data = DataTable.Get( 2005 ,2 , 1 , 390 , 8 , 63 , 18 );
        //ResultSet data = DataTable.Get(2005);
        //     DataTable.Update(1111, 2, 2, 2, 2, 2, 2);
        //DataTable.Delete;
        ArrayList<String> fileContents = ExecelReader.readFile("C:/Users/taniy/OneDrive/Documents/Downloads/dft_rawcount_local_authority_id_86.csv");
        DataTable.batchInsert(fileContents);

    }

}
