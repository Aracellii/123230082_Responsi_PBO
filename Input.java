package Responsi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class Input {
    private JTextField jTextFieldNama;
    private JTextField jTextFieldBarang;
    private JTextField jTextFieldCicilan;
    
    public input(JTextField Nama, JTextField Barang,JTextField Cicilan){
    this.jTextFieldNama=Nama;
    this.jTextFieldBarang=Barang;
    this.jTextFieldCicilan=Cicilan;
    }

}
