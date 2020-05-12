package mandelbrotTest;

import processing.core.PImage;

public class Image {

  public static void main(String[] args) {
    draw();
  }
  /*void setup() {
    size(200, 200);
    //img = loadImage("sunflower.jpg");
  }*/

  public static void draw(){
    /* Since we are going to access the image's pixels too */
    PImage img = new PImage();
    int height = 320;
    int width = 200;
    img.loadPixels();
    for (int y = 0; y < height; y++) {
      for (int x = 0; x < width; x++) {
        int loc = x + y*width;

        // The functions red(), green(), and blue() pull out the 3 color components from a pixel.
        float r = 50; //red(img.pixels[loc]);
        float g = 60; //green(img.pixels[loc]);
        float b = 200; //blue(img.pixels[loc]);

        // Image Processing would go here
        // If we were to change the RGB values, we would do it here,
        // before setting the pixel in the display window.

        // Set the display pixel to the image pixel
        //img.pixels[loc] =  new Color(r,g,b);
      }
    }
    img.updatePixels();
  }

}
