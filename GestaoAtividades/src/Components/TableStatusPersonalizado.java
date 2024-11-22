package Components;

import Models.StatusType;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JLabel;

public class TableStatusPersonalizado extends JLabel {

    private StatusType type;

    public TableStatusPersonalizado() {
        setForeground(Color.WHITE);
    }

    public StatusType getType() {
        return type;
    }

    public void setType(StatusType type) {
        this.type = type;
        if (type != null) {
            String typeString;
            if ("Pendente".equals(type.toString())) {
                typeString = "Pendente";
            } else if ("Ativo".equals(type.toString())) {
                typeString = "Ativo";
            } else {
                typeString = "Concluído";
            }
            setText(typeString);
        }
        repaint();
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        if (type != null) {
            Graphics2D g2 = (Graphics2D) grphcs;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            GradientPaint g;
            if (type == StatusType.Pendente) {
                g = new GradientPaint(0, 0, new Color(253, 200, 48), 0, getHeight(), new Color(243, 115, 53));
            } else if (type == StatusType.Ativo) {
                g = new GradientPaint(0, 0, new Color(0, 180, 219), 0, getHeight(), new Color(0,131,176));
            } else {
                g = new GradientPaint(0, 0, new Color(0, 242, 96), 0, getHeight(), new Color(5, 117, 230));
            }
            g2.setPaint(g);
            g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        }
        super.paintComponent(grphcs);
    }
}