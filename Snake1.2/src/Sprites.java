import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;

public class Sprites {

    public static ImageIcon background = new ImageIcon("Images/Background3.png");
    public static ImageIcon startBackground = new ImageIcon("Images/StartBackground.jpg");
    public static ImageIcon logoImage = new ImageIcon("Images/Logo.png");
    public static ImageIcon gameOverBackground = new ImageIcon("Images/GameOverBackground.jpg");
    public static ImageIcon gameOverLabel = new ImageIcon("Images/GameOver.png");


    public static ImageIcon startSnakeImage = new ImageIcon("Images/StartSnake.png");
    public static ImageIcon sadSnakeImage = new ImageIcon("Images/SadSnake.png");
    public static ImageIcon sadSnakeImage2 = new ImageIcon("Images/SadSnake2.png");


    public static ImageIcon appleImage = new ImageIcon("Images/apple.png");
    public static ImageIcon rocksImage = new ImageIcon("Images/Rocks.png");

    public static ImageIcon mouseImageUP = new ImageIcon("Images/mouseUP.png");
    public static ImageIcon mouseImageDOWN = new ImageIcon("Images/mouseDOWN.png");
    public static ImageIcon mouseImageLEFT = new ImageIcon("Images/mouseLEFT.png");
    public static ImageIcon mouseImageRIGHT = new ImageIcon("Images/mouseRIGHT.png");


    public static ImageIcon headImageUP = new ImageIcon("Images/redHeadUP.png");
    public static ImageIcon headImageDOWN = new ImageIcon("Images/redHeadDOWN.png");
    public static ImageIcon headImageLEFT = new ImageIcon("Images/redHeadLEFT.png");
    public static ImageIcon headImageRIGHT = new ImageIcon("Images/redHeadRIGHT.png");
    public static ImageIcon bodyImageX = new ImageIcon("Images/redBodyX.png");
    public static ImageIcon bodyImageY = new ImageIcon("Images/redBodyY.png");
    public static ImageIcon tailImageUP = new ImageIcon("Images/redTailUP.png");
    public static ImageIcon tailImageDOWN = new ImageIcon("Images/redTailDOWN.png");
    public static ImageIcon tailImageLEFT = new ImageIcon("Images/redTailLEFT.png");
    public static ImageIcon tailImageRIGHT = new ImageIcon("Images/redTailRIGHT.png");
    public static ImageIcon turnUP_LEFT = new ImageIcon("Images/redBodyUP_LEFT.png");
    public static ImageIcon turnUP_RIGHT = new ImageIcon("Images/redBodyUP_RIGHT.png");
    public static ImageIcon turnDOWN_LEFT = new ImageIcon("Images/redBodyDOWN_LEFT.png");
    public static ImageIcon turnDOWN_RIGHT = new ImageIcon("Images/redBodyDOWN_RIGHT.png");


    public static ImageIcon AIheadImageUP = new ImageIcon("Images/blueHeadUP.png");
    public static ImageIcon AIheadImageDOWN = new ImageIcon("Images/blueHeadDOWN.png");
    public static ImageIcon AIheadImageLEFT = new ImageIcon("Images/blueHeadLEFT.png");
    public static ImageIcon AIheadImageRIGHT = new ImageIcon("Images/blueHeadRIGHT.png");
    public static ImageIcon AIbodyImageX = new ImageIcon("Images/blueBodyX.png");
    public static ImageIcon AIbodyImageY = new ImageIcon("Images/blueBodyY.png");
    public static ImageIcon AItailImageUP = new ImageIcon("Images/blueTailUP.png");
    public static ImageIcon AItailImageDOWN = new ImageIcon("Images/blueTailDOWN.png");
    public static ImageIcon AItailImageLEFT = new ImageIcon("Images/blueTailLEFT.png");
    public static ImageIcon AItailImageRIGHT = new ImageIcon("Images/blueTailRIGHT.png");
    public static ImageIcon AIturnUP_LEFT = new ImageIcon("Images/blueBodyUP_LEFT.png");
    public static ImageIcon AIturnUP_RIGHT = new ImageIcon("Images/blueBodyUP_RIGHT.png");
    public static ImageIcon AIturnDOWN_LEFT = new ImageIcon("Images/blueBodyDOWN_LEFT.png");
    public static ImageIcon AIturnDOWN_RIGHT = new ImageIcon("Images/blueBodyDOWN_RIGHT.png");

    public static ImageObserver observer = new ImageObserver() {
        @Override
        public boolean imageUpdate(Image img, int infoflags, int x, int y, int width, int height) {
            return false;
        }
    };
}
