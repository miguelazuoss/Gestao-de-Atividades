/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Components;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

/**
 *
 * @author miguel_a_andrade
 */
public class MenuPrincipal extends javax.swing.JPanel {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
        setOpaque(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs; // Converto o Graphics em Graphics2D pra gráficos avançados
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON); // Ativo o suavizamento das bordas para deixar o desenho mais suave
        GradientPaint g = new GradientPaint(0, 0, Color.decode("#000000"), getWidth(), getHeight(), Color.decode("#737373")); // Gradiente que vai do preto no canto superior esquerdo até um cinza no canto inferior direito
        g2.setPaint(g); //  usar esse gradiente para o desenho
        g2.fillRoundRect(0, 0, getWidth()-20, getHeight(), 15, 15); //  Preencho um retângulo arredondado que ocupa toda a área do componente com um radius de 15
        g2.fillRect(getWidth() -30, 0, 30, getHeight()); // Retângulo reto no lado direito
        super.paintComponent(grphcs); //  Chamando o método da classe pai para garantir que o componente seja desenhado corretamente
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlMy = new javax.swing.JLabel();
        jlActivities = new javax.swing.JLabel();

        jlMy.setFont(new java.awt.Font("Segoe UI", 1, 45)); // NOI18N
        jlMy.setForeground(new java.awt.Color(255, 255, 255));
        jlMy.setText("My");

        jlActivities.setFont(new java.awt.Font("Segoe UI", 1, 45)); // NOI18N
        jlActivities.setForeground(new java.awt.Color(255, 255, 255));
        jlActivities.setText("Activities");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlActivities)
                    .addComponent(jlMy))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jlMy)
                .addGap(0, 0, 0)
                .addComponent(jlActivities)
                .addContainerGap(546, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jlActivities;
    private javax.swing.JLabel jlMy;
    // End of variables declaration//GEN-END:variables
}