package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;


public abstract class ConnectionManager {
    public Connection con;
    public ConnectionManager() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/sushma","sushma","Vidharth@01");
        }catch(Exception ex){
            System.out.println("Error:"+ex.getMessage());
        }
    }
}
