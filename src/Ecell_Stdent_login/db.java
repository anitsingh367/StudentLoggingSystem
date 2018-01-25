package Ecell_Stdent_login;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
 
/**
 *
 * @author sqlitetutorial.net
 */
public class db {
    Connection conn = null;
    public static Connection java_db(){
        try{
        Class.forName("org.sqlite.JDBC");
        Connection conn = DriverManager.getConnection("jdbc:sqlite:sample.db");
        return conn;
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
            return null;
          
        }
    }
    
    
    
    
    
    
    
}
