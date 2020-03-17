import javax.swing.*;

import java.awt.*;
import java.lang.reflect.WildcardType;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SuperHexagon {
  public static int offsetY = 2; //offset SuperHexagon vertically with these many pixels
  public static double lineLength = 40;
  public static double lineHeight = 0.866 * lineLength; //TriangleHeight = sqrt(3)/2 = 0.866 * Height

  public static void mainDraw(Graphics graphics) {
    graphics.setColor(Color.black);

    for (int j = 0; j < 4; j++) {
      for (int i = 0; i < (16 - 2 * j); i += 2) {
        double k = j * 1.5;
        int l = i + j;
        drawLineWithDoubleValues(k - 0.5, l, k + 0.5, l, graphics); //horizontal lines, right side and center
        if (j != 0) drawLineWithDoubleValues(-(k + 0.5), l, -(k - 0.5), l, graphics); //horizontal lines, left side
        if ((i / 2) != (8 - j - 1)) {
          drawLineWithDoubleValues(k + 0.5, l, k + 1, l + 1, graphics); // \ lines, right side and center
          drawLineWithDoubleValues(-(k + 0.5), l, -(k + 1), l + 1, graphics); // / lines, left side
          drawLineWithDoubleValues(k + 1, l + 1, k + 0.5, l + 2, graphics); // / lines, right side
          drawLineWithDoubleValues(-(k + 1), l + 1, -(k + 0.5), l + 2, graphics); // \ lines, left side
        }
      }
    }
  }

  public static void drawLineWithDoubleValues(double x1, double y1, double x2, double y2, Graphics graphics) {
    graphics.drawLine((int) (WIDTH / 2 + x1 * lineLength), (int) (y1 * lineHeight) + offsetY,
            (int) (WIDTH / 2 + x2 * lineLength), (int) (y2 * lineHeight) + offsetY);
  }

  // Don't touch the code below
  static int WIDTH = 500;
  static int HEIGHT = 500;

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