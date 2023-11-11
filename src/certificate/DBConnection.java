/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package certificate;
import java.sql.*;

/**
 *
 * @author Admin
 */
public class DBConnection {
    
    static final String DB_URL = "jdbc:mysql://localhost/Driving_School" ;
    static final String USER = "root";
    static final String PASS = "";
    
    public static Connection connectDB(){
        Connection conn = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            // Open a connection
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            return conn;
        }
        catch(Exception ex){
            System.out.println("There were errors while connecting to db. ");
            return null;
        }
        
    }
    
}
