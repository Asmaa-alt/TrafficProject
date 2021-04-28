package softwaregroupproject;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author taniy
 */
public class Tables {
    public static void createData()
    {
    Connection connection = Database.getConnection();
    
    String sql = ("CREATE TABLE if not exists Database" 
            + "(" 
            + "count_point_id INTEGER,"
            + "direction VARCHAR(2),"
            + "year INTEGER(4),"
            +"count_date VARCHAR (10),"
            +"hour INTEGER(2) ,"
            +"region_id INTEGER(11) ,"
            +"region_name VARCHAR(15) ,"
            +" local_authority_id INTEGER(11),"
            +" local_authority_name VARCHAR(30),"
            +"road_name VARCHAR(30),"
            +"road_type VARCHAR(30),"
            +"start_junction_road_name VARCHAR(30),"
            +"end_junction_road_name VARCHAR(30),"
            +"easting INTEGER (11),"
            +"northing INTEGER (11),"
            +"latitude FLOAT,"
            +"longitude FLOAT ,"
            +"link_length_km FLOAT,"
            +"link_length_miles FLOAT,"
            + "pedal_cycles INTEGER(11),"
            + "two_wheeled_vehicles INTEGER(11),"
            + "cars_and_taxis INTEGER(11),"
            + "buses_and_coaches INTEGER(11),"
            + "lgvs INTEGER(11),"
            +" hgvs_2_rigid_axle INTEGER (11),"
            +" hvgs_3_ridgid_axle INTEGER (11),"
            +" hgvs_4_or_more_rigid_axle INTEGER (11),"
            +" hgvs_3_or_4_articulated_axle INTEGER (11),"
            +" hgvs_5_articulated_axle INTEGER (11),"
            +" hgvs_6_articulated_axle INTEGER (11),"
            + "all_hgvs INTEGER (11),"
            +"all_motor_vehicles INTEGER(11)"
            + ") ");
        try {
            Statement sqlStatement = connection.createStatement();
            sqlStatement.executeUpdate(sql);
            System.out.println("Data Table created!");
        } catch (SQLException e) {
            System.out.println("Error creating Data Table: " + e.getMessage());
        }
    }
}
