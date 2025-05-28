package Responsi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
public class Hapus {
    private String nama;
    public void hapus(String nama){
        this.nama = nama; 
        try{
    Connection conn = Connector.konek();
    String sql="DELETE FROM toko WHERE nama =?";
    PreparedStatement pst = conn.prepareStatement(sql);
    pst.setString(1, nama);
    int affectedRows=pst.executeUpdate();
}   catch(Exception e){
    JOptionPane.showMessageDialog(null, "eror : "+e.getMessage());
}
    }
   
}
