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
        // Define que a altura da tabela preencherá o painel de visualização.
        setFillsViewportHeight(true);

        // Ativa a exibição das linhas horizontais da tabela.
        setShowHorizontalLines(true);

        // Define a cor da grade da tabela como um cinza claro.
        setGridColor(new Color(230, 230, 230));

        // Define a altura das linhas como 40 pixels.
        setRowHeight(40);

        // Desabilita a reorganização das colunas na tabela (as colunas não podem ser movidas).
        getTableHeader().setReorderingAllowed(false);

        // Define que apenas uma linha pode ser selecionada por vez.
        setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // Permite a seleção de linhas.
        setRowSelectionAllowed(true);

        // Desabilita a seleção de colunas.
        setColumnSelectionAllowed(false);

        // Personaliza o cabeçalho da tabela para exibir texto centralizado e estilizado.
        getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int i, int i1) {
                // Cria um componente customizado para o cabeçalho com base no texto
                TableHeaderPersonalizado header = new TableHeaderPersonalizado(o + "");
                // Alinha o texto do cabeçalho ao centro
                header.setHorizontalAlignment(JLabel.CENTER);
                return header;
            }
        });

        // Define o renderer para as células da tabela, personalizando a aparência de diferentes tipos de dados.
        setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean selected, boolean hasFocus, int row, int column) {
                // Verifica se o valor da célula é do tipo StatusType.
                if (value instanceof StatusType) {
                    StatusType type = (StatusType) value;
                    // Cria uma célula personalizada para o tipo StatusType.
                    CellStatusPersonalizado cell = new CellStatusPersonalizado(type);

                    // Aplica a cor de fundo dependendo se a linha está selecionada ou não.
                    if (isRowSelected(row)) {
                        cell.setBackground(new Color(220, 240, 255)); // Fundo azul claro quando a linha é selecionada.
                    } else {
                        cell.setBackground(Color.WHITE); // Fundo branco por padrão.
                    }

                    return cell;
                } else {
                    // Caso o valor não seja um StatusType, renderiza a célula com o comportamento padrão.
                    Component com = super.getTableCellRendererComponent(table, value, selected, hasFocus, row, column);
                    setBorder(noFocusBorder); // Remove a borda de foco.

                    // Aplica a cor de texto com base no valor da célula na coluna 6 (exemplo de valor numérico)
                    if (column == 6) {
                        long valueInt = (long) value;
                        // Condicional para definir a cor do texto dependendo do valor.
                        if (valueInt <= 15 && valueInt > 5) {
                            com.setForeground(Color.ORANGE); // Laranja se o valor estiver entre 6 e 15.
                        } else if (valueInt <= 5 && valueInt > 0) {
                            com.setForeground(Color.RED); // Vermelho se o valor estiver entre 1 e 5.
                        } else if (valueInt == 0) {
                            com.setForeground(Color.LIGHT_GRAY); // Cinza claro se o valor for 0.
                        }
                    } else {
                        com.setForeground(Color.BLACK); // Cor padrão do texto (preto).
                    }

                    // Aplica a cor de fundo dependendo se a linha está selecionada ou não.
                    if (isRowSelected(row)) {
                        com.setBackground(new Color(220, 240, 255)); // Fundo azul claro se a linha for selecionada.
                    } else {
                        com.setBackground(Color.WHITE); // Fundo branco por padrão.
                    }

                    // Centraliza o texto na célula.
                    setHorizontalAlignment(JLabel.CENTER);

                    return com;
                }
            }
        });
    }

// Método para adicionar uma nova linha à tabela.
    public void addRow(Object[] row) {
        // Obtém o modelo da tabela e adiciona a linha.
        DefaultTableModel model = (DefaultTableModel) getModel();
        model.addRow(row);
    }
}
