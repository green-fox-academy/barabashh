import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {
  public static void mainDraw(Graphics graphics) {
    graphics.setColor(Color.black);
    int triHeight = (int) (0.866 * HEIGHT); //TriangleHeight = sqrt(3)/2 = 0.866 * Height
    //graphics.drawLine(WIDTH / 2, 0, 0, triHeight);
    //graphics.drawLine(WIDTH / 2, 0, WIDTH, triHeight);
    graphics.drawLine(0, triHeight, WIDTH, triHeight);
    int res = 20;
    for (int i = 0; i < res; i++) {
      graphics.drawLine(WIDTH / 2 - WIDTH * i / res / 2, triHeight * i / res,
              WIDTH / 2 + WIDTH * i / res / 2, triHeight * i / res);
      graphics.drawLine(WIDTH / 2 - WIDTH * i / res / 2, triHeight * i / res,
              WIDTH - WIDTH * i / res, triHeight);
      graphics.drawLine(WIDTH / 2 + WIDTH * i / res / 2, triHeight * i / res,
              WIDTH * i / res, triHeight);
    }
  }

  // Don't touch the code below
  static int WIDTH = 600;
  static int HEIGHT = 600;

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