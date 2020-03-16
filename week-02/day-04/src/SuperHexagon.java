import javax.swing.*;

import java.awt.*;
import java.lang.reflect.WildcardType;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SuperHexagon {
  public static int offsetY = 2; //offset SuperHexagon vertically with these many pixels

  public static void mainDraw(Graphics graphics) {
    graphics.setColor(Color.black);
    double lineLength = 24;
    double lineHeight = 0.866 * lineLength; //TriangleHeight = sqrt(3)/2 = 0.866 * Height
    //horizontal lines, right side and center
    for (int j = 0; j < 4; j++) {
      for (int i = 0; i < (8 - j); i++) {
        drawLineWithDoubleValues(WIDTH / 2 + (j * 1.5 - 0.5) * lineLength, (i * 2 + j) * lineHeight,
                WIDTH / 2 + (j * 1.5 + 0.5) * lineLength, (i * 2 + j) * lineHeight, graphics);
      }
    }
    //horizontal lines, left side
    for (int j = 1; j < 4; j++) {
      for (int i = 0; i < (8 - j); i++) {
        drawLineWithDoubleValues(WIDTH / 2 - (j * 1.5 + 0.5) * lineLength, (i * 2 + j) * lineHeight,
                WIDTH / 2 - (j * 1.5 - 0.5) * lineLength, (i * 2 + j) * lineHeight, graphics);
      }
    }
    // \ lines, right side and center
    for (int j = 0; j < 4; j++) {
      for (int i = 0; i < (8 - j - 1); i++) {
        drawLineWithDoubleValues(WIDTH / 2 + (j * 1.5 + 0.5) * lineLength, (i * 2 + j) * lineHeight,
                WIDTH / 2 + (j * 1.5 + 1) * lineLength, (i * 2 + j + 1) * lineHeight, graphics);
      }
    }
    // / lines, left side
    for (int j = 0; j < 4; j++) {
      for (int i = 0; i < (8 - j - 1); i++) {
        drawLineWithDoubleValues(WIDTH / 2 - (j * 1.5 + 0.5) * lineLength, (i * 2 + j) * lineHeight,
                WIDTH / 2 - (j * 1.5 + 1) * lineLength, (i * 2 + j + 1) * lineHeight, graphics);
      }
    }
    // / lines, right side
    for (int j = 0; j < 4; j++) {
      for (int i = 0; i < (8 - j - 1); i++) {
        drawLineWithDoubleValues(WIDTH / 2 + (j * 1.5 + 1) * lineLength, (i * 2 + j + 1) * lineHeight,
                WIDTH / 2 + (j * 1.5 + 0.5) * lineLength, (i * 2 + j + 2) * lineHeight, graphics);
      }
    }
    // \ lines, left side
    for (int j = 0; j < 4; j++) {
      for (int i = 0; i < (8 - j - 1); i++) {
        drawLineWithDoubleValues(WIDTH / 2 - (j * 1.5 + 1) * lineLength, (i * 2 + j + 1) * lineHeight,
                WIDTH / 2 - (j * 1.5 + 0.5) * lineLength, (i * 2 + j + 2) * lineHeight, graphics);
      }
    }

  }

  public static void drawLineWithDoubleValues(double x1, double y1, double x2, double y2, Graphics graphics) {
    graphics.drawLine((int) x1, (int) y1 + offsetY, (int) x2, (int) y2 + offsetY);
  }

  // Don't touch the code below
  static int WIDTH = 300;
  static int HEIGHT = 300;

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