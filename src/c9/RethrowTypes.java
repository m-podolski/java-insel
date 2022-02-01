package c9;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class RethrowTypes {

  public static void saveScreenshot(String filename)
    throws AWTException, IOException {
    try {
      Rectangle r = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
      BufferedImage screenshot = new Robot().createScreenCapture(r);
      ImageIO.write(screenshot, "png", new File(filename));
    } catch (AWTException e) {
      throw e;
//    } catch (IOException e) {
    } catch (Throwable e) {
      Files.delete(Paths.get(filename));
      throw e;
    }
  }
}
