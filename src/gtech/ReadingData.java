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
import java.util.ArrayList;

/**
 *
 * @author ghadamhassan
 */
public class ReadingData {
    
    
    public static void insert(int id, String direction_of_travel, int year, String count_date, int hour, int region_id, String region_name, int local_authority_id, 
            String local_authority_name, String road_name, String road_type, String start_junction_road_name, String end_junction_road_name, int easting,
                    int northing,
                    String latitude,
                    String longitude ,
                    String link_length_km,
                    String link_length_miles,
                    int pedal_cycles,
                    int two_wheeled_motor_vehicles,
                    int cars_and_taxis, 
                    int buses_and_coaches,
                    int lgvs,
                    int hgvs_2_rigid_axle,
                    int hgvs_3_rigid_axle,
                    int hgvs_4_or_more_rigid_axle,
                    int hgvs_3_or_4_articulated_axle,
                    int hgvs_5_articulated_axle,
                    int hgvs_6_articulated_axle,
                    int all_hgvs,
                    int all_motor_vehicles){
            
        Connection connection = DB.getConnection();
        
        String sql = "INSERT INTO rawcount_local_authority ("
                + "id, "
                + "direction_of_travel, "
                + "year, "
                + "count_date, "
                + "hour, "
                + "region_id, "
                + "region_name, "
                + "local_authority_id," 
                + "local_authority_name, "
                + "road_name, "
                + "road_type, "
                + "start_junction_road_name, "
                + "end_junction_road_name,"
                + "easting,"
                + "northing,"
                + "latitude,"
                + "longitude,"
                + "link_length_km,"
                + "link_length_miles,"
                + "pedal_cycles,"
                + "two_wheeled_motor_vehicles,"
                + "cars_and_taxis,"
                + "buses_and_coaches,"
                + "lgvs,"
                + "hgvs_2_rigid_axle,"
                + "hgvs_3_rigid_axle,"
                + "hgvs_4_or_more_rigid_axle,"
                + "hgvs_3_or_4_articulated_axle,"
                + "hgvs_5_articulated_axle,"
                + "hgvs_6_articulated_axle,"
                + "all_hgvs,"
                + "all_motor_vehicles"
                + ") VALUES"
                
                + "("
                + "'" + id + "'," 
                + "'" + direction_of_travel + "'," 
                + "'" + year + "',"  
                + "'" + count_date + "'," 
                + "'" + hour + "'," 
                + "'" + region_id + "'," 
                + "'" + region_name + "'," 
                + "'" + local_authority_id + "'," 
                + "'" + local_authority_name + "',"  
                + "'" + road_name + "'," 
                + "'" + road_type + "'," 
                + "'" + start_junction_road_name + "'," 
                + "'" + end_junction_road_name + "'," 
                + "'" + easting  + "',"
                + "'" + northing  + "',"  
                + "'" + latitude  + "',"   
                + "'" + longitude  + "',"   
                + "'" + link_length_km  + "',"  
                + "'" + link_length_miles  + "',"    
                + "'" + pedal_cycles  + "',"    
                + "'" + two_wheeled_motor_vehicles  + "',"    
                + "'" + cars_and_taxis  + "',"  
                + "'" + buses_and_coaches  + "',"   
                + "'" + lgvs  + "',"   
                + "'" + hgvs_2_rigid_axle  + "',"   
                + "'" + hgvs_3_rigid_axle  + "',"    
                + "'" + hgvs_4_or_more_rigid_axle  + "'," 
                + "'" + hgvs_3_or_4_articulated_axle  + "'," 
                + "'" + hgvs_5_articulated_axle  + "',"    
                + "'" + hgvs_6_articulated_axle  + "',"   
                + "'" + all_hgvs  + "',"   
                + "'" + all_motor_vehicles  + "'" 
                +")";
        
        
        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
            System.out.println("all data inserted!");
        } catch (SQLException ex) 
        {
            System.out.println("Error while insrtng the data" + ex.getMessage());
        }
    
    }
    
    public static void batchInsert(ArrayList<String> input){
        for(String currentLine : input){
            String[] lineArray = currentLine.split(",");
            
            int count_point_id = Integer.parseInt(lineArray[0]);
            String direction_of_travel = lineArray[1];            
            int year = Integer.parseInt(lineArray[2]);
            String count_date = lineArray[3];
            int hour = Integer.parseInt(lineArray[4]);
            int region_id = Integer.parseInt(lineArray[5]);
            String region_name = lineArray[6];
            int local_authority_id = Integer.parseInt(lineArray[7]);
            String local_authority_name = lineArray[8];
            String road_name = lineArray[9];
            String road_type = lineArray[10];
            String start_junction_road_name = lineArray[11];
            String end_junction_road_name = lineArray[12];    
            int easting = Integer.parseInt(lineArray[13]);
            int northing = Integer.parseInt(lineArray[14]);
            String latitude  = lineArray[15];
            String longitude  = lineArray[16];
            String link_length_km  = lineArray[17];
            String link_length_miles = lineArray[18];
            int pedal_cycles = Integer.parseInt(lineArray[19]);
            int two_wheeled_motor_vehicles = Integer.parseInt(lineArray[20]);
            int cars_and_taxis = Integer.parseInt(lineArray[21]);
            int buses_and_coaches = Integer.parseInt(lineArray[22]);
            int lgvs = Integer.parseInt(lineArray[23]);
            int hgvs_2_rigid_axle = Integer.parseInt(lineArray[24]);
            int hgvs_3_rigid_axle = Integer.parseInt(lineArray[25]);
            int hgvs_4_or_more_rigid_axle = Integer.parseInt(lineArray[26]);
            int hgvs_3_or_4_articulated_axle = Integer.parseInt(lineArray[27]);
            int hgvs_5_articulated_axle = Integer.parseInt(lineArray[28]);
            int hgvs_6_articulated_axle = Integer.parseInt(lineArray[29]);
            int all_hgvs = Integer.parseInt(lineArray[30]);
            int all_motor_vehicles = Integer.parseInt(lineArray[31]);
            
            insert(count_point_id, direction_of_travel, year, count_date, hour, region_id, region_name, local_authority_id, 
            local_authority_name, road_name, road_type, start_junction_road_name, end_junction_road_name, easting,
            northing,
            latitude,
            longitude,
            link_length_km,
            link_length_miles,
            pedal_cycles,
            two_wheeled_motor_vehicles,
            cars_and_taxis,
            buses_and_coaches,
            lgvs,
            hgvs_2_rigid_axle,
            hgvs_3_rigid_axle,
            hgvs_4_or_more_rigid_axle,
            hgvs_3_or_4_articulated_axle,
            hgvs_5_articulated_axle,
            hgvs_6_articulated_axle,
            all_hgvs,
            all_motor_vehicles);
        }
    }
    
    public static ResultSet get(int id){
        Connection connection = DB.getConnection();
        
        String sql = "SELECT * FROM rawcount_local_authority WHERE id =" + id;
        ResultSet result = null;
        
        try {
            Statement statement = connection.createStatement();
            result = statement.executeQuery(sql);
            if(result.next()){
                
                System.out.println("Road Name is; "  + result.getString("road_name")+ ", and Road Type is: "+ result.getString("road_type"));
            }
            
        } catch (SQLException ex) {
            System.out.println("Error while reading from the table" + ex.getMessage());
        }
        finally{
            
            return result;
        }
            
        }


}
    

