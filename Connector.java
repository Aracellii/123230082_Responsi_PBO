package Responsi;
import java.sql.*;
import java.sql.Connection;
import java.sql.SQLDataException;
public class Connector {
    public static Connection konek(){
        Connection conn = null;
        String url ="jdbc:mysql://localhost:3306/responsipbo";
        String user="root";
        String password = "";
       
        try{
        conn = DriverManager.getConnection(url,user,password);
            System.out.println("Koneksi Berhasil");
        }
        catch(SQLException e){
            System.err.println("Koneksi gagal : "+e.getMessage());
        }
        return conn;
    }
}
