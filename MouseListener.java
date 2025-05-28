package Responsi;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTable;
import javax.swing.JTextField;

public class MouseListener extends MouseAdapter{
    private JTable table;
    private JTextField namaField;
    private JTextField barangField;
    private JTextField cicilanField;
    
    public MouseListener(JTable table,JTextField namaField,JTextField barangField, JTextField cicilanField){
        this.table=table;
        this.namaField=namaField;
        this.barangField=barangField;
        this.cicilanField=cicilanField;

    }
    @Override
    public void mouseClicked(MouseEvent e){
        int row = table.getSelectedRow();    
        namaField.setText(table.getValueAt(row, 0).toString());
        barangField.setText(table.getValueAt(row, 1).toString());
        cicilanField.setText(table.getValueAt(row, 3).toString());
    }
}
