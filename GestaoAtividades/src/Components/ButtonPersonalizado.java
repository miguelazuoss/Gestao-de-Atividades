/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
import javax.swing.JButton;

/**
 *
 * @author user
 */
public class ButtonPersonalizado extends JButton {

    private boolean hover;
    private Color color;
    private Color colorOver;
    private Color colorClick;
    private Color borderColor;
    private int radius = 0;

    public ButtonPersonalizado() {

        setColor(getBackground()); // Cores iniciais do botão para facil manipulação //
        colorOver = new Color(179, 250, 160);
        colorClick = new Color(152, 184, 144);
        borderColor = new Color(30, 136, 56);
        setContentAreaFilled(false);
        // Listener para o botão
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent me) {
                setCursor(new Cursor(Cursor.HAND_CURSOR));
                setBackground(colorOver);
                hover = true;
            }

            @Override
            public void mouseExited(MouseEvent me) {
                setBackground(color);
                hover = false;

            }

            @Override
            public void mousePressed(MouseEvent me) {
                setCursor(new Cursor(Cursor.HAND_CURSOR));
                setBackground(colorClick);
            }

            @Override
            public void mouseReleased(MouseEvent me) {
                if (hover) {
                    setBackground(colorOver);
                } else {
                    setBackground(color);
                }
            }
        });
    }

    public boolean isOver() {
        return hover;
    }

    public void setOver(boolean over) {
        this.hover = over;
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

    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs; // Converte o Graphics em Graphics2D pra gráficos avançados
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON); // Ativo o suavizamento das bordas para deixar o desenho mais suave

        g2.setColor(getBackground()); // Define a cor do fundo antes de desenhar
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), radius, radius); // preenchendo um retângulo arredondado

        super.paintComponent(grphcs); // Chamando o método da classe pai para garantir que o componente seja desenhado corretamente
    }

}
