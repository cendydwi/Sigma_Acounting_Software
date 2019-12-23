package Accounting;
import java.sql.*;

public class Config {
    private static Connection mysqlconf;
    public static Connection configDB()throws SQLException{
        try {
            String url = "jdbc:mysql://localhost:3306/pbo_test";
            String user = "root";
            String pass = "";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            mysqlconf = DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
            System.err.println("Koneksi Gagal "+e.getMessage());
        }
        return mysqlconf;
    }
    
}
