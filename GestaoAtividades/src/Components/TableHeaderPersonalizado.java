/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Components;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author user
 */
public class TableHeaderPersonalizado extends JLabel {
    
    public TableHeaderPersonalizado(String text){
        super(text);
        setOpaque(true);
        setBackground(Color.WHITE);
        setFont(new Font("sansserif", 1, 12));
        setForeground(new Color(102, 102, 102));
        setBorder(new EmptyBorder(10, 5, 10, 5));
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        super.paintComponent(grphcs);
        grphcs.setColor(new Color(200, 200, 200));
        grphcs.drawLine(0, getHeight() - 1, getWidth(), getHeight() - 1);
          grphcs.setColor(new Color(200, 200, 200)); // Cor das linhas verticais
          Graphics2D g2d = (Graphics2D) grphcs;
          g2d.setStroke(new BasicStroke(0.5f)); // Espessura abaixo de 1 pixel
          g2d.drawLine(0, 0, 0, getHeight());
        
        }
}
