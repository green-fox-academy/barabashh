import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {
    public static void mainDraw(Graphics graphics) {
        Color[] rainbowColors = {Color.RED, Color.orange, Color.yellow, Color.green, Color.blue, new Color(75, 0, 130), new Color(159, 0, 255)};

        for (int i = 6; i >= 0; i--) {
            centeredAndColoredSquare((int) ((i + 1) * WIDTH / 7), rainbowColors[i], graphics);
        }
    }

    public static void centeredAndColoredSquare(int size, Color fillColor, Graphics graphics) {
        graphics.setColor(fillColor);
        graphics.fillRect((WIDTH - size) / 2, (HEIGHT - size) / 2, size, size);
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}