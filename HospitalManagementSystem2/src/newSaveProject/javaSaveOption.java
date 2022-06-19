
/*

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newSaveProject;
import java.sql.*;

/**
 *
 * @author dilenpatel
 */
public class javaSaveOption {
    
    public static Connection getCon(){
        try
        {
           Class.forName("com.mysql.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/newsaveproject","root","applestooranges");
           return con;
        }
        catch(Exception e)
        {
            return null;
        }
    }
    
}
