package ho2;
 import java.awt.*;
import java.applet.Applet;

public class opdracht1 extends Applet {
    public void init() {
        setBackground(Color.blue);

    }
    public void paint(Graphics g) {
        g.setColor(Color.orange);
        g.drawString("Welcome to Java!!",150,150);
    }
}
