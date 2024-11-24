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
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class TablePersonalizado extends JTable {

    public TablePersonalizado() {
        setFillsViewportHeight(true);
        setShowHorizontalLines(true);
        setGridColor(new Color(230, 230, 230));
        setRowHeight(40);
        getTableHeader().setReorderingAllowed(false);
        setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setRowSelectionAllowed(true);
        setColumnSelectionAllowed(false);
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
            public Component getTableCellRendererComponent(JTable table, Object value, boolean selected, boolean hasFocus, int row, int column) {
                // Verifica o tipo de dado na célula
                if (value instanceof StatusType) {
                    StatusType type = (StatusType) value;
                    CellStatusPersonalizado cell = new CellStatusPersonalizado(type);

                    // Aplica a cor de fundo com base na seleção da linha
                    if (isRowSelected(row)) {
                        cell.setBackground(new Color(220, 240, 255)); // Fundo ao selecionar         
                    } else {
                        cell.setBackground(Color.WHITE);             // Fundo padrão
                    }
                    return cell;
                } else {
                    // Renderização padrão para outras células
                    Component com = super.getTableCellRendererComponent(table, value, selected, hasFocus, row, column);
                    setBorder(noFocusBorder);
                    // Aplica o estilo com base na seleção da linha
                    if(column == 6){
                        long valueInt = (long) value;
                        if(valueInt <= 15 && valueInt > 5){
                         com.setForeground(Color.ORANGE);
                        } else if(valueInt <= 5 && valueInt > 0){
                        com.setForeground(Color.RED);
                        } else if(valueInt == 0){
                        com.setForeground(Color.LIGHT_GRAY);
                    }
                    } else{
                        com.setForeground(Color.BLACK);
                    }
                    
                    if (isRowSelected(row)) {
                        com.setBackground(new Color(220, 240, 255)); // Fundo ao selecionar
                    } else {
                        com.setBackground(Color.WHITE);              // Fundo padrão
                    }

                    // Centraliza o texto na célula
                    setHorizontalAlignment(JLabel.CENTER);

                    return com;
                }
                
            }
            }
        );
    }

    public void addRow(Object[] row) {
        DefaultTableModel model = (DefaultTableModel) getModel();
        model.addRow(row);
    }
}
