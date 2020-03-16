import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {
  public static void mainDraw(Graphics graphics) {

    int posX = 100; //position X
    int posY = 100; //position Y
    int sizeX = 100;
    int sizeY = 100;
    int res = 15; //resolution: how many lines per edge
    int moveX, moveY;
    for (int i = 1; i < res; i++) {
      moveX = i * (sizeX / res);
      moveY = i * (sizeY / res);
      graphics.setColor(Color.blue);
      graphics.drawLine(posX + moveX, posY, posX +sizeX, posY + moveY);
      graphics.setColor(Color.gray);
      graphics.drawLine(posX, posY + moveY, posX + moveX, posY + sizeY);
    }
    /*for (int i = 0; i < 200; i++) {
      int randColor = (int)(Math.random() * 255);
      graphics.setColor(new Color(randColor,randColor,randColor));
      int randX = (int)(Math.random() * WIDTH)-3;
      int randY = (int)(Math.random() * HEIGHT)-3;
      int size = (int)(Math.random() * 6);
      graphics.fillRect(randX,randY,size,size);
    }*/
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