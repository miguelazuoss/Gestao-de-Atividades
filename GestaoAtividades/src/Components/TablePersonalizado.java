/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Components;

import Models.StatusType;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class TablePersonalizado extends JTable {
    
        public TablePersonalizado(){
         setFillsViewportHeight(true);
        setShowHorizontalLines(true);
        setGridColor(new Color(230, 230, 230));
        setRowHeight(40);
        getTableHeader().setReorderingAllowed(false);
        getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int i, int i1) {
                TableHeaderPersonalizado header = new TableHeaderPersonalizado(o + "");
                    header.setHorizontalAlignment(JLabel.CENTER);
                return header;
            }
        });
        setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable jtable, Object o, boolean selected, boolean bln1, int i, int i1) {
                if (i1 != 7) {
                    Component com = super.getTableCellRendererComponent(jtable, o, selected, bln1, i, i1);
                    setBorder(noFocusBorder);
                    com.setBackground(Color.WHITE);
                    if (selected) {
                        com.setForeground(new Color(15, 89, 140));
                    } else {
                        com.setForeground(new Color(102, 102, 102));
                    }
                    setHorizontalAlignment(JLabel.CENTER);

                    return com;
                } else {
                    // Verifica o tipo de dado na coluna 4
                    if (o instanceof StatusType) {
                        StatusType type = (StatusType) o;
                        CellStatusPersonalizado cell = new CellStatusPersonalizado(type);
                        return cell;
                    } else {
                        // Se o objeto não for StatusType, renderiza como padrão
                        return super.getTableCellRendererComponent(jtable, o, selected, bln1, i, i1);
                    }
                }
            }
            
        });
    }

    public void addRow(Object[] row) {
        DefaultTableModel model = (DefaultTableModel) getModel();
        model.addRow(row);
    }
}
