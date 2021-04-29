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
            + "year INTEGER(4),"
            + "pedal_cycles INTEGER(11),"
            + "two_wheeled_vehicles INTEGER(11),"
            + "cars_and_taxis INTEGER(11),"
            + "buses_and_coaches INTEGER(11),"
            + "lgvs INTEGER(11),"
            + "all_hgvs INTEGER (11)"
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
