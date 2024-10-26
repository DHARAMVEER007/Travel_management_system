
package travel.mangement.system;

import java.sql.*;
public class Conn {
    
    Connection c;
    Statement s;
    Conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///travelmanagementsystem","root","T#9758@qlph");
            s=c.createStatement();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
