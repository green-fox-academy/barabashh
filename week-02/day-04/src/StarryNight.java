import java.awt.image.ImageObserver;
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class StarryNight {
  public static void mainDraw(Graphics graphics) {
    // Draw the night sky:
    //  - The background should be black
    //  - The stars can be small squares
    //  - The stars should have random positions on the canvas
    //  - The stars should have random color (some shade of grey)
    graphics.setColor(Color.black);
    graphics.fillRect(0, 0, WIDTH, HEIGHT);
    for (int i = 0; i < 200; i++) {
      int randColor = (int) (Math.random() * 255);
      graphics.setColor(new Color(randColor, randColor, randColor));
      int randX = (int) (Math.random() * WIDTH) - 3;
      int randY = (int) (Math.random() * HEIGHT) - 3;
      int size = (int) (Math.random() * 6);
      graphics.fillRect(randX, randY, size, size);
    }
    //Image img = new Image();
/*
    graphics.drawImage(img,
    10,10, null);
*/
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