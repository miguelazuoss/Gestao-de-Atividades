/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Components;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;

/**
 *
 * @author user
 */
public class CardButton extends javax.swing.JPanel {

    private boolean hover;
    private Color color;
    private Color colorOver;
    private Color colorClick;
    private Color borderColor;
    private int radius = 0;
    private boolean gradient;
    private Color gradientStartColor;
    private Color gradientFinalColor;
    private Color temp1;
    private Color temp2;
    private Color gradientStartColorHover;
    private Color gradientFinalColorHover;
    private int gradientX = 0;
    private int gradientY = 0;
    
    public CardButton() {
        initComponents();
        setOpaque(false);
        
        setColor(getBackground()); // Cores iniciais do botão para facil manipulação //
        colorOver = new Color(179, 250, 160);
        colorClick = new Color(152, 184, 144);
        borderColor = new Color(30, 136, 56);
        // Listener para o botão
        
        
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent me) {
                setCursor(new Cursor(Cursor.HAND_CURSOR));
                if(gradient){
                setGradientStartColor(gradientStartColorHover);
                setGradientFinalColor(gradientFinalColorHover);
                repaint();
                } else{
                    setBackground(colorOver);
                    hover = true;
                }
            }

            @Override
            public void mouseExited(MouseEvent me) {
                if(gradient){
                setGradientStartColor(temp1);
                setGradientFinalColor(temp2);
                repaint();
                } else{
                    setBackground(color);
                    hover = false;
                }

            }

            @Override
            public void mousePressed(MouseEvent me) {
                setCursor(new Cursor(Cursor.HAND_CURSOR));
                setBackground(colorClick);
                if(gradient){
                        setGradientStartColor(colorClick);
                        setGradientFinalColor(colorClick);
                }
                repaint();
            }

            @Override
            public void mouseReleased(MouseEvent me) {
                if(gradient){
                    if (hover) {
                setGradientStartColor(gradientStartColorHover);
                setGradientFinalColor(gradientFinalColorHover);
                    } else {
                        setGradientStartColor(temp1);
                        setGradientFinalColor(temp2);
                    }
                    repaint();
                } else{
                if (hover) {
                    setBackground(colorOver);
                } else {
                    setBackground(color);
                }
            }}
        });
           
    }

    public int getGradientX() {
        return gradientX;
    }

    public void setGradientX(int gradientX) {
        this.gradientX = gradientX;
    }

    public int getGradientY() {
        return gradientY;
    }

    public void setGradientY(int gradientY) {
        this.gradientY = gradientY;
    }

    public boolean isHover() {
        return hover;
    }

    public void setHover(boolean hover) {
        this.hover = hover;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
        setBackground(color);
    }

    public Color getColorOver() {
        return colorOver;
    }

    public void setColorOver(Color colorOver) {
        this.colorOver = colorOver;
    }

    public Color getColorClick() {
        return colorClick;
    }

    public void setColorClick(Color colorClick) {
        this.colorClick = colorClick;
    }

    public Color getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(Color borderColor) {
        this.borderColor = borderColor;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public boolean isGradient() {
        return gradient;
    }

    public void setGradient(boolean gradient) {
        this.gradient = gradient;
        repaint();
    }

    public Color getGradientStartColor() {
        return gradientStartColor;
    }

    public void setGradientStartColor(Color gradientStartColor) {
        this.gradientStartColor = gradientStartColor;
    }

    public Color getGradientFinalColor() {
        return gradientFinalColor;
    }

    public void setGradientFinalColor(Color gradientFinalColor) {
        this.gradientFinalColor = gradientFinalColor;
    }

    public Color getGradientStartColorHover() {
        return gradientStartColorHover;
    }

    public void setGradientStartColorHover(Color gradientStartColorHover) {
        this.gradientStartColorHover = gradientStartColorHover;
    }

    public Color getGradientFinalColorHover() {
        return gradientFinalColorHover;
    }

    public void setGradientFinalColorHover(Color gradientFinalColorHover) {
        this.gradientFinalColorHover = gradientFinalColorHover;
    }

    public JLabel getJlTituloCard() {
        return jlTituloCard;
    }

    public void setJlTituloCard(JLabel jlTituloCard) {
        this.jlTituloCard = jlTituloCard;
    }

    public JLabel getJlTituloCard1() {
        return jlTituloCard1;
    }

    public void setJlTituloCard1(JLabel jlTituloCard1) {
        this.jlTituloCard1 = jlTituloCard1;
    }

    public Color getTemp1() {
        return temp1;
    }

    public void setTemp1(Color temp1) {
        this.temp1 = temp1;
    }

    public Color getTemp2() {
        return temp2;
    }

    public void setTemp2(Color temp2) {
        this.temp2 = temp2;
    }
    
    

    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs; // Converte o Graphics em Graphics2D pra gráficos avançados
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON); // Ativo o suavizamento das bordas para deixar o desenho mais suave
        if(gradient == true && gradientStartColor != null && gradientFinalColor != null ){
            GradientPaint g = new GradientPaint(gradientX, gradientY, gradientStartColor, getWidth(), getHeight(), gradientFinalColor); // Gradiente que vai do preto no canto superior esquerdo até um cinza no canto inferior direito
            g2.setPaint(g); //  usar esse gradiente para o desenho
        } else {
            g2.setColor(getBackground()); // Define a cor do fundo antes de desenhar
        }
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), radius, radius); // preenchendo um retângulo arredondado

        super.paintComponent(grphcs); // Chamando o método da classe pai para garantir que o componente seja desenhado corretamente
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlTituloCard = new javax.swing.JLabel();
        jlTituloCard1 = new javax.swing.JLabel();

        jlTituloCard.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jlTituloCard.setForeground(new java.awt.Color(255, 255, 255));
        jlTituloCard.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTituloCard.setText("Atividades não iniciadas");

        jlTituloCard1.setFont(new java.awt.Font("Segoe UI", 1, 45)); // NOI18N
        jlTituloCard1.setForeground(new java.awt.Color(255, 255, 255));
        jlTituloCard1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTituloCard1.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlTituloCard1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlTituloCard, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jlTituloCard)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlTituloCard1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jlTituloCard;
    private javax.swing.JLabel jlTituloCard1;
    // End of variables declaration//GEN-END:variables
}
