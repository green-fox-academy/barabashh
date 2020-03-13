import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ConnectTheDots {
    public static void mainDraw(Graphics graphics) {
        // Create a function that takes 2 parameters:
        // An array of {x, y} points and graphics
        // and connects them with green lines.
        // Connect these to get a box: {{10, 10}, {290,  10}, {290, 290}, {10, 290}}
        // Connect these: {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
        // {120, 100}, {85, 130}, {50, 100}}
        graphics.setColor(new Color(0,200,0));

        int[][] box = {{10, 10}, {290, 10}, {290, 290}, {10, 290}};
        int[][] misteryShape = {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
                {120, 100}, {85, 130}, {50, 100}};

        int[][][] shapeArray = {box, misteryShape};
        for (int j = 0; j < 2; j++) {
            int[] shapeX = new int[shapeArray[j].length];
            int[] shapeY = new int[shapeArray[j].length];
            for (int i = 0; i < shapeX.length; i++) {
                shapeX[i] = shapeArray[j][i][0];
                shapeY[i] = shapeArray[j][i][1];
            }
            graphics.drawPolygon(shapeX, shapeY, shapeArray[j].length);
        }
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