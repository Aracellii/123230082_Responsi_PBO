package Responsi;
import java.sql.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TampilkanData {
    public void tampilkan (JTable tabel){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Nama");
        model.addColumn("Barang");
        model.addColumn("Harga");
        model.addColumn("Cicilan");
        model.addColumn("Bunga Perbulan");
        model.addColumn("Angsuran Perbulan");
        model.addColumn("Total Pembayaran");
        
        try{
            Connection conn = Connector.konek();
            Statement stmt = conn.createStatement();
            ResultSet rs=stmt.executeQuery("SELECT*FROM toko"); 
            
            while(rs.next()){
            model.addRow(new Object[]{
            rs.getString("nama"),
            rs.getString("barang"),
            rs.getString("harga"),
            rs.getString("cicilan"),
            rs.getString("bunga"),
            rs.getString("angsuran"),
            rs.getString("total")               
            });
        }           
        tabel.setModel(model);
        }
        catch(SQLException e){
    }
    }}
