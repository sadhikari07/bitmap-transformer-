/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package bitmap.transformer;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class App {
    String filePath = "./src/main/resources/LAND2.BMP";

    public void transformImageByColor(int rgbTobeChangedTo) {
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File(filePath));
            int height = img.getHeight();
            int width = img.getWidth();
            System.out.println("height" + height);
            System.out.println("width" + width);
            for (int h = 0; h < height; h++) {
                for (int w = 0; w < width; w++) {
                    int rgb = img.getRGB(w, h);
                     img.setRGB(w, h, rgbTobeChangedTo);
                }
            }
            ImageIO.write(img, "BMP", new File("./src/main/resources/colorChanged.bmp"));
        } catch (IOException e) {
        }
    }
    public void gridCreator(int gridX, int gridY) {
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File(filePath));
            int height = img.getHeight();
            int width = img.getWidth();
            for (int h = 0; h < height; h++) {
                for (int w = 0; w < width; w++) {
                    if(w%gridX == 0){
                        img.setRGB(w, h, 0);
                    }
                    if(h%gridY==0){
                        img.setRGB(w,h,0);
                    }
                }
            }
            ImageIO.write(img, "BMP", new File("./src/main/resources/gridCreated.bmp"));
        } catch (IOException e) {
        }
    }
    public void cropper(int x, int y, int w, int h){
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File(filePath));
             img = img.getSubimage(x, y, w, h);
            ImageIO.write(img, "BMP", new File("./src/main/resources/subImage.bmp"));
        } catch (IOException e) {
        }
    }



    public static void main(String[] args) {
       new App().transformImageByColor(255);
       new App().gridCreator(20, 20);
       new App().cropper(0, 200, 200, 200);
    }

}
