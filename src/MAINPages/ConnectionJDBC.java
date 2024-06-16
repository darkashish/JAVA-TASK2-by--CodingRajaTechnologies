/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MAINPages;
import java.sql.*;

/**
 *
 * @author rajar
 */
public class ConnectionJDBC {
    public static Connection getConnect(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library_management_system","root","8252");
             
            return con;
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println(e);
            return null;
        }
        
    }
//    public static void main(String args[]){
//        new ConnectionJDBC();
//    }
    
}
