
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Trial {

    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, SQLException {
        //System.out.println("First Value From Command Line Arguments");
        //System.out.println(args[0]);
        
        
            DriverManager.getConnection("abc");
        
        
            Class.forName("abc");
        
            
        
        //here we are trying to open a file for reading its contents.
        //to read a file we need to create an object of FileInputStream
        
        FileInputStream fis=new FileInputStream("e:/data/userdata.txt");
        System.out.println("File Opened....");
        
        
        
      
        
    }
}
