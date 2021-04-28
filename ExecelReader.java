package softwaregroupproject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;


/**
 *
 * @author taniy
 */
public class ExecelReader {

    public static ArrayList<String> readFile(String fileName) 
   {        

        ArrayList<String> fileContents = new ArrayList<>();
        
        try
        {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            
            String line = ("");
            bufferedReader.readLine();
            while((line =bufferedReader.readLine()) !=null)
            {
                fileContents.add(line);
                System.out.println(line);
            
            }
            
        }
        catch(Exception e)
        {
            System.out.println("Error reading from the file " + e.getMessage());
        }
        return fileContents;
        
        
    }

}